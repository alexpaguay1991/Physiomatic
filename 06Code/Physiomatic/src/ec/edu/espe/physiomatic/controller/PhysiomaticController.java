/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.controller;


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
        
        System.out.println("Entry the Physioterapist's name");
        String name = scanner.nextLine();
        
        System.out.println("Entry the Physioterapist's Last name");
        String lastName = scanner.nextLine();
        
        System.out.println("Entry the Physioterapist's username");
        String username = scanner.nextLine();
        
        System.out.println("Entry the Physioterapist's password");
        String password = scanner.nextLine();
        
        Physioterapist physiotherapist= new Physioterapist(name,lastName,username,password);
        return physiotherapist;
    }
    /*public List<Student> retrieveList(){
        
        ArrayList<Student> students = new ArrayList<>();
        try{
            FileReader f= new FileReader("students.csv");
            BufferedReader b = new BufferedReader(f);
            
            Student eachStudent;
            String lineFile;
            
            while(( lineFile=b.readLine())!=null){
                String student[]=lineFile.split(";");
                
                eachStudent=new Student(student[0], student[1],student[2], Integer.valueOf(student[3]), student[4],Float.parseFloat(student[5]), Float.parseFloat(student[6]),Float.parseFloat(student[7]),Float.parseFloat(student[8]));
                
                students.add(eachStudent);
                
            }
            
            
        }catch (IOException exception){
            
        }
        return students;
        
    }*/
    
    
    /*
    public boolean saveStudent(Student student){
        List<Student> students = retrieveList();
        try{
            java.io.File txtFile = new java.io.File("students.csv");
            
            students.add(student);
            
            if (!txtFile.exists()) {
             txtFile.createNewFile();
           }
            PrintWriter printer = new PrintWriter(new FileWriter(txtFile, false));
            
            for (Student studentObject : students) {
                printer.println(studentObject.toNewString() );
                
            }
            printer.close();
            
        }catch(IOException ex){
            System.err.println("Error saving student..");
            return false;
            
        }
        return true;
        
    }
    public void addNewStudent(){
        saveStudent(createStudent());
       
    }
    public void displayAnStudent(String lineOfFile){
        
        Student eachStudent=new Student();
        Gson gson=new Gson();
       
        
        eachStudent=gson.fromJson(lineOfFile, Student.class);
        StudentView view = new StudentView(eachStudent);
        view.display();
    }
    public Student stringToStudent(String line){
        String[] student;
        student=line.split(";");
        Student eachStudent=new Student();
        eachStudent=new Student(student[0], student[1],student[2], Integer.valueOf(student[3]), student[4],Float.parseFloat(student[5]), Float.parseFloat(student[6]),Float.parseFloat(student[7]),Float.parseFloat(student[8]));
        return eachStudent;
        
        
    }
    
    public void displayStudent(String[] arrayOfString){
        ArrayList<Student> students=new ArrayList<>();
         Gson gson=new Gson();
        for(String line:arrayOfString){
            students.add(gson.fromJson(line, Student.class));
        }
        for (Student student : students){
            StudentView view = new StudentView(student);
            view.display();
        }
        
    }
     public void displayStudent1(String[] arrayOfString){
        ArrayList<Student> students=new ArrayList<>();
        for(String line:arrayOfString){
            students.add(stringToStudent(line));
        }
        for (Student student : students){
            StudentView view = new StudentView(student);
            view.display();
        }
        
    }
    public void displayStudent1(){
        List<Student> students = retrieveList();
        
        for (Student student : students){
            StudentView view = new StudentView(student);
            view.display();
        }
        
    }*/
    
    
}
