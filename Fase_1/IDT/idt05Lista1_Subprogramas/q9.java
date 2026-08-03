package idt05Lista1_Subprogramas;

/* Faça uma função que recebe um valor inteiro e verifica se o valor é par ou ímpar. A função deve retornar um valor booleano. */

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int n = s.nextInt();

        boolean resultado = ePar(n);

        System.out.println("É par? " + resultado);
        s.close();
    }

    public static boolean ePar(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}