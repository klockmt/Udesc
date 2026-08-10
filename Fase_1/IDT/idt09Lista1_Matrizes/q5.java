package Fase_1.IDT.idt09Lista1_Matrizes;

/* 5. Elabore um programa que declare uma matriz de valores inteiros, cujas dimensões são 5 linhas e 5 colunas matriz[5x5]. 
Este programa deverá fazer a troca dos elementos, modificando a matriz, onde linhas são transferidas para colunas e vice-versa (Transposta). */

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[][] matriz = new int[5][5];

        System.out.println("- Preenchendo a matriz [5x5] -");
        criarmatriz(matriz, s);

        System.out.println("\nMatriz original:");
        mostrar(matriz);

        transporMatriz(matriz);

        System.out.println("\n\nMatriz transformada (Transposta):");
        mostrar(matriz);

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

    public static void transporMatriz(int[][] matriz) {
        for (int lin = 0; lin < 5; lin++) {
            for (int col = lin + 1; col < 5; col++) {
                int temp = matriz[lin][col];
                matriz[lin][col] = matriz[col][lin];
                matriz[col][lin] = temp;
            }
        }
    }
}