
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anmijurane
 */
public class ParImpar {
    public static void main(String[] args) {
        String numero_st;
        int numero;
        numero_st= JOptionPane.showInputDialog("Veamos si el numero es par. \nIngrese el numero");
        numero = Integer.parseInt(numero_st);
        JOptionPane.showMessageDialog(null, numero + (numero%2==0 ? " \nEs par" : "\nEs impar"));
    }
}
