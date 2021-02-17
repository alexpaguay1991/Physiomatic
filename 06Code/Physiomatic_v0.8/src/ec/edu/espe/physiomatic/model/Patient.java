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

    /**
     * 
     * @param idPatient, saves the patient id.
     * @param name, saves the name of patient.
     * @param lastName, saves the last name of patient.
     * @param contactPatient , saves the contact number of patient.
     */
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

    
    
    public static ClinicalHistory createClinicalHistory() {
        
        ClinicalHistory clinicalHistory = PatientController.createClinicalHistory();
        return clinicalHistory;
    }

    public static void updateClinicalHistory(long idPatient) {

        Gson gson = new Gson();
        Scanner scanner = new Scanner(System.in);
        ClinicalHistory clinical, clinicalToChange;
        clinical = Patient.retrieveClinicalHistory(idPatient);
        clinicalToChange = Patient.retrieveClinicalHistory(idPatient);
        LoginMenu.logClinicalHistoryMenu();
        int opt = scanner.nextInt();

        switch (opt) {

            case 1:

                System.out.println("INGRESE LA ALTURA: ");
                scanner.nextLine();

                String height = scanner.nextLine();
                clinicalToChange.setHeight(Float.parseFloat(height));
                FileManager.update("ClinicalHistory.json", gson.toJson(clinical), gson.toJson(clinicalToChange));

                break;
            case 2:

                System.out.println("INGRESE EL PESO: ");
                scanner.nextLine();

                String weight = scanner.nextLine();
                clinicalToChange.setWeight(Float.parseFloat(weight));
                FileManager.update("ClinicalHistory.json", gson.toJson(clinical), gson.toJson(clinicalToChange));

                break;
            case 3:

                System.out.println("INGRESE LA DIRECCIÓN DEL DOMICILIO: ");
                scanner.nextLine();

                String adress = scanner.nextLine();
                clinicalToChange.setAddressPatient(adress);
                FileManager.update("ClinicalHistory.json", gson.toJson(clinical), gson.toJson(clinicalToChange));

                break;
            case 4:

                System.out.println("INGRESE EL CORREO ELECTRÓNICO: ");
                scanner.nextLine();

                String email = scanner.nextLine();
                clinicalToChange.setEmailPatient(email);
                FileManager.update("ClinicalHistory.json", gson.toJson(clinical), gson.toJson(clinicalToChange));

                break;
        }
    }
    public static ClinicalHistory retrieveClinicalHistory(long idPatient) {
       
        ClinicalHistory clinicalHistory;
        clinicalHistory=PatientController.retrieveClinicalHistory(idPatient);
        return clinicalHistory;

    }

}
