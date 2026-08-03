package idt04Lista2_Repetição.While_only;

/* Escreva um programa que imprime na tela a série de FIBONACCI até um numero dado. 
Esta série começa com 1 e 1 e os próximos números são obtidos pela soma dos anteriores.
Ex: 1 1 2 3 5 8 13 21 34 55 */

import java.util.Scanner;

public class Q8w {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o número limite para a série de Fibonacci: ");
        int limite = s.nextInt();

        int a = 1;
        int b = 1;

        System.out.print("Série: ");
        
        while (a <= limite) {
            System.out.print(a + " ");
            int proximo = a + b;
            a = b;
            b = proximo;
        }
        System.out.println();

        s.close();
    }
}