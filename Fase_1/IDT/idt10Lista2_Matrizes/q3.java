package idt10Lista2_Matrizes;

/* VAMOS REFATORAR O EXERCÍCIO 3 DA LISTA 1.
Elabore um programa que declare uma matriz de valores inteiros, cujas dimensões são 5 linhas e 5 colunas matriz[5x5]. 
Este programa deverá realizar o somatório dos elementos da diagonal principal, denominado SP. 
Também deverá realizar o somatório dos elementos da diagonal secundária, denominado SS. Ao final, subtrair SS de SP e mostrar o resultado.
Deverá apresentar também ao final:
a) Quantos elementos que compõem SP estão abaixo da média destes valores
b) O equivalente binário de SS */

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

        // a) Elementos de SP abaixo da média de SP
        double mediaSP = sp / 5.0;
        int contAbaixoMedia = 0;
        for (int i = 0; i < 5; i++) {
            if (matriz[i][i] < mediaSP) {
                contAbaixoMedia++;
            }
        }

        // b) Binário de SS
        String binarioSS = converterParaBinario(ss);

        System.out.println("\n--- ANÁLISES ADICIONAIS ---");
        System.out.printf("a) Média de SP: %.2f | Elementos de SP abaixo da média: %d\n", mediaSP, contAbaixoMedia);
        System.out.println("b) Equivalente binário de SS (" + ss + "): " + binarioSS);

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

    public static String converterParaBinario(int n) {
        if (n == 0) return "0";
        if (n < 0) return "-" + converterParaBinario(Math.abs(n));
        
        String bin = "";
        int aux = n;
        while (aux > 0) {
            bin = (aux % 2) + bin;
            aux /= 2;
        }
        return bin;
    }
}