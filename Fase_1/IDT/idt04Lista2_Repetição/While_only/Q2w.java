package Fase_1.IDT.idt04Lista2_Repetição.While_only;

/*A conversão de graus Farenheit para centígrados é obtida por C = 5/9 *(F - 32).
 Fazer um programa que calcule e escreva uma tabela de centígrados em função de graus Farenheit, que variam de 50 a 150 de 1 em 1. */


public class Q2w {
    public static void main(String[] args) {
        
        double f = 32;
        double c = 0;

        while (c <= 150) {
            f = (c * 1.8) + 32;
            
        System.out.println(c + " graus celsius = " + f + " graus farenheit");

        c++;
        }
    }
}
