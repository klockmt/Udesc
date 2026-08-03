package idt09Lista1_Matrizes;

/* 4. Elabore um programa que declare uma matriz de valores inteiros, cujas dimensões são 5 linhas e 5 colunas matriz[5x5]. 
Este programa deverá realizar a contagem dos números primos contidos na matriz. */

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[][] matriz = new int[5][5];

        System.out.println("- Preenchendo a matriz [5x5] -");
        criarmatriz(matriz, s);

        System.out.println("\nMatriz informada:");
        mostrar(matriz);

        int qtdPrimos = contarPrimos(matriz);

        System.out.println("\n\nQuantidade de números primos contidos na matriz: " + qtdPrimos);

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

    public static boolean ePrimo(int n) {
        if (n <= 1) return false;
        int i = 2;
        while (i <= Math.sqrt(n)) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static int contarPrimos(int[][] matriz) {
        int cont = 0;
        for (int lin = 0; lin < 5; lin++) {
            for (int col = 0; col < 5; col++) {
                if (ePrimo(matriz[lin][col])) {
                    cont++;
                }
            }
        }
        return cont;
    }
}