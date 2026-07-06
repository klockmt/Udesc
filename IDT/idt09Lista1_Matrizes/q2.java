package idt09Lista1_Matrizes;

import java.util.Scanner;

/*2.	Elabore um programa que declare duas matrizes de valores inteiros, cujas dimensões são 5 linhas e 5 colunas ( matrizA[5x5] e matrizB[5x5]).
 Este programa deverá realizar o somatório dos elementos correspondentes (linha,coluna) e mostrar o resultado.
 */

public class q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[][] matrizA = new int[5][5];
        int[][] matrizB = new int[5][5];
        int[][] soma = new int[5][5];


        criarmatriz(matrizA, s);
        System.out.println("");

        mostrar(matrizA);
        System.out.println("");

        criarmatriz(matrizB, s);
        System.out.println("");

        mostrar(matrizB);
        System.out.println("");

        somaMatriz(matrizA, matrizB, soma);

        mostrar(soma);

        s.close();

    }

    public static int lerEntrada(Scanner s) {

        System.out.print("valor = ");
        int valor = s.nextInt();

        return valor;
    }

    public static void mostrar(int[][] matriz) {
        for (int col = 0; col < 5; col++) {
            System.out.println();
            for (int lin = 0; lin < 5; lin++) {
                System.out.print(matriz[col][lin] + " ");

            }
        }
    }

    public static void criarmatriz(int[][] matriz, Scanner s) {

        for (int col = 0; col < 5; col++) {
            for (int lin = 0; lin < 5; lin++) {
                matriz[col][lin] = lerEntrada(s);
            }
        }
    }

    public static void somaMatriz (int[][] matrizA, int[][] matrizB, int[][] soma) {
        for (int col = 0; col < 5; col++) {
            for (int lin = 0; lin < 5; lin++) {
                soma[col][lin] = matrizA[col][lin] + matrizB[col][lin];
            }
        }
    }
}