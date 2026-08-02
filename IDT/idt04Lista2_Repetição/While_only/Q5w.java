package idt04Lista2_Repetição.While_only;

/* Deseja-se fazer uma pesquisa a respeito do consumo mensal de energia elétrica em uma determinada cidade. 
Para isso, são fornecidos os seguintes dados: preço do kWh consumido, número do consumidor, 
quantidade de kWh consumidos durante o mês e código do tipo de consumidor (residencial, comercial, industrial). 
Elabore um programa que leia os valores de entrada e calcule, enquanto houver consumidores para serem lidos:
	a) para cada consumidor, o total a pagar;
	b) o maior consumo verificado;
	c) o menor consumo verificado;
	d) o total do consumo para cada um dos três tipos de consumidores;
	e) a média geral de consumo */

import java.util.Scanner;

public class Q5w {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o preço do kWh: ");
        double precoKwh = s.nextDouble();

        boolean continuar = true;

        double maiorConsumo = 0;
        double menorConsumo = Double.MAX_VALUE;

        double totalResidencial = 0;
        double totalComercial = 0;
        double totalIndustrial = 0;

        double somaTotal = 0;
        int totalConsumidores = 0;

        while (continuar == true) {
            System.out.print("\nNúmero do consumidor (0 para encerrar): ");
            int numConsumidor = s.nextInt();

            if (numConsumidor == 0) {
                continuar = false;
                break;
            }

            System.out.print("Quantidade de kWh consumidos: ");
            double kwh = s.nextDouble();

            System.out.print("Tipo (1-Residencial, 2-Comercial, 3-Industrial): ");
            int tipo = s.nextInt();

            double totalPagar = kwh * precoKwh;
            System.out.printf("Total a pagar: R$ %.2f\n", totalPagar);

            if (kwh > maiorConsumo) maiorConsumo = kwh;
            if (kwh < menorConsumo) menorConsumo = kwh;

            if (tipo == 1) totalResidencial += kwh;
            else if (tipo == 2) totalComercial += kwh;
            else if (tipo == 3) totalIndustrial += kwh;

            somaTotal += kwh;
            totalConsumidores++;
        }

        if (totalConsumidores > 0) {
            System.out.println("\n--- RELATÓRIO FINAL ---");
            System.out.println("Maior consumo: " + maiorConsumo + " kWh");
            System.out.println("Menor consumo: " + menorConsumo + " kWh");
            System.out.println("Total Residencial: " + totalResidencial + " kWh");
            System.out.println("Total Comercial: " + totalComercial + " kWh");
            System.out.println("Total Industrial: " + totalIndustrial + " kWh");
            System.out.printf("Média geral de consumo: %.2f kWh\n", (somaTotal / totalConsumidores));
        }

        s.close();
    }
}