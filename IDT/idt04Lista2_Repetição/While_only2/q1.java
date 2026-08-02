package idt04Lista2_Repetição.While_only2;

/* Reescreva o exercício 01 da lista anterior, de modo que o programa, ao final, escreva o seguinte:
- Quantos números informados eram números primos
- Qual o maior número primo informado
- Se houve, em algum momento, uma sequência de pelo menos três números primos consecutivos */

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int totalPrimos = 0;
        int maiorPrimo = -1;
        
        int sequenciaPrimos = 0;
        boolean teveTresConsecutivos = false;

        boolean continuar = true;

        while (continuar == true) {
            System.out.print("Escolha um número para conversão (0 a 128, ou negativo para encerrar): ");
            int n = s.nextInt();

            if (n < 0) {
                continuar = false;
                break;
            }

            boolean ePrimo = true;
            if (n <= 1) {
                ePrimo = false;
            } else {
                int div = 2;
                while (div <= n / 2) {
                    if (n % div == 0) {
                        ePrimo = false;
                        break;
                    }
                    div++;
                }
            }

            if (ePrimo == true) {
                totalPrimos++;
                if (n > maiorPrimo) {
                    maiorPrimo = n;
                }
                sequenciaPrimos++;
                if (sequenciaPrimos >= 3) {
                    teveTresConsecutivos = true;
                }
            } else {
                sequenciaPrimos = 0;
            }

            int aux = n;
            String binario = "";
            if (aux == 0) {
                binario = "0";
            } else {
                while (aux > 0) {
                    binario = (aux % 2) + binario;
                    aux /= 2;
                }
            }
            while (binario.length() < 8) {
                binario = "0" + binario;
            }

            System.out.println("O número em binário fica: " + binario + "\n");
        }

        System.out.println("\n--- RELATÓRIO DE NÚMEROS PRIMOS ---");
        System.out.println("Quantidade de números primos informados: " + totalPrimos);
        if (maiorPrimo != -1) {
            System.out.println("Maior número primo informado: " + maiorPrimo);
        } else {
            System.out.println("Nenhum número primo foi informado.");
        }
        
        if (teveTresConsecutivos == true) {
            System.out.println("Houve uma sequência de pelo menos três números primos consecutivos!");
        } else {
            System.out.println("NÃO houve sequência de três números primos consecutivos.");
        }

        s.close();
    }
}