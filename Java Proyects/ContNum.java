
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
        double n[];
        n = new double [5];
        for (int i = 0; i < 5; i++) {
            n[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa numeros positivos, negativos y ceros al azar"));            
        }
        for (int i = 0; i < 5; i++) {
            if (n[i] == 0){
                
            }
            
        }
    }
    
}
