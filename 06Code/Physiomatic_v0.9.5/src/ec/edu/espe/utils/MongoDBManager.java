/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.physiomatic.model.Appointment;
import ec.edu.espe.physiomatic.model.Bill;
import ec.edu.espe.physiomatic.model.ClinicalHistory;
import ec.edu.espe.physiomatic.model.Diagnostic;
import ec.edu.espe.physiomatic.model.Patient;
import ec.edu.espe.physiomatic.model.Physioterapist;
import ec.edu.espe.physiomatic.model.Product;
import java.util.ArrayList;
import java.util.List;
import org.bson.BSONObject;
import org.bson.Document;

/**
 *
 * @author Acer
 */
public class MongoDBManager extends Persistence {

    MongoDatabase baseDatos;

    BasicDBObject document = new BasicDBObject();
    MongoCollection<Document> collection;
    MongoClient mongo;
    String nameCollection;

    Gson gson = new Gson();
    private static MongoDBManager instance;

    private MongoDBManager(String data, String dataBase) {
        try {
            MongoClientURI uri;
            uri = new MongoClientURI(data);
            mongo = new MongoClient(uri);
            baseDatos = mongo.getDatabase(dataBase);
            System.out.println("conection to database sucessfully");
        } catch (Exception e) {
            System.out.println("no ingresa");
        }
    }

    public static MongoDBManager getInstance(String data, String dataBase) {
        if (instance == null) {
            instance = new MongoDBManager(data, dataBase);
        }
        return instance;
    }

    public int countLines(String collectionName) {
        int numberLines = 0;
        collection = baseDatos.getCollection(collectionName);
        MongoCursor<Document> resultDocument = collection.find().iterator();
        while (resultDocument.hasNext()) {
            Document theObj = resultDocument.next();
            numberLines = numberLines + 1;
        }
        return numberLines;
    }

    @Override
    public void save(String fileName, String data) {
        Document admin;
        admin = Document.parse(data);
        collection = baseDatos.getCollection(fileName);
        collection.insertOne(admin);

    }

    @Override
    public String find(String fileName, String dataToFind) {
        String dataFound = "";
        try {
            collection = baseDatos.getCollection(fileName);
            MongoCursor<Document> resultDocument = collection.find().iterator();

            while (resultDocument.hasNext()) {
                Document theObj = resultDocument.next();
                if (theObj.toJson().contains(dataToFind)) {

                    dataFound = theObj.toJson();
                    dataFound = gson.toJson(theObj);
                }
            }
        } catch (Exception e) {
            dataFound = "";
        }
        return dataFound;
    }

    @Override
    public void delete(String fileName, String datatodelete) {
        collection = baseDatos.getCollection(fileName);
        Document admin;
        admin = Document.parse(datatodelete);
        collection.findOneAndDelete(admin);

    }

    @Override
    public void update(String fileName, String dataToFind, String datatoUpdate) {
        Document adminOld, adminNew;
        adminOld = Document.parse(dataToFind);
        adminNew = Document.parse(datatoUpdate);
        collection = baseDatos.getCollection(fileName);
        collection.deleteOne(adminOld);
        collection.insertOne(adminNew);

    }

    @Override
    public String[] read(String fileName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String[] findAll(String fileName) {
        String[] data = new String[countLines(fileName)];
        int i = 0;
        String dataFound = "";
        try {
            collection = baseDatos.getCollection(fileName);
            MongoCursor<Document> resultDocument = collection.find().iterator();
            while (resultDocument.hasNext()) {
                Document theObj = resultDocument.next();
                dataFound = gson.toJson(theObj);
                data[i] = dataFound;
                i = i + 1;
            }

        } catch (Exception e) {
        }
        return data;
    }
}
