/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.model;

import java.util.Date;

/**
 *
 * @author Acer
 */
public class Diagnostic {
    private Patient patient;
    private String pathology;
    private String treatment;
    private String symptoms;
    private String familyBackground;
    private String allergies;
    private Date dateOfDiagnostic;

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
     * @return the pathology
     */
    public String getPathology() {
        return pathology;
    }

    /**
     * @param pathology the pathology to set
     */
    public void setPathology(String pathology) {
        this.pathology = pathology;
    }

    /**
     * @return the treatment
     */
    public String getTreatment() {
        return treatment;
    }

    /**
     * @param treatment the treatment to set
     */
    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    /**
     * @return the symptoms
     */
    public String getSymptoms() {
        return symptoms;
    }

    /**
     * @param symptoms the symptoms to set
     */
    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    /**
     * @return the familyBackground
     */
    public String getFamilyBackground() {
        return familyBackground;
    }

    /**
     * @param familyBackground the familyBackground to set
     */
    public void setFamilyBackground(String familyBackground) {
        this.familyBackground = familyBackground;
    }

    /**
     * @return the allergies
     */
    public String getAllergies() {
        return allergies;
    }

    /**
     * @param allergies the allergies to set
     */
    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    /**
     * @return the dateOfDiagnostic
     */
    public Date getDateOfDiagnostic() {
        return dateOfDiagnostic;
    }

    /**
     * @param dateOfDiagnostic the dateOfDiagnostic to set
     */
    public void setDateOfDiagnostic(Date dateOfDiagnostic) {
        this.dateOfDiagnostic = dateOfDiagnostic;
    }

    public Diagnostic(Patient patient, String pathology, String treatment, String symptoms, String familyBackground, String allergies, Date dateOfDiagnostic) {
        this.patient = patient;
        this.pathology = pathology;
        this.treatment = treatment;
        this.symptoms = symptoms;
        this.familyBackground = familyBackground;
        this.allergies = allergies;
        this.dateOfDiagnostic = dateOfDiagnostic;
    }

    @Override
    public String toString() {
        return "Diagnostic{" + "patient=" + patient + ", pathology=" + pathology + ", treatment=" + treatment + ", symptoms=" + symptoms + ", familyBackground=" + familyBackground + ", allergies=" + allergies + ", dateOfDiagnostic=" + dateOfDiagnostic + '}';
    }
    

    
    
    
}
