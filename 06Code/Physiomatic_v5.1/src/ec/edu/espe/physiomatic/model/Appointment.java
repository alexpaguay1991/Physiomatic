/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.model;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import java.sql.Time;
import java.util.Date;

/**
 *
 * @author Acer
 */
public class Appointment {

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
     * @return the nameOfPatient
     */
    public String getNameOfPatient() {
        return nameOfPatient;
    }

    /**
     * @param nameOfPatient the nameOfPatient to set
     */
    public void setNameOfPatient(String nameOfPatient) {
        this.nameOfPatient = nameOfPatient;
    }
    private String dateOfAppointment;
    private String hour;
    private String nameOfPatient;

    public Appointment(String dateOfAppointment, String hour, String nameOfPatient) {
        this.dateOfAppointment = dateOfAppointment;
        this.hour = hour;
        this.nameOfPatient = nameOfPatient;
    }

    

    
    
    
}
