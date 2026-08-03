package idt10Lista2_Matrizes;

/* VAMOS REFATORAR O EXERCÍCIO 2 DA LISTA 1.
Elabore um programa que declare duas matrizes de valores inteiros, cujas dimensões são 5 linhas e 5 colunas (matrizA[5x5] e matrizB[5x5]). 
Este programa deverá realizar o somatório dos elementos correspondentes (linha,coluna) e mostrar o resultado. 
Deverá apresentar também ao final:
a) Em quantas ocorrências a soma de dois elementos correspondentes resultou em um número ímpar
b) Apenas para elementos das diagonais principais, em quantas ocorrências a soma de dois elementos correspondentes resultou em um número múltiplo de cinco */

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[][] matrizA = new int[5][5];
        int[][] matrizB = new int[5][5];
        int[][] soma = new int[5][5];

        System.out.println("- Digite os dados da Matriz A -");
        criarmatriz(matrizA, s);

        System.out.println("\n- Digite os dados da Matriz B -");
        criarmatriz(matrizB, s);

        somaMatriz(matrizA, matrizB, soma);

        System.out.println("\nMatriz Soma:");
        mostrar(soma);

        int contImpar = 0;
        int contDiagMult5 = 0;

        for (int lin = 0; lin < 5; lin++) {
            for (int col = 0; col < 5; col++) {
                if (soma[lin][col] % 2 != 0) {
                    contImpar++;
                }
                if (lin == col && soma[lin][col] % 5 == 0) {
                    contDiagMult5++;
                }
            }
        }

        System.out.println("\n\n--- ANÁLISES ADICIONAIS ---");
        System.out.println("a) Ocorrências em que a soma resultou em número ímpar: " + contImpar);
        System.out.println("b) Na diagonal principal, somas que são múltiplas de 5: " + contDiagMult5);

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

    public static void somaMatriz(int[][] matrizA, int[][] matrizB, int[][] soma) {
        for (int lin = 0; lin < 5; lin++) {
            for (int col = 0; col < 5; col++) {
                soma[lin][col] = matrizA[lin][col] + matrizB[lin][col];
            }
        }
    }
}