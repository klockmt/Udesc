package EJ;

/*Faça um programa Java que lê um valor inteiro positivo N , calcula e imprime o valor de N ! (fatorial de N). */

import java.util.Locale;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Locale ptBr = Locale.forLanguageTag("pt-BR");
        Scanner s = new Scanner(System.in);
        s.useLocale(ptBr);
        long resultado = 1;

        System.out.println("Informe o valor n:");
        int n = s.nextInt();

        if (n >= 1) {
            for (int i = n; i > 0; i--) {
                resultado = i * resultado;
            }
        }
        System.out.println(resultado);

        s.close();
    }
}
