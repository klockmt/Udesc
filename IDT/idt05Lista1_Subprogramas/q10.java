package idt05Lista1_Subprogramas;

/* Faça uma função que recebe a média final de um aluno por parâmetro e retorna o seu conceito, conforme a tabela abaixo:
de 0,0 a 4,9 -> D
de 5,0 a 6,9 -> C
de 7,0 a 8,9 -> B
de 9,0 a 10,0 -> A */

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Qual a média final do aluno?");
        double media = s.nextDouble();

        char conceito = obterConceito(media);

        System.out.println("Conceito: " + conceito);
        s.close();
    }

    public static char obterConceito(double media) {
        if (media >= 0.0 && media <= 4.9) {
            return 'D';
        } else if (media >= 5.0 && media <= 6.9) {
            return 'C';
        } else if (media >= 7.0 && media <= 8.9) {
            return 'B';
        } else if (media >= 9.0 && media <= 10.0) {
            return 'A';
        }
        return ' ';
    }
}