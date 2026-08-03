package idt07Lista1_Vetores;

/* 10. Leia dois vetores de 5 posições contendo em cada posição uma letra qualquer do alfabeto. 
Verifique e escreva se ambos possuem o mesmo conteúdo (mesmas letras, independentemente da ordem). */

import java.util.Scanner;

public class q10 {
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

        if (mesmoConteudo(v1, v2)) {
            System.out.println("\nOs dois vetores possuem o MESMO conteúdo!");
        } else {
            System.out.println("\nOs vetores NÃO possuem o mesmo conteúdo.");
        }

        s.close();
    }

    public static boolean mesmoConteudo(char[] v1, char[] v2) {
        boolean[] visitado = new boolean[v2.length];

        for (int i = 0; i < v1.length; i++) {
            boolean achou = false;
            for (int j = 0; j < v2.length; j++) {
                if (!visitado[j] && Character.toLowerCase(v1[i]) == Character.toLowerCase(v2[j])) {
                    visitado[j] = true;
                    achou = true;
                    break;
                }
            }
            if (!achou) {
                return false;
            }
        }
        return true;
    }
}