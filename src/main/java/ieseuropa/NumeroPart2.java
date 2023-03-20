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
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero entero para saber su factorial.");
		int	num = teclado.nextInt();
		System.out.println("El factorial es: " + calcularFactorial(num));
		System.out.println("Dime un numero entero para saber cuantas horas,minutos y segundos son:");
		
		int	segundos = teclado.nextInt();
		int hora = segundos /3600;
		segundos %= 3600;
		int minutos = segundos / 60 ;
		segundos %= 60 ;
		System.out.println( "Son "+hora + " horas - " + minutos + " minutos - "+ segundos + " segundos");
		
		System.out.println("Los 15 números de la serie de Pell :");
			int pellPrevio = 0; // P(0)
	        int pellActual = 1; // P(1)

	        System.out.println(pellPrevio);
	        System.out.println(pellActual);
	        
	        for (int i = 2; i < 15; i++) {
	            int pellSiguiente = 2 * pellActual + pellPrevio;
	            System.out.println(pellSiguiente);
	            pellPrevio = pellActual;
	            pellActual = pellSiguiente;
	        }
	    }
	
}

