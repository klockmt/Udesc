package Fase_1.IDT.idt05Lista1_Subprogramas;

/* Faça uma função que recebe um valor inteiro e verifica se o valor é positivo ou negativo. A função deve retornar um valor booleano. */

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int n = s.nextInt();

        boolean resultado = ePositivo(n);

        System.out.println("É positivo? " + resultado);
        s.close();
    }

    public static boolean ePositivo(int n) {
        if (n >= 0) {
            return true;
        } else {
            return false;
        }
    }
}