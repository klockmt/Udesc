package Fase_1.IDT.idt05Lista1_Subprogramas;

/* Escreva uma função que recebe por parâmetro um valor inteiro e positivo N e retorna o valor de S.
S = 1 + 1/1! + 1/2! + 1/3! + ... + 1/N! */

import java.util.Scanner;

public class q16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Qual o valor de N?");
        int n = s.nextInt();

        double resultado = calculaSComFatorial(n);

        System.out.printf("O valor de S é: %.4f\n", resultado);
        s.close();
    }

    public static double calculaSComFatorial(int n) {
        double s = 1.0;
        int i = 1;

        while (i <= n) {
            s += 1.0 / fatorial(i);
            i++;
        }

        return s;
    }

    public static long fatorial(int num) {
        long fat = 1;
        int i = 1;

        while (i <= num) {
            fat *= i;
            i++;
        }

        return fat;
    }
}