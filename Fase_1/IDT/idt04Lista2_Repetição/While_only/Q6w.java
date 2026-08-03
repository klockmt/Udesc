package idt04Lista2_Repetição.While_only;

/* Uma das maneiras de se conseguir a raiz quadrada de um número é subtrair do número 
os ímpares consecutivos a partir de 1, até que o resultado da subtração seja menor ou igual a zero. 
O número de vezes que se conseguir fazer a subtração é a raiz quadrada exata (resultado 0) 
ou aproximada do número (resultado negativo).
Ex.: Raiz de 16 -> 16-1 = 15-3 = 12-5 = 7-7 = 0
Faça um programa que calcule a raiz quadrada de um número usando este método. */

import java.util.Scanner;

public class Q6w {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite um número para calcular a raiz quadrada: ");
        int n = s.nextInt();

        int impar = 1;
        int raiz = 0;
        int resto = n;

        while (resto > 0) {
            resto = resto - impar;
            impar += 2;
            raiz++;
        }

        System.out.println("A raiz quadrada (exata ou aproximada) de " + n + " é: " + raiz);

        s.close();
    }
}