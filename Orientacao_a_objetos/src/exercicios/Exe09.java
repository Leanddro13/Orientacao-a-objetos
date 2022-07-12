package exercicios;
import java.util.Locale;

public class Exe09 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		for (int i = 50; i <= 65; i++) {
			double cel = i - 32/1.8;
			double fal = i * 1.8 + 32;
			System.out.printf("Celsius: %.2f / Fahrenheit: %.2f%n", cel, fal);
		}

	}

}
