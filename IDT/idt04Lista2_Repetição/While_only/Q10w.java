package idt04Lista2_Repetição.While_only;
/* Escreva um programa que imprima na tela os números de 1 a 500 que são múltiplos de 5. */

public class Q10w {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 500) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
    }
}