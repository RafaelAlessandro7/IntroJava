/*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que
una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada
de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).*/
package ejercicios.intro.java;

import java.util.Scanner;

public class EjercicioIntroJavaN19 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa el tamaño de la matriz: ");
        int n = leer.nextInt();
        int [][] matrizA = new int [n][n];
        int [][] matrizB = new int [n][n];
        
        System.out.println("Ingresa los valores de la matriz A");
         //Llenado de matriz A 
         for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n; j++) {
                matrizA[i][j] = leer.nextInt();    
            }
         }
        //Impresión de matriz A
        
        System.out.println("MATRIZ A");
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                System.out.print(" "+matrizA[j][k]+ " ");
            }
            System.out.println(" ");    
        }
        System.out.println(" ");
        //Traspuesta de A (B)
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                matrizB[k][j] = matrizA[j][k];

            }
        }
             
          //Impresión de B
         System.out.println("MATRIZ B");
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                System.out.print(" " +matrizB[j][k]+ " ");
            }
            System.out.println(" ");   
        }
        
        //Evaluación traspuesta
        int contAntiSim = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrizA[i][j]==-(matrizB[i][j])) {
                    contAntiSim++;
                }
           }
        }
        if (contAntiSim ==n*n) {
            System.out.println("La matriz es Antisimétrica");
            
        }else{
            System.out.println("La matriz no es Antisimétrica");
        }
    }   
}
