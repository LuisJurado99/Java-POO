
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisj
 */
public class SeparadorNumeros {
    public static void main(String[] args) {
     char numerosep;
     String cadena;
     Scanner lector = new Scanner(System.in);   
     System.out.println("Ingresa el numero ");
     cadena = lector.next();
     for (int i = 0; i < cadena.length(); i++) {
        numerosep = cadena.charAt(i);
        System.out.println("  "+numerosep);
     }
        
    }      
}
