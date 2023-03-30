package main.java.ieseuropa;

public class Cadena {

	private static int longitud(String string) {
		int size = string.length();
		return size;
	}

	private static String mayus(String string) {
		return string = string.toUpperCase();
	}

	private static int contarLetra(String cadena, char letra) {
		int contador = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == letra) {
				contador++;
			}
		}
		return contador;
	}

	private static void repetirTexto(String texto1, String texto2, int repetir) {
		for (int i = 0; i < repetir; i++) {
			System.out.println(texto1);
			System.out.println(texto2);
		}
	}

	private static String ocurrencia(String texto) {
		String resultado = "";
		for (int i = 0; i < texto.length(); i++) {
			char letra = texto.charAt(i);
			resultado += letra;
			resultado += letra;
		}
		return resultado;
	}

	private static String minus(String string) {
		return string = string.toLowerCase();
	}

	private static void borrarOcurrencia(String a, String b) {
		System.out.println(a.toLowerCase().replace(b.toLowerCase(), ""));
	}

	public static void main(String[] args) {

		System.out.println(longitud("holaHola"));
		System.out.println(mayus("hola"));
		System.out.println(minus("HOLAS"));
		borrarOcurrencia("RealMAdrid", "real");
		String cadena = "Hola mundo";
		char letra = 'a';
		System.out.println("La letra aparece " + contarLetra(cadena, letra) + " veces");
		String texto1 = "Hola";
		String texto2 = "mundo";
		int repetir = 5;
		repetirTexto(texto1, texto2, repetir);
		String texto = "Hola mundo";
		System.out.println(ocurrencia(texto));
	}
}
