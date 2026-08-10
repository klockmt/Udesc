package Fase_1.IDT.idt04Lista2_Repetição.While_only;

/* A série de FETUCCINE é gerada da seguinte forma: os dois primeiros termos são fornecidos pelo usuário; 
a partir daí, os termos são gerados com a soma ou subtração dos dois termos anteriores, ou seja:
Ai = Ai-1 + Ai-2 para i ímpar
Aj = Aj-1 - Ai-2 para i par
Escreva um programa que imprima os 20 primeiros termos da série de FETUCCINE. */

import java.util.Scanner;

public class Q9w {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o 1º termo: ");
        int a1 = s.nextInt();

        System.out.print("Digite o 2º termo: ");
        int a2 = s.nextInt();

        System.out.print("Os 20 primeiros termos: " + a1 + " " + a2 + " ");

        int termoAnterior2 = a1;
        int termoAnterior1 = a2;

        int i = 3;
        while (i <= 20) {
            int termoAtual;
            if (i % 2 != 0) {
                termoAtual = termoAnterior1 + termoAnterior2;
            } else {
                termoAtual = termoAnterior1 - termoAnterior2;
            }

            System.out.print(termoAtual + " ");

            termoAnterior2 = termoAnterior1;
            termoAnterior1 = termoAtual;
            i++;
        }
        System.out.println();

        s.close();
    }
}