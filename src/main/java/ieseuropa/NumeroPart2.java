package main.java.ieseuropa;

import java.util.Scanner;

public class NumeroPart2 {
	
	
	
	private static int calcularFactorial(int num) {
		int resultado = 1, i=2;
		while(i <= num) {
			resultado = resultado *i;
			i++;
		}return resultado;
	}
	

	public static void main(String[] args) {
		
		System.out.println("El factorial es:" + calcularFactorial(8));
		

	}

}
