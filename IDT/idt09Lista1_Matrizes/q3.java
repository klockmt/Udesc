package idt09Lista1_Matrizes;

/* 3. Elabore um programa que declare uma matriz de valores inteiros, cujas dimensões são 5 linhas e 5 colunas matriz[5x5]. 
Este programa deverá realizar o somatório dos elementos da diagonal principal, denominado SP. 
Também deverá realizar o somatório dos elementos da diagonal secundária, denominado SS. 
Ao final, subtrair SS de SP e mostrar o resultado. */

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[][] matriz = new int[5][5];

        System.out.println("- Preenchendo a matriz [5x5] -");
        criarmatriz(matriz, s);

        System.out.println("\nMatriz informada:");
        mostrar(matriz);

        int sp = somaDiagonalPrincipal(matriz);
        int ss = somaDiagonalSecundaria(matriz);
        int resultado = sp - ss;

        System.out.println("\n\nSomatório Diagonal Principal (SP) = " + sp);
        System.out.println("Somatório Diagonal Secundária (SS) = " + ss);
        System.out.println("Resultado (SP - SS) = " + resultado);

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

    public static int somaDiagonalPrincipal(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            soma += matriz[i][i];
        }
        return soma;
    }

    public static int somaDiagonalSecundaria(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            soma += matriz[i][4 - i];
        }
        return soma;
    }
}