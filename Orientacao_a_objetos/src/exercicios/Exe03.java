package exercicios;
// determine o as raizes de uma equacao
import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe tres valores:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		double delta = Math.pow(b,2) - 4 * a * c;
		if (delta > 0) {
			double raiz1 = (- b + Math.sqrt(delta))/(2 * a);
			double raiz2 = (- b - Math.sqrt(delta))/(2 * a);
			System.out.printf("Raiz 1: " + raiz1 + "%n" + "Raiz 2: " + raiz2);
		} else {
			System.out.println("Não e possivel encontrar raizes com o delta negativo");
		}

		
		
		sc.close();
	}

}