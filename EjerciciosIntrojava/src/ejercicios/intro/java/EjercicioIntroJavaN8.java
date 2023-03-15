
package ejercicios.intro.java;

import java.util.Scanner;

public class EjercicioIntroJavaN8 {
    public static void main(String[]asrg){
        Scanner sc=new Scanner(System.in);
    String frase;
    
        System.out.println("Ingrese un frase con menos de 8 caracteres de longitud");
        frase=sc.nextLine();
        if(frase.length()==8){
        System.out.println("Incorrecto");
    }else{
            System.out.println("Correcto");
        }
    }
}
