package Fase_1.IDT.idt05Lista1_Subprogramas;

/* Faça uma função que receba um valor inteiro e positivo e retorne o seu fatorial. */

import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um número inteiro e positivo:");
        int n = s.nextInt();

        long resultado = fatorial(n);

        System.out.println("Fatorial de " + n + " = " + resultado);
        s.close();
    }

    public static long fatorial(int n) {
        long fat = 1;
        int i = 1;

        while (i <= n) {
            fat *= i;
            i++;
        }

        return fat;
    }
}