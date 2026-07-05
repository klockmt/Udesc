package idt03Lista1_Repetição;

//Elabore um programa que leia 20 valores inteiros, calcule e escreva o percentual de valores negativos e positivos informados.

import java.util.Scanner;
import java.util.ArrayList;

public class Q7 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        float positivos = 0;
        float negativos = 0;

        for (int i = 1; i <= 20; i++){
                System.out.println("\nDigite o valor " + i);
                int valor = s.nextInt();
                numeros.add(valor); 
            }

            for (int atual : numeros) {
                if (atual < 0) {
                    negativos++;
                }else 
                    if (atual > 0) {
                        positivos++;
                    }
            }
            System.out.println("Numeros positivos: " +(positivos/20)*100 + "%");
            System.out.println("Numeros negativos: " +(negativos/20)*100 + "%");

        s.close(); 
    }
}
