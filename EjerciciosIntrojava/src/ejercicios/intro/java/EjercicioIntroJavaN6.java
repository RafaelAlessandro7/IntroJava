package ejercicios.intro.java;
import java.util.Scanner;
public class EjercicioIntroJavaN6 {
    public static void main (String[]asrg){
        Scanner sc=new Scanner(System.in);
        double nem;
        System.out.println("Introduzca un numero");
        nem=sc.nextDouble();
        if(nem%2==0){
            System.out.println("El numero es par");
        }else {
            System.out.println("El numero es impar");
        }
    }
}
