/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.view;

import com.google.gson.Gson;
import ec.edu.espe.filemanager.utils.FileManager;
import ec.edu.espe.physiomatic.model.Patient;
import ec.edu.espe.physiomatic.model.Physioterapist;
import ec.edu.espe.physiomatic.model.ClinicalHistory;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Santiago Risueño ESPE-DCCO
 */
public class PatientManagment {

    public static void charge() {
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
        System.out.println("  7. EXIT                               -");
        System.out.println("-----------------------------------------");
        int option = scanner.nextInt();
        while (option < 7 || option > 0) {
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
                        //patients1.add(eachPatient);
                    }
                    for (Patient patient : patients1) {
                        SystemView2 view = new SystemView2(patient);
                        view.displayPatient();
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el ID del paciente:");

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
                        System.out.println("Paciente no encontrado");
                    }

                    break;
                case 4:
                    scanner.nextLine();
                    System.out.println("Ingrese ID del paciente");
                    long idPatient = scanner.nextLong();

                    System.out.println("Ingrese la fecha para la cita");
                    String dateAppointment = scanner.nextLine();
                    scanner.nextLine();
                    //SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    //Date date = sdf.parse(dateAppointment);

                    System.out.println("Ingrese la hora de la cita");
                    String hourOfAppointment = scanner.nextLine();
                    scanner.nextLine();
                    //SimpleDateFormat sdfH = new SimpleDateFormat("HH:mm");

                    // Time time = (Time) sdfH.parse(hourOfAppointment);
                    //Physioterapist.generateAppointment(idPatient, dateAppointment, hourOfAppointment);
                    FileManager.save("patients.json", gson.toJson(Physioterapist.generateAppointment(idPatient, dateAppointment, hourOfAppointment)));
                    break;
                case 5:
                    System.out.println("Por favor ingrese el número de cédula del paciente: ");

                    scanner.nextLine();
                    String idForBill = scanner.nextLine();

                    //if(dataOfFile=FileManager.find("patients.json", idForBill)){
                    System.out.println("Ingrese el precio: ");
                    scanner.nextFloat();
                    float price = scanner.nextFloat();
                    float iva = price * (12 / 100);
                    price += iva;

                    //}else{
                    // System.out.println(">>>> Paciente no encontrado <<<<");
                    //}
                    break;
                case 6:
                    System.out.println("Ingrese el número de cédula del paciente");
                    scanner.nextLine();
                    String idMedicalHistory;

                    idMedicalHistory = scanner.nextLine();
                    
                    try {

                        dataOfFile = FileManager.find("patients.json", idMedicalHistory);
                        Patient patient;
                        
                        patient = gson.fromJson(dataOfFile, Patient.class);
                        SystemView2 view = new SystemView2(patient);
                        view.displayPatient();
                        
                        

                    } catch (Exception ex) {
                        System.out.println("Paciente no encontrado");
                    }
                    break;
                case 7:
                    System.exit(0);

                    break;

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
            System.out.println("- 7. EXIT                               -");
            System.out.println("-----------------------------------------");

        }

    }
}
