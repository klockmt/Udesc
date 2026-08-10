package Fase_1.IDT.idt03Lista1_Repetição;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        while( true ){
        System.out.println("Qual a tabuada que voce quer(de 1 a 10)? ");
        byte base = s.nextByte();

        for (byte i = 1; i <= 10; i++) {
        System.out.println(i + " * " + base + " = " + i*base);
        } s.close();
        }
    }
}
