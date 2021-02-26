/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.model;

/**
 *
 * @author pzeadrian
 */
public class Service {
    private String description;
    private int quantity;
    private float unitPrice;

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the unitPrice
     */
    public float getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * 
     * @param description, saves the service characteristics.
     * @param quantity, saves the number of services stock.
     * @param unitPrice , save the cost per unit of each service.
     */
    public Service(String description, int quantity, float unitPrice) {
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
    
    
}
