/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.view;

import ec.edu.espe.filemanager.utils.FileManager;
import ec.edu.espe.physiomatic.controller.PhysiomaticController;

/**
 *
 * @author Santiago Risueño ESPE-DCCO
 */
public class RegistrationPhysiotepaist {

    PhysiomaticController controller = new PhysiomaticController();

    public void register() {
        System.out.println("" + controller.createPhsyioterapist().toString());
        FileManager.save("physioterapist.csv", controller.createPhsyioterapist().toString());
    }

}
