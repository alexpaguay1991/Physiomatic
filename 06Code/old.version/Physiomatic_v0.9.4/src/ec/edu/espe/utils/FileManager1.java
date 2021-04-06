/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.utils;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Acer
 */
public class FileManager1 extends Persistence {
    //read. edit open serach ,save
    //crud operations create, read, delete information (data) from a DB

    @Override
    public void save(String fileName, String data) {
        List<String> lineInformation;
        lineInformation = retrieveList(fileName);
        try {
            java.io.File txtFile = new java.io.File(fileName);
            lineInformation.add(data);
            if (!txtFile.exists()) {
                txtFile.createNewFile();
            }
            PrintWriter printer = new PrintWriter(new FileWriter(txtFile, false));
            for (String studentObject : lineInformation) {
                printer.println(studentObject);
            }
            printer.close();
        } catch (IOException ex) {
            System.err.println("Error saving student..");
        }
        System.out.println("saving----->" + data + "----in file----" + fileName);
    }
    @Override
    public String find(String fileName, String dataToFind) {
        String dataToReturn = new String();
        try {
            int counter;
            List<String> dataList;
            dataList = retrieveList(fileName);
            for (String line : dataList) {

                String words[] = line.split(";");
                if (line.contains(dataToFind)) {
                    dataToReturn = line;
                }

            }
        } catch (Exception ex) {
            System.out.println("Data has not been found");
        }
        return dataToReturn;
    }
    public static int countLinesOfFile(String fileName) {
        int lines = 0;
        List<String> linesFile = retrieveList(fileName);
        for (String line : linesFile) {
            lines = lines + 1;
        }
        return lines;
    }
    public  String[] findAll(String fileName) {
        String[] allDataOfFile = new String[countLinesOfFile(fileName)];
        try {
            List<String> linesFile = retrieveList(fileName);
            int counter = 0;
            for (String line : linesFile) {
                allDataOfFile[counter] = line;
                counter = counter + 1;
            }
        } catch (Exception ex) {
            System.out.println("The file is empty");
        }
        return allDataOfFile;
    }
    public static List<String> retrieveList(String fileName) {
        ArrayList<String> information = new ArrayList<>();        
        try {
            FileReader f = new FileReader(fileName);
            BufferedReader b = new BufferedReader(f);
            String lineFile;
            while ((lineFile = b.readLine()) != null) {
                information.add(lineFile);
            }
        } catch (IOException exception) {
            System.out.println("no existe el archivo");
        }
        return information;
    }

    @Override
    public void update(String fileName, String dataToFind, String datatoUpdate) {
        List<String> lineInformation;
        lineInformation = retrieveList(fileName);
        try {
            java.io.File txtFile = new java.io.File(fileName);
            if (!txtFile.exists()) {
                txtFile.createNewFile();
            }
            PrintWriter printer = new PrintWriter(new FileWriter(txtFile, false));
            for (String line : lineInformation) {
                if (line.contentEquals(dataToFind)) {
                    line = datatoUpdate;
                }
                printer.println(line);
            }
            printer.close();
        } catch (IOException ex) {
            System.err.println("Error saving ..");
        }
        System.out.println("Updating------in file----" + fileName);
    }

    @Override
    public void delete(String fileName, String datatodelete) {
        List<String> lineInformation;
        lineInformation = retrieveList(fileName);
        try {
            java.io.File txtFile = new java.io.File(fileName);
            lineInformation.remove(datatodelete);
            if (!txtFile.exists()) {
                txtFile.createNewFile();
            }
            PrintWriter printer = new PrintWriter(new FileWriter(txtFile, false));
            for (String line : lineInformation) {
                printer.println(line);
            }
            printer.close();
        } catch (IOException ex) {
            System.err.println("Error saving ..");
        }
        System.out.println("deleting------in file----" + fileName);
    }

    @Override
    public String[] read(String fileName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
