/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.physiomatic.controller;

import ec.edu.espe.physiomatic.model.Product;
import ec.edu.espe.utils.Validation;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class BillController {
     public static Product generateProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESE EL DETALLE DEL PRODUCTO O SERVICIO: ");
        String description=scanner.nextLine();
        
        System.out.println("INGRESE LA CANTIDAD: ");
        
        int quantity=1;
        String quantity1=scanner.nextLine();
        while (!Validation.isNumeric(quantity1)) {
            System.out.println("INGRESE UN DATO NUMÉRICO:  ");
            quantity1 = scanner.nextLine();
        }
        try {
            quantity = Integer.valueOf(quantity1);
        } catch (Exception e) {
            System.out.println("NO SE PUEDE TRANSFORMAR");
        }
        System.out.println("INGRESE EL VALOR UNITARIO: ");
        
        float unitPrice=1;
        String unitPrice1=scanner.nextLine();
        while (!Validation.isFloat(unitPrice1)) {
            System.out.println("INGRESE UN DATO NUMÉRICO:  ");
            unitPrice1 = scanner.nextLine();
        }
        try {
            unitPrice = Float.valueOf(unitPrice1);
        } catch (Exception e) {
            System.out.println("NO SE PUEDE TRANSFORMAR");
        }

        
        
        Product product = new Product(description,quantity,unitPrice);

        return product;

    }
}
