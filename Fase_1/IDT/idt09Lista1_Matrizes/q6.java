package Fase_1.IDT.idt09Lista1_Matrizes;

/* 6. EXERCÍCIO CRIATIVO: "Detector de Gravidade Numérica e Caminho de Collatz"
Elabore um programa que lê uma matriz[5x5]. Para cada número inserido, o programa simula a Conjectura de Collatz 
(Se par -> n/2, se ímpar -> 3n + 1) até atingir o número 1. 
O programa transforma a matriz[5x5] substituindo cada valor original pela quantidade de PASSOS (órbita) necessários para atingir o 1.
Ao final, calcula qual posição da matriz gerou a maior "Gravidade Numérica" (maior quantidade de passos até o colapso no 1). */

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[][] matrizOriginal = new int[5][5];
        int[][] matrizPassos = new int[5][5];

        System.out.println("- Preenchendo a matriz do Universo Numérico [5x5] (valores > 0) -");
        criarmatriz(matrizOriginal, s);

        System.out.println("\n--- Matriz Original (Valores informados) ---");
        mostrar(matrizOriginal);

        calcularMatrizDePassos(matrizOriginal, matrizPassos);

        System.out.println("\n\n--- Matriz de Gravidade (Passos até o colapso no 1) ---");
        mostrar(matrizPassos);

        exibirMaiorGravidade(matrizOriginal, matrizPassos);

        s.close();
    }

    public static int lerEntrada(Scanner s) {
        System.out.print("valor (> 0) = ");
        int valor = s.nextInt();
        while (valor <= 0) {
            System.out.print("Inválido! Digite valor > 0: ");
            valor = s.nextInt();
        }
        return valor;
    }

    public static void criarmatriz(int[][] matriz, Scanner s) {
        for (int lin = 0; lin < 5; lin++) {
            for (int col = 0; col < 5; col++) {
                matriz[lin][col] = lerEntrada(s);
            }
        }
    }

    public static void mostrar(int[][] matriz) {
        for (int lin = 0; lin < 5; lin++) {
            System.out.println();
            for (int col = 0; col < 5; col++) {
                System.out.printf("%4d ", matriz[lin][col]);
            }
        }
    }

    // Calcula quantos passos a Conjectura de Collatz leva para chegar em 1
    public static int passosCollatz(int n) {
        int passos = 0;
        long aux = n;
        while (aux > 1) {
            if (aux % 2 == 0) {
                aux /= 2;
            } else {
                aux = (aux * 3) + 1;
            }
            passos++;
        }
        return passos;
    }

    public static void calcularMatrizDePassos(int[][] original, int[][] passos) {
        for (int lin = 0; lin < 5; lin++) {
            for (int col = 0; col < 5; col++) {
                passos[lin][col] = passosCollatz(original[lin][col]);
            }
        }
    }

    public static void exibirMaiorGravidade(int[][] original, int[][] passos) {
        int maxPassos = passos[0][0];
        int linMax = 0;
        int colMax = 0;

        for (int lin = 0; lin < 5; lin++) {
            for (int col = 0; col < 5; col++) {
                if (passos[lin][col] > maxPassos) {
                    maxPassos = passos[lin][col];
                    linMax = lin;
                    colMax = col;
                }
            }
        }

        System.out.println("\n\n=== ANÁLISE DE GRAVIDADE NUMÉRICA ===");
        System.out.println("O Buraco Negro Numérico (maior órbita de Collatz) ocorreu no elemento:");
        System.out.println("Valor Original: " + original[linMax][colMax]);
        System.out.println("Posição na Matriz: Linha [" + linMax + "], Coluna [" + colMax + "]");
        System.out.println("Quantidade de passos até atingir o número 1: " + maxPassos + " ciclos!");
    }
}