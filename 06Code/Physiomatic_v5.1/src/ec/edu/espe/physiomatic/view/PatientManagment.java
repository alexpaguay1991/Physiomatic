/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.view;

import com.google.gson.Gson;
import ec.edu.espe.filemanager.utils.FileManager;
import ec.edu.espe.physiomatic.model.ClinicalHistory;
import ec.edu.espe.physiomatic.model.Physioterapist;
import ec.edu.espe.physiomatic.model.Patient;
import java.sql.Time;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;

/**
 *
 * @author Acer
 */
public class PatientManagment {

    public static void charge() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        Physioterapist controller;
        Gson gson = new Gson();
        System.out.println("-----------------------------------------");
        System.out.println("-           PHYSIOMATIC                 -");
        System.out.println("-                                       -");
        System.out.println("- 1. NUEVO PACIENTE                     -");
        System.out.println("- 2. MOSTRAR PACIENTES REGISTRADOS      -");
        System.out.println("- 3. BUSCAR UN PACIENTE                 -");
        System.out.println("- 4. GENERAR CITA                       -");
        System.out.println("- 5. GENERAR FACTURA                    -");
        System.out.println("- 6. HISTORIALES MÉDICOS                -");
        System.out.println("  7. SALIR                               -");
        System.out.println("-----------------------------------------");
        System.out.println("ELIJA UNA OPCIÓN: ");
        boolean exit = false;
        
        int option=1;
        while (option<8 || option>0) {
            try {
                option = scanner.nextInt();
                
            } catch (InputMismatchException e) {
                System.out.println("ELIJA UNA OPCIÓN VÁLIDA: ");
                scanner.next();
            }
       
            
                switch (option) {
                    case 1:

                        FileManager.save("patients.json", gson.toJson(Physioterapist.generatePatient()));
                        break;
                    case 2:
                        scanner.nextLine();
                        List<Patient> patients1;
                        patients1 = new ArrayList();
                        String[] patients;
                        patients = FileManager.findAll("patients.json");
                        Patient eachPatient;
                        for (String line : patients) {
                            eachPatient = gson.fromJson(line, Patient.class);
                            patients1.add(eachPatient);
                        }
                        for (Patient patient : patients1) {
                            SystemView2 view = new SystemView2(patient);
                            view.displayPatient();
                        }
                        break;
                    case 3:
                        scanner.nextLine();
                        System.out.println("INGRESE EL No. DE CÉDULA DEL PACIENTE: ");

                        scanner.nextLine();
                        String dataToFind = scanner.nextLine();
                        String dataOfFile;
                        try {

                            dataOfFile = FileManager.find("patients.json", dataToFind);
                            Patient patient;
                            patient = gson.fromJson(dataOfFile, Patient.class);
                            SystemView2 view = new SystemView2(patient);
                            view.displayPatient();

                        } catch (Exception ex) {
                            System.out.println("PACIENTE NO ENCONTRADO...");
                        }
                        break;

                    case 4:
                        scanner.nextLine();

                        FileManager.save("appointments.json", gson.toJson(Physioterapist.generateAppointment()));
                        break;

                    case 5:
                        scanner.nextLine();
                        FileManager.save("bills.json", gson.toJson(Physioterapist.generateBill()));
                        break;

                    case 6:
                        ClinicalHistoryView.manageClinicalHistory();
                        break;

                    case 7:
                        System.exit(0);
                        break;

                    default:
                        System.out.println("SOLO SE PERMITEN OPCIONES DE LA 1 A LA 7");
                }
            System.out.println("-----------------------------------------");
            System.out.println("-           PHYSIOMATIC                 -");
            System.out.println("-                                       -");
            System.out.println("- 1. NUEVO PACIENTE                     -");
            System.out.println("- 2. MOSTRAR PACIENTES REGISTRADOS      -");
            System.out.println("- 3. BUSCAR UN PACIENTE                 -");
            System.out.println("- 4. GENERAR CITA                       -");
            System.out.println("- 5. GENERAR FACTURA                    -");
            System.out.println("- 6. HISTORIALES MÉDICOS                -");
            System.out.println("  7. SALIR                               -");
            System.out.println("-----------------------------------------");
            System.out.println("ELIJA UNA OPCIÓN: ");
            try {
                option = scanner.nextInt();
                
            } catch (InputMismatchException e) {
                System.out.println("ELIJA UNA OPCIÓN VÁLIDA: ");
                scanner.next();
            }
               
        }   
    }
}

