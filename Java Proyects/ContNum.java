
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
public class ContNum {
    public static void main(String[] args) {
        double n1, n2, n3, n4, n5 ;
        n1=Double.parseDouble(JOptionPane.showInputDialog("Ingresa 5 numeros te dire cual es mas grande y cual es mas chico "
                + "\nIngresa el primer numero"));
        n2=Double.parseDouble(JOptionPane.showInputDialog("Ingresa 5 numeros te dire cual es mas grande y cual es mas chico "
                + "\nIngresa el segundo numero"));
        n3=Double.parseDouble(JOptionPane.showInputDialog("Ingresa 5 numeros te dire cual es mas grande y cual es mas chico "
                + "\nIngresa el tercer numero"));
        n4=Double.parseDouble(JOptionPane.showInputDialog("Ingresa 5 numeros te dire cual es mas grande y cual es mas chico "
                + "\nIngresa el cuarto numero"));
        n5=Double.parseDouble(JOptionPane.showInputDialog("Ingresa 5 numeros te dire cual es mas grande y cual es mas chico "
                + "\nIngresa el quinto numero"));
        //evaluacion de los menores
        if (n1 < n2 && n1<n3 && n1<n4 && n1<n5) {
            JOptionPane.showMessageDialog(null, "Es el menor "+n1);
        }
        if (n2 < n1 && n2<n3 && n2<n4 && n2<n5) {
            JOptionPane.showMessageDialog(null, "Es el menor "+n2);
        }
        if (n3<n1  && n3<n2 && n3<n4 && n3<n5) {
            JOptionPane.showMessageDialog(null, "Es el menor "+n3);
        }
        if (n4 < n2 && n4<n3 && n4<n1 && n4<n5) {
            JOptionPane.showMessageDialog(null, "Es el menor "+n4);
        }
        if (n5 < n2 && n5<n3 && n5<n4 && n5<n1) {
            JOptionPane.showMessageDialog(null, "Es el menor "+n5);
        } // fin de las evalucaciones de los numeros menores         
        if (n1 > n2 && n1>n3 && n1>n4 && n1>n5) {
            JOptionPane.showMessageDialog(null, "Es el mayor "+n1);
        }
        if (n2 > n1 && n2>n3 && n2>n4 && n2>n5) {
            JOptionPane.showMessageDialog(null, "Es el mayor "+n2);
        }
        if (n3 > n1 && n3>n2 && n3>n4 && n3>n5) {
            JOptionPane.showMessageDialog(null, "Es el mayor "+n3);
        }
        if (n4 > n2 && n4>n3 && n4>n1 && n4>n5) {
            JOptionPane.showMessageDialog(null, "Es el mayor "+n4);
        }
        if (n5 > n2 && n5>n3 && n5>n4 && n5>n1) {
            JOptionPane.showMessageDialog(null, "Es el mayor "+n5);
        }
    }
    
}
