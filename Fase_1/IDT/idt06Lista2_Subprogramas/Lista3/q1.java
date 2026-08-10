package Fase_1.IDT.idt06Lista2_Subprogramas.Lista3;

/* Refatore o código do exercício 1 da Lista2, de modo que o programa, além das funcionalidades originais, responda mais o seguinte:
- Qual a média geral de volumes
- Quantos volumes de cada tipo de figura foram calculados
- Quantos volumes não foram possíveis de calcular por força de o usuário ter informado alguma medida inválida */

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double somaVolumes = 0;
        int qtdVolumesValidos = 0;

        int qtdCubo = 0;
        int qtdEsfera = 0;
        int qtdCilindro = 0;

        int qtdInvalidos = 0;

        boolean continuar = true;

        while (continuar == true) {
            System.out.println("\nEscolha a figura (1-Cubo, 2-Esfera, 3-Cilindro, 0-Sair):");
            int opcao = s.nextInt();

            if (opcao == 0) {
                continuar = false;
                break;
            }

            if (opcao == 1) {
                System.out.println("Lado do cubo:");
                double lado = s.nextDouble();

                if (lado <= 0) {
                    qtdInvalidos++;
                    System.out.println("Medida inválida!");
                } else {
                    double v = Math.pow(lado, 3);
                    somaVolumes += v;
                    qtdVolumesValidos++;
                    qtdCubo++;
                    System.out.printf("Volume do cubo: %.2f\n", v);
                }

            } else if (opcao == 2) {
                System.out.println("Raio da esfera:");
                double raio = s.nextDouble();

                if (raio <= 0) {
                    qtdInvalidos++;
                    System.out.println("Medida inválida!");
                } else {
                    double v = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
                    somaVolumes += v;
                    qtdVolumesValidos++;
                    qtdEsfera++;
                    System.out.printf("Volume da esfera: %.2f\n", v);
                }

            } else if (opcao == 3) {
                System.out.println("Raio do cilindro:");
                double raio = s.nextDouble();

                System.out.println("Altura do cilindro:");
                double altura = s.nextDouble();

                if (raio <= 0 || altura <= 0) {
                    qtdInvalidos++;
                    System.out.println("Medida inválida!");
                } else {
                    double v = Math.PI * Math.pow(raio, 2) * altura;
                    somaVolumes += v;
                    qtdVolumesValidos++;
                    qtdCilindro++;
                    System.out.printf("Volume do cilindro: %.2f\n", v);
                }

            } else {
                System.out.println("Opção inválida!");
            }
        }

        System.out.println("\n--- RELATÓRIO GERAL ---");
        if (qtdVolumesValidos > 0) {
            System.out.printf("Média geral de volumes: %.2f\n", (somaVolumes / qtdVolumesValidos));
        } else {
            System.out.println("Nenhum volume válido foi calculado.");
        }

        System.out.println("Volumes calculados de Cubos: " + qtdCubo);
        System.out.println("Volumes calculados de Esferas: " + qtdEsfera);
        System.out.println("Volumes calculados de Cilindros: " + qtdCilindro);
        System.out.println("Quantidade de tentativas inválidas: " + qtdInvalidos);

        s.close();
    }
}