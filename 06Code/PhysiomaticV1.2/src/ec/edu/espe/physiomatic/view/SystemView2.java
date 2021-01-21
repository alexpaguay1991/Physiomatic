/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.view;

import ec.edu.espe.physiomatic.model.Patient;

/**
 *
 * @author Santiago Risueño ESPE-DCCO
 */
class SystemView2 {
    Patient patient;

    public SystemView2(Patient patient) {
        this.patient = patient;
    }
    
    public void displayPatient(){
        System.out.println("----------");
        System.out.println("ID DEL PACIENTE      : "+ patient.getIdPatient());
        System.out.println("NOMBRE DEL PACIENTE  : "+ patient.getName());
        System.out.println("APELLIDO DEL PACIENTE: "+ patient.getLastName());
        System.out.println("CONTACTO             : "+ patient.getContactPatient());
       
    }
}
