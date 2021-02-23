/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.view;

import ec.edu.espe.physiomatic.model.Appointment;
import ec.edu.espe.physiomatic.model.Bill;
import ec.edu.espe.physiomatic.model.ClinicalHistory;
import ec.edu.espe.physiomatic.model.Diagnostic;
import ec.edu.espe.physiomatic.model.Patient;
import ec.edu.espe.physiomatic.model.Physioterapist;
import ec.edu.espe.physiomatic.model.Product;
/**
 *
 * @author Santiago Risueño ESPE-DCCO
 */
public class SystemView2 {
    
    Patient patient;
    public SystemView2(Patient patient) {
        this.patient = patient;
    }
    
    public void displayPatient(){
        System.out.println("----------");
        System.out.println("No. DE CÉDULA DEL PACIENTE: " + patient.getIdPatient());
        System.out.println("NOMBRE DEL PACIENTE: " + patient.getName());
        System.out.println("APELLIDO DEL PACIENTE: " + patient.getLastName());
        System.out.println("CONTACTO: " + patient.getContactPatient());
       
    }
    public void displayBill(){
        System.out.println("----------");
        System.out.println("No. DE CÉDULA DEL PACIENTE: " + patient.getIdPatient());
        System.out.println("NOMBRE DEL PACIENTE: " + patient.getName());
        System.out.println("APELLIDO DEL PACIENTE: " + patient.getLastName());
        System.out.println("CONTACTO: " + patient.getContactPatient());
        
        Bill bill=Physioterapist.retrieveBill(patient.getIdPatient());
        int counter=1;
        System.out.println("ORD. \t"+"DESCRIPTION\t\t"+ "CANT\t"+" V.UNIT\t"+  "V.TOTAL");
        for(Product product1:bill.getProducts()){
            System.out.println(counter+".-\t"+product1.getDescription()+" \t\t"+product1.getQuantity()+" \t"+product1.getUnitPrice()+" \t"+product1.getQuantity()*product1.getUnitPrice());
        }
        System.out.println("EL VALOR TOTAL A PAGAR ES: "+bill.getPrice());
       
    }
    
    public void displayClinicalHistory(){
        ClinicalHistory clinicalHistory;
        clinicalHistory=Patient.retrieveClinicalHistory(patient.getIdPatient());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println(" No. DE CÉDULA DEL PACIENTE: " + clinicalHistory.getPatient().getIdPatient());
        System.out.println(" NOMBRE DEL PACIENTE: " + clinicalHistory.getPatient().getName()+ " APELLIDO DEL PACIENTE: "+clinicalHistory.getPatient().getName());
        System.out.println(" NÚMERO DE CONTACTO: " +clinicalHistory.getPatient().getContactPatient());
        System.out.println(" DIRECCIÓN DOMICILIARIA:" +clinicalHistory.getAddressPatient());
        System.out.println(" FECHA DE NACIMIENTO:" +clinicalHistory.getBirthDate());
        System.out.println(" CORREO ELECTRÓNICO:" +clinicalHistory.getEmailPatient());
        System.out.println(" <<<<<<<<<< DATOS CLÍNICOS >>>>>>>>>>>>");
        System.out.println(" PESO:" +clinicalHistory.getWeight() + " ESTATURA: " + clinicalHistory.getHeight());
        System.out.println(" ANTECEDENTES FAMILIARES: ");
        System.out.println("  " + clinicalHistory.getFamiliyBackground());
        System.out.println(" DIAGNÓSTICOS: ");
        int counter=1;
        for (Diagnostic diagnostic:clinicalHistory.getDiagnostics()){
            System.out.println(counter + " .- PATOLOGÍA : " + diagnostic.getPathology()+" TRATAMIENTO: "+diagnostic.getTreatment()+" SÍNTOMAS: "+diagnostic.getSymptoms());
            System.out.println("      ALERGÍAS : "+diagnostic.getAllergies()+" FECHA DEL DIAGNÓSTICO : "+diagnostic.getDateOfDiagnostic());
            counter=counter+1;
        }
        
        
       
    }
    public  void displayAppointment(){
        Appointment appointment;
        appointment=Physioterapist.retrieveAppointment(patient.getIdPatient());
        System.out.println("----------");
        System.out.println("ID DEL PACIENTE: " + patient.getIdPatient());
        System.out.println("NOMBRE DEL PACIENTE: " + patient.getName());
        System.out.println("APELLIDO DEL PACIENTE: " + patient.getLastName());
        System.out.println("CONTACTO: " + patient.getContactPatient());
        System.out.println(" FECHA:"+appointment.getDateOfAppointment());
        System.out.println(" HORA :"+appointment.getHour());
       
    }
    
}
