package Fase_1.IDT.idt04Lista2_Repetição.While_only2;

/* Reescreva o exercício 04 da lista anterior, de modo que o programa, ao final, escreva o seguinte:
- Quais são os cursos (seu código) que tiveram índice candidato/vaga >= 2,5
- No cômputo geral, qual a participação feminina (em percentual) */

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        boolean continuar = true;

        String cursosAltaConcorrencia = "";
        int totalGeralMasc = 0;
        int totalGeralFem = 0;

        while (continuar == true) {
            System.out.print("Digite o código do curso ('X' para sair): ");
            String codigo = s.next();

            if (codigo.equalsIgnoreCase("X")) {
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

            if (candPorVaga >= 2.5) {
                cursosAltaConcorrencia += codigo + " ";
            }

            totalGeralMasc += masc;
            totalGeralFem += fem;
        }

        int totalGeralCand = totalGeralMasc + totalGeralFem;

        System.out.println("\n--- RESULTADO GERAL ---");
        System.out.println("Cursos com candidato/vaga >= 2.5: " 
            + (cursosAltaConcorrencia.isEmpty() ? "Nenhum" : cursosAltaConcorrencia));

        if (totalGeralCand > 0) {
            double pctFemGeral = ((double) totalGeralFem / totalGeralCand) * 100;
            System.out.printf("Participação feminina geral: %.2f%%\n", pctFemGeral);
        }

        s.close();
    }
}