package ejercicios.intro.java;
import java.util.Scanner;
public class EjercicioIntroJavaN1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        System.out.println("Ingrese primer numero");
        num1=sc.nextInt();
        System.out.println("Ingrese segundo numero");
        num2=sc.nextInt();
        num3=num1+num2;
        System.out.println("El resultado de la suma es = "+num3);
    }
    
}
