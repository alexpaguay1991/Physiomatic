/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.controller;

import ec.edu.espe.physiomatic.model.ClinicalHistory;
import ec.edu.espe.physiomatic.model.Diagnostic;
import ec.edu.espe.physiomatic.model.Patient;
import static ec.edu.espe.physiomatic.model.Physioterapist.retrievePatient;
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
        System.out.println("INGRESE EL No. DE CÉDULA DEL PACIENTE: ");
        long idPatient=1;
        String idPatient1=scanner.nextLine();
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
}
