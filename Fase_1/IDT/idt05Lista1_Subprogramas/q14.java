package idt05Lista1_Subprogramas;

/* Faça uma função que recebe, por parâmetro, um valor N e calcula e escreva a tabuada de 1 até N. */

import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Qual o valor de N?");
        int n = s.nextInt();

        tabuada(n);
        s.close();
    }

    public static void tabuada(int n) {
        int i = 1;
        while (i <= n) {
            System.out.println(i + " x " + n + " = " + (i * n));
            i++;
        }
    }
}