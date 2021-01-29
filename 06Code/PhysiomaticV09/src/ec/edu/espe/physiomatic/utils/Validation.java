/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.utils;

import java.util.Scanner;

/**
 *
 * @author Santiago Risueño ESPE-DCCO
 */
public class Validation {

    public static boolean validateEntries(String newEntrie) {
        
        Scanner scannerEntries = new Scanner(System.in);
        newEntrie = scannerEntries.nextLine();
        return false;
    }

    public static boolean validateLetters(String letters) {
        
        return false;

    }

    public static boolean validateNumbers(String numbers) {
        //implemented code from JavaMexico web site
        try {
            Integer.parseInt(numbers);
            return true;
        }catch (NumberFormatException nfe){
            return false;
        }
    }

}
