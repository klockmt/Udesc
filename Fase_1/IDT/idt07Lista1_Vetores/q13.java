package Fase_1.IDT.idt07Lista1_Vetores;

/* 13. Considere um vetor de trajetórias onde cada elemento possui o valor do próximo elemento do vetor a ser lido.
Índice: 0 1 2 3 4 5 6 7 8 9
Valor:  1 5 7 6 9 2 8 4 0 3
Sequência esperada de leitura: 1, 5, 2, 7, 4, 9, 3, 6, 8, 0
Faça um algoritmo que seja capaz de ler esse vetor e seguir a trajetória. */

import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] vetor = new int[10];

        System.out.println("- Digite os 10 valores do vetor de trajetória -");
        for (int i = 0; i < 10; i++) {
            System.out.print("Índice [" + i + "] = ");
            vetor[i] = s.nextInt();
        }

        System.out.println("\nSeguindo a trajetória:");
        seguirTrajetoria(vetor);

        s.close();
    }

    public static void seguirTrajetoria(int[] vetor) {
        int posAtual = 0;
        int passos = 0;

        while (passos < vetor.length) {
            int proximo = vetor[posAtual];
            System.out.print(proximo + (passos < vetor.length - 1 ? ", " : ""));
            posAtual = proximo;
            passos++;
        }
        System.out.println();
    }
}