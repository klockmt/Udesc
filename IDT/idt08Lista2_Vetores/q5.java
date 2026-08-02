package idt08Lista2_Vetores;

/* VAMOS REFATORAR O EXERCÍCIO 10 DA LISTA 1.
Leia dois vetores de 5 posições contendo em cada posição uma letra qualquer do alfabeto. 
Verifique e escreva se ambos possuem o mesmo conteúdo (independentemente da ordem). 
Ao final, o programa deverá escrever:
a) Apenas se os vetores forem iguais: quantas letras estavam em posições equivalentes dos dois vetores
b) Apenas se os vetores forem diferentes: qual letra determinou a diferença */

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        char[] v1 = new char[5];
        char[] v2 = new char[5];

        System.out.println("- Digite as 5 letras do Vetor 1 -");
        for (int i = 0; i < 5; i++) {
            System.out.print("letra = ");
            v1[i] = s.next().charAt(0);
        }

        System.out.println("\n- Digite as 5 letras do Vetor 2 -");
        for (int i = 0; i < 5; i++) {
            System.out.print("letra = ");
            v2[i] = s.next().charAt(0);
        }

        char letraDiferenca = buscarLetraDiferenca(v1, v2);
        boolean iguais = (letraDiferenca == ' ');

        if (iguais) {
            System.out.println("\nOs dois vetores possuem o MESMO conteúdo!");
            
            // a) Quantas letras estavam em posições equivalentes (mesmo índice)
            int posicoesEquivalentes = 0;
            for (int i = 0; i < 5; i++) {
                if (Character.toLowerCase(v1[i]) == Character.toLowerCase(v2[i])) {
                    posicoesEquivalentes++;
                }
            }
            System.out.println("a) Quantidade de letras em posições equivalentes: " + posicoesEquivalentes);

        } else {
            System.out.println("\nOs vetores NÃO possuem o mesmo conteúdo.");
            // b) Qual letra determinou a diferença
            System.out.println("b) A letra que determinou a diferença foi: '" + letraDiferenca + "'");
        }

        s.close();
    }

    public static char buscarLetraDiferenca(char[] v1, char[] v2) {
        boolean[] visitado = new boolean[5];

        for (int i = 0; i < 5; i++) {
            boolean achou = false;
            for (int j = 0; j < 5; j++) {
                if (!visitado[j] && Character.toLowerCase(v1[i]) == Character.toLowerCase(v2[j])) {
                    visitado[j] = true;
                    achou = true;
                    break;
                }
            }
            if (!achou) {
                return v1[i];
            }
        }
        return ' ';
    }
}