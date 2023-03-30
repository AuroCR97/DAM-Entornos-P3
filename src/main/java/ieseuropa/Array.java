package main.java.ieseuropa;

import java.util.Arrays;
import java.util.Collections;

public class Array {

	private static int calcularMedia(int[] numeros) {
		int media = 0;
		int cont = 0;
		for(int i = 0; i<numeros.length;i++) {
			media += numeros[i];
			cont++;
		}
		return media/cont;
	}
	
	private static void ordenarArrayMenorMayor(int[] numeros) {
		Arrays.sort(numeros);                                                                                             
		for (int num : numeros) {
		     System.out.print(num + ",");                                                                                       
		}
	}
	
	private static int calcularMediana(int [] numeros) {
		int mediana = 0;
		int mitad = numeros.length / 2;
		if (numeros.length % 2 == 0) {
		    mediana = (numeros[mitad - 1] + numeros[mitad]) / 2;
		} else {
		    mediana = numeros[mitad];
		}
		return mediana;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeros[] = { 7, 2, 3, 1, 5, 6, 7, 8 };
		System.out.println("La media es: " + calcularMedia(numeros));
		System.out.println("El array ordenado de mayor a menor es:");
		ordenarArrayMenorMayor(numeros);
		System.out.println();
		System.out.println("La mediana es: " +calcularMediana(numeros));
	}

}
