package Fase_1.IDT.idt04Lista2_Repetição;


/* VAMOS REFATORAR O EXERCÍCIO 3 DA LISTA 1.
 A ADIÇÃO É A SEGUINTE: todo valor no intervalo entre 5 .. 50 deve ser testado,
  pois no final o programa deve ser capaz de dizer qual o maior e o menor valor informados neste intervalo. */

import java.util.Scanner;
import java.util.ArrayList;

public class Q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Float> numeros = new ArrayList<>();
        int i = 1;
        for (i = 1; i <= 10; i++){
                System.out.println("\nDigite o valor " + i);
                float valor = s.nextInt();
                numeros.add(valor); 
            }

            i--;
            float soma = 0;
            float x = 0;
            float maior = 5;
            float menor = 50;

            System.out.println("\nEssa é a média dos valores positivos:");
            for (float atualP : numeros) { 
                if (atualP > 0) {
                    soma = soma + atualP;
                    x++;
                }}
                System.out.print(soma/x);

            System.out.println("\nEssa é a quantidade de valores menores que zero: ");
            int zero = 0;
            for (float atual : numeros) {
                if (atual < 0) {
                    zero++;
                }}
                System.out.print(zero);

            System.out.println("\nEssa é a quantidade de valores entre 5 - 50:");
            int cinco = 0;
            for (float atual50 : numeros) {
                if (atual50 >= 5 && atual50 <= 50) {
                    cinco++;

                    //verificação de maior e menor
            
                    for (Float natual : numeros) {
                if (natual > maior && natual >= 5 && natual <= 50) {
                    maior = natual;
                } else
                    if (natual < menor && natual >= 5 && natual <= 50) {
                        menor = natual;
                    }
                }

                }
            }
            
            System.out.println(cinco);
            System.out.println("Entre 5 e 50");
            System.out.println("Esse é o maior: \n" + maior);
            System.out.println("Esse é o menor: \n" + menor);
            s.close();
    }
}
