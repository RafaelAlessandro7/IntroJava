package ejercicios.intro.java;

public class EjercicioIntroJavaN15 {
    public static void main(String[] args) {
        // Declarar el vector de tamaño 100
        int[] numeros = new int[100];

        // Llenar el vector con los 100 primeros números enteros
        for (int i = 0; i < 100; i++) {
            numeros[i] = i + 1;
        }

        // Recorrer el vector en orden descendente y mostrar cada elemento por pantalla
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}

