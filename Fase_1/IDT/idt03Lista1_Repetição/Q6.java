package idt03Lista1_Repetição;

//Elabore um programa que, dado um valor inteiro positivo, calcule o fatorial deste número e escreva o resultado.

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

            float fatorial = 1;

            System.out.println("\nDigite o valor, só aceito positivos e inteiros!");
            float valor = s.nextFloat();

            if (valor < 0 || valor % 1 != 0) {
                System.out.println("Erro");
            } else {
                for (float i = 1; i <= valor; i++){
                    fatorial = fatorial * i;
                }
            }
            System.out.print("\nFatorial = " + fatorial);

s.close(); 
}
}
