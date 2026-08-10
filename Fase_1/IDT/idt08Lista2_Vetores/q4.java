package Fase_1.IDT.idt08Lista2_Vetores;

/* VAMOS REFATORAR O EXERCÍCIO 7 DA LISTA 1.
Leia dois vetores de inteiros de 20 posições A e B e transfira seus conteúdos para um terceiro vetor C. 
Este vetor conterá, nas posições pares os valores do vetor A e nas posições impares os valores do vetor B. 
Ao final, o programa deverá ler o vetor C e escrever:
a) o somatório dos valores movimentados do vetor A
b) quantos valores movimentados do vetor B são maiores que a média dos valores contidos neste vetor (B) */

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] a = new int[20];
        int[] b = new int[20];
        int[] c = new int[40];

        System.out.println("- Digite os 20 valores do vetor A -");
        for (int i = 0; i < 20; i++) {
            a[i] = lerEntrada(s);
        }

        System.out.println("\n- package idt08Lista2_Vetores;\n" + //
                        "\n" + //
                        "public class q4 {\n" + //
                        "    \n" + //
                        "}\n" + //
                        "Digite os 20 valores do vetor B -");
        double somaB = 0;
        for (int i = 0; i < 20; i++) {
            b[i] = lerEntrada(s);
            somaB += b[i];
        }

        // Intercala em C
        for (int i = 0; i < 20; i++) {
            c[2 * i] = a[i];       // Índices pares recebem A
            c[2 * i + 1] = b[i];   // Índices ímpares recebem B
        }

        // Processa o vetor C para obter os resultados pedidos
        int somaA = 0;
        double mediaB = somaB / 20.0;
        int bMaioresQueMedia = 0;

        for (int i = 0; i < 40; i++) {
            if (i % 2 == 0) {
                // Posições pares de C (origem do vetor A)
                somaA += c[i];
            } else {
                // Posições ímpares de C (origem do vetor B)
                if (c[i] > mediaB) {
                    bMaioresQueMedia++;
                }
            }
        }

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("a) Somatório dos valores movimentados do vetor A: " + somaA);
        System.out.printf("b) Quantidade de valores do vetor B maiores que a média de B (%.2f): %d\n", mediaB, bMaioresQueMedia);

        s.close();
    }

    public static int lerEntrada(Scanner s) {
        System.out.print("valor = ");
        return s.nextInt();
    }
}