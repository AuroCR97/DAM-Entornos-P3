package main.java.ieseuropa;

import java.util.Arrays;
import java.util.Collections;

public class Array {

	public static int maximo(int[] valores) {
		int i = 0;
		int mayor = valores[0];
		for (i = 1; i < valores.length; i++) {
			if (valores[i] > mayor) {
				mayor = valores[i];
			}
		}
		return mayor;
	}

	public static int minimo(int[] valores) {
		int i = 0;
		int menor = valores[0];
		for (i = 1; i < valores.length; i++) {
			if (valores[i] < menor) {
				menor = valores[i];
			}
		}
		return menor;
	}

	private static int calcularMedia(int[] numeros) {
		int media = 0;
		int cont = 0;
		for (int i = 0; i < numeros.length; i++) {
			media += numeros[i];
			cont++;
		}
		return media / cont;
	}

	private static void ordenarArrayMenorMayor(int[] numeros) {
		Arrays.sort(numeros);
		for (int num : numeros) {
			System.out.print(num + ",");
		}
	}

	private static int calcularMediana(int[] numeros) {
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
		System.out.println("La mediana es: " + calcularMediana(numeros));
		System.out.println();
		System.out.println("El máximo es: " + maximo(numeros));
		System.out.println("El mínimo es: " + minimo(numeros));

	}

}
