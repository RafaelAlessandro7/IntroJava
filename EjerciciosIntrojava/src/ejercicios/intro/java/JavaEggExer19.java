package ejercicios.intro.java;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
/**
 *
 * @author diego
 */
public class JavaEggExer19 {

   
    
    private static final BufferedReader CONSOLE = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int filas, matriz [][];
        boolean antisimétrica = true;
        
        System.out.println("Por favor ingrese la cantidad de filas de la matriz cuadrada");
        filas = Integer.parseInt(CONSOLE.readLine());
        
        matriz = new int [filas][filas];
        
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < filas; j++){
                System.out.printf("Pos[%d, %d] = ", i, j);
                matriz[i][j] = Integer.parseInt(CONSOLE.readLine());
            }
        }
        
//        Ciclos de comprobación matriz antisimétrica
        
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < filas; j++){
                if(i == j){
                    if(matriz[i][j] != 0){
                        antisimétrica = false;
                        break;
                    }
                }
                
                if(i != 0){
                    if(j <= (i-1) ){
                        if(Integer.signum(matriz[j][i]) == Integer.signum(matriz[i][j])){
                            System.out.printf("%d - %d", matriz[j][i], matriz[i][j]);
                            antisimétrica = false;
                            break;
                        }
                    }
                }
            }
            if(!antisimétrica){
                break;
            }
        }
        
        for(int [] row : matriz){
            System.out.println(Arrays.toString(row));
        }
        
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < filas; j++){
                System.out.printf(" [%d] ", matriz[j][i]);
            }
            System.out.println("");
        }
        
        if(!antisimétrica){
            System.out.println("No es una matriz antisimétrica.");
        }else{
            System.out.println("Es una matriz antisimétrica");
        }
    }  
}

