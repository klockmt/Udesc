package Fase_1.IDT.idt03Lista1_Repetição;

import java.util.Scanner;

/*    Reescreva o programa anterior. Esta nova versão deverá informar, além dos resultados já solicitados para cada aluno, quais medias bimestrais foram iguais a 10,0 em caso de conceito ‘Aluno Exemplar’.
*/

	public class Q9 {
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);

            int boma = 0;
            float exem = 0;
            int lendas = 0;

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
                    } 
                    if (mediaa >= 10) {
                        lendas++;
                    }
            }

            System.out.println("Tiveram " + boma + " alunos com bom aproveitamento");
            System.out.println((exem/5)*100 + "% de alunos exemplares");
            System.out.println("Tiveram essa quantidade de lendas: " + lendas);

			s.close(); 
	}
}