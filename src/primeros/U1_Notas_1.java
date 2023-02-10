package primeros;

import java.util.Scanner;

public class U1_Notas_1 {

	public static void main(String[] args) {
		
		String modulo, sNota;
		float n1, n2, n3, m;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nombre del módulo:");
		modulo = sc.nextLine();
		
		System.out.println("Dime la nota de la primera evaluación");
		n1 = sc.nextFloat();
		
		System.out.println("Dime la nota de la segunda evaluación");
		n2 = sc.nextFloat();
		
		System.out.println("Dime la nota de la tercera evaluación");
		n3 = sc.nextFloat();
		
		m = (n1+n2+n3)/3;
		m = (int)m;
		
			switch((int)m) {
				case (int) 0,1,2,3,4 :
					sNota="Suspenso";
					break;
				case (int) 5:
					sNota="Aprobado";
					break;
				case (int) 6:
					sNota="Bien";
					break;
				case (int) 7,8:
					sNota="Notable";
					break;
				case (int) 9,10:
					sNota="Sobresaliente";
					break;
				default:
					sNota="Error";
			}
			System.out.printf("La nota final del %s es %s", modulo, sNota);
		}
}