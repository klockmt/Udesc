package idt04Lista2_Repetição.While_only;

/* Escreva um programa que calcule a soma dos números pares entre 25 e 200. */

public class Q12w {
    public static void main(String[] args) {
        int i = 25;
        int soma = 0;

        while (i <= 200) {
            if (i % 2 == 0) {
                soma += i;
            }
            i++;
        }

        System.out.println("A soma dos pares entre 25 e 200 é: " + soma);
    }
}