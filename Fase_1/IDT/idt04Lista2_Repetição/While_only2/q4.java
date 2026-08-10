package Fase_1.IDT.idt04Lista2_Repetição.While_only2;

/* Reescreva o exercício 06 da lista anterior, de modo que o programa, ao final, escreva o seguinte:
- Quais as duas maiores raízes exatas calculadas (imprimir em ordem crescente)
- Quais as três menores raízes aproximadas calculadas (imprimir em ordem decrescente) */

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int maiorExata1 = -1;
        int maiorExata2 = -1;

        int menorAprox1 = Integer.MAX_VALUE;
        int menorAprox2 = Integer.MAX_VALUE;
        int menorAprox3 = Integer.MAX_VALUE;

        boolean continuar = true;

        while (continuar == true) {
            System.out.print("Digite um número para calcular a raiz (negativo para encerrar): ");
            int n = s.nextInt();

            if (n < 0) {
                continuar = false;
                break;
            }

            int impar = 1;
            int raiz = 0;
            int resto = n;

            while (resto > 0) {
                resto = resto - impar;
                impar += 2;
                raiz++;
            }

            if (resto == 0) {
                if (raiz > maiorExata1) {
                    maiorExata2 = maiorExata1;
                    maiorExata1 = raiz;
                } else if (raiz > maiorExata2) {
                    maiorExata2 = raiz;
                }
            } else {
                if (raiz < menorAprox1) {
                    menorAprox3 = menorAprox2;
                    menorAprox2 = menorAprox1;
                    menorAprox1 = raiz;
                } else if (raiz < menorAprox2) {
                    menorAprox3 = menorAprox2;
                    menorAprox2 = raiz;
                } else if (raiz < menorAprox3) {
                    menorAprox3 = raiz;
                }
            }
        }

        System.out.println("\n--- RELATÓRIO DE RAÍZES ---");
        System.out.print("Duas maiores raízes exatas (ordem crescente): ");
        if (maiorExata2 != -1) System.out.print(maiorExata2 + " ");
        if (maiorExata1 != -1) System.out.print(maiorExata1);
        System.out.println();

        System.out.print("Três menores raízes aproximadas (ordem decrescente): ");
        if (menorAprox3 != Integer.MAX_VALUE) System.out.print(menorAprox3 + " ");
        if (menorAprox2 != Integer.MAX_VALUE) System.out.print(menorAprox2 + " ");
        if (menorAprox1 != Integer.MAX_VALUE) System.out.print(menorAprox1);
        System.out.println();

        s.close();
    }
}
