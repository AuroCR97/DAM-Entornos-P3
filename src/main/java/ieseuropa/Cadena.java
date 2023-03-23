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
	private static void repetirTexto(String texto1,String texto2,int repetir) {
			
			for(int i=0;i< repetir;i++) {
				System.out.println(texto1);
				System.out.println(texto2);
			}
			
		}

	public static void main(String[] args) {

		String cadena = "hola mundo";
		char letra = 'a';
		System.out.println("La letra aparece " + contarLetra(cadena,letra) + " veces");
		
		String texto1 = "hola";
		String texto2 = "mundo";
		int repetir = 5 ;
		repetirTexto(texto1,texto2,repetir);
		

	}

}
