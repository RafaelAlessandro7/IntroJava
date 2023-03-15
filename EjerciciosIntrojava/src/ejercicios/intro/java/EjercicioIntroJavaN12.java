
package ejercicios.intro.java;

import java.util.Scanner;

public class EjercicioIntroJavaN12 {
    public static void main (String[]asrg){
    Scanner sc = new Scanner(System.in);
    String FDE="&&&&&";
    boolean send=true;
        while(send!=false){
            String cadena;
            System.out.println("Ingrese Cadena (recuerde al incluir X al inicio y O al final de la cadena para ser valido(maximo 5 caracteres))");
            cadena=sc.next();
            String cadena2 = cadena.toLowerCase();
            String inicio;
            String finall;
            inicio = cadena2.substring(0, 1);
            finall = cadena2.substring(4, 5);
            if (cadena.length()>=6) {
                System.out.println("Exede el limite de caracteres");
                send=false;
            }else if(!"o".equals(finall)){
                System.out.println("La letra final no coincide con el formato");
                send=false;
                }else if(!"x".equals(inicio)){
                System.out.println("La letra inicial no coincide con el formato");
                send=false;
                }else{
                   System.out.println(FDE); 
                }
        }
    }
}
