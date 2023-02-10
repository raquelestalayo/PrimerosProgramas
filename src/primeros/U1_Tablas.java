package primeros;

import java.util.Scanner;

public class U1_Tablas {
	
	public static void main(String[] arg) {
		 
		int n;
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Dame un número entre 1 y 10");
			n = sc.nextInt();
			if ((n<1) || (n>10))
				System.out.println("El número no es válido");
			}while (n<=0 || (n>11));
	}
}