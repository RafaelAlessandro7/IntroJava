
package ejercicios.intro.java;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class EjercicioIntroJavaN5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        double dnum;
        double trip;
        System.out.println("Ingrese un numero");
        num=sc.nextInt();
        dnum=num*2;
        trip=num*3;
        System.out.println("EL doble es ="+dnum);
        System.out.println("El triple es ="+trip);
        System.out.println("La raiz Cuadrada es ="+(sqrt(num)));
    }
}
