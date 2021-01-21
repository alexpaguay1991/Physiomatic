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

/**
 *
 * @author Santiago Risueño ESPE-DCCO
 */
public class PhysioterapistManagment {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        PhysiomaticController controller=new PhysiomaticController();
        RegistrationPhysiotepaist registration=new RegistrationPhysiotepaist();
        System.out.println("-----PHYSIOMATIC------"); 
        System.out.println("1: LOGIN");
        System.out.println("2: REGISTER");
        System.out.println("3: EXIT");
        System.out.println("ENTER AN OPTION: ");
        int option = scanner.nextInt();
        while(option<5 || option>0){
             switch (option){
                case 1:
                    
                    //FileManager.save("students.csv", gson.toJson(controller.createStudent()));
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
            System.out.println("1: LOGIN");
            System.out.println("2: REGISTER");
            System.out.println("3: EXIT");
            System.out.println("ENTER AN OPTION: ");
            option = scanner.nextInt();
        }
    }
    
}
