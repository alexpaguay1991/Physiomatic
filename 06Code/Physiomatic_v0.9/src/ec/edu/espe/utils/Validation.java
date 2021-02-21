/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.utils;

import java.util.Scanner;

/**
 *
 * @author Santiago Risueño ESPE-DCCO
 */
public class Validation {
    /**
     * 
     * @param newEntrie, receives data input type.
     * @return, return a boolean type value.
     */
    public static boolean validateEntries(String newEntrie) {
        
        Scanner scannerEntries = new Scanner(System.in);
        newEntrie = scannerEntries.nextLine();
        return false;
    }
    /**
     * 
     * @param letters, validates only letter input.
     * @return, return a boolean type value.
     */
    public static boolean validateLetters(String letters) {
        if(letters.matches("[a-zA-Z]")){
            return true;
        }
        return false;

    }

    /**
     * 
     * @param numbers, validates only numbers input.
     * @return, return a boolean type value.
     */
    public static boolean validateNumbers(String numbers) {
        //implemented code from JavaMexico web site
        try {
            Integer.parseInt(numbers);
            return true;
        }catch (NumberFormatException nfe){
            return false;
        }
    }
    public static boolean isNumeric(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
     public static boolean isLong(String string) {
        try {
            Long.parseLong(string);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
    public static boolean isFloat(String string) {
        try {
            Float.parseFloat(string);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}
