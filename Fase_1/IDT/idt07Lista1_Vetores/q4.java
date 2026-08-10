package Fase_1.IDT.idt07Lista1_Vetores;

/* 4. Leia um vetor de inteiros de 20 posições e em seguida um valor X qualquer. 
Seu programa devera fazer uma busca do valor de X no vetor lido e informar a posição em que foi encontrado ou se não foi encontrado. */

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] vetor = new int[20];

        System.out.println("- Digite os 20 valores do vetor -");
        for (int i = 0; i < 20; i++) {
            vetor[i] = lerEntrada(s);
        }

        System.out.println("\nDigite o valor X a ser buscado:");
        int x = s.nextInt();

        int posicao = buscarValor(vetor, x);

        if (posicao != -1) {
            System.out.println("O valor " + x + " foi encontrado na posição (índice): " + posicao);
        } else {
            System.out.println("O valor " + x + " NÃO foi encontrado no vetor.");
        }

        s.close();
    }

    public static int lerEntrada(Scanner s) {
        System.out.print("valor = ");
        return s.nextInt();
    }

    public static int buscarValor(int[] vetor, int x) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == x) {
                return i;
            }
        }
        return -1;
    }
}