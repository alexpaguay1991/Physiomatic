/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.model;

import ec.edu.espe.physiomatic.controller.PatientController;

/**
 *
 * @author Acer
 * @author Santiago Risueño ESPE-DCCO
 * @author Yulliana Roman ESPE-DCCO
 */
public class Patient extends Person {
        
    public static ClinicalHistory createClinicalHistory() {

        ClinicalHistory clinicalHistory = PatientController.createClinicalHistory();
        return clinicalHistory;
    }

    public static void updateClinicalHistory(long idPatient) {

        PatientController.updateClinicalHistory(idPatient);
    }

    public static ClinicalHistory retrieveClinicalHistory(long idPatient) {

        ClinicalHistory clinicalHistory;
        clinicalHistory = PatientController.retrieveClinicalHistory(idPatient);
        return clinicalHistory;

    }
    
    public Patient(long id, String address, String name, String lastname, String email, String phoneNumber) {
        super(id, address, name, lastname, email, phoneNumber);
    }    

    @Override
    public String toString() {
        return "PACIENTE {" + "No. DE CÉDULA = " + super.getId() + ", NOMBRE = " + super.getName() + ", APELLIDO = " + super.getLastname() + ", No. DE CONTACTO = " + super.getPhoneNumber() +  ", EMAIL = " + super.getEmail()+  ", DIRECCION = " + super.getAddress()+ '}';
    }

}
