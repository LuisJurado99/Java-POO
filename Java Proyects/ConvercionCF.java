
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisj
 */
public class ConvercionCF {
    public static void main(String[] args) {
        String centigrados_st; 
        double centigrados, faren;
        centigrados_st = JOptionPane.showInputDialog("Vamos a convertir Grados Centigrados a Fahrenheit.\n Ingresa los datos en Centigrados.");
        centigrados = Double.parseDouble(centigrados_st);
        faren = (32+(9*centigrados/5));
        
        JOptionPane.showMessageDialog(null, "Grados Fahrenheit. " + (String.format("%.2f", faren)) + "\nGrados centigrados. " + String.format("%.2f", centigrados));
    }
}
