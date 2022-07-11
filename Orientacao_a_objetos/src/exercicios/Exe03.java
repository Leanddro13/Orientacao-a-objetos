package exercicios;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe tres valores:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		double raiz1 = (- b + Math.sqrt(Math.pow(b,2) - 4 * a * c))/(2 * a);
		double raiz2 = (- b - Math.sqrt(Math.pow(b,2) - 4 * a * c))/(2 * a);
		
		sc.close();
	}

}