/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.controller;

import com.google.gson.Gson;
import ec.edu.espe.filemanager.utils.FileManager;
import ec.edu.espe.physiomatic.model.ClinicalHistory;
import ec.edu.espe.physiomatic.model.Diagnostic;
import ec.edu.espe.physiomatic.model.Patient;
import static ec.edu.espe.physiomatic.model.Physioterapist.retrievePatient;
import ec.edu.espe.utils.LoginMenu;
import ec.edu.espe.utils.Validation;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class PatientController {
    public static ClinicalHistory createClinicalHistory() {
        Scanner scanner = new Scanner(System.in);
        long idPatient=LoginMenu.validateIdPatient();


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
    public static ClinicalHistory retrieveClinicalHistory(long idPatient) {
        Gson gson = new Gson();
        String dataFile;
        dataFile = FileManager.find("ClinicalHistory.json", idPatient + "");
        ClinicalHistory clinicalHistory;
        clinicalHistory = gson.fromJson(dataFile, ClinicalHistory.class);;
        return clinicalHistory;

    }
}
