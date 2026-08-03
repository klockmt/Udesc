package idt07Lista1_Vetores;

/* 8. Leia um vetor de 40 posições e acumule os valores do primeiro elemento no segundo, deste no terceiro e assim por diante. 
Ao final, escreva o vetor obtido. */

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] vetor = new int[40];

        System.out.println("- Digite os 40 valores do vetor -");
        for (int i = 0; i < 40; i++) {
            vetor[i] = lerEntrada(s);
        }

        acumularValores(vetor);

        System.out.println("\nVetor com valores acumulados:");
        mostrarVetor(vetor);

        s.close();
    }

    public static int lerEntrada(Scanner s) {
        System.out.print("valor = ");
        return s.nextInt();
    }

    public static void acumularValores(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            vetor[i] = vetor[i] + vetor[i - 1];
        }
    }

    public static void mostrarVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}