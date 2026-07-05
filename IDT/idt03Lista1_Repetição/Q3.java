package Lista1_Repetição;
//  3. Elabore um programa que leia 10 valores inteiros e ao final escreva como resultado:
//    a) a media dos valores positivos lidos
//    b) quantos valores são menores que zero
//    c) quantos valores estão no intervalo 5..50, incluindo os valores dos limites
import java.util.Scanner;
import java.util.ArrayList;

public class Q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int i = 1;
        for (i = 1; i <= 10; i++){
                System.out.println("\nDigite o valor " + i);
                int valor = s.nextInt();
                numeros.add(valor); 
            }

            i--;
            float soma = 0;

            System.out.println("\nEssa é a média dos valores positivos:");
            for (float atualP : numeros) { 
                if (atualP > 0) {
                    soma = soma + atualP;
                }}
                System.out.print(soma/i);

            System.out.println("\nEssa é a quantidade de valores menores que zero: ");
            int zero = 0;
            for (int atual : numeros) {
                if (atual < 0) {
                    zero++;
                }}
                System.out.print(zero);

            System.out.println("\nEssa é a quantidade de valores entre 5 - 50:");
            int cinco = 0;
            for (int atual50 : numeros) {
                if (atual50 >= 5 && atual50 <= 50) {
                    cinco++;
                }
            }
            System.out.print(cinco);
            s.close();
    }
}
