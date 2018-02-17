
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
public class Pitagoras {
    public static void main(String[] args) {
        double a,b;
        a=Double.parseDouble (JOptionPane.showInputDialog("Ingresa el lado A"));
        b=Double.parseDouble (JOptionPane.showInputDialog("Ingresa el lado B"));
        JOptionPane.showMessageDialog(null,"El valor de la Hipotenusa es: " + String.format("%.2f", Math.hypot(a, b)));
    }
}
