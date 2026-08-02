package idt07Lista1_Vetores;

/* 12. Leia um vetor de inteiros de 50 posições e o compacte, ou seja, elimine as posições com valor zero 
avançando uma posição com os valores subsequentes. Todos os zeros devem ficar nas posições finais. */

import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] vetor = new int[50];

        System.out.println("- Digite os 50 valores do vetor -");
        for (int i = 0; i < 50; i++) {
            vetor[i] = lerEntrada(s);
        }

        compactarVetor(vetor);

        System.out.println("\nVetor compactado:");
        mostrarVetor(vetor);

        s.close();
    }

    public static int lerEntrada(Scanner s) {
        System.out.print("valor = ");
        return s.nextInt();
    }

    public static void compactarVetor(int[] vetor) {
        int pos = 0;
        
        // Desloca todos os elementos diferentes de zero para o início
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != 0) {
                vetor[pos] = vetor[i];
                pos++;
            }
        }

        // Preenche o restante com zeros
        while (pos < vetor.length) {
            vetor[pos] = 0;
            pos++;
        }
    }

    public static void mostrarVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}