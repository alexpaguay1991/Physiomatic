/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.controller;


import com.google.gson.Gson;
import ec.edu.espe.filemanager.utils.FileManager;
import ec.edu.espe.physiomatic.model.Appointment;
import ec.edu.espe.physiomatic.model.Bill;
import ec.edu.espe.physiomatic.model.ClinicalHistory;
import ec.edu.espe.physiomatic.model.Patient;
import ec.edu.espe.physiomatic.model.Physioterapist;
import static ec.edu.espe.physiomatic.model.Physioterapist.retrievePatient;
import ec.edu.espe.physiomatic.model.Product;
import ec.edu.espe.utils.LoginMenu;
import ec.edu.espe.utils.Validation;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class PhysiomaticController {
   //long idpatient;
    public Physioterapist createPhsyioterapist(){
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("INGRESE EL NOMBRE DEL FISIOTERAPEUTA: ");
        String name = scanner.nextLine();
        
        System.out.println("INGRESE EL APELLIDO DEL FISIOTERAPEUTA: ");
        String lastName = scanner.nextLine();
        
        System.out.println("INGRESE EL NOMBRE DE USUARIO DEL FISIOTERAPEUTA: ");
        String username = scanner.nextLine();
        
        System.out.println("INGRESE UNA CONTRASEÑA: ");
        String password = scanner.nextLine();
        
        Physioterapist physiotherapist= new Physioterapist(name,lastName,username,password);
        return physiotherapist;
    }
     public static Patient createPatient() {
        Scanner scanner = new Scanner(System.in);
        long idPatient=LoginMenu.validateIdPatient();
        
        

        System.out.println("INGRESE EL NOMBRE DEL PACIENTE: ");
        String namePatient = scanner.nextLine();

        System.out.println("INGRESE EL APELLIDO DEL PACIENTE: ");
        String lastNamePatient = scanner.nextLine();

        System.out.println("INGRESE EL No. DE CONTACTO DEL PACIENTE: ");
        String contactPatient = scanner.nextLine();
        while (!Validation.isNumeric(contactPatient)) {
            System.out.println("INGRESE UN DATO NUMÉRICO:  ");
            contactPatient = scanner.nextLine();
        }
        
        Patient patient = new Patient(idPatient, namePatient, lastNamePatient, contactPatient);
        return patient;

    }
     public static Patient retrievePatient(long idPatient) {
        Gson gson = new Gson();
        String dataFile;
        dataFile = FileManager.find("patients.json", idPatient + "");
        Patient patient;
        patient = gson.fromJson(dataFile, Patient.class);;
        return patient;

    }
     public static Appointment generateAppointment() {
        Scanner scanner = new Scanner(System.in);
        long idPatient=LoginMenu.validateIdPatient();
        
        System.out.println("INGRESE LA FECHA DE LA CITA");
        String dateAppointment = scanner.nextLine();

        System.out.println("INGRESE LA HORA DE LA CITA: ");
        String hourAppointment = scanner.nextLine();

        Patient patient;
        patient = retrievePatient(idPatient);
        Appointment appointment = new Appointment(dateAppointment, hourAppointment, patient);
        
        return appointment;

    }
     public static Bill generateBill() {
        Scanner scanner = new Scanner(System.in);
        long idPatient=LoginMenu.validateIdPatient();
        Patient patient;
        patient = retrievePatient(idPatient);
        ArrayList<Product> products=new ArrayList<>() ;
        
        String optionToAddAProduct="y";
        
        while(optionToAddAProduct.contentEquals("y")){
            Product product=Bill.generateProduct();
            products.add(product);
            System.out.println("DESEA AGREGAR OTRO PRODUCTO PRESIONE y");
            optionToAddAProduct=scanner.nextLine();
        }
        float price=0;
        for(Product eachProductOfBill:products){
            price=price+eachProductOfBill.getQuantity()*eachProductOfBill.getUnitPrice();
            
        }
        
        
        Bill bill = new Bill(price,patient,products);

        return bill;

    }
     public static Bill retrieveBill(long idPatient) {
        Gson gson = new Gson();
        String dataFile;
        
        dataFile = FileManager.find("bills.json", idPatient + "");
        Bill bill;
        bill = gson.fromJson(dataFile, Bill.class);;
        return bill;

    }
     public static Appointment retrieveAppointment(long idPatient) {
        Gson gson = new Gson();
        String dataFile;
        
        dataFile = FileManager.find("appointments.json", idPatient + "");
        Appointment appointment;
        appointment = gson.fromJson(dataFile, Appointment.class);;
        return appointment;

    }
    
    
}
