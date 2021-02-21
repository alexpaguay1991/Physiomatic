/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.controller;


import ec.edu.espe.physiomatic.model.ClinicalHistory;
import ec.edu.espe.physiomatic.model.Physioterapist;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class PhysiomaticController {
    public Physioterapist createPhsyioterapist(){
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("INGRESE EL NOMBRE DEL FISIOTERAPEUTA: ");
        String name = scanner.nextLine();
        
        System.out.println("INGRESE EL APELLIDO DEL FISIOTERAPEUTA: ");
        String lastName = scanner.nextLine();
        
        System.out.println("INGRESE EL NOMBRE DE USUARIO DEL FISIOTERAPEUTA: ");
        String username = scanner.nextLine();
        
        System.out.println("INGRESE UNA CONTRASEÑA: ");
        String password = scanner.nextLine();
        
        Physioterapist physiotherapist= new Physioterapist(name,lastName,username,password);
        return physiotherapist;
    }
    
    
    
}
