package ejercicios.intro.java;
import java.util.Scanner;
public class EjercicioIntroJavaN13 {
    public static void main(String[]asrg){
        Scanner scanner = new Scanner(System.in);
        int n;
        // Pedimos al usuario que introduzca el tamaño del cuadrado
        System.out.print("Introduce dimenciones del cuadrado: ");
        n = scanner.nextInt();
        // Dibujamos el cuadrado
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n-1 || j == 0 || j == n-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
    }
    }
}