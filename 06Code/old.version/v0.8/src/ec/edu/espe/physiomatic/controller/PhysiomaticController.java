/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.controller;

import com.google.gson.Gson;
import ec.edu.espe.filemanager.utils.FileManager;
import ec.edu.espe.physiomatic.model.Appointment;
import ec.edu.espe.physiomatic.model.Bill;
import ec.edu.espe.physiomatic.model.Patient;
import ec.edu.espe.physiomatic.model.Person;
import ec.edu.espe.physiomatic.model.Physioterapist;
import ec.edu.espe.physiomatic.model.Product;
import ec.edu.espe.utils.LoginMenu;
import ec.edu.espe.utils.Validation;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Acer
 * @author Yulliana Roman ESPE-DCCO
 */
public class PhysiomaticController {

    public static Physioterapist createPhsyioterapist() {
        Scanner scanner = new Scanner(System.in);

        long id = LoginMenu.validateId("FISIOTERAPEUTA");

        System.out.println("INGRESE EL NOMBRE DEL FISIOTERAPEUTA: ");
        String name = scanner.nextLine();

        System.out.println("INGRESE EL APELLIDO DEL FISIOTERAPEUTA: ");
        String lastName = scanner.nextLine();

        System.out.println("INGRESE EL No. DE CONTACTO DEL FISIOTERAPEUTA: ");
        String phoneNumber = scanner.nextLine();
        while (!Validation.isNumeric(phoneNumber)) {
            System.out.println("INGRESE UN DATO NUMÉRICO:  ");
            phoneNumber = scanner.nextLine();
        }

        System.out.println("INGRESE EL EMAIL DEL FISIOTERAPEUTA: ");
        String email = scanner.nextLine();

        System.out.println("INGRESE LA DIRECCION DEL FISIOTERAPEUTA: ");
        String address = scanner.nextLine();

        System.out.println("INGRESE EL NOMBRE DE USUARIO DEL FISIOTERAPEUTA: ");
        String username = scanner.nextLine();

        System.out.println("INGRESE UNA CONTRASEÑA: ");
        String password = scanner.nextLine();

        Physioterapist physiotherapist = new Physioterapist(username, password, id, address, name, lastName, email, phoneNumber);
        return physiotherapist;
    }

    public static Person createPatient() {
        Scanner scanner = new Scanner(System.in);
        long id = LoginMenu.validateId("PACIENTE");

        System.out.println("INGRESE EL NOMBRE DEL PACIENTE: ");
        String name = scanner.nextLine();

        System.out.println("INGRESE EL APELLIDO DEL PACIENTE: ");
        String lastName = scanner.nextLine();

        System.out.println("INGRESE EL No. DE CONTACTO DEL PACIENTE: ");
        String phoneNumber = scanner.nextLine();
        while (!Validation.isNumeric(phoneNumber)) {
            System.out.println("INGRESE UN DATO NUMÉRICO:  ");
            phoneNumber = scanner.nextLine();
        }

        System.out.println("INGRESE EL EMAIL DEL PACIENTE: ");
        String email = scanner.nextLine();

        System.out.println("INGRESE LA DIRECCION DEL PACIENTE: ");
        String address = scanner.nextLine();

        Person patient = new Patient(id, address, name, lastName, email, phoneNumber);
        return patient;
    }

    public static Patient retrievePatient(long idPatient) {
        Gson gson = new Gson();
        String dataFile;
        dataFile = FileManager.find("patients.json", idPatient + "");
        Patient patient;
        patient = gson.fromJson(dataFile, Patient.class);
        return patient;

    }

    public static Appointment generateAppointment() {
        Scanner scanner = new Scanner(System.in);
        long idPatient = LoginMenu.validateId("PACIENTE");

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
        long idPatient = LoginMenu.validateId("PACIENTE");
        Patient patient;
        patient = retrievePatient(idPatient);
        ArrayList<Product> products = new ArrayList<>();

        String optionToAddAProduct = "y";

        while (optionToAddAProduct.contentEquals("y")) {
            Product product = Bill.generateProduct();
            products.add(product);
            System.out.println("DESEA AGREGAR OTRO PRODUCTO PRESIONE y");
            optionToAddAProduct = scanner.nextLine();
        }
        float price = 0;
        for (Product eachProductOfBill : products) {
            price = price + eachProductOfBill.getQuantity() * eachProductOfBill.getUnitPrice();

        }

        Bill bill = new Bill(price, patient, products);

        return bill;

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

}
