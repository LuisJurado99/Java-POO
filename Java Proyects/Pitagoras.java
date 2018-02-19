
import javax.swing.JOptionPane;

public class Pitagoras {
    public static void main(String[] args) {
        double a,b;
        a=Double.parseDouble (JOptionPane.showInputDialog("Ingresa el lado A"));
        b=Double.parseDouble (JOptionPane.showInputDialog("Ingresa el lado B"));
        JOptionPane.showMessageDialog(null,"El valor de la Hipotenusa es: " + String.format("%.2f", Math.hypot(a, b)));
    }
}