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
	private static void calcularHora(int segundos) {
		int hora = segundos /3600;
		segundos %= 3600;
		System.out.print("Son " + hora + " horas, ");
		int minutos = segundos / 60 ;
		System.out.print( minutos + " minutos, ");
		segundos %= 60 ;
		System.out.println(segundos + " segundos.");
	}
	private static void seriePell () {
		int pellPrevio = 0; 
        int pellActual = 1; 

        System.out.println(pellPrevio);
        System.out.println(pellActual);
        
        for (int i = 2; i < 15; i++) {
            int pellSiguiente = 2 * pellActual + pellPrevio;
            System.out.println(pellSiguiente);
            pellPrevio = pellActual;
            pellActual = pellSiguiente;
        }
	}
	

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int	num = 8;
		System.out.println("El factorial es: " + calcularFactorial(num));
		
		int	segundos = 25542;
		calcularHora(segundos);
		
		System.out.println("Los primeros 15 numeros de la serie de Pell :");
		seriePell();
		
	    }
}

