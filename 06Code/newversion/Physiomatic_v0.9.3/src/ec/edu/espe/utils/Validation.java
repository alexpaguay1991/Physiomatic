/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.utils;

import com.google.gson.Gson;
import ec.edu.espe.filemanager.utils.FileManager;
import ec.edu.espe.physiomatic.model.Physioterapist;
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
    
     public static void login(String username, String password) throws PhysiomaticException {

        Gson gson = new Gson();

        String physioterapist1 = FileManager.find("physioterapists.json", username);
        Physioterapist physioterapist; 
        try {
            physioterapist = gson.fromJson(physioterapist1, Physioterapist.class);
            if (!(physioterapist.getUserName().contentEquals(username) && physioterapist.getPassword().contentEquals(password))) {
                throw new PhysiomaticException("USUARIO Y CONTRASEÑA INCORRECTOS");
            }

        } catch (Exception e) {
            physioterapist = new Physioterapist("null", "null", 0, "null", "null", "null", "null", "null");
            if (!(physioterapist.getUserName().contentEquals(username) && physioterapist.getPassword().contentEquals(password))) {
                throw new PhysiomaticException("USUARIO Y CONTRASEÑA INCORRECTOS");
            }
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
