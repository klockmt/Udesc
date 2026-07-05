package Lista1_Repetição;

//Elabore um programa que leia 5 valores inteiros positivos e ao final responda quantos destes valores são números primos.

import java.util.Scanner;

public class Q5 {
     public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        boolean b = true;
        int valoresp = 0;
        
        while( b == true ){
            for (int i = 1; i <= 5; i++) {

                System.out.println("\nDigite o valor " + i + " só aceito positivos e inteiros!");
                float valor = s.nextFloat();

                if (valor < 0 || valor % 1 != 0) {
                    b = false;
                    break;
                }

                if (b == false) {
                    break;
                }
            
                for (int d = 2; d <= Math.sqrt(valor); d++) {
                    if (valor == 2 || valor == 3) {
                        valoresp++;
                    } else
                       if (valor % d == 1) {
                        valoresp++;
                        break;
                    } 
                }
            }
         System.out.println("Essa é a quantidade números que são primos: " + valoresp);
        }
        s.close();       
    }
}

