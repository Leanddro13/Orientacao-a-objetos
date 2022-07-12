package exercicios;

import java.util.Scanner;
	
public class Exe04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Recebe data: dia/mes/ano");
		int dia = sc.nextInt();
		int mes = sc.nextInt();
		int ano = sc.nextInt();
		
		System.out.println("Recebendo outra data: dia/mes/ano");
		int dia2 = sc.nextInt();
		int mes2 = sc.nextInt();
		int ano2 = sc.nextInt();
		
		int anoTotal1 = dia + mes + ano;
		int anoTotal2 = dia2 + mes2 + ano2;
		
		if (anoTotal1 > anoTotal2) {
			System.out.println("A data " + dia + "/" + mes + "/" + ano + " e maior");
		} else {
			System.out.println("A data " + dia2 + "/" + mes2 + "/" + ano2 + " e maior");
		}
		
		
		sc.close();

	}

}
