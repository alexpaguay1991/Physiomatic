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
import ec.edu.espe.utils.LoginMenu;
import ec.edu.espe.utils.Validation;
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
 * @author pzeadrian
 */
public class PatientManagment {

    public static void charge() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        Gson gson = new Gson();
        long idPatient;
        Patient patient;
        int option;
        boolean exit = false;
        while (!exit) {
            LoginMenu.logPatientMenu();
          
            try {
                           
                option=LoginMenu.validateOption();
                switch (option) {
                    case 1:
                        FileManager.save("patients.json", gson.toJson(Physioterapist.registerPatient()));
                        break;
                    case 2:
                     
                        Physioterapist.printAllPatients();
                        break;
                    case 3:
                        String dataToFind;
                        System.out.println("INGRESE EL No. DE CÉDULA DEL PACIENTE: ");
                        dataToFind = scanner.nextLine();
                        while (!Validation.validateNumbers(dataToFind)) {
                            System.out.println("INGRESE UN DATO NUMÉRICO:  ");
                            dataToFind = scanner.nextLine();
                        }

                        dataToFind = "\"idPatient\":" + dataToFind;
                        String dataOfFile;
                        try {

                            dataOfFile = FileManager.find("patients.json", dataToFind);
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
                        String idPatient1;
                        try {
                            idPatient = LoginMenu.validateId();
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
                                                       
                            idPatient = LoginMenu.validateId();
                            patient = Physioterapist.retrievePatient(idPatient);
                            SystemView2 bill = new SystemView2(patient);
                            bill.displayBill();

                        } catch (Exception e) {
                            System.out.println("NO EXISTE FACTURA REGISTRADA PARA EL PACIENTE");
                        }
                        break;

                    case 9:
                        
                        System.exit(0);
                        break;

                    default:
                        System.out.println("SOLO SE PERMITEN OPCIONES DEL 1 AL 9");
                }
            } catch (InputMismatchException e) {
                System.out.println("POR FAVOR ELIJA UNA OPCIÓN VÁLIDA: ");
                scanner.next();
            }
        }
    }
}
