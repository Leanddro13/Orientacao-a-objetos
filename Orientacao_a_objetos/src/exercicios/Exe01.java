package exercicios;

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a velocidade maxima?");
		int velMaxima = sc.nextInt();
		System.out.println("Qual sua velocidade?");
		int velocidade = sc.nextInt();
		 int veloFinal = velocidade - velMaxima;
		
		if (veloFinal > 0 && veloFinal <= 10) {
			System.out.printf("Voce ultrapassou %d da velocidade maxima, tera que pagar uma multa de R$ 50,00%n", veloFinal);
		}
		else if (veloFinal > 10 && veloFinal <= 30) {
			System.out.printf("Voce ultrapassou %d da velocidade maxima, tera que pagar uma multa de R$ 100,00%n", veloFinal);
		}
		else if (veloFinal > 30) {
			System.out.printf("Voce ultrapassou %d da velocidade maxima, tera que pagar uma multa de R$ 200,00%n", veloFinal);
		}
		else {
			System.out.println("Informe uma velocidade valida");
		}
		
		sc.close();

	}

}
