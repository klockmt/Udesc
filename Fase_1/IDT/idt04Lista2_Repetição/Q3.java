package Fase_1.IDT.idt04Lista2_Repetição;


import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Qual a tabuada que voce quer(de 1 a bastante)? ");
        long base = s.nextLong();
        System.out.println("Quão grande queres que seja a tabela(número de linhas)?");
        long x = s.nextLong();

        for (long i = 1; i <= x; i++) {
        System.out.println(i + " * " + base + " = " + i*base);
        } s.close();
    }
}
