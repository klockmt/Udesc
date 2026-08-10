package Fase_1.IDT.idt04Lista2_Repetição.While_only2;

/* Reescreva o exercício 08 da lista anterior, de modo que o programa, antes de imprimir a série Fibonacci, 
tenha impresso a raiz quadrada de cada número da série. Para calcular a raiz, utilize a técnica das subtrações sucessivas de ímpares. */

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o número limite para a série de Fibonacci: ");
        int limite = s.nextInt();

        int a = 1;
        int b = 1;

        System.out.println("\n--- IMPRESSÃO DAS RAÍZES DA SÉRIE ---");
        int auxA = a;
        int auxB = b;
        while (auxA <= limite) {
            int impar = 1;
            int raiz = 0;
            int resto = auxA;

            while (resto > 0) {
                resto = resto - impar;
                impar += 2;
                raiz++;
            }

            System.out.println("Número: " + auxA + " -> Raiz Quadrada: " + raiz);

            int proximo = auxA + auxB;
            auxA = auxB;
            auxB = proximo;
        }

        System.out.println("\n--- SÉRIE DE FIBONACCI ---");
        while (a <= limite) {
            System.out.print(a + " ");
            int proximo = a + b;
            a = b;
            b = proximo;
        }
        System.out.println();

        s.close();
    }
}

