package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exe07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o nome do produto: ");
		String prod = sc.next();
		System.out.println("Informe a quantidade: ");
		int quant = sc.nextInt();
		System.out.println("preco do produto: ");
		double price = sc.nextDouble();
		
		if (quant >= 0 && quant <= 5) {
			double total = price * quant;
			double desconto = total * 2/100;
			double totalFinal = total - desconto;
			System.out.printf("foram comprados %d %s e o total a pagar e %.2f%n", quant, prod, totalFinal);
		} else if (quant > 5 && quant <= 10) {
			double total = price * quant;
			double desconto = total * 3/100;
			double totalFinal = total - desconto;
			System.out.printf("foram comprados %d %s e o total a pagar e %.2f%n", quant, prod, totalFinal);
		} else if (quant > 10) {
			double total = price * quant;
			double desconto = total * 5/100;
			double totalFinal = total - desconto;
			System.out.printf("foram comprados %d %s e o total a pagar e %.2f%n", quant, prod, totalFinal);
		} else {
			System.out.println("Informe um valor valido");
		}
		
		sc.close();
	}

}
