package idt06Lista2_Subprogramas.Lista3;

/* Refatore o código do exercício 2 da Lista2, de modo que o programa, além das funcionalidades originais, responda mais o seguinte:
- A lista de números perfeitos verificados
- A lista de números não perfeitos verificados
- Dentre os números perfeitos, o maior
- Dentre os números não perfeitos, o menor */

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String listaPerfeitos = "";
        String listaNaoPerfeitos = "";

        int maiorPerfeito = Integer.MIN_VALUE;
        int menorNaoPerfeito = Integer.MAX_VALUE;

        boolean continuar = true;

        while (continuar == true) {
            System.out.println("Digite um número inteiro e positivo (0 ou negativo para encerrar):");
            int n = s.nextInt();

            if (n <= 0) {
                continuar = false;
                break;
            }

            boolean perfeito = ePerfeito(n);

            if (perfeito == true) {
                listaPerfeitos += n + " ";
                if (n > maiorPerfeito) {
                    maiorPerfeito = n;
                }
            } else {
                listaNaoPerfeitos += n + " ";
                if (n < menorNaoPerfeito) {
                    menorNaoPerfeito = n;
                }
            }
        }

        System.out.println("\n--- RELATÓRIO DE NÚMEROS ---");
        System.out.println("Lista de números perfeitos: " + (listaPerfeitos.isEmpty() ? "Nenhum" : listaPerfeitos));
        System.out.println("Lista de números não perfeitos: " + (listaNaoPerfeitos.isEmpty() ? "Nenhum" : listaNaoPerfeitos));

        if (maiorPerfeito != Integer.MIN_VALUE) {
            System.out.println("Maior número perfeito: " + maiorPerfeito);
        } else {
            System.out.println("Nenhum número perfeito foi informado.");
        }

        if (menorNaoPerfeito != Integer.MAX_VALUE) {
            System.out.println("Menor número não perfeito: " + menorNaoPerfeito);
        } else {
            System.out.println("Nenhum número não perfeito foi informado.");
        }

        s.close();
    }

    public static boolean ePerfeito(int n) {
        int soma = 0;
        int i = 1;

        while (i <= n / 2) {
            if (n % i == 0) {
                soma += i;
            }
            i++;
        }

        return soma == n;
    }
}