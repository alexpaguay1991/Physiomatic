/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.model;

import com.google.gson.Gson;
import ec.edu.espe.filemanager.utils.FileManager;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Santiago Risueño ESPE-DCCO
 */
public class Physioterapist {

    public Physioterapist(String name, String lastName, String username, String password) {
        this.name = name;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
    }
    String name;
    String lastName;
    String username;
    String password;

    public static Patient generatePatient() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESE EL No. DE CÉDULA DEL PACIENTE: ");
        String idPatient1 = scanner.nextLine();
        long idPatient=1;
        while (!Physioterapist.isNumeric(idPatient1)) {
            System.out.println("INGRESE UN DATO NUMÉRICO:  ");
            idPatient1 = scanner.nextLine();
        }
        try {
            idPatient = Integer.valueOf(idPatient1);
        } catch (Exception e) {
            System.out.println("NO SE PUEDE TRANSFORMAR");
        }
        
        

        System.out.println("INGRESE EL NOMBRE DEL PACIENTE: ");
        String namePatient = scanner.nextLine();

        System.out.println("INGRESE EL APELLIDO DEL PACIENTE: ");
        String lastNamePatient = scanner.nextLine();

        System.out.println("INGRESE EL No. DE CONTACTO DEL PACIENTE: ");
        String contactPatient = scanner.nextLine();
        while (!Physioterapist.isNumeric(contactPatient)) {
            System.out.println("INGRESE UN DATO NUMÉRICO:  ");
            idPatient1 = scanner.nextLine();
        }
        
        Patient patient = new Patient(idPatient, namePatient, lastNamePatient, contactPatient);
        return patient;

    }

    

    public static Appointment generateAppointment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESE EL No. DE CÉDULA DEL PACIENTE: ");
        long idPatient=1;
        String idPatient1=scanner.nextLine();
        while (!Physioterapist.isNumeric(idPatient1)) {
            System.out.println("INGRESE UN DATO NUMÉRICO:  ");
            idPatient1 = scanner.nextLine();
        }
        try {
            idPatient = Integer.valueOf(idPatient1);
        } catch (Exception e) {
            System.out.println("NO SE PUEDE TRANSFORMAR");
        }
        
        System.out.println("INGRESE LA FECHA DE LA CITA");
        String dateAppointment = scanner.nextLine();

        System.out.println("INGRESE LA HORA DE LA CITA: ");
        String hourAppointment = scanner.nextLine();

        Patient patient;
        patient = retrievePatient(idPatient);
        Appointment appointment = new Appointment(dateAppointment, hourAppointment, patient);
        
        return appointment;

    }

    public static Bill generateBill() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESE EL No. DE CÉDULA DEL PACIENTE: ");
        long idPatient=1;
        String idPatient1=scanner.nextLine();
        while (!Physioterapist.isNumeric(idPatient1)) {
            System.out.println("INGRESE UN DATO NUMÉRICO:  ");
            idPatient1 = scanner.nextLine();
        }
        try {
            idPatient = Integer.valueOf(idPatient1);
        } catch (Exception e) {
            System.out.println("NO SE PUEDE TRANSFORMAR");
        }

        

        Patient patient;
        patient = retrievePatient(idPatient);
        ArrayList<Product> products=new ArrayList<>() ;
        
        String optionToAddAProduct="y";
        
        while(optionToAddAProduct.contentEquals("y")){
            Product product=Physioterapist.generateProduct();
            products.add(product);
            System.out.println("DESEA AGREGAR OTRO PRODUCTO PRESIONE y");
            optionToAddAProduct=scanner.nextLine();
        }
        float price=0;
        for(Product eachProductOfBill:products){
            price=price+eachProductOfBill.getQuantity()*eachProductOfBill.getUnitPrice();
            
        }
        
        
        Bill bill = new Bill(price,patient,products);

        return bill;

    }
    public static Product generateProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESE EL DETALLE DEL PRODUCTO O SERVICIO: ");
        String description=scanner.nextLine();
        
        System.out.println("INGRESE LA CANTIDAD: ");
        
        int quantity=1;
        String quantity1=scanner.nextLine();
        while (!Physioterapist.isNumeric(quantity1)) {
            System.out.println("INGRESE UN DATO NUMÉRICO:  ");
            quantity1 = scanner.nextLine();
        }
        try {
            quantity = Integer.valueOf(quantity1);
        } catch (Exception e) {
            System.out.println("NO SE PUEDE TRANSFORMAR");
        }
        System.out.println("INGRESE EL VALOR UNITARIO: ");
        
        float unitPrice=1;
        String unitPrice1=scanner.nextLine();
        while (!Physioterapist.isFloat(unitPrice1)) {
            System.out.println("INGRESE UN DATO NUMÉRICO:  ");
            unitPrice1 = scanner.nextLine();
        }
        try {
            unitPrice = Float.valueOf(unitPrice1);
        } catch (Exception e) {
            System.out.println("NO SE PUEDE TRANSFORMAR");
        }

        
        
        Product product = new Product(description,quantity,unitPrice);

        return product;

    }
    

    public static Patient retrievePatient(long idPatient) {
        Gson gson = new Gson();
        String dataFile;
        dataFile = FileManager.find("patients.json", idPatient + "");
        Patient patient;
        patient = gson.fromJson(dataFile, Patient.class);;
        return patient;

    }
    public static Bill retrieveBill(long idPatient) {
        Gson gson = new Gson();
        String dataFile;
        
        dataFile = FileManager.find("bills.json", idPatient + "");
        Bill bill;
        bill = gson.fromJson(dataFile, Bill.class);;
        return bill;

    }


    public static Appointment retrieveAppointment(long idPatient) {
        Gson gson = new Gson();
        String dataFile;
        
        dataFile = FileManager.find("appointments.json", idPatient + "");
        Appointment appointment;
        appointment = gson.fromJson(dataFile, Appointment.class);;
        return appointment;

    }

    public static ClinicalHistory retrieveClinicalHistory(long idPatient) {
        Gson gson = new Gson();
        String dataFile;
        dataFile = FileManager.find("ClinicalHistory.json", idPatient + "");
        ClinicalHistory clinicalHistory;
        clinicalHistory = gson.fromJson(dataFile, ClinicalHistory.class);;
        return clinicalHistory;

    }

    public static ClinicalHistory createClinicalHistory() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESE EL No. DE CÉDULA DEL PACIENTE: ");
        long idPatient=1;
        String idPatient1=scanner.nextLine();
        while (!Physioterapist.isNumeric(idPatient1)) {
            System.out.println("INGRESE UN DATO NUMÉRICO:  ");
            idPatient1 = scanner.nextLine();
        }
        try {
            idPatient = Integer.valueOf(idPatient1);
        } catch (Exception e) {
            System.out.println("NO SE PUEDE TRANSFORMAR");
        }


        Patient patient;
        patient = retrievePatient(idPatient);

        System.out.println("INGRESE LA FECHA DE NACIMIENTO: ");
        String birthDate = scanner.nextLine();

        System.out.println("INGRESE EL PESO (Kg): ");
        float weight = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("INGRESE LA ALTURA (cm): ");
        float height = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("INGRESE LA DIRECCIÓN DEL DOMICILIO: ");
        String addressPatient = scanner.nextLine();

        System.out.println("INGRESE EL CORREO ELECTRÓNICO: ");
        String emailPatient = scanner.nextLine();

        ArrayList<Diagnostic> diagnostics = new ArrayList<>();

        System.out.println("INGRESE LOS ANTECEDENTES FAMILIARES: ");
        String familyBackground = scanner.nextLine();

        ClinicalHistory clinicalHistory = new ClinicalHistory(patient, birthDate, weight, height, addressPatient, emailPatient, diagnostics, familyBackground);

        return clinicalHistory;
    }

    public static Diagnostic createDiagnostic() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("INGRESE LA PATOLOGÍA DEL PACIENTE: ");
        String pathology = scanner.nextLine();

        System.out.println("INGRESE LOS SÍNTOMAS DEL PACIENTE: ");
        String symptoms = scanner.nextLine();

        System.out.println("INGRESA LAS ALERGIAS DEL PACIENTE: ");
        String allergies = scanner.nextLine();

        System.out.println("INGRESE LA FECHA DEL DIAGNÓSTICO: ");
        String dateOfDiagnostic = scanner.nextLine();

        System.out.println("INGRESE EL TRATAMIENTO DEL PACIENTE: ");
        String treatment = scanner.nextLine();

        Diagnostic diagnostic = new Diagnostic(pathology, treatment, symptoms, allergies, dateOfDiagnostic);

        return diagnostic;
    }
    //basado en algoritmo de http://lineadecodigo.com/java/validar-si-un-dato-es-numerico-en-java
    public static boolean isNumeric(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
    public static boolean isFloat(String string) {
        try {
            Float.parseFloat(string);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}
