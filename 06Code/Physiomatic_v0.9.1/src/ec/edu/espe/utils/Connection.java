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
    public void insertAppointment() {
        Appointment appointment;
        appointment = Physioterapist.generateAppointment();
        BSONObject bson;
        Document admin;
        admin = new Document("dateOfAppointment", appointment.getDateOfAppointment());
        admin.append("hour", appointment.getHour());
        bson = (BSONObject) com.mongodb.util.JSON.parse(gson.toJson(appointment.getPatient()));
        admin.append("products", bson);
        collection.insertOne(admin);
        mongo.close();

    }
    public void insertClinicalHistory() {
        ClinicalHistory clinicalHistory;
        clinicalHistory = Physioterapist.createClinicalHistory();
        BSONObject bson = (BSONObject) com.mongodb.util.JSON.parse(gson.toJson(clinicalHistory.getPatient()));
        Document admin;
        admin = new Document("patient", bson);
        admin.append("birthDate", clinicalHistory.getBirthDate());
        admin.append("weight", clinicalHistory.getWeight());
        admin.append("height", clinicalHistory.getHeight());
        admin.append("addressPatient", clinicalHistory.getAddressPatient());
        admin.append("emailPatient", clinicalHistory.getEmailPatient());
        bson = (BSONObject) com.mongodb.util.JSON.parse(gson.toJson(clinicalHistory.getDiagnostics()));
        admin.append("diagnostics", bson);
        admin.append("familiyBackground", clinicalHistory.getFamiliyBackground());
        collection.insertOne(admin);
        mongo.close();

    }
    public void insertPhysioterapist(Physioterapist physioterapist) {
       
        Document admin;
        admin = new Document("userName", physioterapist.getUserName());
        admin.append("password", physioterapist.getPassword());
        admin.append("id", physioterapist.getId());
        admin.append("address", physioterapist.getAddress());
        admin.append("name", physioterapist.getName());
        admin.append("lastname", physioterapist.getLastname());
        admin.append("email", physioterapist.getEmail());
        admin.append("phoneNumber", physioterapist.getPhoneNumber());
        collection.insertOne(admin);
        mongo.close();

    }
    long id;
    String name;
    String lastName;
    String email;
    String address;
    String phoneNumber;
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
        ConectionPatient conectionPatient=new ConectionPatient("patients");
        patient1=conectionPatient.retrievePatient(2101044556);
        System.out.println("-------"+patient1.getName());
         System.out.println("-------"+patient1.getIdPatient());
          System.out.println("-------"+patient1.getLastName());
           System.out.println("-------"+patient1.getContactPatient());
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
    public Physioterapist retrievePhysioterapist( String username,String password) {
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
        
        Physioterapist physioterapistRetrieved=new Physioterapist("username"," password", 0, "name", "name", "lastName", "name", "username1");
        while (resultDocument.hasNext()) {
            Document theObj = resultDocument.next();
            userName1=gson.toJson(theObj.get("userName")).replace("\"", "");
            password1=gson.toJson(theObj.get("password")).replace("\"", "");
            id=Long.parseLong(gson.toJson(theObj.get("id")));
            address=gson.toJson(theObj.get("address")).replace("\"", "");
            name=gson.toJson(theObj.get("name")).replace("\"", "");
            lastname=gson.toJson(theObj.get("lastname")).replace("\"", "");
            email=gson.toJson(theObj.get("email")).replace("\"", "");
            phoneNumber=gson.toJson(theObj.get("phoneNumber")).replace("\"", "");
            physioterapist=new Physioterapist(userName1,password1,id,address,name,lastname,email,phoneNumber);
           
            
            if (username.contentEquals(physioterapist.getUserName()) && password.contentEquals(physioterapist.getPassword())){
                physioterapistRetrieved=physioterapist;
            }
            
        }
        return physioterapistRetrieved;
        
    }
    public void showSpecificBill(String idPatient) {
        /*Patient patient1;
        DBCursor cursor=coleccion.find();
        //DBObject cursor1=coleccion.;
         //System.out.println("cursor1"+cursor1);
         System.out.println("-----------");
        while(cursor.hasNext()){
            DBObject theObj = cursor.next();
            BasicDBObject bill = ( BasicDBObject) theObj;
            String price=bill.getString("price");
            String patient=bill.getString("patient");
            String products=bill.getString("products");
            String name=bill.getString("name");
            
           
           
            patient1 = gson.fromJson(patient, Patient.class);
            System.out.println("Nombre: "+patient1.getName());
            String[] products1=products.replace("[", "").replace("]", "").split("}");
            String line;
            ArrayList<Product> products3=new ArrayList<>();
            Product eachProduct;
            for(int i=0;i<=products1.length-1;i=i+1){
                line=products1[0]+"}";
                eachProduct=gson.fromJson(line, Product.class);
                products3.add(eachProduct);
                System.out.println("--"+line);
            }
            Bill billfinal;
            billfinal=new Bill(Float.parseFloat(price),patient1,products3);
            SystemView2 bill12 = new SystemView2(billfinal.getPatient());
            bill12.displayBill();*/

    }

    /*public boolean actualizar(String accionVieja,String accionNueva){
        document.put("accion",accionVieja);
        BasicDBObject documentNuevo=new BasicDBObject();
        documentNuevo.put("accion", accionNueva);
        coleccion.findAndModify(document, documentNuevo);
        return true;
    }
    public boolean eliminar(String accion){
        document.put("accion",accion);
        coleccion.remove(document);
        return true;
    }
     */
}
