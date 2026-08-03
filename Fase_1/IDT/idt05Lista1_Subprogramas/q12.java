package idt05Lista1_Subprogramas;

/* Escreva uma função que recebe 3 valores reais X, Y e Z e verifica se podem ser lados de um triângulo. 
Caso sim, retorna o tipo de triângulo (Equilátero, Isósceles ou Escaleno). */

import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Valor de X:");
        double x = s.nextDouble();

        System.out.println("Valor de Y:");
        double y = s.nextDouble();

        System.out.println("Valor de Z:");
        double z = s.nextDouble();

        String resultado = verificarTriangulo(x, y, z);

        System.out.println("Resultado: " + resultado);
        s.close();
    }

    public static String verificarTriangulo(double x, double y, double z) {
        if (x < y + z && y < x + z && z < x + y) {
            if (x == y && y == z) {
                return "Triângulo Equilátero";
            } else if (x == y || x == z || y == z) {
                return "Triângulo Isósceles";
            } else {
                return "Triângulo Escaleno";
            }
        } else {
            return "Não forma um triângulo";
        }
    }
}