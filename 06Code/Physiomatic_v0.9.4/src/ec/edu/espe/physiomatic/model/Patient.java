/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.model;

/**
 *
 * @author Alex Paguay
 * @author Santiago Risueño ESPE-DCCO
 * @author pzeadrian
 */
public class Patient extends Person{

    public Patient(long id, String address, String name, String lastname, String email, String phoneNumber) {
        super(id, address, name, lastname, email, phoneNumber);
    }

   
    @Override
    public String toString() {
        return "Patient{" + '}';
    }

    
    @Override
    public void createAPerson() {
       
        
    }

}
