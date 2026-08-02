package idt07Lista1_Vetores;

/* 5. Leia um vetor de inteiros de 10 posições. Contar e escrever quantos valores pares ele possui. */

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] vetor = new int[10];

        System.out.println("- Digite os 10 valores do vetor -");
        for (int i = 0; i < 10; i++) {
            vetor[i] = lerEntrada(s);
        }

        int qtdPares = contarPares(vetor);

        System.out.println("O vetor possui " + qtdPares + " valores pares.");

        s.close();
    }

    public static int lerEntrada(Scanner s) {
        System.out.print("valor = ");
        return s.nextInt();
    }

    public static int contarPares(int[] vetor) {
        int cont = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                cont++;
            }
        }
        return cont;
    }
}