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
 * @author Acer
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
        Long idPatient = scanner.nextLong();
        scanner.nextLine();

        System.out.println("INGRESE EL NOMBRE DEL PACIENTE: ");
        String namePatient = scanner.nextLine();

        System.out.println("INGRESE EL APELLIDO DEL PACIENTE: ");
        String lastNamePatient = scanner.nextLine();

        System.out.println("INGRESE EL No. DE CONTACTO DEL PACIENTE: ");
        String contactPatient = scanner.nextLine();
        scanner.nextLine();

        Patient patient = new Patient(idPatient, namePatient, lastNamePatient, contactPatient);
        return patient;

    }

    public void modifyPatient(Patient patient) {

    }

    public void deletePatient(Patient patient) {

    }

    public static Appointment generateAppointment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESE EL No. DE CÉDULA DEL PACIENTE: ");
        long idPatient = scanner.nextLong();
        scanner.nextLine();

        System.out.println("INGRESE LA FECHA DE LA CITA");
        String dateAppointment = scanner.nextLine();

        System.out.println("INGRESE LA HORA DE LA CITA: ");
        String hourAppointment = scanner.nextLine();

        Patient patient;
        patient = retrievePatient(idPatient);
        Appointment appointment = new Appointment(dateAppointment, hourAppointment, patient.getName());

        return appointment;

    }

    public static Bill generateBill() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESE EL No. DE CÉDULA DEL PACIENTE: ");
        long idPatient = scanner.nextLong();
        scanner.nextLine();

        System.out.println("INGRESE EL MONTO DEL VALOR A PAGAR: ");
        float price = scanner.nextFloat();
        scanner.nextLine();

        Patient patient;
        patient = retrievePatient(idPatient);
        Bill bill = new Bill(price, patient);

        return bill;

    }

    public void deployAppointment(Appointment appointment) {

    }

    public static Patient retrievePatient(long idPatient) {
        Gson gson = new Gson();
        String dataFile;
        dataFile = FileManager.find("patients.json", idPatient + "");
        Patient patient;
        patient = gson.fromJson(dataFile, Patient.class);;
        return patient;

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
        long idPatient = scanner.nextLong();
        scanner.nextLine();

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
    public static boolean isNumeric(String cadena){
        try {
                Integer.parseInt(cadena);
                return true;
        } catch (NumberFormatException nfe){
                return false;
        }
    }
}
