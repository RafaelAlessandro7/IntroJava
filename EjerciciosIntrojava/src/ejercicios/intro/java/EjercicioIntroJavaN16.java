
package ejercicios.intro.java;

import java.util.Scanner;

public class EjercicioIntroJavaN16 {
     public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el tamaño deseado del vector: ");
        int tamanoVector= leer.nextInt();
        int[] vector = new int [tamanoVector];
        llenarVector(vector, tamanoVector);
         System.out.println("");
        System.out.println("Ingrese el número que desea bucar en el vector: ");
        int num= leer.nextInt();             
        buscarNum(vector, num, tamanoVector);

    }
    public static void llenarVector(int[] vector, int tamanoVector){
        
        for (int i = 0; i < tamanoVector; i++) {
            int num2 = (int) (Math.random()*10);
            vector[i]=num2;
            System.out.print(" " +vector[i]+ " ");
        }
    }
    
    
    public static void buscarNum(int[] vector, int num, int tamanoVector){
        int contNum = 0;
        System.out.println("");
        for (int i = 0; i < tamanoVector; i++) {
            if (vector[i]==num) {
                System.out.println("El número "+num+" se encuentra en la posición "+i+" del vector");
                contNum++;
            }
        }
        System.out.println("Y se repite "+contNum+ " veces"); 
        
        
    }
                  
}
