/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.model;

/**
 *
 * @author Acer
 * @author Santiago Risueño ESPE-DCCO
 * 
 */
public class Diagnostic {

    private String pathology;
    private String treatment;
    private String symptoms;
    private String dateOfDiagnostic;  

    /**
     * 
     * @param pathology, saves patient evaluations during appointment.
     * @param treatment, saves the treatment to be followed by the patient.
     * @param symptoms, saves the symptoms before the appointment.
     * @param dateOfDiagnostic, saves the date of appointment.
     */
    
    public Diagnostic(String pathology, String treatment, String symptoms, String dateOfDiagnostic) {
        this.pathology = pathology;
        this.treatment = treatment;
        this.symptoms = symptoms;
        this.dateOfDiagnostic = dateOfDiagnostic;      
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
     * @return the dateOfDiagnostic
     */
    public String getDateOfDiagnostic() {
        return dateOfDiagnostic;
    }

    /**
     * @param dateOfDiagnostic the dateOfDiagnostic to set
     */
    public void setDateOfDiagnostic(String dateOfDiagnostic) {
        this.dateOfDiagnostic = dateOfDiagnostic;
    }
}
