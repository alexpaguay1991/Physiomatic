/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.view;

import ec.edu.espe.physiomatic.controller.PhysiomaticController;
import ec.edu.espe.physiomatic.model.Physioterapist;
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
        String option1;
        try {
                option1 = scanner.nextLine();
                while(!Physioterapist.isNumeric(option1)){
                    System.out.println("ELIJA UNA OPCIÓN CORRECTA:  ");
                    option1 = scanner.nextLine();
                }
                try{
                    option=Integer.valueOf(option1);
                }catch(Exception e){
                    System.out.println("NO SE PUEDE TRANSFORMAR");
                }
                

        } catch (InputMismatchException e) {
            System.out.println("POR FAVOR ELIJA UNA OPCIÓN VÁLIDA: ");
            scanner.next();
        }
        
        while (option<4 || option>0) {
            
            
            
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
                option1 = scanner.nextLine();
                while(!Physioterapist.isNumeric(option1)){
                    System.out.println("ELIJA UNA OPCIÓN CORRECTA:  ");
                    option1 = scanner.nextLine();
                }
                try{
                    option=Integer.valueOf(option1);
                }catch(Exception e){
                    System.out.println("NO SE PUEDE TRANSFORMAR");
                }
                

        } catch (InputMismatchException e) {
            System.out.println("POR FAVOR ELIJA UNA OPCIÓN VÁLIDA: ");
            scanner.next();
        }

        }

    }

}
