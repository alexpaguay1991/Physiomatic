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
import ec.edu.espe.utils.MongoDBManager;
import ec.edu.espe.utils.FileManager1;
import ec.edu.espe.utils.Persistence;
import java.util.ArrayList;
import org.bson.Document;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author Acer
 * @author Santiago Risueño ESPE-DCCO
 * @author pzeadrian
 */
public class PhysiomaticController {

    static Gson gson = new Gson();
    static MongoDBManager mongo = MongoDBManager.getInstance();
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
        Patient patient = conection.retrievePatient(id);
        Connection conection2 = new Connection("clinicalHistory");
        ClinicalHistory clinicalHistory = conection2.retrieveClinicalHistory(patient);
        String[][] matrix = new String[clinicalHistory.getDiagnostics().size()][4];
        for (int i = 0; i < clinicalHistory.getDiagnostics().size(); i++) {
            matrix[i][0] = clinicalHistory.getDiagnostics().get(i).getDateOfDiagnostic();
            matrix[i][1] = clinicalHistory.getDiagnostics().get(i).getSymptoms();
            matrix[i][2] = clinicalHistory.getDiagnostics().get(i).getTreatment();
            matrix[i][3] = clinicalHistory.getDiagnostics().get(i).getPathology();
            //
        }
        return matrix;
    }

    public static String[][] showTable() {
        ArrayList<Patient> patients = new ArrayList<Patient>();
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

    public static void addDiagnostic(long id, String symptom, String pathology, String treatment, String date) {
        Diagnostic diagnostic = new Diagnostic(pathology, treatment, symptom, date);
        Patient patient = retrievePatient(id);
        ClinicalHistory clinicalHistory = retrieveClinicalHistory(patient);
        mongo.delete("clinicalHistory", gson.toJson(clinicalHistory));
        ClinicalHistory newClinicalHistory = clinicalHistory;
        newClinicalHistory.getDiagnostics().add(diagnostic);
        mongo.save("clinicalHistory", gson.toJson(newClinicalHistory));
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

    public void createPatient(long id, String address, String name, String lastname, String email, String phoneNumber) {
        Patient patient = new Patient(id, address, name, lastname, email, phoneNumber);
        String data = gson.toJson(patient);
        mongo.save("patients", data);

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

}
