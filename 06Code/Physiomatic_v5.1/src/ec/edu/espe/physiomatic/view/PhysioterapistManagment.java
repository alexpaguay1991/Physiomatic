/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.view;

import ec.edu.espe.physiomatic.controller.PhysiomaticController;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;
import java.text.ParseException;
import java.util.InputMismatchException;

/**
 *
 * @author Acer
 */
public class PhysioterapistManagment {

    public static void main(String[] args) throws IOException, InterruptedException, ParseException {
        CoverPage.present();
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        PhysiomaticController controller = new PhysiomaticController();
        RegistrationPhysiotepaist registration = new RegistrationPhysiotepaist();
        System.out.println(" <<< PHYSIOMATIC >>>");
        System.out.println("1: INICIAR SESIÓN");
        System.out.println("2: REGISTRARSE");
        System.out.println("3: SALIR");
        System.out.println("ELIJA UNA OPCIÓN: ");
        
        boolean exit = false;
        int option=1;
        
        
        while (option<4 || option>0) {
            try {
                option = scanner.nextInt();
                
            } catch (InputMismatchException e) {
                System.out.println("ELIJA UNA OPCIÓN VÁLIDA: ");
                scanner.next();
            }
            
            
            switch (option) {
                case 1:

                    LoginPhysioterapist.login();
                    break;
                case 2:

                    registration.register();

                    break;
                case 3:
                    System.exit(0);
                    break;

                default:
                    System.out.println("SOLO SE PERMITEN OPCIONES DE LA 1 A LA 3...");

            }
           
            System.out.println(" <<< PHYSIOMATIC >>> ");
            System.out.println("1: INICIAR SESIÓN");
            System.out.println("2: REGISTRARSE");
            System.out.println("3: SALIR");
            System.out.println("ELIJA UNA OPCIÓN: ");
            try {
                option = scanner.nextInt();
                
            } catch (InputMismatchException e) {
                System.out.println("ELIJA UNA OPCIÓN VÁLIDA: ");
                scanner.next();
            }

        }

    }

}
