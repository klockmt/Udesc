package idt10Lista2_Matrizes;

/* VAMOS REFATORAR O EXERCÍCIO 5 DA LISTA 1.
Elabore um programa que declare uma matriz de valores inteiros, cujas dimensões são 5 linhas e 5 colunas matriz[5x5]. 
Este programa deverá fazer a troca dos elementos, onde linhas são transferidas para colunas e vice-versa.
Deverá apresentar também ao final:
a) Quantos valores trocados de posição são iguais entre si
b) Quantas trocas foram feitas no total */

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[][] matriz = new int[5][5];

        System.out.println("- Preenchendo a matriz [5x5] -");
        criarmatriz(matriz, s);

        System.out.println("\nMatriz original:");
        mostrar(matriz);

        int totalTrocas = 0;
        int trocasIguais = 0;

        for (int lin = 0; lin < 5; lin++) {
            for (int col = lin + 1; col < 5; col++) {
                totalTrocas++;
                if (matriz[lin][col] == matriz[col][lin]) {
                    trocasIguais++;
                }
                
                // Realiza a troca (transposição)
                int temp = matriz[lin][col];
                matriz[lin][col] = matriz[col][lin];
                matriz[col][lin] = temp;
            }
        }

        System.out.println("\n\nMatriz transformada (Transposta):");
        mostrar(matriz);

        System.out.println("\n\n--- ANÁLISES ADICIONAIS ---");
        System.out.println("a) Quantidade de valores trocados que eram iguais entre si: " + trocasIguais);
        System.out.println("b) Quantidade total de trocas efetuadas: " + totalTrocas);

        s.close();
    }

    public static int lerEntrada(Scanner s) {
        System.out.print("valor = ");
        return s.nextInt();
    }

    public static void criarmatriz(int[][] matriz, Scanner s) {
        for (int lin = 0; lin < 5; lin++) {
            for (int col = 0; col < 5; col++) {
                matriz[lin][col] = lerEntrada(s);
            }
        }
    }

    public static void mostrar(int[][] matriz) {
        for (int lin = 0; lin < 5; lin++) {
            System.out.println();
            for (int col = 0; col < 5; col++) {
                System.out.print(matriz[lin][col] + " ");
            }
        }
    }
}