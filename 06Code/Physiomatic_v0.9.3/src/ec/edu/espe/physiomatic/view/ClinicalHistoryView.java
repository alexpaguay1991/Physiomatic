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
import ec.edu.espe.utils.Connection;
//import ec.edu.espe.utils.LoginMenu;
//import ec.edu.espe.utils.Validation;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Acer
 *
 */
public class ClinicalHistoryView {

//    long idPatient;

//    public static void manageClinicalHistory() throws ParseException {
//        Scanner scanner = new Scanner(System.in);
//        Gson gson = new Gson();
//        LoginMenu.logClinicalHistoryMenu();
//        int option = LoginMenu.validateOption();
//
//        while (option < 5 || option > 0) {
//
//            switch (option) {
//                case 1:
//                    Patient.createClinicalHistory();
//                    Connection connection = new Connection("patients");
//                    Patient patient = new Patient(0, "", "", "", "", "");
//                    connection.insertPatient(patient);
//                    patient = connection.retrievePatient(0);
//                    FileManager.save("ClinicalHistory.json", gson.toJson(patient));
//
//                    break;
//                case 2:
//                    try {
//                        System.out.println("INGRESE EL No. DE CÉDULA DEL PACIENTE: ");
//                        long idPatient = scanner.nextLong();
//                        scanner.nextLine();
//
//                        Patient.updateClinicalHistory(idPatient);
//
//                    } catch (Exception e) {
//                        System.out.println("NO SE ENCUENTRA CREADA LA HISTORIA CLÍNICA CON ESE NÚEMRO DE CÉDULA");
//                    }
//                    break;
//                case 3:
//                    try {
//                        System.out.println("INGRESE EL No. DE CÉDULA DEL PACIENTE: ");
//                        long idPatient = scanner.nextLong();
//                        scanner.nextLine();                        
//                        patient = Physioterapist.retrievePatient(idPatient);
//                        SystemView2 clinicalHistory = new SystemView2(patient);
//                        clinicalHistory.displayClinicalHistory();
//
//                    } catch (Exception e) {
//                        System.out.println("NO SE ENCUENTRA CREADA LA HISTORIA CLÍNICA CON ESE NÚEMRO DE CÉDULA");
//                    }
//
//                    break;
//                case 4:
//                    try {
//                        System.out.println("INGRESE EL No. DE CÉDULA DEL PACIENTE: ");
//                        long idPatient = scanner.nextLong();
//                        scanner.nextLine();
//
//                        ClinicalHistory clinical, clinicalToChange;
//                        clinical = Patient.retrieveClinicalHistory(idPatient);
//                        clinicalToChange = Patient.retrieveClinicalHistory(idPatient);
//                        clinical.getDiagnostics().add(ClinicalHistory.createDiagnostic());
//                        System.out.println("" + gson.toJson(clinicalToChange));
//                        System.out.println("" + gson.toJson(clinical));
//                        FileManager.update("ClinicalHistory.json", gson.toJson(clinicalToChange), gson.toJson(clinical));
//
//                    } catch (Exception e) {
//                        System.out.println("NO SE ENCUENTRA CREADA LA HISTORIA CLÍNICA CON ESE NÚEMRO DE CÉDULA");
//
//                    }
//
//                    break;
//                case 5:
//                    PatientManagment.charge();
//
//                    break;
//
//                default:
//                    System.out.println("SOLO SE PERMITEN OPCIONES DE LA 1 A LA 3");
//
//            }
//
//            LoginMenu.logClinicalHistoryMenu();
//
//            option = LoginMenu.validateOption();
//        }
//    }

//    public ClinicalHistoryView(long idPatient) {
//        this.idPatient = idPatient;
//    }

}
