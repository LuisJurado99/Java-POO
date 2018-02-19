
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
        int numero;
        numero= Integer.parseInt(JOptionPane.showInputDialog("Veamos si el numero es par. \nIngrese el numero"));
        JOptionPane.showMessageDialog(null,(numero%2==0 ? " \nEl numero que ingresaste es : "+numero+"\nEs par" : " \nEl numero que ingresaste es : "
                +numero+"\nEs impar"));
    }
}
