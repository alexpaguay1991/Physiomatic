/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.model;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Diagnostic {

    private String pathology;
    private String treatment;
    private String symptoms;
    private String allergies;
    private String dateOfDiagnostic;

    @Override
    public String toString() {
        return "DIAGNÓSTICO {" + "PATOLOGÍA = " + pathology + ", TRATAMIENTO = " + treatment + ", SÍNTOMAS = " + symptoms + ", ALERGIAS = " + allergies + ", FECHA DEL DIAGNÓSTICO = " + dateOfDiagnostic + '}';
    }

    public Diagnostic(String pathology, String treatment, String symptoms, String allergies, String dateOfDiagnostic) {
        this.pathology = pathology;
        this.treatment = treatment;
        this.symptoms = symptoms;
        this.allergies = allergies;
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
