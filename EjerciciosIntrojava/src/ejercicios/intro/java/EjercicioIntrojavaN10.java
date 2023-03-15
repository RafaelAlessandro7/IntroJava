
package ejercicios.intro.java;
import java.util.Scanner;
public class EjercicioIntrojavaN10 {
    public static void main (String[]asrg){
        Scanner sc=new Scanner(System.in);
        int numL;
        int suma=0;
        System.out.println("Ingrese un numero limite");
        numL=sc.nextInt();
        while (numL>=suma){
            int num;
            System.out.println("Ingrese numero a sumar");
            num=sc.nextInt();
            suma=num+suma;
            System.out.println("La suma hasta el momento es = "+suma);
        }     
    }
}
