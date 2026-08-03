package idt05Lista1_Subprogramas;

/* Escreva uma função que recebe por parâmetro um valor inteiro e positivo N e retorna o valor de S.
S = 1 + 1/2 + 1/3 + 1/4 + 1/5 + ... + 1/N */

import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Qual o valor de N?");
        int n = s.nextInt();

        double resultado = calculaS(n);

        System.out.printf("O valor de S é: %.4f\n", resultado);
        s.close();
    }

    public static double calculaS(int n) {
        double s = 0;
        int i = 1;

        while (i <= n) {
            s += 1.0 / i;
            i++;
        }

        return s;
    }
}