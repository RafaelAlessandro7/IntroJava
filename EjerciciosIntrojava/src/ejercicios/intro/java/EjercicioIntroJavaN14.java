
package ejercicios.intro.java;
import java.util.Scanner;
public class EjercicioIntroJavaN14 {
    public static void main (String[]asrg){
        Scanner sc=new Scanner(System.in);
        double vectorvalores[]=new double[3];
        vectorvalores[0]=0.86;
        vectorvalores[1]=1.28611;
        vectorvalores[2]=129.852;
        System.out.println("Ingrese monto a cambiar en euros");
        double monto=sc.nextInt();
        double librass=vectorvalores[0];
        double dolaress=vectorvalores[1];
        double yeness=vectorvalores[2];
        libras(monto,librass);
        dolares(monto,dolaress);
        yenes(monto,yeness);
    }
    public static void libras(double monto,double librass){
        double cambio1;
        cambio1=monto*librass;
        System.out.println("Cambio a Libras = "+cambio1);
    }
    public static void dolares(double monto,double dolaress){
        double cambio2;
        cambio2=monto*dolaress;
        System.out.println("Cambio a Dolares = "+cambio2);
    }
    public static void yenes(double monto,double yeness){
        double cambio3;
        cambio3=monto*yeness;
        System.out.println("Cambio a Yenes = "+cambio3);
    }
}
