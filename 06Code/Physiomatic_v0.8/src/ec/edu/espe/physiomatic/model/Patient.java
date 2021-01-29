/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.model;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Patient {
    private long idPatient;
    private String name;
    private String lastName;
    private String contactPatient;

    

   
    

    /**
     * @return the idPatient
     */
    public long getIdPatient() {
        return idPatient;
    }

    /**
     * @param idPatient the idPatient to set
     */
    public void setIdPatient(long idPatient) {
        this.idPatient = idPatient;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the contactPatient
     */
    public String getContactPatient() {
        return contactPatient;
    }

    /**
     * @param contactPatient the contactPatient to set
     */
    public void setContactPatient(String contactPatient) {
        this.contactPatient = contactPatient;
    }

    public Patient(long idPatient, String name, String lastName, String contactPatient) {
        this.idPatient = idPatient;
        this.name = name;
        this.lastName = lastName;
        this.contactPatient = contactPatient;
    }

    @Override
    public String toString() {
        return "PACIENTE {" + "No. DE CÉDULA = " + idPatient + ", NOMBRE = " + name + ", APELLIDO = " + lastName + ", No. DE CONTACTO = " + contactPatient + '}';
    }
    
    public static Patient generatePatient() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESE EL No. DE CÉDULA DEL PACIENTE: ");
        String idPatient1 = scanner.nextLine();
        long idPatient=1;
        while (!Physioterapist.isNumeric(idPatient1)) {
            System.out.println("INGRESE UN DATO NUMÉRICO:  ");
            idPatient1 = scanner.nextLine();
        }
        try {
            idPatient = Integer.valueOf(idPatient1);
        } catch (Exception e) {
            System.out.println("NO SE PUEDE TRANSFORMAR");
        }
        
        

        System.out.println("INGRESE EL NOMBRE DEL PACIENTE: ");
        String namePatient = scanner.nextLine();

        System.out.println("INGRESE EL APELLIDO DEL PACIENTE: ");
        String lastNamePatient = scanner.nextLine();

        System.out.println("INGRESE EL No. DE CONTACTO DEL PACIENTE: ");
        String contactPatient = scanner.nextLine();
     
        Patient patient = new Patient(idPatient, namePatient, lastNamePatient, contactPatient);
        return patient;

    }
    
    
    
}
