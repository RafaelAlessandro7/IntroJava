package ejercicios.intro.java;
import java.util.Scanner;
public class EjercicioIntroJavaN3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String Frase;
        System.out.println("Ingrese una frase");
        Frase=sc.next();
        System.out.println(Frase.toUpperCase());
        System.out.println(Frase.toLowerCase());
    }
    
}
