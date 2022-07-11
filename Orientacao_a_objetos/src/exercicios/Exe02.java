package exercicios;

//equals compara duas Strings, se elas forem iguais retorna true se não false.
import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um caractere: ");
		String cte = sc.next();
		if (cte.equals("a") || cte.equals("e") || cte.equals("i") || cte.equals("o") || cte.equals("u")) {
			System.out.println("Vogal");
		}
		else if (cte.equals("1") || cte.equals("2") || cte.equals("3") || cte.equals("4") || cte.equals("5") || cte.equals("6") || cte.equals("7") || cte.equals("8") || cte.equals("9")) {
			System.out.println("Numerico");
		}
		else {
			System.out.println("Consoante");
		}
			
		sc.close();

	}

}