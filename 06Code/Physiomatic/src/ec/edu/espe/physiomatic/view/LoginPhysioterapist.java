/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.view;

import ec.edu.espe.filemanager.utils.FileManager;
import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class LoginPhysioterapist {
    public static void login() throws ParseException{
        Scanner scanner= new Scanner(System.in);
        System.out.println("ENTRY YOUR USERNAME");      
        String username=scanner.nextLine();
        System.out.println("ENTRY YOUR PASSWORD");      
        String password=scanner.nextLine();
        String dataToFind=scanner.nextLine();
        String dataOfFile;
        String dataOfFile1;
        int control=0;
        dataOfFile=FileManager.find("physioterapist.json", username);
        dataOfFile1=FileManager.find("physioterapist.json", password);
        
        if (dataOfFile1.contentEquals(dataOfFile)){
                    PatientManagment.charge();
                }
       
    }
}
