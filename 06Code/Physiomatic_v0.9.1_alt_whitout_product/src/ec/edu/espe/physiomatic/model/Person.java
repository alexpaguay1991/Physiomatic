/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.model;

import ec.edu.espe.physiomatic.controller.PhysiomaticController;

/**
 *
 * @author Yulliana Roman ESPE-DCCO
 */
public class Person {

    /**
     * @param id saves the id of patient or physioterapist 
     * @param name saves the name of patient or physioterapist 
     * @param address saves the address of patient or physioterapist 
     * @param lastName saves the last name of patient or physioterapist 
     * @param email saves the email of patient or physioterapist 
     * @param phoneNumber saves the phone number of patient or physioterapist 
     */
    private long id;
    private String address;
    private String name;
    private String lastName;
    private String email;
    private String phoneNumber;

    /**
     * 
     * @return Person 
     * @
     */
    public Person resgiter() {
        return PhysiomaticController.createPatient();
    }

    public Person(long id, String address, String name, String lastname, String email, String phoneNumber) {
        this.id = id;
        this.address = address;
        this.name = name;
        this.lastName = lastname;
        this.email = email;
        this.phoneNumber = phoneNumber;
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
    public String getLastname() {
        return lastName;
    }

    /**
     * @param lastname the lastName to set
     */
    public void setLastname(String lastname) {
        this.lastName = lastname;
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
