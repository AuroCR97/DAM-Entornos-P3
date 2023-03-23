package main.java.ieseuropa;

public class Cadena {

	

	public static int longitud(String string) {

		int size = string.length();

		return size;

	}
	
	public static String mayus(String string) {

		return string = string.toUpperCase();

	}

	public static String minus(String string) {

		return string = string.toLowerCase();

	}
	
	public static void borrarOcurrencia(String a, String b) {
		System.out.println(a.toLowerCase().replace(b.toLowerCase(), ""));
	  }

	public static void main(String[] args) {

		
		
		System.out.println(longitud("holaHola"));
		
		System.out.println(mayus("hola"));
		
		System.out.println(minus("HOLAS"));
		
		borrarOcurrencia("RealMAdrid" , "real");
	}

}
