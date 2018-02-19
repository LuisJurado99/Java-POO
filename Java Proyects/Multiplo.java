
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
public class Multiplo {
    public static void main(String[] args) {
        int numero, numero2;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Veamos que numeros son multiplos.\n Ingresa el primer numero. "));
        numero2= Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero."));                
        JOptionPane.showMessageDialog(null, numero+" y "+numero2 + (numero%numero2==0 ? "\nSon multiplos" : "\nNo son multiplos" ));
    }
    
}
