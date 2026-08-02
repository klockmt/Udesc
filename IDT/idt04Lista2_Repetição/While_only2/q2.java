package idt04Lista2_Repetição.While_only2;

/* Reescreva o exercício 03 da lista anterior, de modo que o programa, ao final, escreva o seguinte:
- Qual a faixa de lucro que mais apareceu
- Dentro da faixa de lucro que menos apareceu, qual o valor médio de compra destas mercadorias
- Dentro da faixa de lucro que menos apareceu, qual o percentual médio de lucro destas mercadorias */

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        boolean b = true;

        int qtdA = 0, qtdB = 0, qtdC = 0;
        float somaCompraA = 0, somaCompraB = 0, somaCompraC = 0;
        float somaLucroPctA = 0, somaLucroPctB = 0, somaLucroPctC = 0;

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

            float lucroPct = ((valorvend - valorcomp) / valorcomp) * 100;

            if (lucroPct < 10) {
                qtdA++;
                somaCompraA += valorcomp;
                somaLucroPctA += lucroPct;
            } else if (lucroPct <= 20) {
                qtdB++;
                somaCompraB += valorcomp;
                somaLucroPctB += lucroPct;
            } else {
                qtdC++;
                somaCompraC += valorcomp;
                somaLucroPctC += lucroPct;
            }
        }

        String maisApareceu = "Faixa A (<10%)";
        int maxQtd = qtdA;

        if (qtdB > maxQtd) {
            maxQtd = qtdB;
            maisApareceu = "Faixa B (10% a 20%)";
        }
        if (qtdC > maxQtd) {
            maisApareceu = "Faixa C (>20%)";
        }

        String menosApareceu = "Faixa A (<10%)";
        int minQtd = qtdA;
        float compraMenos = somaCompraA;
        float lucroPctMenos = somaLucroPctA;

        if (qtdB < minQtd) {
            minQtd = qtdB;
            menosApareceu = "Faixa B (10% a 20%)";
            compraMenos = somaCompraB;
            lucroPctMenos = somaLucroPctB;
        }
        if (qtdC < minQtd) {
            minQtd = qtdC;
            menosApareceu = "Faixa C (>20%)";
            compraMenos = somaCompraC;
            lucroPctMenos = somaLucroPctC;
        }

        System.out.println("\n--- ANÁLISE DE FAIXAS DE LUCRO ---");
        System.out.println("Faixa que mais apareceu: " + maisApareceu);

        if (minQtd > 0) {
            float mediaCompraMenos = compraMenos / minQtd;
            float mediaLucroPctMenos = lucroPctMenos / minQtd;

            System.out.println("Faixa que menos apareceu: " + menosApareceu);
            System.out.printf("Valor médio de compra nessa faixa: R$ %.2f\n", mediaCompraMenos);
            System.out.printf("Percentual médio de lucro nessa faixa: %.2f%%\n", mediaLucroPctMenos);
        } else {
            System.out.println("Não há dados suficientes para calcular as médias da faixa menos cadastrada.");
        }

        s.close();
    }
}