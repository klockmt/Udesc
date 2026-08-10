package Fase_1.IDT.idt03Lista1_Repetição;

import java.util.Scanner;
import java.util.ArrayList;

//Elabore um programa que leia 5 valores e conte quantos destes valores são negativos, escrevendo esta informação. 

public class Q2 {
     public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        while( true ){
            for (int i = 1; i <= 5; i++){
                System.out.println("\nDigite o valor " + i);
                int valor = s.nextInt();
                numeros.add(valor); 
            }
            System.out.println("Os seguintes valores são negativos:");
            for (int atual : numeros) {
                if (atual < 0) {
                    System.out.print(atual + " ");
                }
            } 
        s.close();       
    }
}}

