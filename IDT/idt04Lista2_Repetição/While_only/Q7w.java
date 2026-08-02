package idt04Lista2_Repetição.While_only;

/* Repare a seguinte característica do número 3025: 30 + 25 = 55 e 55**2 = 3025.
Criar um programa que possa ler vários números inteiros de 4 algarismos, um de cada vez, 
e diga se o número apresenta a mesma característica (repare que 3025/100=30 com resto 25). 
O algoritmo pára quando for lido um valor menor que 1000 ou maior que 9999. */

import java.util.Scanner;

public class Q7w {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        boolean continuar = true;

        while (continuar == true) {
            System.out.print("Digite um número de 4 algarismos (fora do intervalo 1000-9999 para sair): ");
            int n = s.nextInt();

            if (n < 1000 || n > 9999) {
                continuar = false;
                break;
            }

            int parte1 = n / 100;
            int parte2 = n % 100;
            int soma = parte1 + parte2;

            if ((soma * soma) == n) {
                System.out.println("O número " + n + " POSSUI a característica!\n");
            } else {
                System.out.println("O número " + n + " NÃO possui a característica.\n");
            }
        }

        s.close();
    }
}