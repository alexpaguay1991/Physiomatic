/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.view;

import com.google.gson.Gson;
import ec.edu.espe.filemanager.utils.FileManager;
import ec.edu.espe.physiomatic.model.ClinicalHistory;
import ec.edu.espe.physiomatic.model.Diagnostic;
import ec.edu.espe.physiomatic.model.Patient;
import ec.edu.espe.physiomatic.model.Physioterapist;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Santiago Risueño ESPE-DCCO
 */
public class ClinicalHistoryView {

    long idPatient;

    public static void manageClinicalHistory() throws ParseException {
        Scanner scanner = new Scanner(System.in);

        Gson gson = new Gson();
        System.out.println("----------------------------------------------------");
        System.out.println("- HISTORIALES MÉDICOS                              -");
        System.out.println("-                                                  -");
        System.out.println("- 1. CREAR NUEVO HISTORIAL MÉDICO                  -");
        System.out.println("- 2. DESPLEGAR UN HISTORIAL MÉDICO                 -");
        System.out.println("- 3. AÑADIR UN DIAGNÓSTICO AL HISTORIAL MÉDICO     -");
        System.out.println("- 4. REGRESAR.                                     -");
        System.out.println("-----------------------------------------");
        System.out.println("ELIJA UNA OPCIÓN:  ");
        String option1;
        int option=1;
        try {
                option1 = scanner.nextLine();
                while(!Physioterapist.isNumeric(option1)){
                    System.out.println("ELIJA UNA OPCIÓN CORRECTA:  ");
                    option1 = scanner.nextLine();
                }
                try{
                    option=Integer.valueOf(option1);
                }catch(Exception e){
                    System.out.println("NO SE PUEDE TRANSFORMAR");
                }
                

        } catch (InputMismatchException e) {
            System.out.println("POR FAVOR ELIJA UNA OPCIÓN VÁLIDA: ");
            scanner.next();
        }

        while (option < 5 || option > 0) {
            

            switch (option) {
                case 1:
                    FileManager.save("ClinicalHistory.json", gson.toJson(Physioterapist.createClinicalHistory()));

                    break;
                case 2:
                    try{
                        System.out.println("INGRESE EL No. DE CÉDULA DEL PACIENTE");
                        long idPatient = scanner.nextLong();
                        scanner.nextLine();
                        Patient patient;
                        patient=Physioterapist.retrievePatient(idPatient);
                        SystemView2 clinicalHistory = new SystemView2(patient);
                        clinicalHistory.displayClinicalHistory();
                        
                    }catch(Exception e){
                        System.out.println("NO SE ENCUENTRA CREADA LA HISTORIA CLÍNICA CON ESE NÚEMRO DE CÉDULA");
                    }
                    

                    break;
                case 3:
                    try{
                        System.out.println("INGRESE EL No. DE CÉDULA DEL PACIENTE: ");
                        long idPatient = scanner.nextLong();
                        scanner.nextLine();

                        ClinicalHistory clinical,clinicalToChange;
                        clinical = Physioterapist.retrieveClinicalHistory(idPatient);
                        clinicalToChange = Physioterapist.retrieveClinicalHistory(idPatient);
                        clinical.getDiagnostics().add(Physioterapist.createDiagnostic());
                        System.out.println(""+gson.toJson(clinicalToChange));
                        System.out.println(""+gson.toJson(clinical));
                        FileManager.update("ClinicalHistory.json", gson.toJson(clinicalToChange), gson.toJson(clinical));

                    }catch(Exception e){
                         System.out.println("NO SE ENCUENTRA CREADA LA HISTORIA CLÍNICA CON ESE NÚEMRO DE CÉDULA");
                    
                    }
                    
            
                    break;
                case 4:
                    PatientManagment.charge();
     
                    break;

                default:
                    System.out.println("SOLO SE PERMITEN OPCIONES DE LA 1 A LA 3");

            }

            System.out.println("----------------------------------------------------");
            System.out.println("- HISTORIALES MEDICOS                              -");
            System.out.println("-                                                  -");
            System.out.println("- 1. CREAR UN NUEVO HISTORIAL MÉDICO               -");
            System.out.println("- 2. DESPLEGAR UN HISTORIAL MÉDICO                 -");
            System.out.println("- 3. AÑADIR UN DIAGNÓSTICO AL HISTORIAL MÉDICO     -");
            System.out.println("- 4. REGRESAR.                                     -");
            System.out.println("-----------------------------------------");
            System.out.println("ELIJA UNA OPCIÓN: ");
            
            try {
                option1 = scanner.nextLine();
                while(!Physioterapist.isNumeric(option1)){
                    System.out.println("ELIJA UNA OPCIÓN CORRECTA:  ");
                    option1 = scanner.nextLine();
                }
                try{
                    option=Integer.valueOf(option1);
                }catch(Exception e){
                    System.out.println("NO SE PUEDE TRANSFORMAR");
                }
                

        } catch (InputMismatchException e) {
            System.out.println("POR FAVOR ELIJA UNA OPCIÓN VÁLIDA: ");
            scanner.next();
        }
            

        }
    }

    public ClinicalHistoryView(long idPatient) {
        this.idPatient = idPatient;
    }

}
