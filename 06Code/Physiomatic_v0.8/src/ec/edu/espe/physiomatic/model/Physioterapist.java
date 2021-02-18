/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.model;

import com.google.gson.Gson;
import ec.edu.espe.filemanager.utils.FileManager;
import ec.edu.espe.physiomatic.controller.PhysiomaticController;
import ec.edu.espe.physiomatic.view.SystemView2;
import ec.edu.espe.utils.Validation;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Acer
 * @author Santiago Risueño ESPE-DCCO
 */
public class Physioterapist {

    /**
     * 
     * @param name, saves the name of physioterapist.
     * @param lastName, saves the last name of physioterapist.
     * @param username, saves the username of physioterapist.
     * @param password, saves the password of physioterapist. 
     */
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
        Patient patient = PhysiomaticController.createPatient();
        return patient;

    }
     public static Patient retrievePatient(long idPatient) {
        Patient patient = PhysiomaticController.retrievePatient(idPatient);
        return patient;

    }

     public static Appointment generateAppointment() {
       
        Appointment appointment = PhysiomaticController.generateAppointment();
        
        return appointment;

    }

    public static Bill generateBill() {
        
        
        Bill bill = PhysiomaticController.generateBill();

        return bill;

    }
    public static Bill retrieveBill(long idPatient) {
        
        Bill bill;
        bill=PhysiomaticController.retrieveBill(idPatient);
        return bill;

    }
    public static Appointment retrieveAppointment(long idPatient) {
        Appointment appointment;
        appointment=PhysiomaticController.retrieveAppointment(idPatient);
        return appointment;
    }
    public static void printAllPatients() {
        Gson gson = new Gson();
        Scanner scanner = new Scanner(System.in);
        List<Patient> patients1;
        patients1 = new ArrayList();
        String[] patients;
        patients = FileManager.findAll("patients.json");
        Patient eachPatient;
        for (String line : patients) {
            eachPatient = gson.fromJson(line, Patient.class);
            patients1.add(eachPatient);
        }
        for (Patient patient : patients1) {
            SystemView2 view = new SystemView2(patient);
            view.displayPatient();
        }
        scanner.nextLine();
    }
}
