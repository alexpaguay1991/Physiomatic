/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.model;

import com.google.gson.Gson;
import ec.edu.espe.filemanager.utils.FileManager;
import ec.edu.espe.physiomatic.controller.PatientController;
import static ec.edu.espe.physiomatic.model.Physioterapist.retrievePatient;
import ec.edu.espe.utils.LoginMenu;
import ec.edu.espe.utils.Validation;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Acer
 * @author Santiago Risueño ESPE-DCCO
 * @author pzeadrian
 */
public class Patient extends Person {

    public Patient(long id, String address, String name, String lastname, String email, String phoneNumber) {
        super(id, address, name, lastname, email, phoneNumber);
    }

    

    
   

    
   

    

   

    @Override
    public String toString() {
        return "Patient{" + "name=" + name + ", lastName=" + lastName + ", email=" + email + ", address=" + address + ", phoneNumber=" + phoneNumber + ", id=" + id + '}';
    }

    @Override
    public void register(Person person) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    


}
