/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Acer
 */
public class ClinicalHistory {
    
    private Patient patient;
    private String birthDate;
    private float weight;
    private float height;
    private String addressPatient;
    private String emailPatient;
    private ArrayList<Diagnostic> diagnostics=new ArrayList<>();
    private String familiyBackground;
    

    /**
     * @return the patient
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * @param patient the patient to set
     */
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    /**
     * @return the birthDate
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * @return the height
     */
    public float getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     * @return the addressPatient
     */
    public String getAddressPatient() {
        return addressPatient;
    }

    /**
     * @param addressPatient the addressPatient to set
     */
    public void setAddressPatient(String addressPatient) {
        this.addressPatient = addressPatient;
    }

    /**
     * @return the emailPatient
     */
    public String getEmailPatient() {
        return emailPatient;
    }

    /**
     * @param emailPatient the emailPatient to set
     */
    public void setEmailPatient(String emailPatient) {
        this.emailPatient = emailPatient;
    }

    /**
     * @return the diagnostics
     */
    public ArrayList<Diagnostic> getDiagnostics() {
        return diagnostics;
    }

    /**
     * @param diagnostics the diagnostics to set
     */
    public void setDiagnostics(ArrayList<Diagnostic> diagnostics) {
        this.diagnostics = diagnostics;
    }

    /**
     * @return the familiyBackground
     */
    public String getFamiliyBackground() {
        return familiyBackground;
    }

    /**
     * @param familiyBackground the familiyBackground to set
     */
    public void setFamiliyBackground(String familiyBackground) {
        this.familiyBackground = familiyBackground;
    }

    public ClinicalHistory(Patient patient, String birthDate, float weight, float height, String addressPatient, String emailPatient,ArrayList<Diagnostic> diagnostics, String familiyBackground) {
        this.patient = patient;
        this.birthDate = birthDate;
        this.weight = weight;
        this.height = height;
        this.addressPatient = addressPatient;
        this.emailPatient = emailPatient;
        this.diagnostics= diagnostics;
        this.familiyBackground = familiyBackground;
    }
    // colocar el methodos crear diagnosticos
    
    
}
