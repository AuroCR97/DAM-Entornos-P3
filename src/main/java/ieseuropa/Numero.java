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
	    }else {
	    	return false;
	    }
	}
	 public static boolean esDeLaSuerte(int n){
	    	int counter=2;
	        	
			if (counter > n)
			    return true;
			if (n % counter == 0)
			    return false;
			int next_position = n - (n / counter);
			counter++;
			return esDeLaSuerte(next_position);
	        }

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		System.out.println(esPrimo(73));
		System.out.println(esNumeroArmstrong(128));
		System.out.println(esDeLaSuerte(35));
		

	}

}
