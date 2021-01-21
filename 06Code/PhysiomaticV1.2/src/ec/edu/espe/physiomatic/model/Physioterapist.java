/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.model;

import com.google.gson.Gson;
import ec.edu.espe.filemanager.utils.FileManager;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Santiago Risueño ESPE-DCCO
 */
public class Physioterapist {

    private static Patient retrievePatient(long idPatient) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String name;
    private String lastName;
    private String userName;
    private String password;

    public static Patient generatePatient() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrece la cédula del paciente");
        Long idPatient = scanner.nextLong();
        scanner.nextLine();

        System.out.println("Ingrese el nombre del paciente");
        String namePatient = scanner.nextLine();

        System.out.println("Ingrese el apellido del paciente");
        String lastNamePatient = scanner.nextLine();

        System.out.println("Ingrese el número telefónico del paciente");
        String contactPatient = scanner.nextLine();
        scanner.nextLine();

        Patient patient = new Patient(idPatient, namePatient, lastNamePatient, contactPatient);
        return patient;

    }

    public static Appointment generateAppointment(long idPatient, String dateAppointment, String hourOfAppointment) {

        Patient patient;
        patient = retrievePatient(idPatient);
        Appointment appointment = new Appointment(dateAppointment, hourOfAppointment, patient.getName());

        return appointment;

    }

    public ClinicalHistory createClinicalHistory(Patient patient, Diagnostic diagnostic) {
        Scanner scanner = new Scanner(System.in);
       /*
        String pathology;
        String treatment;
        String symptoms;
        String familyBackground;
        String allergies;
        */
        ClinicalHistory clinicalHistory;
        
        clinicalHistory = new ClinicalHistory(patient);

        System.out.println("Ingrese la patología que presenta");
        String pathology = scanner.nextLine();
        System.out.println("Ingrese el tratamiento a seguir");
        String treatment = scanner.nextLine();
        System.out.println("Ingrese los síntomas que presenta");
        String symptoms = scanner.nextLine();
        System.out.println("Ingrese los antecedentes familiares");
        String familyBackground = scanner.nextLine();
        System.out.println("Ingrese las alergias");
        String allergies = scanner.nextLine();
        
        /*
                 pathology;
    private String treatment;
    private String symptoms;
    private String familyBackground;
    private String allergies;
    private Date dateOfDiagnostic;*/

        return clinicalHistory;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public Physioterapist(String name, String lastName, String userName, String password) {
        this.name = name;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
    }

    @Override
    public String toString() {
        return name + ";" + lastName + ";" + userName + ";" + password;
    }

}
