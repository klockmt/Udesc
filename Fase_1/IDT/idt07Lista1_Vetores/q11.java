package Fase_1.IDT.idt07Lista1_Vetores;

/* 11. Leia um vetor de inteiros de 10 posições de inteiros positivos e verifique se existem valores repetidos. 
Para cada valor repetido escrever o valor e quantas vezes ele se repete no vetor. */

import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] vetor = new int[10];

        System.out.println("- Digite os 10 valores inteiros positivos -");
        for (int i = 0; i < 10; i++) {
            vetor[i] = lerEntrada(s);
        }

        verificarRepetidos(vetor);

        s.close();
    }

    public static int lerEntrada(Scanner s) {
        System.out.print("valor = ");
        return s.nextInt();
    }

    public static void verificarRepetidos(int[] vetor) {
        boolean[] jaContado = new boolean[vetor.length];
        boolean houveRepeticao = false;

        System.out.println("\n- Valores repetidos -");
        for (int i = 0; i < vetor.length; i++) {
            if (!jaContado[i]) {
                int cont = 1;
                for (int j = i + 1; j < vetor.length; j++) {
                    if (vetor[i] == vetor[j]) {
                        cont++;
                        jaContado[j] = true;
                    }
                }
                if (cont > 1) {
                    System.out.println("O valor " + vetor[i] + " se repete " + cont + " vezes.");
                    houveRepeticao = true;
                }
            }
        }

        if (!houveRepeticao) {
            System.out.println("Não existem valores repetidos no vetor.");
        }
    }
}