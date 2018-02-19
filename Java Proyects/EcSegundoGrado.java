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
public class EcSegundoGrado {
    public static void main(String[] args) {
        double a,b,c,x1,x2, potencia, raiz;
        a=Double.parseDouble(JOptionPane.showInputDialog("Ingresa A"));
        b=Double.parseDouble(JOptionPane.showInputDialog("Ingresa B"));
        c=Double.parseDouble(JOptionPane.showInputDialog("Ingresa C"));
        JOptionPane.showMessageDialog(null, "A:"+ a +" B:"+ b + " C:" + c);
        potencia= Math.pow(b, 2);
        JOptionPane.showMessageDialog(null, "potencia: " + potencia);
        raiz=(potencia-(4*a*c));
        JOptionPane.showMessageDialog(null, "raiz: " + raiz);
        if (raiz<0){
            JOptionPane.showMessageDialog(null, "raiz imaginaria");
        }else{
            x1=((b*(-1))+(Math.sqrt(raiz)))/(2*a);
            x2=((b*(-1))-(Math.sqrt(raiz)))/(2*a);
            JOptionPane.showMessageDialog(null, "(+)Primera Raiz: " + x1 + "\n(-)Segunda Raiz: " + x2);
        }
    }
    
}
