
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
public class NumerosEnteros {
    public static void main(String[] args) {
        double numeros[];
        numeros= new double [5];
        for (int i = 0; i < 5; i++) {
            numeros[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el numero: " + (i+1) ));
        }
        for (int i = 0; i < 5; i++) {
            if (numeros[i]%1 == 0) {
                JOptionPane.showMessageDialog(null, "Es entero: " + String.format("%.0f", numeros[i] ));
            }else{
                JOptionPane.showMessageDialog(null, "No hay numeros enteros");
            }
        }
    }
}
