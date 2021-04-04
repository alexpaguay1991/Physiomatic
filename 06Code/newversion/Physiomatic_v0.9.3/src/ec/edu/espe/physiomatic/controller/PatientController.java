/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.controller;

import com.google.gson.Gson;
import ec.edu.espe.physiomatic.model.ClinicalHistory;
import ec.edu.espe.utils.MongoDBManager;

/**
 *
 * @author Acer
 * @author pzeadrian
 * @author Yulliana Roman ESPE-DCCO
 */
public class PatientController {

    static String data = "mongodb+srv://AlexPaguay:resende1A@physiomatic.ths5b.mongodb.net/Physiomatic?retryWrites=true&w=majority";
    static String dataBase = "Physiomatic";
    static Gson gson = new Gson();
    static MongoDBManager mongo = MongoDBManager.getInstance(data, dataBase);
    static DataTranslation translation = new DataTranslation();

    public static void createClinicalHistory(ClinicalHistory clinicalHistory) {
        mongo.save("clinicalHistory", gson.toJson(clinicalHistory));
    }
}
