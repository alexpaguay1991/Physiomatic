/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.model;

import java.util.Date;

/**
 *
 * @author Acer
 */
public class Patient {
    private long idPatient;
    private String name;
    private String lastName;
    private String contactPatient;

    

   
    

    /**
     * @return the idPatient
     */
    public long getIdPatient() {
        return idPatient;
    }

    /**
     * @param idPatient the idPatient to set
     */
    public void setIdPatient(long idPatient) {
        this.idPatient = idPatient;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the contactPatient
     */
    public String getContactPatient() {
        return contactPatient;
    }

    /**
     * @param contactPatient the contactPatient to set
     */
    public void setContactPatient(String contactPatient) {
        this.contactPatient = contactPatient;
    }

    public Patient(long idPatient, String name, String lastName, String contactPatient) {
        this.idPatient = idPatient;
        this.name = name;
        this.lastName = lastName;
        this.contactPatient = contactPatient;
    }

    @Override
    public String toString() {
        return "PACIENTE {" + "No. DE CÉDULA = " + idPatient + ", NOMBRE = " + name + ", APELLIDO = " + lastName + ", No. DE CONTACTO = " + contactPatient + '}';
    }
    

    
    
    
}
