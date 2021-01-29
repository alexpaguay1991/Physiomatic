/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.view;


import com.google.gson.Gson;
import ec.edu.espe.filemanager.utils.FileManager;
import ec.edu.espe.physiomatic.controller.PhysiomaticController;

/**
 *
 * @author Santiago Risueño ESPE-DCCO
 */
public class RegistrationPhysiotepaist {
    Gson gson=new Gson();
    PhysiomaticController controller=new PhysiomaticController();
    public  void register(){
        
        FileManager.save("physioterapist.json",gson.toJson(controller.createPhsyioterapist()));
    }
    
}
