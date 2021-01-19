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
    private String dateOfAppointment;
    private String hour;
    private String nameOfPatient;

    public Appointment(String dateOfAppointment, String hour, String nameOfPatient) {
        this.dateOfAppointment = dateOfAppointment;
        this.hour = hour;
        this.nameOfPatient = nameOfPatient;
    }

    

    
    
    public void run(){
        
    }
    /*
    /**
     * @return the dateOfAppointment
     */
    
    /*
    public Date getDateOfAppointment() {
        return dateOfAppointment;
    }

    /**
     * @param dateOfAppointment the dateOfAppointment to set
     */
    /*
    public void setDateOfAppointment(Date dateOfAppointment) {
        this.dateOfAppointment = dateOfAppointment;
    }

    /**
     * @return the hour
     */
    /*public Time getHour() {
        return hour;
    }

    /**
     * @param hour the hour to set
     */
    /*public void setHour(Time hour) {
        this.hour = hour;
    }

    /**
     * @return the nameOfPatien
     */
    /*public String getNameOfPatien() {
        return nameOfPatien;
    }

    /**
     * @param nameOfPatien the nameOfPatien to set
     */
    /*public void setNameOfPatien(String nameOfPatien) {
        this.nameOfPatien = nameOfPatien;
    }

    public Appointment(Date dateOfAppointment, Time hour, String nameOfPatien) {
        this.dateOfAppointment = dateOfAppointment;
        this.hour = hour;
        this.nameOfPatien = nameOfPatien;
    }

    @Override
    public String toString() {
        return "Appointment{" + "dateOfAppointment=" + dateOfAppointment + ", hour=" + hour + ", nameOfPatien=" + nameOfPatien + '}';
    }*/
    
}
