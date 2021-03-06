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
        System.out.println("- 5. MOSTRAR CITA                       -");
        System.out.println("- 6. HISTORIALES MÉDICOS                -");
        System.out.println("- 7. GENERAR FACTURA                    -");
        System.out.println("  8. DESPLEGAR FACTURA                   -");
        System.out.println("  9. SALIR                               -");
        System.out.println("-----------------------------------------");
        System.out.println("ELIJA UNA OPCIÓN: ");
        boolean exit = false;

        int option = 1;
        String option1;
        try {
            option1 = scanner.nextLine();
            while (!Physioterapist.isNumeric(option1)) {
                System.out.println("ELIJA UNA OPCIÓN CORRECTA:  ");
                option1 = scanner.nextLine();
            }
            try {
                option = Integer.valueOf(option1);
            } catch (Exception e) {
                System.out.println("NO SE PUEDE TRANSFORMAR");
            }

        } catch (InputMismatchException e) {
            System.out.println("POR FAVOR ELIJA UNA OPCIÓN VÁLIDA: ");
            scanner.next();
        }
        while (option < 10 || option > 0) {

            switch (option) {
                case 1:

                    FileManager.save("patients.json", gson.toJson(Physioterapist.generatePatient()));
                    break;
                case 2:

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

                    System.out.println("INGRESE EL No. DE CÉDULA DEL PACIENTE: ");

                    String dataToFind = scanner.nextLine();
                    while (!Physioterapist.isNumeric(dataToFind)) {
                        System.out.println("INGRESE UN DATO NUMÉRICO:  ");
                        dataToFind = scanner.nextLine();
                    }
                    dataToFind = "\"idPatient\":" + dataToFind;
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
                    try {
                        FileManager.save("appointments.json", gson.toJson(Physioterapist.generateAppointment()));

                    } catch (Exception e) {
                        System.out.println("PACIENTE NO REGISTRADO ");
                    }

                    break;
                case 5:
                    try {
                        System.out.println("INGRESE EL No. DE CÉDULA DEL PACIENTE");
                        long idPatient = 1;
                        String idPatient1 = scanner.nextLine();
                        while (!Physioterapist.isNumeric(idPatient1)) {
                            System.out.println("INGRESE UN DATO NUMÉRICO:  ");
                            idPatient1 = scanner.nextLine();
                        }
                        try {
                            idPatient = Integer.valueOf(idPatient1);
                        } catch (Exception e) {
                            System.out.println("NO SE PUEDE TRANSFORMAR");
                        }
                        Patient patient;
                        patient = Physioterapist.retrievePatient(idPatient);
                        SystemView2 appointment = new SystemView2(patient);
                        appointment.displayAppointment();

                    } catch (Exception e) {
                        System.out.println("NO EXISTE CITA REGISTRADA PARA EL PACIENTE");
                    }
                    break;
                case 6:
                    ClinicalHistoryView.manageClinicalHistory();
                    break;

                case 7:
                    scanner.nextLine();
                    FileManager.save("bills.json", gson.toJson(Physioterapist.generateBill()));
                    break;

                case 8:
                    try {
                        System.out.println("INGRESE EL No. DE CÉDULA DEL PACIENTE");
                        long idPatient = 1;
                        String idPatient1 = scanner.nextLine();
                        while (!Physioterapist.isNumeric(idPatient1)) {
                            System.out.println("INGRESE UN DATO NUMÉRICO:  ");
                            idPatient1 = scanner.nextLine();
                        }
                        try {
                            idPatient = Integer.valueOf(idPatient1);
                        } catch (Exception e) {
                            System.out.println("NO SE PUEDE TRANSFORMAR");
                        }
                        Patient patient;
                        patient = Physioterapist.retrievePatient(idPatient);
                        SystemView2 bill = new SystemView2(patient);
                        bill.displayBill();

                    } catch (Exception e) {
                        System.out.println("NO EXISTE CITA REGISTRADA PARA EL PACIENTE");
                    }
                    break;

                case 9:
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
            System.out.println("- 5. MOSTRAR CITA                       -");
            System.out.println("- 6. HISTORIALES MÉDICOS                -");
            System.out.println("- 7. GENERAR FACTURA                    -");
            System.out.println("  8. DESPLEGAR FACTURA                   -");
            System.out.println("  9. SALIR                               -");
            System.out.println("-----------------------------------------");
            System.out.println("ELIJA UNA OPCIÓN: ");
            try {
                option1 = scanner.nextLine();
                while (!Physioterapist.isNumeric(option1)) {
                    System.out.println("ELIJA UNA OPCIÓN CORRECTA:  ");
                    option1 = scanner.nextLine();
                }
                try {
                    option = Integer.valueOf(option1);
                } catch (Exception e) {
                    System.out.println("NO SE PUEDE TRANSFORMAR");
                }

            } catch (InputMismatchException e) {
                System.out.println("POR FAVOR ELIJA UNA OPCIÓN VÁLIDA: ");
                scanner.next();
            }

        }
    }
}
