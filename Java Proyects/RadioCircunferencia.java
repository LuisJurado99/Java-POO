/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anmijurane
 */

import javax.swing.JOptionPane;
public class RadioCircunferencia {
    public static void main(String[] args) {
        double PI = Math.PI;
        String radio_st;
        double radio, diametro, area, perimetro;
        radio_st= JOptionPane.showInputDialog("Sacemos el area de un circulo");
        radio= Double.parseDouble(radio_st) ;
        diametro= (2*radio);
        perimetro =  (2*radio)*PI;
        area = (PI*(radio*radio));
        JOptionPane.showMessageDialog(null, "El diametro es de: "+ String.format("%.2f", diametro)+"\nEl perimetro de la circunferencia: "+ String.format("%.2f", perimetro) +
                "\nEl area del circulo es de:" + String.format("%.2f", area));
        
    }
    
}
