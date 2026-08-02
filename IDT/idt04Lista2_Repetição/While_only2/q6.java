package idt04Lista2_Repetição.While_only2;

/* Reescreva o exercício 13 da lista anterior, de modo que o programa, ao final, escreva o seguinte:
- Qual a população do país A, ano a ano, até um ano antes do ano da superação da população do país B
- Qual a diferença populacional entre os países A e B: i) no primeiro ano ii) no momento da superação */

public class q6 {
    public static void main(String[] args) {
        double popA = 5000000;
        double popB = 7000000;

        double difInicial = Math.abs(popA - popB);

        int anos = 0;

        System.out.println("--- EVOLUÇÃO DA POPULAÇÃO DO PAÍS A ---");

        while (popA <= popB) {
            System.out.printf("Ano %d: População País A = %.0f hab.\n", anos, popA);

            popA += popA * 0.03;
            popB += popB * 0.02;
            anos++;
        }

        double difFinal = Math.abs(popA - popB);

        System.out.println("\n--- COMPARAÇÃO POPULACIONAL ---");
        System.out.printf("Diferença populacional no primeiro ano (Ano 0): %.0f habitantes\n", difInicial);
        System.out.printf("Diferença no momento da superação (Ano %d): %.0f habitantes\n", anos, difFinal);
    }
}