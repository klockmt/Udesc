package Fase_1.IDT.idt08Lista2_Vetores;

/* VAMOS REFATORAR O EXERCÍCIO 3 DA LISTA 1.
Leia um vetor de inteiros de 16 posições e troque os 8 primeiros valores pelos 8 últimos e vice-e-versa. 
Não pode criar vetor auxiliar. Escreva ao final o vetor obtido e também:
a) o somatório dos números que foram movimentados para a primeira metade do vetor
b) a média dos valores movimentados para a segunda metade do vetor
c) O maior e o menor valores movimentados
d) Se existe ou não pelo menos um número primo entre os valores movimentados */

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] vetor = new int[16];
        int temp = 0;

        System.out.println("- Digite os 16 valores do vetor -");
        for (int i = 0; i < 16; i++) {
            vetor[i] = lerEntrada(s);
        }

        // Troca dos 8 primeiros pelos 8 últimos
        for (int i = 0; i < 8; i++) {
            temp = vetor[i + 8];
            vetor[i + 8] = vetor[i];
            vetor[i] = temp;
        }

        System.out.println("\nVetor obtido:");
        mostrarVetor(vetor);

        // a) Somatório da primeira metade
        int somaPrimeiraMetade = 0;
        for (int i = 0; i < 8; i++) {
            somaPrimeiraMetade += vetor[i];
        }

        // b) Média da segunda metade
        double somaSegundaMetade = 0;
        for (int i = 8; i < 16; i++) {
            somaSegundaMetade += vetor[i];
        }
        double mediaSegundaMetade = somaSegundaMetade / 8.0;

        // c) Maior e menor valores movimentados
        int maior = vetor[0];
        int menor = vetor[0];
        boolean temPrimo = false;

        for (int i = 0; i < 16; i++) {
            if (vetor[i] > maior) maior = vetor[i];
            if (vetor[i] < menor) menor = vetor[i];
            
            if (ePrimo(vetor[i])) {
                temPrimo = true;
            }
        }

        System.out.println("\n\n--- ESTATÍSTICAS ---");
        System.out.println("a) Somatório dos valores na primeira metade: " + somaPrimeiraMetade);
        System.out.printf("b) Média dos valores na segunda metade: %.2f\n", mediaSegundaMetade);
        System.out.println("c) Maior valor movimentado: " + maior + " | Menor valor: " + menor);
        System.out.println("d) Existe pelo menos um número primo? " + (temPrimo ? "Sim" : "Não"));

        s.close();
    }

    public static int lerEntrada(Scanner s) {
        System.out.print("valor = ");
        return s.nextInt();
    }

    public static void mostrarVetor(int[] vetor) {
        for (int i = 0; i < 16; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    public static boolean ePrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}