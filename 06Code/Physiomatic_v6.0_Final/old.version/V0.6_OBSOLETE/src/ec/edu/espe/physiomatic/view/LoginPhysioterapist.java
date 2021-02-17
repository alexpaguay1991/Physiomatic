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

    public static void login() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESE EL NOMBRE DE USUARIO: ");
        String username = scanner.nextLine();
        System.out.println("INGRESE LA CONTRASEÑA: ");
        String password = scanner.nextLine();
        String dataToFind ;
        String dataOfFile;
        String dataOfFile1;
        int control = 0;
        dataOfFile = FileManager.find("physioterapist.json", username);
        dataOfFile1 = FileManager.find("physioterapist.json", password);
        if (dataOfFile1.contentEquals("") && dataOfFile.contentEquals("")){
            System.out.println("EL USUARIO NO ESTA REGISTRADO");
        }else{
        if (dataOfFile1.contentEquals(dataOfFile)) {
            PatientManagment.charge();
        }else{
            System.out.println("EL USUARIO Y LA CONTRASEÑA NO COINCIDEN");
        }}

    }
}
