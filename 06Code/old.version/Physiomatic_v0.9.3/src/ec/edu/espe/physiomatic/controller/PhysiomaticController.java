/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.controller;

import com.google.gson.Gson;
import ec.edu.espe.filemanager.utils.FileManager;
import ec.edu.espe.physiomatic.model.Appointment;
import ec.edu.espe.physiomatic.model.ClinicalHistory;
import ec.edu.espe.physiomatic.model.Diagnostic;
import ec.edu.espe.physiomatic.model.Patient;
import ec.edu.espe.physiomatic.model.Physioterapist;
import ec.edu.espe.utils.Connection;
import ec.edu.espe.utils.FileManager1;
import ec.edu.espe.utils.Persistence;
import java.util.ArrayList;

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
    public static void createPatient(long id, String address, String name, String lastname, String email, String phoneNumber) {

        Patient patient = new Patient(id, address, name, lastname, email, phoneNumber);
        Connection conection = new Connection("patients");
        conection.insertPatient(patient);

    }

    public static void createPhysioterapist(String userName, String password, long id, String address, String name, String lastname, String email, String phoneNumber) {
        Physioterapist physioterapist = new Physioterapist(userName, password, id, address, name, lastname, email, phoneNumber);
        Connection conection = new Connection("physioterapist");
        conection.insertPhysioterapist(physioterapist);
        Persistence fileManager = new FileManager1();
        Gson gson = new Gson();                
        fileManager.save("physioterapists.json", gson.toJson(physioterapist), "Physioterapist");        
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

}
