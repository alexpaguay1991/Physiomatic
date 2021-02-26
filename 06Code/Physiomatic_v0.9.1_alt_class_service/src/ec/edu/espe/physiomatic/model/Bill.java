/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.model;

import ec.edu.espe.physiomatic.controller.BillController;
import ec.edu.espe.utils.Validation;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pzeadrian
 * @author Santiago Risueño ESPE-DCCO
 *
 **/
public class Bill {
    private float price;
    private Patient patient;
    private ArrayList<Service> services;

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
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
     * @param price, saves the cost of the application.
     * @param patient, receive a patient Patient.
     * @param services, receive an ArrayList of services.
     */
    public Bill(float price, Patient patient, ArrayList<Service> services) {
        this.price = price;
        this.patient = patient;
        this.services = services;
    }

    /**
     * @return the services
     */
    public ArrayList<Service> getServices() {
        return services;
    }

    /**
     * @param services the services to set
     */
    public void setServices(ArrayList<Service> services) {
        this.services = services;
    }
    public static Service generateService() {      
        Service services = BillController.generateService();
        return services;

    }
    
    
    
}
