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
    private Date birthDate;
    private String email;
    private long contactPatient;
    private String addressPatient;
    private double height;
    private double weight;

    Patient(Long idPatient, String namePatient, String lastNamePatient, String contactPatient) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

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
     * @return the birthDate
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the contactPatient
     */
    public long getContactPatient() {
        return contactPatient;
    }

    /**
     * @param contactPatient the contactPatient to set
     */
    public void setContactPatient(long contactPatient) {
        this.contactPatient = contactPatient;
    }

    /**
     * @return the addressPatient
     */
    public String getAddressPatient() {
        return addressPatient;
    }

    /**
     * @param addressPatient the addressPatient to set
     */
    public void setAddressPatient(String addressPatient) {
        this.addressPatient = addressPatient;
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Patient(long idPatient, String name, String lastName, Date birthDate, String email, long contactPatient, String addressPatient, double height, double weight) {
        this.idPatient = idPatient;
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.email = email;
        this.contactPatient = contactPatient;
        this.addressPatient = addressPatient;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return idPatient + ";" + name + ";" + lastName + ";" + birthDate + ";" + email + ";" + contactPatient + ";" + addressPatient + ";" + height + ";" + weight;
    }

}
