/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Acer
 */
public class ClinicalHistory {
    private Patient patient;
    private List<Diagnostic> dataDiagnostic=new ArrayList<>();

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
     * @return the dataDiagnostic
     */
    public List<Diagnostic> getDataDiagnostic() {
        return dataDiagnostic;
    }

    /**
     * @param dataDiagnostic the dataDiagnostic to set
     */
    public void setDataDiagnostic(List<Diagnostic> dataDiagnostic) {
        this.dataDiagnostic = dataDiagnostic;
    }

    public ClinicalHistory(Patient patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "ClinicalHistory{" + "patient=" + patient + ", dataDiagnostic=" + dataDiagnostic + '}';
    }
    
}
