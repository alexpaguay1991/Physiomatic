/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.view;

import ec.edu.espe.physiomatic.model.ClinicalHistory;
import ec.edu.espe.physiomatic.model.Diagnostic;
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
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println(" ID DEL PACIENTE        : "+ clinicalHistory.getPatient().getIdPatient());
        System.out.println(" NOMBRE DEL PACIENTE    : "+ clinicalHistory.getPatient().getName()+ " APELLIDO DEL PACIENTE: "+clinicalHistory.getPatient().getName());
        System.out.println(" NÚMERO DE CONTACTO     : "+clinicalHistory.getPatient().getContactPatient());
        System.out.println(" DIRECCIÓN DOMICILIARIA :"+clinicalHistory.getAddressPatient());
        System.out.println(" FECHA DE NACIMIENTO    :"+clinicalHistory.getBirthDate());
        System.out.println(" CORREO ELECTRÓNICO     :"+clinicalHistory.getEmailPatient());
        System.out.println(" ----------------DATOS CLÍNICOS--------------------------------------");
        System.out.println(" PESO :"+clinicalHistory.getWeight()+" ESTATURA : "+clinicalHistory.getHeight());
        System.out.println(" ANTECEDENTES FAMILIARES :");
        System.out.println("  "+clinicalHistory.getFamiliyBackground());
        System.out.println("  DIAGNÓSTICOS:");
        int counter=1;
        for (Diagnostic diagnostic:clinicalHistory.getDiagnostics()){
            System.out.println(counter+".-"+diagnostic);
            counter=counter+1;
        }
        
        
       
    }
    
}
