/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mongodb.client.MongoCursor;
import static ec.edu.espe.physiomatic.controller.PhysiomaticController.mongo;

import ec.edu.espe.physiomatic.model.Appointment;
import ec.edu.espe.physiomatic.model.Bill;
import ec.edu.espe.physiomatic.model.ClinicalHistory;
import ec.edu.espe.physiomatic.model.Diagnostic;
import ec.edu.espe.physiomatic.model.Patient;
import ec.edu.espe.physiomatic.model.Physioterapist;
import ec.edu.espe.physiomatic.model.Product;
import ec.edu.espe.utils.Validation;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author Alex Paguay
 */
public class DataTranslation {

    Gson gson = new Gson();
    ObjectMapper mapper = new ObjectMapper();
    Document doc;

    public Patient retrievePatient(String documentPatient) {
        Patient patient;
        patient = new Patient(0, "null", "null", "null", "null", "null");
        String id;
        try {
            doc = gson.fromJson(documentPatient, Document.class);
            id = gson.toJson(doc.get("id")).replace("E9", "").replace(".", "").replace("E8", "").replace("E7", "");
            long id1 = Long.parseLong(id);
            String name = gson.toJson(doc.get("name")).replace("\"", "");
            String address = gson.toJson(doc.get("address")).replace("\"", "");
            String lastName = gson.toJson(doc.get("lastName")).replace("\"", "");
            String email = gson.toJson(doc.get("email")).replace("\"", "");
            String phoneNumber = gson.toJson(doc.get("phoneNumber")).replace("\"", "");
            patient = new Patient(id1, address, name, lastName, email, phoneNumber);
        } catch (Exception e) {
            System.out.println("no ingresa");
        }
        return patient;

    }

    public ClinicalHistory retrieveClinicalHistory(String clinicalHistoryDocument) {
        ArrayList<Diagnostic> diagnostics = new ArrayList<>();
        Patient patientNull = new Patient(0, "null", "null", "null", "null", "null");
        ClinicalHistory clinicalHistory = new ClinicalHistory(patientNull, "null", 0, 0, "null", "null", "null", diagnostics);
        try {
            
            doc = gson.fromJson(clinicalHistoryDocument, Document.class);
            String birthDate = gson.toJson(doc.get("birthDate")).replace("\"", "");
            float weight = Float.parseFloat(gson.toJson(doc.get("weight")));
            float height = Float.parseFloat(gson.toJson(doc.get("height")));
            String familiyBackground = gson.toJson(doc.get("familiyBackground")).replace("\"", "");
            String bloodType = gson.toJson(doc.get("bloodType")).replace("\"", "");
            String allergy = gson.toJson(doc.get("allergy")).replace("\"", "");
            String diagnostics1 = gson.toJson(doc.get("diagnostics"));
            String patient1 = gson.toJson(doc.get("patient"));
            Patient patient2 = gson.fromJson(patient1, Patient.class);
            diagnostics = gson.fromJson(diagnostics1, new TypeToken<List<Diagnostic>>() {
            }.getType());
            clinicalHistory = new ClinicalHistory(patient2, birthDate, weight, height, familiyBackground, bloodType, allergy, diagnostics);

        } catch (Exception e) {

        }
        return clinicalHistory;

    }

    public Physioterapist retrievePhysioterapist(String physioterapistDocument) {
        Physioterapist physioterapist = new Physioterapist("username", " password", 0, "name", "name", "lastName", "name", "username1");
        try {
            //doc = mapper.readValue(physioterapistDocument, Document.class);
            doc = gson.fromJson(physioterapistDocument, Document.class);
            String userName1 = gson.toJson(doc.get("userName")).replace("\"", "");
            String password1 = gson.toJson(doc.get("password")).replace("\"", "");
            long id = Long.parseLong(gson.toJson(doc.get("id")));
            String address = gson.toJson(doc.get("address")).replace("\"", "");
            String name = gson.toJson(doc.get("name")).replace("\"", "");
            String lastname = gson.toJson(doc.get("lastname")).replace("\"", "");
            String email = gson.toJson(doc.get("email")).replace("\"", "");
            String phoneNumber = gson.toJson(doc.get("phoneNumber")).replace("\"", "");
            physioterapist = new Physioterapist(userName1, password1, id, address, name, lastname, email, phoneNumber);

        } catch (Exception e) {

        }

        return physioterapist;

    }

    public Appointment retrieveAppointment(String appointmentDocument) {
        Patient patientNull = new Patient(0, "null", "null", "null", "null", "null");
        Appointment appointment = new Appointment("null", "null", patientNull);
        try {
            doc = mapper.readValue(appointmentDocument, Document.class);
            String dateOfAppointment = gson.toJson(doc.get("dateOfAppointment")).replace("\"", "");
            String hour = gson.toJson(doc.get("hour")).replace("\"", "");
            String patient1 = gson.toJson(doc.get("patient"));
            Patient patient2 = gson.fromJson(patient1, Patient.class);

            appointment = new Appointment(dateOfAppointment, hour, patient2);
        } catch (Exception e) {

        }
        return appointment;

    }

    public Bill retrieveBill(String billDocument) {
        ArrayList<Product> products = new ArrayList<>();
        Patient patient1 = new Patient(0, "null", "null", "null", "null", "null");
        Bill bill = new Bill(0, patient1, products);
        try {
            doc = mapper.readValue(billDocument, Document.class);
            String patient = gson.toJson(doc.get("patient"));
            patient1 = gson.fromJson(patient, Patient.class);
            String products1 = gson.toJson(doc.get("products"));
            products = gson.fromJson(products1, new TypeToken<List<Product>>() {
            }.getType());
            float price = Float.parseFloat(gson.toJson(doc.get("price")));
            bill = new Bill(price, patient1, products);

        } catch (Exception e) {

        }
        return bill;

    }
     public  ArrayList<Patient> retrievePatients() {
        String patients[];
        Patient eachPatient;
        patients=mongo.findAll("patients");
        ArrayList<Patient> patients1 = new ArrayList<Patient>();
        for(int i=0;i<patients.length;i++){
            eachPatient=retrievePatient(patients[i]);
            patients1.add(eachPatient);
        }
       
        return patients1;
    }
     public ArrayList<Appointment> retrieveAppointments() {
        String appointments[];
        Appointment eachAppointment;
        appointments=mongo.findAll("appointments");
        ArrayList<Appointment> appointments1 = new ArrayList<Appointment>();
        for(int i=0;i<appointments.length;i++){
            eachAppointment=retrieveAppointment(appointments[i]);
            appointments1.add(eachAppointment);
        }
       
        return appointments1;
    }
     public ArrayList<Appointment> retrieveAppointmentsSpecific(Patient patient) {
        String appointments[];
        Appointment eachAppointment;
        appointments=mongo.findAll("appointments");
        ArrayList<Appointment> appointments1 = new ArrayList<Appointment>();
        for(int i=0;i<appointments.length;i++){
            eachAppointment=retrieveAppointment(appointments[i]);
            if(patient.getId()==eachAppointment.getPatient().getId()){
                appointments1.add(eachAppointment);
            }
            
        }
       
        return appointments1;
    }
     
     public ArrayList<ClinicalHistory> retrieveClinicalHistories() {
        String clinicalHistories[];
        ClinicalHistory eachClinicalHistory;
        clinicalHistories=mongo.findAll("clinicalHistory");
        ArrayList<ClinicalHistory> clinicalHistories1 = new ArrayList<ClinicalHistory>();
        for(int i=0;i<clinicalHistories.length;i++){
            eachClinicalHistory=retrieveClinicalHistory(clinicalHistories[i]);
            clinicalHistories1.add(eachClinicalHistory);
        }
       
        return clinicalHistories1;
    }
    
}
