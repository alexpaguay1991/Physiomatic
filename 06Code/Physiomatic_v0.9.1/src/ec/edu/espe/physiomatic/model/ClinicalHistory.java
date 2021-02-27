/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.model;

import ec.edu.espe.physiomatic.controller.ClinicalHistoryController;
import java.util.ArrayList;

/**
 *
 * @author Acer
 * @author pzeadrian
 */
public class ClinicalHistory {
    
    private Patient patient;
    private String birthDate;
    private float weight;
    private float height;  
    private ArrayList<Diagnostic> diagnostics=new ArrayList<>();
    private String familiyBackground;

    
    public ClinicalHistory(Patient patient, String birthDate, float weight, float height, ArrayList<Diagnostic> diagnostics, String familiyBackground) {
        this.patient = patient;
        this.birthDate = birthDate;
        this.weight = weight;
        this.height = height;
        this.diagnostics = diagnostics;
        this.familiyBackground = familiyBackground;
    }

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
    
    
}
