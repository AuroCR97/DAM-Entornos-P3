package main.java.ieseuropa;
import java.util.*;
import java.text.NumberFormat;
import java.text.DecimalFormat;


public class decimales {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
double num=15.46;
System.out.print("El numero original es " + num);
System.out.println();
System.out.println("Redondedo al alza dependiendo del decimal  " +RedondalAlza(num));
System.out.println("Redondedo hacia la baja   "+ RedondalBajo(num));
System.out.println("Redondea hacia arria sin importar decimal   " +Redondear(num));


System.out.println();
System.out.println("Quitar decimales");
	escribe(132.0012);
    escribe(123.45432);
    escribe(0.4);


System.out.println();
System.out.println("Ecuacion de Seggundo grado siendo a= 4, b=2, c=3");
System.out.println(ecuacion2Grado(5,3, 2));
	}
	

	public static double RedondalAlza (double num) {
		return Math.round(num);
	}
	public static double RedondalBajo (double num) {
		return Math.floor(num);
	}
	public static double Redondear(double num) {
		return Math.ceil(num);
	
	

}
	
public static void escribe (double num)	{
	    NumberFormat nf = new DecimalFormat("##.##");
        System.out.println( num + " -> " + nf.format(num) );
     }


public static double[] ecuacion2Grado(int a, int b, int c) {
 
    double discriminante = (Math.pow(b, 2) - (4 * a * c));
    if (discriminante >= 0) {
 
        double soluciones[];
 
       if(discriminante == 0){
 
            soluciones = new double[1];
 
            soluciones[0] = ((-b) - (4 * a * c)) / (2 * a);
 
        }else{
            soluciones = new double[2];
            soluciones[0] = ((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
            soluciones[1] = ((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        }
        return soluciones;
    } else {
        return null;
    		}
		}
	}