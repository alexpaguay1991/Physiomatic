/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.model;

import com.google.gson.Gson;
import ec.edu.espe.filemanager.utils.FileManager;
import ec.edu.espe.physiomatic.controller.PatientController;
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
public class Patient {

    private long id;
    private String name;
    private String lastName;
    private String email;
    private String address;
    private String phoneNumber;

    
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

    public Patient(long id, String namePatient, String lastNamePatient, String contactPatient) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    public Patient(String name, String lastName, String email, String address, String phoneNumber, long id) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Patient{" + "name=" + name + ", lastName=" + lastName + ", email=" + email + ", address=" + address + ", phoneNumber=" + phoneNumber + ", id=" + id + '}';
    }
    


}
