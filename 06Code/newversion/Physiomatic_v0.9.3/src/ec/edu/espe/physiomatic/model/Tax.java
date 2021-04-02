package ec.edu.espe.physiomatic.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Tax {

    private float value;
    private float tax = (float) 0.12;

    private static Tax instance; 

    private Tax(float value) {
        this.value = value;
    }

    public static Tax getInstance(Float value) {
        if (instance == null) {
            instance = new Tax(value);
        }
        return instance;
    }

    public float salesTotal(Tax usTax) {
        float total;
        total = usTax.getTax() * usTax.getValue();
        total += usTax.getValue();
        return total;
    }

    /**
     * @return the value
     */
    public float getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(float value) {
        this.value = value;
    }

    /**
     * @return the tax
     */
    public float getTax() {
        return tax;
    }

    /**
     * @param tax the tax to set
     */
    public void setTax(float tax) {
        this.tax = tax;
    }
}
