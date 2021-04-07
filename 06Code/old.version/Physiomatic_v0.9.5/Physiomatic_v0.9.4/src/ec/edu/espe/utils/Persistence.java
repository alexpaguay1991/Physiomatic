/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.utils;

/**
 *
 * @author User
 */
public abstract class Persistence {

    public abstract void save(String fileName, String data);

    public abstract String[] read(String fileName);

    public abstract String find(String fileName, String dataToFind);

    public abstract String[] findAll(String fileName);

    public abstract void delete(String fileName, String datatodelete);

    public abstract void update(String fileName, String dataToFind, String datatoUpdate);
}
