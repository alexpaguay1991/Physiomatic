/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.controller;

import com.google.gson.Gson;
import ec.edu.espe.physiomatic.model.ClinicalHistory;
import ec.edu.espe.physiomatic.model.Diagnostic;
import ec.edu.espe.physiomatic.model.Patient;
import ec.edu.espe.utils.MongoDBManager;
import java.util.ArrayList;

/**
 *
 * @author Acer
 * @author pzeadrian
 * @author Yulliana Roman ESPE-DCCO
 */
public class PatientController {
    static Gson gson = new Gson();
    static MongoDBManager mongo =MongoDBManager.getInstance();
    static DataTranslation translation =new DataTranslation();
    public static void createClinicalHistory(long idPatient, String birthDate, float weight, float height, String familiyBackground, String bloodType, String allergy) {
        Patient patient=PhysiomaticController.retrievePatient(idPatient);
        ArrayList <Diagnostic> diagnostics = new ArrayList<>();
        ClinicalHistory clinicalHistory = new ClinicalHistory(patient, birthDate, weight, height, familiyBackground, bloodType, allergy, diagnostics );
        mongo.save("clinicalHistory",gson.toJson(clinicalHistory));      
    }        
}
