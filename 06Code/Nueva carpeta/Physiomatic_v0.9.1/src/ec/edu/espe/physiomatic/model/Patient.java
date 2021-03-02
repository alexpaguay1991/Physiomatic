/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.model;

import com.google.gson.Gson;
import ec.edu.espe.filemanager.utils.FileManager;
import ec.edu.espe.physiomatic.controller.PatientController;
import ec.edu.espe.physiomatic.controller.PhysiomaticController;
import static ec.edu.espe.physiomatic.model.Physioterapist.retrievePatient;
import ec.edu.espe.utils.LoginMenu;
import ec.edu.espe.utils.Validation;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Acer
 * @author Santiago Risueño ESPE-DCCO
 * @author pzeadrian
 */
public class Patient extends Person{

   

    
    public static ClinicalHistory createClinicalHistory() {
        
        ClinicalHistory clinicalHistory = PatientController.createClinicalHistory();
        return clinicalHistory;
    }

    public static void updateClinicalHistory(long idPatient) {

        PatientController.updateClinicalHistory(idPatient);
    }
    public static ClinicalHistory retrieveClinicalHistory(long idPatient) {
       
        ClinicalHistory clinicalHistory;
        clinicalHistory=PatientController.retrieveClinicalHistory(idPatient);
        return clinicalHistory;

    }

    public Patient(long id, String address, String name, String lastname, String email, String phoneNumber) {
        super(id, address, name, lastname, email, phoneNumber);
    }

   
    @Override
    public String toString() {
        return "Patient{" + '}';
    }

    
    @Override
    public void createAPerson() {
        PhysiomaticController.createPatient(0, address, name, lastName, email, phoneNumber);
        
    }

}
