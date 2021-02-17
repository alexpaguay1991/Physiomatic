/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.utils;

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
     
}
