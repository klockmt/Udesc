package idt08Lista2_Vetores;

/* VAMOS REFATORAR O EXERCÍCIO 5 DA LISTA 1.
Leia um vetor de inteiros de 40 posições. Contar e escrever quantos valores pares ele possui. 
Ao final, este programa deverá escrever:
a) qual a média dos valores pares encontrados
b) quantos valores ímpares estão abaixo desta média */

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] vetor = new int[40];

        System.out.println("- Digite os 40 valores do vetor -");
        for (int i = 0; i < 40; i++) {
            vetor[i] = lerEntrada(s);
        }

        int qtdPares = 0;
        double somaPares = 0;

        for (int i = 0; i < 40; i++) {
            if (vetor[i] % 2 == 0) {
                qtdPares++;
                somaPares += vetor[i];
            }
        }

        System.out.println("\nQuantidade de valores pares: " + qtdPares);

        if (qtdPares > 0) {
            double mediaPares = somaPares / qtdPares;

            int imparesAbaixoMedia = 0;
            for (int i = 0; i < 40; i++) {
                if (vetor[i] % 2 != 0 && vetor[i] < mediaPares) {
                    imparesAbaixoMedia++;
                }
            }

            System.out.printf("a) Média dos valores pares encontrados: %.2f\n", mediaPares);
            System.out.println("b) Quantidade de valores ímpares abaixo dessa média: " + imparesAbaixoMedia);
        } else {
            System.out.println("a) Não foram digitados valores pares para calcular a média.");
            System.out.println("b) Não foi possível avaliar ímpares abaixo da média.");
        }

        s.close();
    }

    public static int lerEntrada(Scanner s) {
        System.out.print("valor = ");
        return s.nextInt();
    }
}