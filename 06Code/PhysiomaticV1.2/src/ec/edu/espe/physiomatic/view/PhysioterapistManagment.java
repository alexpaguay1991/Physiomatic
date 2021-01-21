/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.view;

import ec.edu.espe.physiomatic.controller.PhysiomaticController;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Santiago Risueño ESPE-DCCO
 */
public class PhysioterapistManagment {

    public static void main(String[] args) throws IOException, InterruptedException {
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
        System.out.println("Elija una opción: ");
        int option = scanner.nextInt();
        while (option < 5 || option > 0) {
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
            }

            System.out.println("-----PHYSIOMATIC------");
            System.out.println("-----PHYSIOMATIC------");
            System.out.println("1: Iniciar Sesión");
            System.out.println("2: Registrarse");
            System.out.println("3: Salir");
            System.out.println("Elija una opción: ");
            option = scanner.nextInt();
        }
    }

}
