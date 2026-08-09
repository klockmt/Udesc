package EJ;

/*Faça um programa Java que determine o volume V de uma caixa da agua ciliındrica, sendo
que o raio e a altura devem ser fornecidos(lidos pelo teclado) */

import java.util.Locale;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Locale ptBr = Locale.forLanguageTag("pt-BR");
        Scanner s = new Scanner(System.in);
        s.useLocale(ptBr);

        System.out.println("Informe o raio:");
        double raio = s.nextDouble();

        System.out.println("Informe a altura:");
        double altura = s.nextDouble();

        double resultado = Math.PI * Math.pow(raio, 2) * altura;

        System.out.printf(ptBr, "%.2f%n", resultado);

        s.close();
    }
}