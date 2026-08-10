package Fase_1.IDT.idt07Lista1_Vetores;

/*Leia um vetor de inteiros de 12 posições e em seguida ler também dois valores X e Y quaisquer correspondentes a duas posições no vetor.
 Ao final seu programa deverá escrever a soma dos valores encontrados nas respectivas posições X e Y */

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] vetor = new int[12];
        int x = -1;
        int y = -1;

        System.out.println("- Digite os valores do vetor -");
        for (int i = 0; i < 12; i++) {
            vetor[i] = lerEntrada(s);
        }

        while (x < 0 || x > 11) {
            System.out.println("Posição X");
            x = lerEntrada(s);
        }
        while (y < 0 || y > 11) {
            System.out.println("Posição Y");
            y = lerEntrada(s);
        }
        System.out.print(soma(x, y, vetor));

        s.close();
    }

    public static int lerEntrada(Scanner s) {

        System.out.print("valor = ");
        int valor = s.nextInt();

        return valor;
    }

    public static int soma(int x, int y, int[] vetor) {
        return vetor[x] + vetor[y];
    }
}
