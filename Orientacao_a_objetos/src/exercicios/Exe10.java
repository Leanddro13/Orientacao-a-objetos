package exercicios;

public class Exe10 {
    public static void main(String[] args) {
       double soma = 0;
       for(int	i = 1; i <= 50; i++) {
           int divisor = i * 2 - 1;
           int dividendo = i;
           double parcela = divisor / (double)dividendo;
           System.out.println("Parcela: " + divisor + "/" + dividendo);
           soma = soma + parcela;
       }
       System.out.println("Soma: " + soma);
    }
}