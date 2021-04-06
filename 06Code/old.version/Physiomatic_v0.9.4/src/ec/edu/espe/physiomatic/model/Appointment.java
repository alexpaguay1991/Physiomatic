/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.model;

/**
 *
 * @author Alex Paguay
 * @author Santiago Risueño ESPE-DCCO
 */
public class Appointment {

   
    private String dateOfAppointment;
    private String hour;
    private Patient patient;

    /**
     * @return the dateOfAppointment
     */
    public String getDateOfAppointment() {
        return dateOfAppointment;
    }

    /**
     * @param dateOfAppointment the dateOfAppointment to set
     */
    public void setDateOfAppointment(String dateOfAppointment) {
        this.dateOfAppointment = dateOfAppointment;
    }

    /**
     * @return the hour
     */
    public String getHour() {
        return hour;
    }

    /**
     * @param hour the hour to set
     */
    public void setHour(String hour) {
        this.hour = hour;
    }

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
     * 
     * @param dateOfAppointment, save the date of the medical appointment.
     * @param hour, save the appointment time.
     * @param patient, recieve a Patient patient.
     */
    public Appointment(String dateOfAppointment, String hour, Patient patient) {
        this.dateOfAppointment = dateOfAppointment;
        this.hour = hour;
        this.patient = patient;
    }
}
