/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.model;

import java.util.ArrayList;

/**
 *
 * @author pzeadrian
 * @author Santiago Risueño ESPE-DCCO
 * @author Yulliana Roman ESPE-DCCO
 *
 **/
public class Bill {
    private float price;
    private Patient patient;
    private ArrayList<Product> products;
    private String date;

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
     * @param products, receive an ArrayList of products.
     */
    public Bill(float price, Patient patient, ArrayList<Product> products, String date) {    
        this.price = price;
        this.patient = patient;
        this.products = products;
        this.date = date;
    }

    /**
     * @return the products
     */
    public ArrayList<Product> getProducts() {
        return products;
    }

    /**
     * @param products the products to set
     */
    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }
    
}
