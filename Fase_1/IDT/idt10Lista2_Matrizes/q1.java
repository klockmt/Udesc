package Fase_1.IDT.idt10Lista2_Matrizes;

/* VAMOS REFATORAR O EXERCÍCIO 1 DA LISTA 1.
Elabore um programa que declare uma matriz de valores inteiros, cujas dimensões são 5 linhas e 5 colunas (matriz[5x5]). 
Este programa deverá encontrar o maior e o menor valores contidos na matriz e escrever.
Deverá apresentar também ao final:
a) Se existe pelo menos uma linha da matriz onde os valores são todos iguais
b) Se existe pelo menos uma linha da matriz onde a ordem dos valores é decrescente */

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[][] matriz = new int[5][5];

        for (int lin = 0; lin < 5; lin++) {
            for (int col = 0; col < 5; col++) {
                matriz[lin][col] = lerEntrada(s);
            }
        }

        System.out.println("\nMatriz informada:");
        mostrar(matriz);

        System.out.println("\n\nMaior = " + maior(matriz));
        System.out.println("Menor = " + menor(matriz));

        System.out.println("\n--- ANÁLISES ADICIONAIS ---");
        System.out.println("a) Existe linha com valores todos iguais? " + (temLinhaIgual(matriz) ? "Sim" : "Não"));
        System.out.println("b) Existe linha com valores em ordem decrescente? " + (temLinhaDecrescente(matriz) ? "Sim" : "Não"));

        s.close();
    }

    public static int lerEntrada(Scanner s) {
        System.out.print("valor = ");
        return s.nextInt();
    }

    public static void mostrar(int[][] matriz) {
        for (int lin = 0; lin < 5; lin++) {
            System.out.println();
            for (int col = 0; col < 5; col++) {
                System.out.print(matriz[lin][col] + " ");
            }
        }
    }

    public static int menor(int[][] matriz) {
        int menor = matriz[0][0];
        for (int lin = 0; lin < 5; lin++) {
            for (int col = 0; col < 5; col++) {
                if (matriz[lin][col] < menor) {
                    menor = matriz[lin][col];
                }
            }
        }
        return menor;
    }

    public static int maior(int[][] matriz) {
        int maior = matriz[0][0];
        for (int lin = 0; lin < 5; lin++) {
            for (int col = 0; col < 5; col++) {
                if (matriz[lin][col] > maior) {
                    maior = matriz[lin][col];
                }
            }
        }
        return maior;
    }

    public static boolean temLinhaIgual(int[][] matriz) {
        for (int lin = 0; lin < 5; lin++) {
            boolean igual = true;
            for (int col = 1; col < 5; col++) {
                if (matriz[lin][col] != matriz[lin][0]) {
                    igual = false;
                    break;
                }
            }
            if (igual) return true;
        }
        return false;
    }

    public static boolean temLinhaDecrescente(int[][] matriz) {
        for (int lin = 0; lin < 5; lin++) {
            boolean decrescente = true;
            for (int col = 0; col < 4; col++) {
                if (matriz[lin][col] <= matriz[lin][col + 1]) {
                    decrescente = false;
                    break;
                }
            }
            if (decrescente) return true;
        }
        return false;
    }
}