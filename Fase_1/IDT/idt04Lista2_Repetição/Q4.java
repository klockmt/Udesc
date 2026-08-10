package Fase_1.IDT.idt04Lista2_Repetição;


import java.util.Scanner;

/*    8. Em uma escola os alunos aprovados ao final do ano letivo recebem citações de honra ao mérito pelo seu desempenho escolar.
    Somente recebe a citação o aluno cuja media anual for igual ou superior a 7,0. Esta media anual é obtida com base na media aritmética simples das medias bimestrais do aluno.
    Esta citação é concedida com base em algumas regras, a saber:
    • O aluno recebe a citação ‘honras pelo bom aproveitamento’ quando sua media anual estiver entre 7,0 e 7,9
    • O aluno recebe a citação ‘honras pelo ótimo aproveitamento’ quando sua media anual estiver entre 8,0 e 8,9
    • O aluno recebe a citação ‘honras pelo excelente aproveitamento’ quando sua media anual estiver entre 9,0 e 10,0
    • O aluno recebe a citação ‘aluno exemplar’ quando sua media anual estiver entre 9,0 e 10,0 e tiver pelo menos duas medias bimestrais iguais a 10,0

    Elabore um programa que leia as medias bimestrais de 5 alunos e para cada um calcule sua media anual de aproveitamento e sua citação de honra ao mérito. Ao final este programa deverá escrever:
    a) Quantos alunos obtiveram ‘honras pelo bom aproveitamento’
    b) Qual o percentual de alunos que obtiveram o conceito ‘aluno exemplar’

    VAMOS REFATORAR O EXERCÍCIO 8 DA LISTA 1 A ADIÇÃO É A SEGUINTE: pegue o grupo de alunos com média entre 9.0 e 10.0 (excelentes e exemplares).
    O programa deve ser capaz de dizer se no cômputo geral estas médias tenderam mais para o 9.0 ou para o 10.0.
    Considere a nota 9.5 como ponto de corte entre os dois limiares
*/

	public class Q4 {
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);

            int boma = 0;
            float exem = 0;
            float acima = 0;
            float abaixo = 0;
            String tend = null;

            for (int a = 1; a <= 5; a++) {
                float soma = 0;
                System.out.println("\nDigite as notas para o aluno " + a);
                for (int b = 1; b <= 4; b++) {
            System.out.println("Digite a nota do bimestre " + b);
                    float media = s.nextFloat();
                    soma = soma + media;
                }
                float mediaa = soma / 4;
                if (mediaa >= 7 && mediaa <= 7.9) {
                    boma++;
                } else 
                    if (mediaa >= 9) {
                        exem++;
                        if (mediaa > 9.5) {
                            acima++;
                        } else {
                            abaixo++;
                        }
                    } 
            }
            if (acima > abaixo) {
                tend = "Tendencia de notas 10";
            } else
                if (abaixo > acima) {
                    tend = "Tendencia de notas 9";
            }

            System.out.println("Tiveram " + boma + " alunos com bom aproveitamento");
            System.out.println((exem/5)*100 + "% de alunos exemplares");
            System.out.println(tend);
			s.close(); 
	}
}