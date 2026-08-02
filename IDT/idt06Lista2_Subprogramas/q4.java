package idt06Lista2_Subprogramas;

/* Um distribuidor de brinquedos fez um acordo de compra de um lote de brinquedos pequenos embalados em caixas de formato retangular de tamanhos variados. Ele pretende reembalar estes brinquedos em esferas de plástico e revendê-las como pacotes surpresa. As esferas são fornecidas com quatro diâmetros diferentes: 10, 15, 20 e 25 cm. Para pedir as esferas ele precisa saber quantas de cada diâmetro necessita. Sabendo que a diagonal maior (D) de uma caixa retangular com dimensões A, B, e C é dada por:		
	D2 = A2 + B2 + C2
Determinar o número de esferas, de cada tamanho e total, necessárias para embalar o lote de brinquedos. Determine também a quantidade de caixas que possuem diagonal maior que o diâmetro da maior esfera. As dimensões das caixas retangulares são lidas através do teclado. Um valor negativo ou nulo para a primeira dimensão lida servirá como marca de final de introdução de dados. */

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int esf10 = 0;
        int esf15 = 0;
        int esf20 = 0;
        int esf25 = 0;
        int naoCobre = 0;

        boolean continuar = true;

        while (continuar == true) {
            System.out.println("Digite a dimensão A da caixa (<= 0 para encerrar):");
            double a = s.nextDouble();

            if (a <= 0) {
                continuar = false;
                break;
            }

            System.out.println("Digite a dimensão B da caixa:");
            double b = s.nextDouble();

            System.out.println("Digite a dimensão C da caixa:");
            double c = s.nextDouble();

            double diagonal = calcularDiagonal(a, b, c);

            if (diagonal <= 10) {
                esf10++;
            } else if (diagonal <= 15) {
                esf15++;
            } else if (diagonal <= 20) {
                esf20++;
            } else if (diagonal <= 25) {
                esf25++;
            } else {
                naoCobre++;
            }
        }

        int totalEsferas = esf10 + esf15 + esf20 + esf25;

        System.out.println("\n--- RELATÓRIO DE EMBALAGENS ---");
        System.out.println("Esferas de 10 cm: " + esf10);
        System.out.println("Esferas de 15 cm: " + esf15);
        System.out.println("Esferas de 20 cm: " + esf20);
        System.out.println("Esferas de 25 cm: " + esf25);
        System.out.println("Total de esferas necessárias: " + totalEsferas);
        System.out.println("Caixas maiores que o diâmetro máximo (não cabem): " + naoCobre);

        s.close();
    }

    public static double calcularDiagonal(double a, double b, double c) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
    }
}
