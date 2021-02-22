/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.controller;

import ec.edu.espe.physiomatic.model.Diagnostic;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class ClinicalHistoryController {
    public static Diagnostic createDiagnostic() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("INGRESE LA PATOLOGÍA DEL PACIENTE: ");
        String pathology = scanner.nextLine();

        System.out.println("INGRESE LOS SÍNTOMAS DEL PACIENTE: ");
        String symptoms = scanner.nextLine();

        System.out.println("INGRESA LAS ALERGIAS DEL PACIENTE: ");
        String allergies = scanner.nextLine();

        System.out.println("INGRESE LA FECHA DEL DIAGNÓSTICO: ");
        String dateOfDiagnostic = scanner.nextLine();

        System.out.println("INGRESE EL TRATAMIENTO DEL PACIENTE: ");
        String treatment = scanner.nextLine();

        Diagnostic diagnostic = new Diagnostic(pathology, treatment, symptoms, allergies, dateOfDiagnostic);

        return diagnostic;
    }
    
}
