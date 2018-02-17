
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
        String numero_st, numero2_st;
        int numero, numero2;
            numero_st = JOptionPane.showInputDialog("Veamos que numeros son multiplos.\n Ingresa el primer numero. ");
        numero2_st = JOptionPane.showInputDialog("Ingresa el segundo numero.");
        numero = Integer.parseInt(numero_st);
        numero2 = Integer.parseInt(numero2_st);
        JOptionPane.showMessageDialog(null, numero+"*"+numero2 + (numero%numero2==0 ? "\nSon multiplos" : "\nNo son multiplos" ));
    }
    
}
