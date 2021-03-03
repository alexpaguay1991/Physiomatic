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
import ec.edu.espe.physiomatic.model.Patient;
import ec.edu.espe.physiomatic.model.Physioterapist;
import ec.edu.espe.utils.Connection;
import ec.edu.espe.utils.LoginMenu;
import ec.edu.espe.utils.Validation;
import java.util.Scanner;

/**
 *
 * @author Acer
 * @author Santiago Risueño ESPE-DCCO
 * @author pzeadrian
 */
public class PhysiomaticController {
    public Physioterapist createPhsyioterapist(){
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("INGRESE EL NUMERO DE CEDULA DEL FISIOTERAPEUTA: ");
        long id = scanner.nextLong();
        scanner.nextLine();
        
        System.out.println("INGRESE EL NOMBRE DEL FISIOTERAPEUTA: ");
        String name = scanner.nextLine();
        while (!Validation.validateLetters(name)){
            System.out.println("EXISTEN DATOS INCORRECTOS, INGRESE ÚNICAMENTE LETRAS");
            name = scanner.nextLine();
        }
        
        System.out.println("INGRESE EL APELLIDO DEL FISIOTERAPEUTA: ");
        String lastName = scanner.nextLine();
        while (!Validation.validateLetters(lastName)){
            System.out.println("INGRESE ÚNICAMENTE LETRAS");
            lastName = scanner.nextLine();
        }
        System.out.println("INGRESE LA DIRECCION DEL FISIOTERAPEUTA: ");
        String address = scanner.nextLine();
        
        System.out.println("INGRESE EL EMAIL DEL FISIOTERAPEUTA: ");
        String email = scanner.nextLine();
        
        System.out.println("INGRESE EL NUMERO DE TELEFONO DEL FISIOTERAPEUTA: ");
        String phoneNumber = scanner.nextLine();
        
        System.out.println("INGRESE EL NOMBRE DE USUARIO DEL FISIOTERAPEUTA: ");
        String username = scanner.nextLine();
        
        System.out.println("INGRESE UNA CONTRASEÑA: ");
        String password = scanner.nextLine();
        
        Physioterapist physiotherapist = new Physioterapist(username,password,id,address,name,lastName,email,phoneNumber);
        return physiotherapist;
    }
     public static void createPatient(long id, String address, String name, String lastname, String email, String phoneNumber) {
            
        Patient patient = new Patient(id,address,name,lastname,email,phoneNumber);
        Connection conection=new Connection("patients");
         conection.insertPatient(patient);

    }
     public static void createPhysioterapist(String userName, String password, long id, String address, String name, String lastname, String email, String phoneNumber) {
         Physioterapist physioterapist=new Physioterapist(userName,password,id, address, name, lastname,  email,  phoneNumber);
         Connection conection=new Connection("physioterapist");
         conection.insertPhysioterapist(physioterapist);
       
        //return physioterapist;

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
        long idPatient=LoginMenu.validateId();
        
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
        long idPatient=LoginMenu.validateId();
        Patient patient;
        patient = retrievePatient(idPatient);
        return null;
     }
    @SuppressWarnings("empty-statement")
     public static Bill retrieveBill(long idPatient) {
        Gson gson = new Gson();
        String dataFile;
        
        dataFile = FileManager.find("bills.json", idPatient + "");
        Bill bill;
        bill = gson.fromJson(dataFile, Bill.class);;
        return bill;

    }
    @SuppressWarnings("empty-statement")
     public static Appointment retrieveAppointment(long idPatient) {
        Gson gson = new Gson();
        String dataFile;
        
        dataFile = FileManager.find("appointments.json", idPatient + "");
        Appointment appointment;
        appointment = gson.fromJson(dataFile, Appointment.class);;
        return appointment;

    }        
}
