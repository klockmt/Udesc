package Fase_1.IDT.idt07Lista1_Vetores;

/* 7. Leia dois vetores de inteiros de 20 posições A e B e transfira seus conteúdos para um terceiro vetor C. 
Este vetor conterá, nas posições de índice par os valores do vetor A e nas posições impares os valores do vetor B. */

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] a = new int[20];
        int[] b = new int[20];
        int[] c = new int[40];

        System.out.println("- Digite os 20 valores do vetor A -");
        for (int i = 0; i < 20; i++) {
            a[i] = lerEntrada(s);
        }

        System.out.println("\n- Digite os 20 valores do vetor B -");
        for (int i = 0; i < 20; i++) {
            b[i] = lerEntrada(s);
        }

        intercalarVetores(a, b, c);

        System.out.println("\nVetor C resultante:");
        mostrarVetor(c);

        s.close();
    }

    public static int lerEntrada(Scanner s) {
        System.out.print("valor = ");
        return s.nextInt();
    }

    public static void intercalarVetores(int[] a, int[] b, int[] c) {
        for (int i = 0; i < 20; i++) {
            c[2 * i] = a[i];       // Posições pares
            c[2 * i + 1] = b[i];   // Posições ímpares
        }
    }

    public static void mostrarVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}