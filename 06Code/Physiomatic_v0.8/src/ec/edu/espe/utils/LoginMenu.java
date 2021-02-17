/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class LoginMenu {

    public static void logLoginMenu() {
        System.out.println(" <<< PHYSIOMATIC >>>");
        System.out.println("1: INICIAR SESIÓN");
        System.out.println("2: REGISTRARSE");
        System.out.println("3: SALIR");
        System.out.println("ELIJA UNA OPCIÓN: ");
    }

    public static void logPatientMenu() {
        System.out.println("-----------------------------------------");
        System.out.println("-           PHYSIOMATIC                 -");
        System.out.println("-                                       -");
        System.out.println("- 1. NUEVO PACIENTE                     -");
        System.out.println("- 2. MOSTRAR PACIENTES REGISTRADOS      -");
        System.out.println("- 3. BUSCAR UN PACIENTE                 -");
        System.out.println("- 4. GENERAR CITA                       -");
        System.out.println("- 5. MOSTRAR CITA                       -");
        System.out.println("- 6. HISTORIALES MÉDICOS                -");
        System.out.println("- 7. GENERAR FACTURA                    -");
        System.out.println("  8. DESPLEGAR FACTURA                   -");
        System.out.println("  9. SALIR                               -");
        System.out.println("-----------------------------------------");
        System.out.println("ELIJA UNA OPCIÓN: ");
    }

    public static void logClinicalHistoryMenu() {
        System.out.println("----------------------------------------------------");
        System.out.println("- HISTORIALES MÉDICOS                              -");
        System.out.println("-                                                  -");
        System.out.println("- 1. CREAR NUEVO HISTORIAL MÉDICO                  -");
        System.out.println("- 2. MODIFICAR HISTORIAL MÉDICO                    -");
        System.out.println("- 3. DESPLEGAR UN HISTORIAL MÉDICO                 -");
        System.out.println("- 4. AÑADIR UN DIAGNÓSTICO AL HISTORIAL MÉDICO     -");
        System.out.println("- 5. REGRESAR.                                     -");
        System.out.println("----------------------------------------------------");
        System.out.println("ELIJA UNA OPCIÓN:  ");
    }
    public static void updateClinicalHistoryMenu() {
        System.out.println("1. ALTURA");
        System.out.println("2. PESO");
        System.out.println("3. LA DIRECCIÓN DEL DOMICILIO");
        System.out.println("4. CORREO ELECTRÓNICO");
        System.out.println("INGRESE EL DATO QUE DESEA MODIFICAR: ");
    }

    public static int validateOption() {
        int option = 1;
        String option1;
        Scanner scanner = new Scanner(System.in);

        option1 = scanner.nextLine();
        while (!Validation.isNumeric(option1)) {
            System.out.println("ELIJA UNA OPCIÓN CORRECTA:  ");
            option1 = scanner.nextLine();
        }
        try {
            option = Integer.valueOf(option1);
        } catch (Exception e) {
            System.out.println("NO SE PUEDE TRANSFORMAR");
        }
        return option;

    }

    public static long validateIdPatient() {
        
        String idPatient1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESE EL No. DE CÉDULA DEL PACIENTE");
        long idPatient=1 ;
        idPatient1 = scanner.nextLine();
        while (!Validation.isLong(idPatient1)) {
            System.out.println("INGRESE UN DATO NUMÉRICO:  ");
            idPatient1 = scanner.nextLine();
        }
        idPatient = Long.valueOf(idPatient1);      
        return idPatient;

    }

}
