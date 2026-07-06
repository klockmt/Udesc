package idt09Lista1_Matrizes;

import java.util.Scanner;

public class template {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[][] matriz = new int[5][5];

        for (int col = 0; col < 5; col++) {
            for (int lin = 0; lin < 5; lin++) {
                matriz[col][lin] = lerEntrada(s);
            }
        }
        mostrar(matriz);
        
        s.close();

    }

    public static int lerEntrada(Scanner s) {

        System.out.print("valor = ");
        int valor = s.nextInt();

        return valor;
    }

    public static void mostrar(int[][] matriz) {
        for (int col = 0; col < 5; col++) {
            System.out.println();
            for (int lin = 0; lin < 5; lin++) {
                System.out.print(matriz[col][lin] + " ");

            }
        }
    }

}
