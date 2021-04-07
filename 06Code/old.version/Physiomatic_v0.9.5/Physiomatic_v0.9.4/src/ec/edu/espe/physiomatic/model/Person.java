/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.model;

/**
 *
 * @author Yulliana Roman ESPE-DCCO
 * @author pzeadrian
 */
public abstract class Person {

    /**
     * @param id saves the id of patient or physioterapist 
     * @param name saves the name of patient or physioterapist 
     * @param address saves the address of patient or physioterapist 
     * @param lastName saves the last name of patient or physioterapist 
     * @param email saves the email of patient or physioterapist 
     * @param phoneNumber saves the phone number of patient or physioterapist 
     */
    long id;
    String address;
    String name;
    String lastName;
    String email;
    String phoneNumber;

    /**
     * 
     * @return 
     * @
     */
    public  abstract  void createAPerson();

    public Person(long id, String address, String name, String lastname, String email, String phoneNumber) {
        this.id = id;
        this.address = address;
        this.name = name;
        this.lastName = lastname;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }    
    
    

    @Override
    public String toString() {
        return "Person{" + "id=" + getId() + ", address=" + getAddress() + ", name=" + getName() + ", lastName=" + getLastName() + ", email=" + getEmail() + ", phoneNumber=" + getPhoneNumber() + '}';
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
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
    
}
