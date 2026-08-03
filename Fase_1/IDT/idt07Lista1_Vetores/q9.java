package idt07Lista1_Vetores;

/* 9. Leia um vetor de 5 posições contendo os algarismos de um numero. Em seguida escreva esse numero por extenso. */

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] vetor = new int[5];

        System.out.println("- Digite os 5 algarismos (0 a 9) -");
        for (int i = 0; i < 5; i++) {
            vetor[i] = lerEntrada(s);
        }

        System.out.println("\nNúmero por extenso:");
        escreverPorExtenso(vetor);

        s.close();
    }

    public static int lerEntrada(Scanner s) {
        System.out.print("algarismo = ");
        return s.nextInt();
    }

    public static void escreverPorExtenso(int[] vetor) {
        String[] nomes = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};

        for (int i = 0; i < vetor.length; i++) {
            int d = vetor[i];
            if (d >= 0 && d <= 9) {
                System.out.print(nomes[d] + " ");
            } else {
                System.out.print("[inválido] ");
            }
        }
        System.out.println();
    }
}