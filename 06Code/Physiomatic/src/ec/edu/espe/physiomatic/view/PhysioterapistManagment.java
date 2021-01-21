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
        System.out.println("-----PHYSIOMATIC------");
        System.out.println("1: Iniciar Sesión");
        System.out.println("2: Registrarse");
        System.out.println("3: Salir");
        System.out.println("Elije una opción: ");
        
        boolean exit = false;
        int option;
        while (!exit) {
            try {
                option = scanner.nextInt();
                switch (option) {
                    case 1:

                        LoginPhysioterapist.login();
                        break;
                    case 2:

                        registration.register();
                        break;
                    case 3:
                        exit = true;
                        break;

                    default:
                        System.out.println("Sólo números entre 1 y 3");

                }
            } catch (InputMismatchException e) {
                System.out.println("Elija una opción correcta");
                scanner.next();
            }

        }

    }

}
