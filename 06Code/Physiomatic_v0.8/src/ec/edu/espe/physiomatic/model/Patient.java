/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.model;

import com.google.gson.Gson;
import ec.edu.espe.filemanager.utils.FileManager;
import static ec.edu.espe.physiomatic.model.Physioterapist.retrievePatient;
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

    public static Patient generatePatient() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESE EL No. DE CÉDULA DEL PACIENTE: ");
        String idPatient1 = scanner.nextLine();
        long idPatient = 1;
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
    
    
    public static ClinicalHistory createClinicalHistory() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESE EL No. DE CÉDULA DEL PACIENTE: ");
        long idPatient = 1;
        String idPatient1 = scanner.nextLine();
        while (!Validation.isNumeric(idPatient1)) {
            System.out.println("INGRESE UN DATO NUMÉRICO:  ");
            idPatient1 = scanner.nextLine();
        }
        try {
            idPatient = Integer.valueOf(idPatient1);
        } catch (Exception e) {
            System.out.println("NO SE PUEDE TRANSFORMAR");
        }

        Patient patient;
        patient = retrievePatient(idPatient);

        System.out.println("INGRESE LA FECHA DE NACIMIENTO: ");
        String birthDate = scanner.nextLine();

        System.out.println("INGRESE EL PESO (Kg): ");
        float weight = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("INGRESE LA ALTURA (cm): ");
        float height = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("INGRESE LA DIRECCIÓN DEL DOMICILIO: ");
        String addressPatient = scanner.nextLine();

        System.out.println("INGRESE EL CORREO ELECTRÓNICO: ");
        String emailPatient = scanner.nextLine();

        ArrayList<Diagnostic> diagnostics = new ArrayList<>();

        System.out.println("INGRESE LOS ANTECEDENTES FAMILIARES: ");
        String familyBackground = scanner.nextLine();

        ClinicalHistory clinicalHistory = new ClinicalHistory(patient, birthDate, weight, height, addressPatient, emailPatient, diagnostics, familyBackground);

        return clinicalHistory;
    }

    public static void updateClinicalHistory(long idPatient) {

        Gson gson = new Gson();
        Scanner scanner = new Scanner(System.in);
        ClinicalHistory clinical, clinicalToChange;
        clinical = Physioterapist.retrieveClinicalHistory(idPatient);
        clinicalToChange = Physioterapist.retrieveClinicalHistory(idPatient);
        System.out.println("1.PESO");
        System.out.println("2. ALTURA");
        System.out.println("3. LA DIRECCIÓN DEL DOMICILIO");
        System.out.println("4. CORREO ELECTRÓNICO");
        System.out.println("INGRESE EL DATO QUE DESEA MODIFICAR: ");
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

}
