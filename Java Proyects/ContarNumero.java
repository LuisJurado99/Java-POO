package contarnumero;
import java.util.Scanner;
public class ContarNumero {
    static Scanner lr = new Scanner(System.in);
    public static void main(String[] args) {

        int Pos = 0, Neg = 0, Cero = 0;
        
        System.out.println("Ingresa un Número: ");
        int Num1 = lr.nextInt();
        
        System.out.println("Ingresa número 2: ");
        int Num2 = lr.nextInt();
        
        System.out.println("Ingresa número 3: ");
        int Num3 = lr.nextInt();
        
        System.out.println("Ingresa número 4: ");
        int Num4 = lr.nextInt();
        
        System.out.println("Ingresa número 5: ");
        int Num5 = lr.nextInt();
        
        //Negativos//        
        if (Num1 < 0) {
            Neg++;
        }
        if (Num2 < 0) {
            Neg++;
        }
        if (Num3 < 0) {
            Neg++;
        }
        if (Num4 < 0) {
            Neg++;
        }
        if (Num5 < 0) {
            Neg++;
        }
        //Positivos//
        if (Num1 > 0) {
            Pos++;
        }
        if (Num2 > 0) {
            Pos++;
        }
        if (Num3 > 0) {
            Pos++;
        }
        if (Num4 > 0) {
            Pos++;
        }
        if (Num5 > 0) {
            Pos++;
        }
        //Ceros//
        if (Num1 == 0) {
            Cero++;
        }
        if (Num2 == 0) {
            Cero++;
        }
        if (Num3 == 0) {
            Cero++;
        }
        if (Num4 == 0) {
            Cero++;
        }
        if (Num5 == 0) {
            Cero++;
        }
        
        System.out.println("Números Negativos = " +Neg+ "\n Números Positivos = "+Pos+ "\n Número Cero = " +Cero);
    }
    
}
