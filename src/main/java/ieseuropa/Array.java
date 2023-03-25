package main.java.ieseuropa;
import java.util.*;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int []num = new int [10];
		int i;
		System.out.println("Introduce los elementos del array");
		for (i=0; i<10; i++) {
			num[i]=sc.nextInt();
		}
		for (i=0; i<10; i++) {
			System.out.print(num[i]+" ");
		}
		int max = num[0];
		int min = num[0];

		for (i=0; i<10; i++) {
			if (num[i]<min) {
				min = num[i];
			}else if (num[i]>max) {
				max= num[i];
			}
		}
		System.out.println();
		System.out.println("El numero mayor en el array es " + max);
		System.out.println ("el numero menor en el array es "+ min);
	}
}