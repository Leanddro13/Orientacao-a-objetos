package exercicios;

import java.util.Scanner;

public class Exe05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int senha = 1234;
		System.out.println("Sua nova senha é 1234");
		System.out.println("Informe a nova senha para entrar no sistema: ");
		int senhaCorreta = sc.nextInt();
		if (senha >= 1000 && senha <= 9999) {
			if (senha == senhaCorreta) {
				System.out.println("Senha correta");
			} else {
				System.out.println("Senha incorreta, tente novamente");
			}
		} else {
			System.out.println("Sua senha tem 4 digitos, tente novamente");
		}

		sc.close();

	}

}
