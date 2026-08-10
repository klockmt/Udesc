package Fase_1.IDT.idt06Lista2_Subprogramas.Lista3;

/* Refatore o código do exercício 3 da Lista2, de modo que o programa, além das funcionalidades originais, responda mais o seguinte:
- O tempo médio dos materiais que foram informados, para alcançar a massa mínima
- O nome do material que levou mais tempo para alcançar a massa mínima
- O nome do material que levou menos tempo para alcançar a massa mínima */

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double somaTempos = 0;
        int totalMateriais = 0;

        String matMaisTempo = "";
        int maxTempo = -1;

        String matMenosTempo = "";
        int minTempo = Integer.MAX_VALUE;

        boolean continuar = true;

        while (continuar == true) {
            System.out.println("Nome do material ('X' para encerrar):");
            String nome = s.next();

            if (nome.equalsIgnoreCase("X")) {
                continuar = false;
                break;
            }

            System.out.println("Massa inicial (em gramas):");
            double massaInicial = s.nextDouble();

            System.out.println("Massa mínima (em gramas):");
            double massaMinima = s.nextDouble();

            int tempoSegundos = 0;
            double massa = massaInicial;

            while (massa > massaMinima) {
                massa /= 2.0;
                tempoSegundos += 50;
            }

            somaTempos += tempoSegundos;
            totalMateriais++;

            if (tempoSegundos > maxTempo) {
                maxTempo = tempoSegundos;
                matMaisTempo = nome;
            }

            if (tempoSegundos < minTempo) {
                minTempo = tempoSegundos;
                matMenosTempo = nome;
            }

            System.out.println("Tempo necessário para o material " + nome + ": " + tempoSegundos + " segundos.\n");
        }

        System.out.println("\n--- RELATÓRIO DE DECAIMENTO ---");
        if (totalMateriais > 0) {
            System.out.printf("Tempo médio para alcançar a massa mínima: %.2f segundos\n", (somaTempos / totalMateriais));
            System.out.println("Material que levou MAIS tempo: " + matMaisTempo + " (" + maxTempo + "s)");
            System.out.println("Material que levou MENOS tempo: " + matMenosTempo + " (" + minTempo + "s)");
        } else {
            System.out.println("Nenhum material foi analisado.");
        }

        s.close();
    }
}