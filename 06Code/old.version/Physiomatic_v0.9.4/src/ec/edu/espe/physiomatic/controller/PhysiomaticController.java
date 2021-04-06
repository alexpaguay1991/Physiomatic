/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.controller;

import com.google.gson.Gson;
import ec.edu.espe.physiomatic.model.Appointment;
import ec.edu.espe.physiomatic.model.Bill;
import ec.edu.espe.physiomatic.model.ClinicalHistory;
import ec.edu.espe.physiomatic.model.Consumption;
import ec.edu.espe.physiomatic.model.Diagnostic;
import ec.edu.espe.physiomatic.model.Patient;
import ec.edu.espe.physiomatic.model.Physioterapist;
import ec.edu.espe.physiomatic.model.Product;
import ec.edu.espe.physiomatic.model.Tax;
import ec.edu.espe.utils.Connection;
import ec.edu.espe.utils.MongoDBManager;
import ec.edu.espe.utils.FileManager1;
import ec.edu.espe.utils.Persistence;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author Alex Paguay
 * @author Santiago Risueño ESPE-DCCO
 * @author pzeadrian
 */
public class PhysiomaticController {

    static String data = "mongodb+srv://AlexPaguay:resende1A@physiomatic.ths5b.mongodb.net/Physiomatic?retryWrites=true&w=majority";
    static String dataBase = "Physiomatic";
    static Gson gson = new Gson();
    static MongoDBManager mongo = MongoDBManager.getInstance(data, dataBase);
    static Persistence fileManager = new FileManager1();
    static DataTranslation translation = new DataTranslation();

    public static String[][] showTableClinicalHistories() {
        ArrayList<ClinicalHistory> clinicaHistories = new ArrayList<>();
        clinicaHistories = translation.retrieveClinicalHistories();
        String[][] matrix = new String[clinicaHistories.size()][8];
        for (int i = 0; i < clinicaHistories.size(); i++) {
            matrix[i][5] = clinicaHistories.get(i).getAllergy();
            matrix[i][1] = clinicaHistories.get(i).getBirthDate();
            matrix[i][6] = clinicaHistories.get(i).getBloodType();
            matrix[i][0] = clinicaHistories.get(i).getPatient().getId() + "";
            matrix[i][7] = clinicaHistories.get(i).getFamiliyBackground();
            matrix[i][1] = clinicaHistories.get(i).getPatient().getName();
            matrix[i][2] = clinicaHistories.get(i).getPatient().getLastName();
        }
        return matrix;
    }

    public static String[][] showTableClinicalHistory(long id) {
        Connection conection = new Connection("patients");
        Patient patient = retrievePatient(id);
        ClinicalHistory clinicalHistory = retrieveClinicalHistory(patient);
        String[][] matrix = new String[clinicalHistory.getDiagnostics().size()][4];
        for (int i = 0; i < clinicalHistory.getDiagnostics().size(); i++) {
            matrix[i][0] = clinicalHistory.getDiagnostics().get(i).getDateOfDiagnostic();
            matrix[i][1] = clinicalHistory.getDiagnostics().get(i).getSymptoms();
            matrix[i][2] = clinicalHistory.getDiagnostics().get(i).getTreatment();
            matrix[i][3] = clinicalHistory.getDiagnostics().get(i).getPathology();           
        }
        return matrix;
    }

    public static String[][] showTable() {
        ArrayList<Patient> patients = new ArrayList<>();
        patients = translation.retrievePatients();
        String[][] matrix = new String[patients.size()][6];
        for (int i = 0; i < patients.size(); i++) {
            matrix[i][0] = patients.get(i).getId() + "";
            matrix[i][1] = patients.get(i).getName();
            matrix[i][2] = patients.get(i).getLastName();
            matrix[i][3] = patients.get(i).getAddress();
            matrix[i][4] = patients.get(i).getEmail();
            matrix[i][5] = patients.get(i).getPhoneNumber();
        }
        return matrix;
    }

    public static String[][] showTableProduct() {
        ArrayList<Product> products = new ArrayList<>();
        products = translation.retrieveProducts();
        String[][] matrix = new String[products.size() - 1][4];
        for (int i = 1; i < products.size(); i++) {
            matrix[i - 1][0] = products.get(i).getId();
            matrix[i - 1][1] = products.get(i).getStock() + "";
            matrix[i - 1][2] = products.get(i).getDescription();
            matrix[i - 1][3] = products.get(i).getUnitPrice() + "";
        }
        return matrix;
    }

    public static String[][] showAppointmentTable(long id) {
        ArrayList<Appointment> appointments = new ArrayList<>();
        Patient patient = retrievePatient(id);        
        appointments = translation.retrieveAppointments();
        String[][] matrix = new String[appointments.size()][3];
        for (int i = 0; i < appointments.size(); i++) {
            matrix[i][1] = appointments.get(i).getHour();
            matrix[i][0] = appointments.get(i).getDateOfAppointment();
        }
        return matrix;
    }

    public static String[][] showBillTable(long id) {
        Bill bill = retrieveBill(id);
        ArrayList<Product> products = new ArrayList<>();
        products = bill.getProducts();
        String[][] matrix = new String[products.size()][5];
        for (int i = 0; i < products.size(); i++) {
            matrix[i][0] = (i + 1) + "";
            matrix[i][1] = products.get(i).getAmount() + "";
            matrix[i][2] = products.get(i).getDescription();
            matrix[i][3] = products.get(i).getUnitPrice() + "";
            matrix[i][4] = products.get(i).getAmount() * products.get(i).getUnitPrice() + "";
        }
        return matrix;
    }

    public static void addDiagnostic(long id, String symptom, String pathology, String treatment, String date) {
        Diagnostic diagnostic = new Diagnostic(pathology, treatment, symptom, date);
        Patient patient = retrievePatient(id);
        ClinicalHistory clinicalHistory = retrieveClinicalHistory(patient);
        mongo.delete("clinicalHistory", gson.toJson(clinicalHistory));
        ClinicalHistory newClinicalHistory = clinicalHistory;
        newClinicalHistory.getDiagnostics().add(diagnostic);
        mongo.save("clinicalHistory", gson.toJson(newClinicalHistory));
    }

    public static void createProduct(Product product) {
        String data = gson.toJson(product);
        mongo.save("products", data);
    }

    public static void updateProduct(String idProduct, float quantity) {
        Product product = retrieveProduct(idProduct);
        Product newProduct = product;
        mongo.delete("products", gson.toJson(product));
        System.out.println(gson.toJson(product));
        float stock = product.getStock();
        stock = stock - quantity;
        newProduct.setStock(stock);
        System.out.println("Entra aqui");
        mongo.save("products", gson.toJson(newProduct));
    }

    public void createPatient(long id, String address, String name, String lastname, String email, String phoneNumber) {
        Patient patient = new Patient(id, address, name, lastname, email, phoneNumber);
        String data = gson.toJson(patient);
        mongo.save("patients", data);
    }

    public static void createBill(long id) {
        Patient patient = retrievePatient(id);
        ArrayList<Product> products = retrieveConsumption(patient).getProducts();
        float total = calculateTotal(id);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        String dateOfAppointment = sdf.format(date) + "";
        System.out.println(date);
        Bill bill = new Bill(total, patient, products, dateOfAppointment);
        String data = gson.toJson(bill);
        mongo.save("bills", data);
    }

    public static void createPhysioterapist(String userName, String password, long id, String address, String name, String lastname, String email, String phoneNumber) {
        Physioterapist physioterapist = new Physioterapist(userName, password, id, address, name, lastname, email, phoneNumber);
        mongo.save("physioterapist", gson.toJson(physioterapist));
        fileManager.save("physioterapists.json", gson.toJson(physioterapist));
    }

    public static void createAppoinment(String date, String time, long id) {
        Patient patient = retrievePatient(id);
        Appointment appointment = new Appointment(date, time, patient);
        System.out.println("fgfg" + appointment.getPatient().getName());
        mongo.save("appointments", gson.toJson(appointment));
    }

    public static void createConsumption(long idPatient, String idProduct) {
        Patient patient = PhysiomaticController.retrievePatient(idPatient);
        ArrayList<Product> products = new ArrayList<>();
        Consumption consumption = new Consumption(patient, products);
        consumption.getProducts().add(retrieveProduct(idProduct));
        mongo.save("consumptions", gson.toJson(consumption));
    }

    public static float calculateTotal(long idPatient) {
        Patient patient = PhysiomaticController.retrievePatient(idPatient);
        Consumption consumption = PhysiomaticController.retrieveConsumption(patient);
        ArrayList<Product> products = new ArrayList<>();
        products = consumption.getProducts();
        float[] precioRow;
        precioRow = new float[products.size()];
        float total = 0;
        for (int i = 0; i < products.size(); i++) {
            precioRow[i] = (products.get(i).getAmount() * products.get(i).getUnitPrice());
        }
        for (int i = 0; i < precioRow.length; i++) {
            total += precioRow[i];
        }
        return total;
    }

    public static void addProductToConsumption(long id, String idProduct, String amount) {
        Product product = retrieveProduct(idProduct);
        product.setAmount(Float.valueOf(amount));
        Patient patient = retrievePatient(id);
        Consumption consumption = retrieveConsumption(patient);
        mongo.delete("consumptions", gson.toJson(consumption));
        Consumption newConsumption = consumption;
        newConsumption.getProducts().add(product);
        mongo.save("consumptions", gson.toJson(newConsumption));
    }

    public static Product retrieveProduct(String id) {
        Product product;
        String productJson = mongo.find("products", id);
        product = translation.retrieveProduct(productJson);
        return product;
    }

    public static Patient retrievePatient(long id) {
        Patient patient;
        String patientjson = mongo.find("patients", Long.toString(id));
        patient = translation.retrievePatient(patientjson);
        return patient;
    }

    public static ClinicalHistory retrieveClinicalHistory(Patient patient) {
        ClinicalHistory clinicalHistory;
        String clinicalHistoryjson = mongo.find("clinicalHistory", Long.toString(patient.getId()));
        clinicalHistory = translation.retrieveClinicalHistory(clinicalHistoryjson);
        return clinicalHistory;
    }

    public static Consumption retrieveConsumption(Patient patient) {
        Consumption consumption;
        String consumptionJson = mongo.find("consumptions", Long.toString(patient.getId()));
        consumption = translation.retrieveConsumption(consumptionJson);
        return consumption;
    }

    public static Bill retrieveBill(long id) {
        Bill bill;
        String billJson = mongo.find("bills", Long.toString(id));
        bill = translation.retrieveBill(billJson);
        return bill;
    }

    public static float calculateTax(Float value) {
        float total;
        Tax tax = Tax.getInstance(value);
        total = tax.salesTotal(tax);
        return total;
    }
}
