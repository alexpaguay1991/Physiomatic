/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.model;

import ec.edu.espe.physiomatic.controller.PhysiomaticController;

/**
 *
 * @author Alex Paguay
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

        PhysiomaticController.createPhysioterapist(userName, password, id, address, name, lastName, email, phoneNumber);

    }

}
