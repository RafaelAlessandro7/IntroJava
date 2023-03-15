
package ejercicios.intro.java;
import java.util.Scanner;
public class EjercicioIntroJavaN4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese Grados centrigrados");
        double C=sc.nextDouble();
        double F=32+(9*C/5);
        System.out.println(C+" Grados Celsius es equivalente a "+F+" Grados Fahrenheit");

    }
    
}
