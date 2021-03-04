/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.controller;

import com.google.gson.Gson;
import com.sun.org.apache.bcel.internal.generic.GETFIELD;
import ec.edu.espe.filemanager.utils.FileManager;
import ec.edu.espe.physiomatic.model.Appointment;
import ec.edu.espe.physiomatic.model.Bill;
import ec.edu.espe.physiomatic.model.ClinicalHistory;
import ec.edu.espe.physiomatic.model.Diagnostic;
import ec.edu.espe.physiomatic.model.Patient;
import ec.edu.espe.physiomatic.model.Physioterapist;
import ec.edu.espe.physiomatic.model.Product;
import ec.edu.espe.utils.Connection;
import ec.edu.espe.utils.LoginMenu;
import ec.edu.espe.utils.Validation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Acer
 * @author Santiago Risueño ESPE-DCCO
 * @author pzeadrian
 */
public class PhysiomaticController {

    public static String[][] showTableClinicalHistories() {
        ArrayList<ClinicalHistory> clinicaHistories = new ArrayList<>();
        Connection conection = new Connection("clinicalHistory");
        clinicaHistories = conection.retrieveClinicalHistories();
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
        Patient patient = conection.retrievePatient(id);
        Connection conection2 = new Connection("clinicalHistory");
        ClinicalHistory clinicalHistory = conection2.retrieveClinicalHistory(patient);
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
        ArrayList<Patient> patients = new ArrayList<Patient>();
        Connection conection = new Connection("patients");
        patients = conection.retrievePatients();
        for (Patient patiens1 : patients) {
            System.out.println(patiens1.getName());
        }
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

    public static void addDiagnostic(long id, String symptom, String pathology, String treatment, String date) {
        Diagnostic diagnostic = new Diagnostic(pathology, treatment, symptom, date);
        Connection connection = new Connection("patients");
        Patient patient = connection.retrievePatient(id);
        Connection connection2 = new Connection("clinicalHistory");
        ClinicalHistory clinicalHistory = connection2.retrieveClinicalHistory(patient);
        ClinicalHistory newClinicalHistory = clinicalHistory;
        newClinicalHistory.getDiagnostics().add(diagnostic);
        connection2.updateClinicalHistory(clinicalHistory, newClinicalHistory);
    }

    public static String[][] showAppointmentTable(long id) {
        ArrayList<Appointment> appointments = new ArrayList<Appointment>();
        Connection connection = new Connection("patients");
        Patient patient = connection.retrievePatient(id);
        connection = new Connection("appointments");
        appointments = connection.retrieveAppointments(patient);
        String[][] matrix = new String[appointments.size()][3];
        for (int i = 0; i < appointments.size(); i++) {
            matrix[i][1] = appointments.get(i).getHour();
            matrix[i][0] = appointments.get(i).getDateOfAppointment();
        }
        return matrix;
    }

    public Physioterapist createPhsyioterapist() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("INGRESE EL NUMERO DE CEDULA DEL FISIOTERAPEUTA: ");
        long id = scanner.nextLong();
        scanner.nextLine();

        System.out.println("INGRESE EL NOMBRE DEL FISIOTERAPEUTA: ");
        String name = scanner.nextLine();
        while (!Validation.validateLetters(name)) {
            System.out.println("EXISTEN DATOS INCORRECTOS, INGRESE ÚNICAMENTE LETRAS");
            name = scanner.nextLine();
        }

        System.out.println("INGRESE EL APELLIDO DEL FISIOTERAPEUTA: ");
        String lastName = scanner.nextLine();
        while (!Validation.validateLetters(lastName)) {
            System.out.println("INGRESE ÚNICAMENTE LETRAS");
            lastName = scanner.nextLine();
        }
        System.out.println("INGRESE LA DIRECCION DEL FISIOTERAPEUTA: ");
        String address = scanner.nextLine();

        System.out.println("INGRESE EL EMAIL DEL FISIOTERAPEUTA: ");
        String email = scanner.nextLine();

        System.out.println("INGRESE EL NUMERO DE TELEFONO DEL FISIOTERAPEUTA: ");
        String phoneNumber = scanner.nextLine();

        System.out.println("INGRESE EL NOMBRE DE USUARIO DEL FISIOTERAPEUTA: ");
        String username = scanner.nextLine();

        System.out.println("INGRESE UNA CONTRASEÑA: ");
        String password = scanner.nextLine();

        Physioterapist physiotherapist = new Physioterapist(username, password, id, address, name, lastName, email, phoneNumber);
        return physiotherapist;
    }

    public static void createPatient(long id, String address, String name, String lastname, String email, String phoneNumber) {

        Patient patient = new Patient(id, address, name, lastname, email, phoneNumber);
        Connection conection = new Connection("patients");
        conection.insertPatient(patient);

    }

    public static void createPhysioterapist(String userName, String password, long id, String address, String name, String lastname, String email, String phoneNumber) {
        Physioterapist physioterapist = new Physioterapist(userName, password, id, address, name, lastname, email, phoneNumber);
        Connection conection = new Connection("physioterapist");
        conection.insertPhysioterapist(physioterapist);

        //return physioterapist;
    }

    public static void createAppoinment(String date, String time, long id) {
        Patient patient;
        Connection conection = new Connection("patients");
        patient = conection.retrievePatient(id);
        Appointment appointment = new Appointment(date, time, patient);
        conection = new Connection("appointments");
        conection.insertAppointment(appointment);
    }
    
    public static Patient retrievePatient(long idPatient) {
        Gson gson = new Gson();
        String dataFile;
        dataFile = FileManager.find("patients.json", idPatient + "");
        Patient patient;
        patient = gson.fromJson(dataFile, Patient.class);;
        return patient;
    }

    public static Appointment generateAppointment() {
        Scanner scanner = new Scanner(System.in);
        long idPatient = LoginMenu.validateId();

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
        long idPatient = LoginMenu.validateId();
        Patient patient;
        patient = retrievePatient(idPatient);
        return null;
    }

    @SuppressWarnings("empty-statement")
    public static Bill retrieveBill(long idPatient) {
        Gson gson = new Gson();
        String dataFile;

        dataFile = FileManager.find("bills.json", idPatient + "");
        Bill bill;
        bill = gson.fromJson(dataFile, Bill.class);;
        return bill;

    }

    @SuppressWarnings("empty-statement")
    public static Appointment retrieveAppointment(long idPatient) {
        Gson gson = new Gson();
        String dataFile;

        dataFile = FileManager.find("appointments.json", idPatient + "");
        Appointment appointment;
        appointment = gson.fromJson(dataFile, Appointment.class);;
        return appointment;

    }
}
