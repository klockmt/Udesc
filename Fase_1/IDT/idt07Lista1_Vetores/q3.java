package Fase_1.IDT.idt07Lista1_Vetores;

import java.util.Scanner;

/*3.	Leia um vetor de inteiros de 16 posições e troque os 8 primeiros valores pelos 8 últimos e vice-e-versa.
 Não pode criar vetor auxiliar.
 Escreva ao final o vetor obtido.
 */

public class q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] vetor = new int[16];
        int temp = 0;

        for (int i = 0; i < 16; i++) {
            vetor[i] = lerEntrada(s);
        }

        for (int i = 0; i < 8; i++) {
            temp = vetor[i + 8];
            vetor[i + 8] = vetor[i];
            vetor[i] = temp;
        }

        mostrarVetor(vetor);

        s.close();
    }

    public static int lerEntrada(Scanner s) {

        System.out.print("valor = ");
        int valor = s.nextInt();

        return valor;
    }

    public static void mostrarVetor(int vetor[]) {
        for (int i = 0; i < 16; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
