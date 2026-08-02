package idt09Lista1_Matrizes;

import java.util.Scanner;

/*3.	Elabore um programa que declare uma matriz de valores inteiros, cujas dimensões são 5 linhas e 5 colunas matriz[5x5].
 Este programa deverá realizar o somatório dos elementos da diagonal principal, denominado SP.
 Também deverá realizar o somatório dos elementos da diagonal secundária, denominado SS Ao final, subtrair SS de SP e mostrar o resultado.
 */

public class q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[][] matriz = new int[5][5];
        int soma = 0;
        

        criarmatriz(matriz, s);
        System.out.println("");

        mostrar(matriz);
        System.out.println("");

        calcularMatriz(matriz, soma);

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
                System.out.println("");
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

    public static void calcularMatriz (int[][] matriz, int soma) {
        for (int col = 0; col < 5; col++) {
            for (int lin = 0; lin < 5; lin++) {
                soma = 
                

            }
        }
    }
}