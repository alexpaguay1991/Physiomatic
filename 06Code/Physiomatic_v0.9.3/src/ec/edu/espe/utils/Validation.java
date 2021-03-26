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
 * @author pzeadrian
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
        if(letters.matches("^[A-Za-z]*$") || letters.matches(" ")){
            return true;
        } else {
            return false;
        }

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
    
    //Implemented code from Argenis
    public static boolean validateId(String id) {
        boolean correctId = false;

        try {

            if (id.length() == 10) 
            {
                int thirdDigit = Integer.parseInt(id.substring(2, 3));
                if (thirdDigit < 6) {

                    int[] coefValId = {2, 1, 2, 1, 2, 1, 2, 1, 2};
                    int verifier = Integer.parseInt(id.substring(9, 10));
                    int sum = 0;
                    int digit = 0;
                    for (int i = 0; i < (id.length() - 1); i++) {
                        digit = Integer.parseInt(id.substring(i, i + 1)) * coefValId[i];
                        sum += ((digit % 10) + (digit / 10));
                    }

                    if ((sum % 10 == 0) && (sum % 10 == verifier)) {
                        correctId = true;
                    } else if ((10 - (sum % 10)) == verifier) {
                        correctId = true;
                    } else {
                        correctId = false;
                    }
                } else {
                    correctId = false;
                }
            } else {
                correctId = false;
            }
        } catch (NumberFormatException nfe) {
            correctId = false;
        } catch (Exception err) {
            //System.out.println("Una excepcion ocurrio en el proceso de validadcion");
            correctId = false;
        }

        if (!correctId) {
            //System.out.println("La Cédula ingresada es Incorrecta");
        }
        return correctId;
    }
}
