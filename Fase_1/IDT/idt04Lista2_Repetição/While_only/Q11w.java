package Fase_1.IDT.idt04Lista2_Repetição.While_only;

/* Escreva um programa que imprima na tela os números de 1 a 500 que são múltiplos de 5 e de 3 (os dois ao mesmo tempo). */

public class Q11w {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 500) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
    }
}