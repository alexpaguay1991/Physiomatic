/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.physiomatic.controller.PhysiomaticController;
import ec.edu.espe.physiomatic.model.Appointment;
import ec.edu.espe.physiomatic.model.Bill;
import ec.edu.espe.physiomatic.model.ClinicalHistory;
import ec.edu.espe.physiomatic.model.Diagnostic;
import ec.edu.espe.physiomatic.model.Patient;
import ec.edu.espe.physiomatic.model.Physioterapist;
import ec.edu.espe.physiomatic.model.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import org.bson.BSONObject;
import org.bson.Document;

/**
 *
 * @author Acer
 */
public class Connection {

    MongoDatabase baseDatos;
    //DBCollection collection;
    BasicDBObject document = new BasicDBObject();
    MongoCollection<Document> collection;
    MongoClient mongo;
    String nameCollection;

    Gson gson = new Gson();

    public Connection(String nameCollection) {
        try {
            this.nameCollection = nameCollection;
            String data;
            data = "mongodb+srv://AlexPaguay:resende1A@physiomatic.ths5b.mongodb.net/Physiomatic?retryWrites=true&w=majority";

            MongoClientURI uri;
            uri = new MongoClientURI(data);
            mongo = new MongoClient(uri);
            baseDatos = mongo.getDatabase("Physiomatic");

            collection = baseDatos.getCollection(nameCollection);
            System.out.println("conection to database sucessfully");

        } catch (Exception e) {
            System.out.println("no ingresa");

        }
    }

    /**
     *
     * @param bill
     */
    public void insertBill() {
        Bill bill;
        bill = Physioterapist.generateBill();
        BSONObject bson = (BSONObject) com.mongodb.util.JSON.parse(gson.toJson(bill));
        Document admin;
        admin = new Document("price", bill.getPrice());
        bson = (BSONObject) com.mongodb.util.JSON.parse(gson.toJson(bill.getPatient()));
        admin.append("patient", bson);
        bson = (BSONObject) com.mongodb.util.JSON.parse(gson.toJson(bill.getProducts()));
        admin.append("products", bson);
        collection.insertOne(admin);
        mongo.close();

    }

    public void insertAppointment(Appointment appointment) {

        BSONObject bson;
        Document admin;
        admin = new Document("dateOfAppointment", appointment.getDateOfAppointment());
        admin.append("hour", appointment.getHour());
        bson = (BSONObject) com.mongodb.util.JSON.parse(gson.toJson(appointment.getPatient()));
        admin.append("patient", bson);
        collection.insertOne(admin);
        mongo.close();

    }

    public void insertClinicalHistory(ClinicalHistory clinicalHistory) {

        BSONObject bson = (BSONObject) com.mongodb.util.JSON.parse(gson.toJson(clinicalHistory.getPatient()));
        Document admin;
        admin = new Document("patient", bson);
        admin.append("birthDate", clinicalHistory.getBirthDate());
        admin.append("weight", clinicalHistory.getWeight());
        admin.append("height", clinicalHistory.getHeight());
        admin.append("familiyBackground", clinicalHistory.getFamiliyBackground());
        admin.append("bloodType", clinicalHistory.getBloodType());
        admin.append("allergy", clinicalHistory.getAllergy());
        bson = (BSONObject) com.mongodb.util.JSON.parse(gson.toJson(clinicalHistory.getDiagnostics()));
        admin.append("diagnostics", bson);
        collection.insertOne(admin);
        mongo.close();

    }

    public void insertPhysioterapist(Physioterapist physioterapist) {

        Document admin=generatePhysioterapistDocument(physioterapist);
        collection.insertOne(admin);
        mongo.close();

    }

    public void insertPatient(Patient patient) {
        Document admin;
        admin = new Document("id", patient.getId());
        admin.append("name", patient.getName());
        admin.append("lastName", patient.getLastName());
        admin.append("email", patient.getEmail());
        admin.append("address", patient.getAddress());
        admin.append("phoneNumber", patient.getPhoneNumber());

        collection.insertOne(admin);
        mongo.close();

    }

    public void mostrar() {
        Patient patient1;
        ConectionPatient conectionPatient = new ConectionPatient("patients");
        patient1 = conectionPatient.retrievePatient(2101044556);
        System.out.println("-------" + patient1.getName());
        System.out.println("-------" + patient1.getIdPatient());
        System.out.println("-------" + patient1.getLastName());
        System.out.println("-------" + patient1.getContactPatient());
        MongoCursor<Document> resultDocument = collection.find().iterator();
        String jsonResult;
        float price;
        Bill bill1;

        while (resultDocument.hasNext()) {
            Document theObj = resultDocument.next();
            String billprobe = gson.toJson(theObj.get("patient"));
            System.out.println("-----" + billprobe);
            patient1 = gson.fromJson(billprobe, Patient.class);
            //patient = gson.fromJson(dataFile, Patient.class);
            billprobe = gson.toJson(theObj.get("products"));

            ArrayList<Product> products3 = gson.fromJson(billprobe, new TypeToken<List<Product>>() {
            }.getType());
            for (Product producta : products3) {
                System.out.println("---" + producta.getDescription());
            }
            billprobe = gson.toJson(theObj.get("price"));
            price = Float.parseFloat(billprobe);
            bill1 = new Bill(price, patient1, products3);

            SystemView2 bill12 = new SystemView2(bill1.getPatient());
            bill12.displayBill();

        }
    }

    public Physioterapist retrievePhysioterapist(String username, String password) {
        Physioterapist physioterapist;
        MongoCursor<Document> resultDocument = collection.find().iterator();
        String userName1;
        String password1;
        long id;
        String address;
        String name;
        String lastname;
        String email;
        String phoneNumber;

        Physioterapist physioterapistRetrieved = new Physioterapist("username", " password", 0, "name", "name", "lastName", "name", "username1");
        while (resultDocument.hasNext()) {
            Document theObj = resultDocument.next();
            userName1 = gson.toJson(theObj.get("userName")).replace("\"", "");
            password1 = gson.toJson(theObj.get("password")).replace("\"", "");
            id = Long.parseLong(gson.toJson(theObj.get("id")));
            address = gson.toJson(theObj.get("address")).replace("\"", "");
            name = gson.toJson(theObj.get("name")).replace("\"", "");
            lastname = gson.toJson(theObj.get("lastname")).replace("\"", "");
            email = gson.toJson(theObj.get("email")).replace("\"", "");
            phoneNumber = gson.toJson(theObj.get("phoneNumber")).replace("\"", "");
            physioterapist = new Physioterapist(userName1, password1, id, address, name, lastname, email, phoneNumber);

            if (username.contentEquals(physioterapist.getUserName()) && password.contentEquals(physioterapist.getPassword())) {
                physioterapistRetrieved = physioterapist;
            }

        }
        return physioterapistRetrieved;

    }

    public ClinicalHistory retrieveClinicalHistory(Patient patient) {
        ClinicalHistory clinicalHistory;
        MongoCursor<Document> resultDocument = collection.find().iterator();
        String birthDate;
        float weight;
        float height;
        ArrayList<Diagnostic> diagnostics = new ArrayList<>();
        String familiyBackground;
        String bloodType;
        String allergy;
        Patient patientNull = new Patient(0, "null", "null", "null", "null", "null");

        ClinicalHistory clinicalHistoryRetrieved = new ClinicalHistory(patientNull, "null", 0, 0, "null", "null", "null", diagnostics);
        while (resultDocument.hasNext()) {
            Document theObj = resultDocument.next();
            birthDate = gson.toJson(theObj.get("birthDate")).replace("\"", "");
            weight = Float.parseFloat(gson.toJson(theObj.get("weight")));
            height = Float.parseFloat(gson.toJson(theObj.get("height")));
            familiyBackground = gson.toJson(theObj.get("familiyBackground")).replace("\"", "");
            bloodType = gson.toJson(theObj.get("bloodType")).replace("\"", "");
            allergy = gson.toJson(theObj.get("allergy")).replace("\"", "");
            String diagnostics1 = gson.toJson(theObj.get("diagnostics"));
            String patient1 = gson.toJson(theObj.get("patient"));
            Patient patient2 = gson.fromJson(patient1, Patient.class);
            diagnostics = gson.fromJson(diagnostics1, new TypeToken<List<Diagnostic>>() {
            }.getType());
            clinicalHistory = new ClinicalHistory(patient2, birthDate, weight, height, familiyBackground, bloodType, allergy, diagnostics);

            if (patient.getId() == clinicalHistory.getPatient().getId()) {
                clinicalHistoryRetrieved = clinicalHistory;
            }

        }
        return clinicalHistoryRetrieved;

    }

    public ArrayList<ClinicalHistory> retrieveClinicalHistories() {
        ArrayList<ClinicalHistory> clinicalHistories = new ArrayList<>();
        ClinicalHistory clinicalHistory;
        MongoCursor<Document> resultDocument = collection.find().iterator();
        String birthDate;
        float weight;
        float height;
        ArrayList<Diagnostic> diagnostics = new ArrayList<>();
        String familiyBackground;
        String bloodType;
        String allergy;
        Patient patientNull = new Patient(0, "null", "null", "null", "null", "null");

        ClinicalHistory clinicalHistoryRetrieved = new ClinicalHistory(patientNull, "null", 0, 0, "null", "null", "null", diagnostics);
        while (resultDocument.hasNext()) {
            Document theObj = resultDocument.next();
            birthDate = gson.toJson(theObj.get("birthDate")).replace("\"", "");
            weight = Float.parseFloat(gson.toJson(theObj.get("weight")));
            height = Float.parseFloat(gson.toJson(theObj.get("height")));
            familiyBackground = gson.toJson(theObj.get("familiyBackground")).replace("\"", "");
            bloodType = gson.toJson(theObj.get("bloodType")).replace("\"", "");
            allergy = gson.toJson(theObj.get("allergy")).replace("\"", "");
            String diagnostics1 = gson.toJson(theObj.get("diagnostics"));
            String patient1 = gson.toJson(theObj.get("patient"));
            Patient patient2 = gson.fromJson(patient1, Patient.class);
            diagnostics = gson.fromJson(diagnostics1, new TypeToken<List<Diagnostic>>() {
            }.getType());
            clinicalHistory = new ClinicalHistory(patient2, birthDate, weight, height, familiyBackground, bloodType, allergy, diagnostics);

            clinicalHistories.add(clinicalHistory);

        }
        return clinicalHistories;

    }

    public Bill retrieveBill(Patient patient) {
        Bill bill;
        MongoCursor<Document> resultDocument = collection.find().iterator();

        float price;
        ArrayList<Product> products = new ArrayList<>();
        Patient patientNull = new Patient(0, "null", "null", "null", "null", "null");

        Bill billRetrieved = new Bill(0, patientNull, products);

        while (resultDocument.hasNext()) {
            Document theObj = resultDocument.next();
            String billprobe = gson.toJson(theObj.get("patient"));

            Patient patient1 = gson.fromJson(billprobe, Patient.class);

            billprobe = gson.toJson(theObj.get("products"));

            ArrayList<Product> products3 = gson.fromJson(billprobe, new TypeToken<List<Product>>() {
            }.getType());
            billprobe = gson.toJson(theObj.get("price"));
            price = Float.parseFloat(billprobe);
            bill = new Bill(price, patient1, products3);
            if (patient.getId() == bill.getPatient().getId()) {
                billRetrieved = bill;
            }

        }
        return billRetrieved;

    }

    public ArrayList<Bill> retrieveBills(Patient patient) {
        ArrayList<Bill> bills = new ArrayList<>();
        Bill bill;
        MongoCursor<Document> resultDocument = collection.find().iterator();

        float price;
        ArrayList<Product> products = new ArrayList<>();
        Patient patientNull = new Patient(0, "null", "null", "null", "null", "null");

        Bill billRetrieved = new Bill(0, patientNull, products);

        while (resultDocument.hasNext()) {
            Document theObj = resultDocument.next();
            String billprobe = gson.toJson(theObj.get("patient"));

            Patient patient1 = gson.fromJson(billprobe, Patient.class);

            billprobe = gson.toJson(theObj.get("products"));

            ArrayList<Product> products3 = gson.fromJson(billprobe, new TypeToken<List<Product>>() {
            }.getType());
            billprobe = gson.toJson(theObj.get("price"));
            price = Float.parseFloat(billprobe);
            bill = new Bill(price, patient1, products3);
            if (patient.getId() == bill.getPatient().getId()) {
                bills.add(bill);
            }

        }
        return bills;

    }

    public Appointment retrieveAppointment(Patient patient) {
        Appointment appointment;
        MongoCursor<Document> resultDocument = collection.find().iterator();

        String dateOfAppointment;
        String hour;
        Patient patientNull = new Patient(0, "null", "null", "null", "null", "null");

        Appointment appointmentRetrieved = new Appointment("null", "null", patientNull);
        while (resultDocument.hasNext()) {
            Document theObj = resultDocument.next();
            dateOfAppointment = gson.toJson(theObj.get("dateOfAppointment")).replace("\"", "");
            hour = gson.toJson(theObj.get("hour")).replace("\"", "");
            String patient1 = gson.toJson(theObj.get("patient"));
            Patient patient2 = gson.fromJson(patient1, Patient.class);

            appointment = new Appointment(dateOfAppointment, hour, patient2);

            if (patient.getId() == appointment.getPatient().getId()) {
                appointmentRetrieved = appointment;
            }

        }
        return appointmentRetrieved;

    }

    public ArrayList<Appointment> retrieveAppointments(Patient patient) {
        ArrayList<Appointment> appointments = new ArrayList<>();
        Appointment appointment;
        MongoCursor<Document> resultDocument = collection.find().iterator();

        String dateOfAppointment;
        String hour;
        Patient patientNull = new Patient(0, "null", "null", "null", "null", "null");

        Appointment appointmentRetrieved = new Appointment("null", "null", patientNull);
        while (resultDocument.hasNext()) {
            Document theObj = resultDocument.next();
            dateOfAppointment = gson.toJson(theObj.get("dateOfAppointment")).replace("\"", "");
            hour = gson.toJson(theObj.get("hour")).replace("\"", "");
            String patient1 = gson.toJson(theObj.get("patient"));
            Patient patient2 = gson.fromJson(patient1, Patient.class);

            appointment = new Appointment(dateOfAppointment, hour, patient2);

            if (patient.getId() == appointment.getPatient().getId()) {
                appointments.add(appointment);
            }

        }
        return appointments;

    }

    public Patient retrievePatient(long idPatient) {
        Patient patient;
        MongoCursor<Document> resultDocument = collection.find().iterator();
        long id;
        String name;
        String lastName;
        String email;
        String address;
        String phoneNumber;

        Patient patientRetrieved = new Patient(0, "null", "null", "null", "null", "null");
        while (resultDocument.hasNext()) {
            Document theObj = resultDocument.next();
            id = Long.parseLong(gson.toJson(theObj.get("id")));
            address = gson.toJson(theObj.get("address")).replace("\"", "");
            name = gson.toJson(theObj.get("name")).replace("\"", "");
            lastName = gson.toJson(theObj.get("lastName")).replace("\"", "");
            email = gson.toJson(theObj.get("email")).replace("\"", "");
            phoneNumber = gson.toJson(theObj.get("phoneNumber")).replace("\"", "");
            patient = new Patient(id, name, lastName, email, address, phoneNumber);

            if (idPatient == patient.getId()) {
                patientRetrieved = patient;
            }

        }
        return patientRetrieved;

    }

    public ArrayList<Patient> retrievePatients() {
        ArrayList<Patient> patients = new ArrayList<>();
        MongoCursor<Document> resultDocument = collection.find().iterator();
        long id;
        String name;
        String lastName;
        String email;
        String address;
        String phoneNumber;
        Patient patient;

        while (resultDocument.hasNext()) {
            Document theObj = resultDocument.next();
            id = Long.parseLong(gson.toJson(theObj.get("id")));
            address = gson.toJson(theObj.get("address")).replace("\"", "");
            name = gson.toJson(theObj.get("name")).replace("\"", "");
            lastName = gson.toJson(theObj.get("lastName")).replace("\"", "");
            email = gson.toJson(theObj.get("email")).replace("\"", "");
            phoneNumber = gson.toJson(theObj.get("phoneNumber")).replace("\"", "");
            patient = new Patient(id, name, lastName, email, address, phoneNumber);
            patients.add(patient);

        }
        return patients;

    }

    public Document generatePatientDocument(Patient patient) {
        Document admin;
        admin = new Document("id", patient.getId());
        admin.append("name", patient.getName());
        admin.append("lastName", patient.getLastName());
        admin.append("email", patient.getEmail());
        admin.append("address", patient.getAddress());
        admin.append("phoneNumber", patient.getPhoneNumber());

        return admin;
    }

    public Document generatePhysioterapistDocument(Physioterapist physioterapist) {
        Document admin;
        admin = new Document("userName", physioterapist.getUserName());
        admin.append("password", physioterapist.getPassword());
        admin.append("id", physioterapist.getId());
        admin.append("address", physioterapist.getAddress());
        admin.append("name", physioterapist.getName());
        admin.append("lastname", physioterapist.getLastName());
        admin.append("email", physioterapist.getEmail());
        admin.append("phoneNumber", physioterapist.getPhoneNumber());

        return admin;
    }

    public Document generateBillDocument(Bill bill) {
        Document admin;
        admin = new Document("price", bill.getPrice());
        BSONObject bson = (BSONObject) com.mongodb.util.JSON.parse(gson.toJson(bill.getPatient()));
        admin.append("patient", bson);
        bson = (BSONObject) com.mongodb.util.JSON.parse(gson.toJson(bill.getProducts()));
        admin.append("products", bson);

        return admin;
    }

    public Document generateAppointmentDocument(Appointment appointment) {
        BSONObject bson;
        Document admin;
        admin = new Document("dateOfAppointment", appointment.getDateOfAppointment());
        admin.append("hour", appointment.getHour());
        bson = (BSONObject) com.mongodb.util.JSON.parse(gson.toJson(appointment.getPatient()));
        admin.append("patient", bson);

        return admin;
    }
    
    public Document generateClinicalHistoryDocument(ClinicalHistory clinicalHistory) {
        BSONObject bson = (BSONObject) com.mongodb.util.JSON.parse(gson.toJson(clinicalHistory.getPatient()));
        Document admin;
        admin = new Document("patient", bson);
        admin.append("birthDate", clinicalHistory.getBirthDate());
        admin.append("weight", clinicalHistory.getWeight());
        admin.append("height", clinicalHistory.getHeight());
        admin.append("familiyBackground", clinicalHistory.getFamiliyBackground());
        admin.append("bloodType", clinicalHistory.getBloodType());
        admin.append("allergy", clinicalHistory.getAllergy());
        bson = (BSONObject) com.mongodb.util.JSON.parse(gson.toJson(clinicalHistory.getDiagnostics()));
        admin.append("diagnostics", bson);

        return admin;
    }
    public void deleteClinicalHistory(ClinicalHistory clinicalHistory) {

        try {

            Document findDocument = generateClinicalHistoryDocument(clinicalHistory);
            collection.findOneAndDelete(findDocument);
        } catch (Exception e) {
            Document findDocument = generateClinicalHistoryDocument(clinicalHistory);
            collection.findOneAndDelete(findDocument);
        }
    }
    public void deletePatient(Patient oldPatient) {

        try {

            Document findDocument = generatePatientDocument(oldPatient);
            collection.findOneAndDelete(findDocument);
        } catch (Exception e) {
            Document findDocument = generatePatientDocument(oldPatient);
            collection.findOneAndDelete(findDocument);
        }
    }
    public void deleteAppointment(Appointment appointment) {

        try {

            Document findDocument = generateAppointmentDocument(appointment);
            collection.findOneAndDelete(findDocument);
        } catch (Exception e) {
            Document findDocument = generateAppointmentDocument(appointment);
            collection.findOneAndDelete(findDocument);
        }
    }

    public void deleteBill(Bill bill) {

        try {

            Document findDocument = generateBillDocument(bill);
            collection.findOneAndDelete(findDocument);
        } catch (Exception e) {
            Document findDocument = generateBillDocument(bill);
            collection.findOneAndDelete(findDocument);
        }
    }

    public void deletePhysioterapist(Physioterapist oldPhysioterapist) {

        try {

            Document findDocument = generatePhysioterapistDocument(oldPhysioterapist);
            collection.findOneAndDelete(findDocument);
        } catch (Exception e) {
            Document findDocument = generatePhysioterapistDocument(oldPhysioterapist);
            collection.findOneAndDelete(findDocument);
        }
    }

    public void updatePatient(Patient patientOld, Patient patientNew) {

        try {

            Document findDocument = generatePatientDocument(patientOld);
            Document updateDocument = generatePatientDocument(patientNew);
            collection.findOneAndUpdate(findDocument, updateDocument);
        } catch (Exception e) {
            Document findDocument = generatePatientDocument(patientOld);
            Document updateDocument = generatePatientDocument(patientNew);
            collection.findOneAndUpdate(findDocument, updateDocument);
        }
    }
     public void updateClinicalHistory(ClinicalHistory clinicalHistoryOld, ClinicalHistory clinicalHistoryNew) {

        try {

            Document findDocument = generateClinicalHistoryDocument(clinicalHistoryOld);
            Document updateDocument = generateClinicalHistoryDocument(clinicalHistoryNew);
            collection.findOneAndUpdate(findDocument, updateDocument);
        } catch (Exception e) {
             Document findDocument = generateClinicalHistoryDocument(clinicalHistoryOld);
            Document updateDocument = generateClinicalHistoryDocument(clinicalHistoryNew);
            collection.findOneAndUpdate(findDocument, updateDocument);
        }
    }

    public void updateBill(Bill billOld, Bill billNew) {

        try {

            Document findDocument = generateBillDocument(billOld);
            Document updateDocument = generateBillDocument(billNew);
            collection.findOneAndUpdate(findDocument, updateDocument);
        } catch (Exception e) {
            Document findDocument = generateBillDocument(billOld);
            Document updateDocument = generateBillDocument(billNew);
            collection.findOneAndUpdate(findDocument, updateDocument);
        }
    }
    public void updateAppointment(Appointment appointmentOld, Appointment appointmentNew) {

        try {

            Document findDocument = generateAppointmentDocument(appointmentOld);
            Document updateDocument = generateAppointmentDocument(appointmentNew);
            collection.findOneAndUpdate(findDocument, updateDocument);
        } catch (Exception e) {
             Document findDocument = generateAppointmentDocument(appointmentOld);
            Document updateDocument = generateAppointmentDocument(appointmentNew);
            collection.findOneAndUpdate(findDocument, updateDocument);
        }
    }


    
}
