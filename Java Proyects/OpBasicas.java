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
public class OpBasicas {
    public static void main(String[] args) {        
        double numero1, numero2, division; // variables para las operaciones logicas
        numero1= Double.parseDouble(JOptionPane.showInputDialog("Te ayudo a hacer las operaciones basicas de dos numeros\n "
                + "Ingresa el primer numero"));
        numero2= Double.parseDouble(JOptionPane.showInputDialog("Ingresa el otro numero"));
        division=(numero1/numero2);
        JOptionPane.showMessageDialog(null,"Ingresaste estos numeros: "+numero1+" y "+numero2+ "\nLa suma es igual a: "+ (numero1 + numero2) + "\nEl producto de los dos numeros es: "+ (numero1 * numero2) + 
                "\nLa diferencia de los dos numeros es: "+ (numero1 - numero2) + "\nEl cociente de los dos numeros es:"+ String.format("%.2f",division));
    } 
}
