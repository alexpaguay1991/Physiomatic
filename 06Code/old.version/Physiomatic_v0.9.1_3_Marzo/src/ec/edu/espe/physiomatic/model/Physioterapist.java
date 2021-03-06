/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.model;

import com.google.gson.Gson;
import ec.edu.espe.filemanager.utils.FileManager;
import ec.edu.espe.physiomatic.controller.PhysiomaticController;
import ec.edu.espe.physiomatic.view.SystemView2;
import ec.edu.espe.utils.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Acer
 * @author Santiago Risueño ESPE-DCCO
 * @author Yulliana Roman ESPE-DCCO
 * @author pzeadrian
 */
public class Physioterapist extends Person {

    /**
     *
     * @param username, saves the username of physioterapist.
     * @param password, saves the password of physioterapist.
     */
    private String userName;
    private String password;

    /**
     *
     * @return
     */
    

    public static Patient retrievePatient(long idPatient) {
        Patient patient = PhysiomaticController.retrievePatient(idPatient);
        return patient;

    }

    public static Appointment generateAppointment() {

        Appointment appointment = PhysiomaticController.generateAppointment();

        return appointment;

    }

    public static Bill generateBill() {

        Bill bill = PhysiomaticController.generateBill();

        return bill;

    }

    public static Bill retrieveBill(long idPatient) {

        Bill bill;
        bill = PhysiomaticController.retrieveBill(idPatient);
        return bill;

    }

    public static Appointment retrieveAppointment(long idPatient) {
        Appointment appointment;
        appointment = PhysiomaticController.retrieveAppointment(idPatient);
        return appointment;
    }

    public static void printAllPatients() {
        Gson gson = new Gson();
        Scanner scanner = new Scanner(System.in);
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
        scanner.nextLine();
    }
    
    public static String[][] showTable() {
        ArrayList<Patient> patients = new ArrayList<Patient>();
        Connection conection = new Connection("patients");

        patients = conection.retrievePatients();
        for (Patient patiens1 : patients) {
            System.out.println(patiens1.getName());
        }
        String matrix[][] = new String[patients.size()][6];
        for (int i = 0; i < patients.size(); i++) {
            matrix[i][0] = patients.get(i).getId()+"";
            matrix[i][1] = patients.get(i).getName();
            matrix[i][2] = patients.get(i).getLastName();
            matrix[i][3] = patients.get(i).getAddress();
            matrix[i][4] = patients.get(i).getEmail();
            matrix[i][5] = patients.get(i).getPhoneNumber();
        }
        return matrix;
    }
    public static String[][] showTableClinicalHistory() {
        ArrayList<ClinicalHistory> clinicaHistories = new ArrayList<>();
        Connection conection = new Connection("clinicalHistory");                
        clinicaHistories = conection.retrieveClinicalHistories();
        String matrix[][] = new String[clinicaHistories.size()][7];
        for (int i = 0; i < clinicaHistories.size(); i++) {
            matrix[i][0] = clinicaHistories.get(i).getAllergy();
            matrix[i][1] = clinicaHistories.get(i).getBirthDate();
            matrix[i][2] = clinicaHistories.get(i).getBloodType();
            matrix[i][3] = clinicaHistories.get(i).getPatient().getId()+"";
            matrix[i][4] = clinicaHistories.get(i).getFamiliyBackground();
            matrix[i][5] = clinicaHistories.get(i).getPatient().getName();
            matrix[i][5] = clinicaHistories.get(i).getPatient().getLastName();
        }
        return matrix;
    }
//    public static String[][] createDiagnosticTable(){
//        ArrayList<Diagnostic> diagnostics = new ArrayList<Diagnostic>();
//        Connection conection = new Connection("diagnostics");
//        
//    }

    public Physioterapist(String userName, String password, long id, String address, String name, String lastname, String email, String phoneNumber) {
        super(id, address, name, lastname, email, phoneNumber);
        this.userName = userName;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Physioterapist{" + "userName=" + userName + ", password=" + password + '}';
    }

    

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void createAPerson() {
       
        PhysiomaticController.createPhysioterapist(userName, password, id, userName, userName, userName, userName, userName);
        
    }

    

}
