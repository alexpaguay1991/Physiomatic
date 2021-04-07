/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.model;

/**
 *
 * @author Acer
 */
public class Product {

    private String description;
    private float stock;    
    private float unitPrice;
    private String id;
    private float amount;

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
     * @return the stock
     */
    public float getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(float stock) {
        this.stock = stock;
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
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @param description, saves the product catacteristics.
     * @param amount, saves the quantity of products purchased.
     * @param stock, saves the number of products stock.
     * @param unitPrice , save the cost per unit of each product.
     * @param id, save the product id.
     */
    public Product(String description, float stock, float unitPrice, String id, float amount) {    
        this.description = description;
        this.stock = stock;
        this.unitPrice = unitPrice;
        this.id = id;
        this.amount = amount;
    }

    /**
     * @return the amount
     */
    public float getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(float amount) {
        this.amount = amount;
    }

}
