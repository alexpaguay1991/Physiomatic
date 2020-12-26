/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.model;

/**
 *
 * @author Santiago Risueño ESPE-DCCO
 */
public class Patient {
    
    private String idPatient, namePatient, lastNamePatient, phoneNumber, email, address; 
    private int age;
   
    /**
     * @return the idPatient
     */
    public String getIdPatient() {
        return idPatient;
    }

    /**
     * @param idPatient the idPatient to set
     */
    public void setIdPatient(String idPatient) {
        this.idPatient = idPatient;
    }

    /**
     * @return the namePatient
     */
    public String getNamePatient() {
        return namePatient;
    }

    /**
     * @param namePatient the namePatient to set
     */
    public void setNamePatient(String namePatient) {
        this.namePatient = namePatient;
    }

    /**
     * @return the lastNamePatient
     */
    public String getLastNamePatient() {
        return lastNamePatient;
    }

    /**
     * @param lastNamePatient the lastNamePatient to set
     */
    public void setLastNamePatient(String lastNamePatient) {
        this.lastNamePatient = lastNamePatient;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
}
