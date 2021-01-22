/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.view;

import ec.edu.espe.physiomatic.model.ClinicalHistory;
import ec.edu.espe.physiomatic.model.Physioterapist;

/**
 *
 * @author Acer
 */
public class PrinterClinicalHistory {
    long idPatient;

    public PrinterClinicalHistory(long idPatient) {
        this.idPatient = idPatient;
    }
    
    public void displayClinicalHistory(){
        ClinicalHistory clinicalHistory;
        clinicalHistory=Physioterapist.retrieveClinicalHistory(idPatient);
        System.out.println("----------");
        System.out.println("ID DEL PACIENTE      : "+ clinicalHistory.getPatient().getIdPatient());
        System.out.println("NOMBRE DEL PACIENTE  : "+ clinicalHistory.getPatient().getName()+ " APELLIDO DEL PACIENTE: "+clinicalHistory.getPatient().getName());
        
        
        
       
    }
    
}
