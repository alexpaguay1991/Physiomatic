/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.model;

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
    private ArrayList<Product> products;

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
    public Bill(float price, Patient patient, ArrayList<Product> products) {
        this.price = price;
        this.patient = patient;
        this.products = products;
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
    public static Product generateProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESE EL DETALLE DEL PRODUCTO O SERVICIO: ");
        String description=scanner.nextLine();
        
        System.out.println("INGRESE LA CANTIDAD: ");
        
        int quantity=1;
        String quantity1=scanner.nextLine();
        while (!Validation.isNumeric(quantity1)) {
            System.out.println("INGRESE UN DATO NUMÉRICO:  ");
            quantity1 = scanner.nextLine();
        }
        try {
            quantity = Integer.valueOf(quantity1);
        } catch (Exception e) {
            System.out.println("NO SE PUEDE TRANSFORMAR");
        }
        System.out.println("INGRESE EL VALOR UNITARIO: ");
        
        float unitPrice=1;
        String unitPrice1=scanner.nextLine();
        while (!Validation.isFloat(unitPrice1)) {
            System.out.println("INGRESE UN DATO NUMÉRICO:  ");
            unitPrice1 = scanner.nextLine();
        }
        try {
            unitPrice = Float.valueOf(unitPrice1);
        } catch (Exception e) {
            System.out.println("NO SE PUEDE TRANSFORMAR");
        }

        
        
        Product product = new Product(description,quantity,unitPrice);

        return product;

    }
    
    
    
}
