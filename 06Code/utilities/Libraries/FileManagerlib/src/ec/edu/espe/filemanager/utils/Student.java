/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.filemanager.utils;

import java.io.Serializable;

/**
 *
 * @author Acer
 */
public class Student implements Serializable {

    private String name;
    private String lastName;
    private String idStudent;
    private int age;
    private String email;
    private float programationGrade;
    private float calculusGrade;
    private float linearAlgebraGrade;
    private float averageGrade;

    public Student(String name, String lastName, String idStudent, int age, String email, float programationGrade, float calculusGrade, float linearAlgebraGrade, float averageGrade) {
        this.name = name;
        this.lastName = lastName;
        this.idStudent = idStudent;
        this.age = age;
        this.email = email;
        this.programationGrade = programationGrade;
        this.calculusGrade = calculusGrade;
        this.linearAlgebraGrade = linearAlgebraGrade;
        this.averageGrade = averageGrade;
    }

    public Student() {

        name = "name";
        lastName = "lastName";
        idStudent = "L00000";
        age = 18;
        email = "proof@espe.edu.ec";
        programationGrade = 18;
        calculusGrade = 18;
        linearAlgebraGrade = 18;
        averageGrade = 18;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the idStudent
     */
    public String getIdStudent() {
        return idStudent;
    }

    /**
     * @param idStudent the idStudent to set
     */
    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the programationGrade
     */
    public float getProgramationGrade() {
        return programationGrade;
    }

    /**
     * @param programationGrade the programationGrade to set
     */
    public void setProgramationGrade(float programationGrade) {
        this.programationGrade = programationGrade;
    }

    /**
     * @return the calculusGrade
     */
    public float getCalculusGrade() {
        return calculusGrade;
    }

    /**
     * @param calculusGrade the calculusGrade to set
     */
    public void setCalculusGrade(float calculusGrade) {
        this.calculusGrade = calculusGrade;
    }

    /**
     * @return the linearAlgebraGrade
     */
    public float getLinearAlgebraGrade() {
        return linearAlgebraGrade;
    }

    /**
     * @param linearAlgebraGrade the linearAlgebraGrade to set
     */
    public void setLinearAlgebraGrade(float linearAlgebraGrade) {
        this.linearAlgebraGrade = linearAlgebraGrade;
    }

    /**
     * @return the averageGrade
     */
    public float getAverageGrade() {
        return averageGrade;
    }

    /**
     * @param averageGrade the averageGrade to set
     */
    public void setAverageGrade(float averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", lastName=" + lastName + ", idStudent=" + idStudent + ", age=" + age + ", email=" + email + ", programationGrade=" + programationGrade + ", calculusGrade=" + calculusGrade + ", linearAlgebraGrade=" + linearAlgebraGrade + ", averageGrade=" + averageGrade + '}';
    }

    public String toNewString() {
        return name + ";" + lastName + ";" + idStudent + ";" + age + ";" + email + ";" + programationGrade + ";" + calculusGrade + ";" + linearAlgebraGrade + ";" + averageGrade;
    }

}
