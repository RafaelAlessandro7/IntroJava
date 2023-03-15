package ejercicios.intro.java;

import java.util.Scanner;
import java.lang.String;
public class EjercicioIntroJavaN9 {
    public static void main(String[]asrg){
        Scanner sc=new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase");
        frase=sc.nextLine();
        String pL=frase.substring(0,1);
        if(pL.equals("a")||pL.equals("A")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
}
