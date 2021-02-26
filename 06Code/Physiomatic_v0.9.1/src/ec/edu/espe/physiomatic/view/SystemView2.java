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

/**
 *
 * @author Santiago Risueño ESPE-DCCO
 * @author Yulliana Roman ESPE-DCCO
 * @author pzeadrian
 */
public class SystemView2 {

    Patient patient;

    public SystemView2(Patient patient) {
        this.patient = patient;
    }

    public void displayPatient() {
        System.out.println("----------");
        System.out.println("No. DE CÉDULA DEL PACIENTE: " + patient.getIdPatient());
        System.out.println("NOMBRE DEL PACIENTE: " + patient.getName());
        System.out.println("APELLIDO DEL PACIENTE: " + patient.getLastName());
        System.out.println("EMAIL DEL PACIENTE: " + patient.getEmail());
        System.out.println("DIRECCION DEL PACIENTE: " + patient.getAddress());
        System.out.println("CONTACTO: " + patient.getPhoneNumber());

    }

    public void displayBill() {
        System.out.println("----------");
        System.out.println("No. DE CÉDULA DEL PACIENTE: " + patient.getId());
        System.out.println("NOMBRE DEL PACIENTE: " + patient.getName());
        System.out.println("APELLIDO DEL PACIENTE: " + patient.getLastname());
        System.out.println("CONTACTO: " + patient.getPhoneNumber());

        Bill bill = Physioterapist.retrieveBill(patient.getId());
        int counter = 1;
        System.out.println("ORD. \t" + "DESCRIPTION\t\t" + "CANT\t" + " V.UNIT\t" + "V.TOTAL");
        System.out.println("EL VALOR TOTAL A PAGAR ES: " + bill.getPrice());

    }

    public void displayClinicalHistory() {
        ClinicalHistory clinicalHistory;
        clinicalHistory = Patient.retrieveClinicalHistory(patient.getId());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println(" No. DE CÉDULA DEL PACIENTE: " + clinicalHistory.getPatient().getId());
        System.out.println(" NOMBRE DEL PACIENTE: " + clinicalHistory.getPatient().getName() + " APELLIDO DEL PACIENTE: " + clinicalHistory.getPatient().getName());
        System.out.println(" NÚMERO DE CONTACTO: " + clinicalHistory.getPatient().getPhoneNumber());
        System.out.println(" DIRECCIÓN DOMICILIARIA:" + clinicalHistory.getPatient().getAddress());
        System.out.println(" FECHA DE NACIMIENTO:" + clinicalHistory.getBirthDate());
        System.out.println(" CORREO ELECTRÓNICO:" + clinicalHistory.getPatient().getEmail());
        System.out.println(" <<<<<<<<<< DATOS CLÍNICOS >>>>>>>>>>>>");
        System.out.println(" PESO:" + clinicalHistory.getWeight() + " ESTATURA: " + clinicalHistory.getHeight());
        System.out.println(" ANTECEDENTES FAMILIARES: ");
        System.out.println("  " + clinicalHistory.getFamiliyBackground());
        System.out.println(" DIAGNÓSTICOS: ");
        int counter = 1;
        for (Diagnostic diagnostic : clinicalHistory.getDiagnostics()) {
            System.out.println(counter + " .- PATOLOGÍA : " + diagnostic.getPathology() + " TRATAMIENTO: " + diagnostic.getTreatment() + " SÍNTOMAS: " + diagnostic.getSymptoms());
            System.out.println("      ALERGÍAS : " + diagnostic.getAllergies() + " FECHA DEL DIAGNÓSTICO : " + diagnostic.getDateOfDiagnostic());
            counter = counter + 1;
        }

    }

    public void displayAppointment() {
        Appointment appointment;
        appointment = Physioterapist.retrieveAppointment(patient.getId());
        System.out.println("----------");
        System.out.println("ID DEL PACIENTE: " + patient.getId());
        System.out.println("NOMBRE DEL PACIENTE: " + patient.getName());
        System.out.println("APELLIDO DEL PACIENTE: " + patient.getLastname());
        System.out.println("CONTACTO: " + patient.getPhoneNumber());
        System.out.println(" FECHA:" + appointment.getDateOfAppointment());
        System.out.println(" HORA :" + appointment.getHour());

    }

}
