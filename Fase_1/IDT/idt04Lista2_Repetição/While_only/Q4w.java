package idt04Lista2_Repetição.While_only;

/* Uma universidade deseja fazer um levantamento a respeito do seu concurso vestibular. 
Para cada curso, é fornecido o seguinte conjunto de valores: o código do curso, o número de vagas, 
número de candidatos do sexo masculino e o número de candidatos do sexo feminino. 
Fazer um programa que calcule e escreva para cada curso:
- o número de candidatos por vaga 
- a porcentagem de candidatos do sexo feminino 
- determine o maior número de candidatos por vaga e escreva esse número juntamente com o código do curso correspondente

Este programa deverá ler cursos enquanto o código do curso for diferente de “X”. */

import java.util.Scanner;

public class Q4w {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        boolean continuar = true;
        
        String maiorCodigo = "";
        double maiorCandVaga = 0;

        while (continuar == true) {
            System.out.print("Digite o código do curso ('X' para sair): ");
            String codigo = s.next();

            if (codigo.equals("X") || codigo.equals("x")) {
                continuar = false;
                break;
            }

            System.out.print("Número de vagas: ");
            int vagas = s.nextInt();

            System.out.print("Candidatos do sexo masculino: ");
            int masc = s.nextInt();

            System.out.print("Candidatos do sexo feminino: ");
            int fem = s.nextInt();

            int totalCand = masc + fem;
            double candPorVaga = (double) totalCand / vagas;
            double pctFem = ((double) fem / totalCand) * 100;

            System.out.printf("Candidatos por vaga: %.2f\n", candPorVaga);
            System.out.printf("Porcentagem feminina: %.2f%%\n\n", pctFem);

            if (candPorVaga > maiorCandVaga) {
                maiorCandVaga = candPorVaga;
                maiorCodigo = codigo;
            }
        }

        if (!maiorCodigo.equals("")) {
            System.out.printf("Maior número de candidatos por vaga: %.2f (Curso: %s)\n", maiorCandVaga, maiorCodigo);
        }

        s.close();
    }
}
