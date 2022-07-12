package exercicios;

import java.util.Scanner;

public class Exe06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um numero: ");
		int num = sc.nextInt();
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("nao e primo");
			} else {
				System.out.println("e primo");
			}
				
		} 
		sc.close();

	}

}
