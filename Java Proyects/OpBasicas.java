/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anmijurane
 */
/*import java.util.Scanner;*/
import javax.swing.JOptionPane;
public class OpBasicas {
    public static void main(String[] args) {
        String numero1_st,numero2_st; //variables string por cuadro de dialogos
        double numero1, numero2, division; // variables para las operaciones logicas
        numero1_st= JOptionPane.showInputDialog("Que numero deseas sumar");
        numero2_st= JOptionPane.showInputDialog("Ingresa el otro numero");
        numero1 = Double.parseDouble(numero1_st);
        numero2 = Double.parseDouble(numero2_st);
        division=(numero1/numero2);
        JOptionPane.showMessageDialog(null, "La suma es igual a: "+ (numero1 + numero2) + "\nEl producto de los dos numeros es: "+ (numero1 * numero2) + 
                "\nLa diferencia de los dos numeros es: "+ (numero1 - numero2) + "\nEl cociente de los dos numeros es:"+ String.format("%.2f",division));
    }
    
}
