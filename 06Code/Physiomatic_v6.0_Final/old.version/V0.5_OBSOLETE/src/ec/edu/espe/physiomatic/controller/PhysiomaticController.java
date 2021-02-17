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
        
        System.out.println("Ingrese el nombre del Fisioterapista");
        String name = scanner.nextLine();
        
        System.out.println("Ingrese el apellido de un fisioterapista");
        String lastName = scanner.nextLine();
        
        System.out.println("Ingrese el nombre de usuario del Fisioterapista");
        String username = scanner.nextLine();
        
        System.out.println("Ingrese una contraseña");
        String password = scanner.nextLine();
        
        Physioterapist physiotherapist= new Physioterapist(name,lastName,username,password);
        return physiotherapist;
    }
    
    
    
}
