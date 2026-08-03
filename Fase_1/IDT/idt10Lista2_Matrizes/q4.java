package idt10Lista2_Matrizes;

/* VAMOS REFATORAR O EXERCÍCIO 4 DA LISTA 1.
Elabore um programa que declare uma matriz de valores inteiros, cujas dimensões são 5 linhas e 5 colunas matriz[5x5]. 
Este programa deverá realizar a contagem dos números primos contidos na matriz.
Deverá apresentar também ao final:
a) Dentre os números não primos da matriz, qual o maior
b) Dentre os números não primos da matriz, quantos são pares
c) Dentre os números primos da matriz, quantos têm pelo menos três dígitos */

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[][] matriz = new int[5][5];

        System.out.println("- Preenchendo a matriz [5x5] -");
        criarmatriz(matriz, s);

        System.out.println("\nMatriz informada:");
        mostrar(matriz);

        int qtdPrimos = 0;
        int maiorNaoPrimo = Integer.MIN_VALUE;
        int naoPrimosPares = 0;
        int primosTresDigitos = 0;

        for (int lin = 0; lin < 5; lin++) {
            for (int col = 0; col < 5; col++) {
                int valor = matriz[lin][col];
                boolean primo = ePrimo(valor);

                if (primo) {
                    qtdPrimos++;
                    if (Math.abs(valor) >= 100) {
                        primosTresDigitos++;
                    }
                } else {
                    if (valor > maiorNaoPrimo) {
                        maiorNaoPrimo = valor;
                    }
                    if (valor % 2 == 0) {
                        naoPrimosPares++;
                    }
                }
            }
        }

        System.out.println("\n\nQuantidade de números primos contidos na matriz: " + qtdPrimos);

        System.out.println("\n--- ANÁLISES ADICIONAIS ---");
        if (maiorNaoPrimo != Integer.MIN_VALUE) {
            System.out.println("a) Maior número NÃO primo: " + maiorNaoPrimo);
        } else {
            System.out.println("a) Todos os números da matriz eram primos.");
        }
        System.out.println("b) Quantidade de números NÃO primos que são pares: " + naoPrimosPares);
        System.out.println("c) Quantidade de números primos com 3 ou mais dígitos: " + primosTresDigitos);

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
}