package main.java.ieseuropa;
import java.util.*;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);

		int num[] = rellenarArray(10);
		imprmirArray(num);
		System.out.println();
		maximo(num);
		minimo(num);
		
		
		
		
			}
	public static void imprmirArray (int lista[]) {
		int i;
	for ( i=0; i<lista.length; i++) {
		System.out.print(lista[i]+" ");
		}
	}
	public static int[]rellenarArray ( int a ){
		int num[]= new int [10];
		 int i; 
		 a=1;
		 for ( i=0; i<num.length; i++) {
			 num[i]=a;
			 a++;
			 
		 }return num; 
	}	
	
	public static void minimo (int []valores) {
	int i=0; 
		int mayor=valores[0];
		for (i=1;i<valores.length;i++) {
		if (valores[i]>mayor) {
			mayor=valores[i];
		}
	}System.out.println("el numero mayor es el "+ mayor);
}	
	
	public static void maximo (int []valores) {
		int i=0; 
		int menor=valores[0];
for (i=1;i<valores.length;i++) {
		if (valores[i]<menor) {
			menor=valores[i];
		}
			}System.out.println("el numero menor es el "+ menor);
		}
	}
		