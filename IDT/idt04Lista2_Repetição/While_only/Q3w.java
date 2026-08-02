package idt04Lista2_Repetição.While_only;

/* 3. Um comerciante deseja fazer o levantamento do lucro das mercadorias que ele comercializa.
Fazer um programa que determine e escreva quantas mercadorias proporcionam:
    a) lucro < 10%
    b) 10% <= lucro <= 20%
    c) lucro > 20%

Ao final, determine e escreva o valor total de compra e de venda de todas as mercadorias, assim como o lucro total.
Este programa deverá calcular o lucro das mercadorias até o momento em que o usuário resolver terminar o programa (nome da mercadoria = “X”). */

import java.util.Scanner;

public class Q3w {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        boolean b = true;

        float totalCompra = 0;
        float totalVenda = 0;

        int lucromenor10 = 0;
        int lucro1020 = 0;
        int lucromaior20 = 0;

        while (b == true) {
            System.out.print("Qual a mercadoria? ('X' para terminar): "); 
            String veri = s.next();

            if (veri.equalsIgnoreCase("X")) {
                b = false;
                break;
            }

            System.out.print("Qual o valor de compra? ");
            float valorcomp = s.nextFloat();
            
            System.out.print("Qual o valor de venda? ");
            float valorvend = s.nextFloat();

            totalCompra += valorcomp;
            totalVenda += valorvend;

            float lucro = ((valorvend - valorcomp) / valorcomp) * 100;

            if (lucro < 10) {
                lucromenor10++;
            } else if (lucro <= 20) {
                lucro1020++;
            } else {
                lucromaior20++;
            }
        }

        float lucroTotal = totalVenda - totalCompra;

        System.out.println("\n--- RELATÓRIO FINAL ---");
        System.out.println("Mercadorias com lucro < 10%: " + lucromenor10);
        System.out.println("Mercadorias com 10% <= lucro <= 20%: " + lucro1020);
        System.out.println("Mercadorias com lucro > 20%: " + lucromaior20);
        System.out.printf("Valor total de compra: R$ %.2f\n", totalCompra);
        System.out.printf("Valor total de venda: R$ %.2f\n", totalVenda);
        System.out.printf("Lucro total: R$ %.2f\n", lucroTotal);

        s.close();
    }
}