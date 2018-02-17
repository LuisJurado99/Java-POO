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
public class comparacion {
    public static void main(String[] args) {
        String a_st, b_st, c_st;
        int a,b,c;
        int Mayor;
        int Medio;
        int Menor;
        a_st = JOptionPane.showInputDialog("Vamos a ordenar los numeros.\n Dame el primer numero");
        b_st = JOptionPane.showInputDialog("Dame el segundo numero");
        c_st = JOptionPane.showInputDialog("Dame el tercer numero");
        a = Integer.parseInt(a_st);
        b = Integer.parseInt(b_st);
        c = Integer.parseInt(c_st);
        if(a>b && a>c){
            Mayor=a;
        }else{
            if(b>a && b>c){
                Mayor=b;
            }else{
                Mayor=c;
            }
        }
        if(a<b && a<c){
            Menor=a;
        }else{
            if(b<a && b<c){
            Menor=b;
            }else{
            Menor=c;
            }
        }
        Medio=(a+b+c)-(Mayor+Menor);
        JOptionPane.showMessageDialog(null," " + Menor + " " + Medio + " " +Mayor);
    }
}