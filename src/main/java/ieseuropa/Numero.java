package main.java.ieseuropa;

public class Numero {

	private static boolean esPrimo(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean esNumeroArmstrong(int numero) {
		int suma = 0;
		int numeroOriginal = numero;
		while (numero != 0) {
			int digito = numero % 10;
			suma += Math.pow(digito, 3);
			numero /= 10;
		}
		if (suma == numeroOriginal) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean esDeLaSuerte(int n) {
		int counter = 2;

		if (counter > n)
			return true;
		if (n % counter == 0)
			return false;
		int next_position = n - (n / counter);
		counter++;
		return esDeLaSuerte(next_position);
	}

	private static int calcularFactorial(int num) {
		int resultado = 1, i = 2;
		while (i <= num) {
			resultado = resultado * i;
			i++;
		}
		return resultado;
	}

	private static void calcularHora(int segundos) {
		int hora = segundos / 3600;
		segundos %= 3600;
		System.out.print("Son " + hora + " horas, ");
		int minutos = segundos / 60;
		System.out.print(minutos + " minutos, ");
		segundos %= 60;
		System.out.println(segundos + " segundos.");
	}

	private static void seriePell() {
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

		// TODO Auto-generated method stub

		System.out.println(esPrimo(73));
		System.out.println(esNumeroArmstrong(128));
		System.out.println(esDeLaSuerte(35));
		int num = 8;
		System.out.println("El factorial es: " + calcularFactorial(num));

		int segundos = 25542;
		calcularHora(segundos);

		System.out.println("Los primeros 15 numeros de la serie de Pell :");
		seriePell();

	}

}
