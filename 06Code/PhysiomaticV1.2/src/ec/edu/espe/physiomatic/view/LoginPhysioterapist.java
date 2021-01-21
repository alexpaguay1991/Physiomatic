/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.view;

import ec.edu.espe.filemanager.utils.FileManager;
import java.util.Scanner;

/**
 *
 * @author Santiago Risueño ESPE-DCCO
 */
public class LoginPhysioterapist {

    public static void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu nombre de usuario");
        String username = scanner.nextLine();
        System.out.println("Ingresa tu contraseña");
        String password = scanner.nextLine();
        String dataToFind = scanner.nextLine();
        String dataOfFile;
        String dataOfFile1;
        dataOfFile = FileManager.find("physioterapist.json", username);
        dataOfFile1 = FileManager.find("physioterapist.json", password);
        if (dataOfFile1.contentEquals(dataOfFile)) {
            PatientManagment.charge();
        }
    }
}
