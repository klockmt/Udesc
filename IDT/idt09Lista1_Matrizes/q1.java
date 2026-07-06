package idt09Lista1_Matrizes;

/*1.	Elabore um programa que declare uma matriz de valores inteiros, cujas dimensões são 5 linhas e 5 colunas (matriz[5x5]).
 Este programa deverá encontrar o maior e o menor valores contidos na matriz e escrever.
 */

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[][] matriz = new int[5][5];

        for (int col = 0; col < 5; col++) {
            for (int lin = 0; lin < 5; lin++) {
                matriz[col][lin] = lerEntrada(s);
            }
        }
        mostrar(matriz);

        menor(matriz);
        maior(matriz);

        System.out.println("\nMaior = " + maior(matriz));
        System.out.println("Menor = " + menor(matriz));

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

    public static int menor(int[][] matriz) {
        int menor = matriz[0][0];
        for (int col = 0; col < 5; col++) {
            for (int lin = 0; lin < 5; lin++) {
                if(matriz[col][lin] < menor) {
                    menor = matriz[col][lin];
                }
            }
        }
        return menor;
    }
    public static int maior(int[][] matriz) {
        int maior = matriz[0][0];
        for (int col = 0; col < 5; col++) {
            for (int lin = 0; lin < 5; lin++) {
                if(matriz[col][lin] > maior) {
                    maior = matriz[col][lin];
                }
            }
        }
        return maior;
    }

}
