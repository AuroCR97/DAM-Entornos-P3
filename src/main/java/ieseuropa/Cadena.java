package main.java.ieseuropa;

public class Cadena {
	
	private static int contarLetra(String cadena,char letra) {
		int contador = 0;
		
		for(int i=0;i<cadena.length();i++) {
			if(cadena.charAt(i) ==  letra) {
				contador++;
			}
		}
		return contador;
	}

	public static void main(String[] args) {

		String cadena = "hola mundo";
		char letra = 'a';
		System.out.println("La letra aparece " + contarLetra(cadena,letra) + " veces");
		

	}

}
