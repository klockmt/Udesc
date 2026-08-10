package Fase_1.IDT.idt07Lista1_Vetores;

/* 6. Leia um vetor de inteiros 10 posições e atribua valor 0 para todos os elementos que possuírem valores negativos. */

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] vetor = new int[10];

        System.out.println("- Digite os 10 valores do vetor -");
        for (int i = 0; i < 10; i++) {
            vetor[i] = lerEntrada(s);
        }

        zerarNegativos(vetor);

        System.out.println("\nVetor resultante:");
        mostrarVetor(vetor);

        s.close();
    }

    public static int lerEntrada(Scanner s) {
        System.out.print("valor = ");
        return s.nextInt();
    }

    public static void zerarNegativos(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                vetor[i] = 0;
            }
        }
    }

    public static void mostrarVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}