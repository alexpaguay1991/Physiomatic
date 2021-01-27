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

    

    
    
    
}
