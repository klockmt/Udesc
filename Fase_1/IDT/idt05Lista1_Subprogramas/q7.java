package Fase_1.IDT.idt05Lista1_Subprogramas;

/* Faça uma função que recebe a idade de um nadador por parâmetro e retorna a categoria desse nadador de acordo com a tabela:
5 a 7 anos -> Infantil A
8 a 10 anos -> Infantil B
11 a 13 anos -> Juvenil A
14 a 17 anos -> Juvenil B
Maiores de 17 anos -> Adulto */

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Qual a idade do nadador?");
        int idade = s.nextInt();

        String categoria = obterCategoria(idade);

        System.out.println("Categoria: " + categoria);
        s.close();
    }

    public static String obterCategoria(int idade) {
        if (idade >= 5 && idade <= 7) {
            return "Infantil A";
        } else if (idade >= 8 && idade <= 10) {
            return "Infantil B";
        } else if (idade >= 11 && idade <= 13) {
            return "Juvenil A";
        } else if (idade >= 14 && idade <= 17) {
            return "Juvenil B";
        } else if (idade > 17) {
            return "Adulto";
        }
        return "Sem categoria";
    }
}