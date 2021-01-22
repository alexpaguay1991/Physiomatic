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

<<<<<<< HEAD
    public static Patient generatePatient() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entry the patient's id");
        Long idPatient = scanner.nextLong();
        scanner.nextLine();

        System.out.println("Entry the Patient's first name");
        String namePatient = scanner.nextLine();

        System.out.println("Entry the Patient's last name");
        String lastNamePatient = scanner.nextLine();

        System.out.println("Entry the Patient's contact");
=======
      
    public static Patient generatePatient( ){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese el No. de Cédula del paciente:");
        Long idPatient = scanner.nextLong();
        scanner.nextLine();
        
        System.out.println("Ingrese el nombre del paciente:");
        String namePatient = scanner.nextLine();
        
        System.out.println("Ingrese el apellido del paciente:");
        String lastNamePatient = scanner.nextLine();
        
        System.out.println("Ingrese el No. de contacto del paciente:");
>>>>>>> c3045b119e72a99c671220640a78bce9d87ded33
        String contactPatient = scanner.nextLine();
        scanner.nextLine();

        Patient patient = new Patient(idPatient, namePatient, lastNamePatient, contactPatient);
        return patient;

    }

    public void modifyPatient(Patient patient) {

    }

    public void deletePatient(Patient patient) {

    }
<<<<<<< HEAD

    public static Appointment generateAppointment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entry the patient's id");
        long idPatient = scanner.nextLong();
        scanner.nextLine();

        System.out.println("Entry the date of Appointment");
        String dateAppointment = scanner.nextLine();

        System.out.println("Entry the hour of appointment");
=======
    public static Appointment generateAppointment( ){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese el No. de Cédula del paciente: ");
        long idPatient = scanner.nextLong();
        scanner.nextLine();
        
        System.out.println("Ingrese la fecha de la cita: ");
        String dateAppointment = scanner.nextLine();
        
        System.out.println("INgrese la hora de la cita: ");
>>>>>>> c3045b119e72a99c671220640a78bce9d87ded33
        String hourAppointment = scanner.nextLine();

        Patient patient;
        patient = retrievePatient(idPatient);
        Appointment appointment = new Appointment(dateAppointment, hourAppointment, patient.getName());

        return appointment;

    }
<<<<<<< HEAD

    public static Bill generateBill() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entry the patient's id");
        long idPatient = scanner.nextLong();
        scanner.nextLine();

        System.out.println("Entry the price of Bill");
=======
    public static Bill generateBill( ){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese el No. de Cédula del paciente: ");
        long idPatient = scanner.nextLong();
        scanner.nextLine();
        
        System.out.println("Ingrese el monto del valor a pagar: ");
>>>>>>> c3045b119e72a99c671220640a78bce9d87ded33
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

    public static ClinicalHistory retrieveClinicalHistory(long idPatient) {
        Gson gson = new Gson();
        String dataFile;
        dataFile = FileManager.find("ClinicalHistory.json", idPatient + "");
        ClinicalHistory clinicalHistory;
        clinicalHistory = gson.fromJson(dataFile, ClinicalHistory.class);;
        return clinicalHistory;

    }
<<<<<<< HEAD

    public static ClinicalHistory createClinicalHistory() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el ID del paciente");
=======
    public static ClinicalHistory createClinicalHistory(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese el No. de Cédula del paciente: ");
>>>>>>> c3045b119e72a99c671220640a78bce9d87ded33
        long idPatient = scanner.nextLong();
        scanner.nextLine();

        Patient patient;
<<<<<<< HEAD
        patient = retrievePatient(idPatient);

        System.out.println("Ingrese la fecha de nacimiento");
        String birthDate = scanner.nextLine();

        System.out.println("Ingrese el peso");
        float weight = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Ingrese la altura");
        float height = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Ingrese la dirección domiciliaria");
        String addressPatient = scanner.nextLine();

        System.out.println("Ingrese el correo electrónico");
        String emailPatient = scanner.nextLine();

        ArrayList<Diagnostic> diagnostics = new ArrayList<>();

        System.out.println("Ingrese los antecedentes familiares");
=======
        patient=retrievePatient(idPatient);
        
        System.out.println("Ingrese la fecha de nacimiento: ");
        String birthDate = scanner.nextLine();
        
        System.out.println("Ingrese el peso: ");
        float weight = scanner.nextFloat();
        scanner.nextLine();
        
        System.out.println("Ingrese la altura: ");
        float height = scanner.nextFloat();
        scanner.nextLine();
        
        System.out.println("Ingrese la dirección del domicilio: ");
        String addressPatient = scanner.nextLine();
       
        System.out.println("Ingrese el correo electrónico: ");
        String emailPatient = scanner.nextLine();
        
        ArrayList<Diagnostic> diagnostics=new ArrayList<>();
        
        System.out.println("Ingrese los antecedentes familiares: ");
>>>>>>> c3045b119e72a99c671220640a78bce9d87ded33
        String familyBackground = scanner.nextLine();

        ClinicalHistory clinicalHistory = new ClinicalHistory(patient, birthDate, weight, height, addressPatient, emailPatient, diagnostics, familyBackground);

        return clinicalHistory;
    }

    public static Diagnostic createDiagnostic() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("INGRESE LA PATOLOGÍA DEL PACIENTE ");
        String pathology = scanner.nextLine();

        System.out.println("INGRESE LOS SÍNTOMAS DEL PACIENTE ");
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
}
