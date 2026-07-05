package idt03Lista1_Repetição;

import java.util.Scanner;

/*    10. Uma agencia de empregos oferece diariamente vagas para diversos postos de trabalho na indústria e no comercio.
    A seleção é feita em função do perfil desejado para cada área. As regras de seleção são as seguintes:
    • Para uma pessoa ser aceita para trabalhar no comércio ela necessita residir na cidade há pelo menos um ano, ter segundo grau completo e possuir experiência comprovada;
    • Para uma pessoa trabalhar na indústria o perfil esperado é residir dentro ou fora da cidade sem tempo mínimo de residência e possuir segundo grau completo para os cargos operacionais e curso superior para os cargos de gerencia.
    É também exigida experiência comprovada somente para os cargos de gerencia, não sendo exigida experiência para os cargos operacionais.

    Elabore um programa que leia os dados necessários para classificar 30 candidatos.
    Para cada candidato o programa deve exibir uma mensagem ‘candidato apto’ quando todas as exigências para a área pretendida forem satisfeitas e ‘candidato inapto’ quando qualquer das exigência por área não forem satisfeitas e isto reprovar o candidato.
    Quando o algoritmo definir um candidato inapto deve ser escrita também a exigência que implicou na reprovação deste candidato.
    Ao final este programa deverá escrever:
    a) Quantos candidatos para cada área foram computados
    b) Qual o percentual de candidatos inaptos por área
    c) Quantos candidatos aptos por área foram computados */



public class Q10 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int i = 0;
        float inaptosc = 0;
        float inaptosi = 0;
        int vgc = 0;
        int vgi = 0;
        int vga = 0;

        for (i = 1; i <= 30; i++) {
            System.out.println("Seleção de Candidato " + i);
            //reside na cidade
            System.out.println("Reside na cidade há pelo menos 1 ano? Sim[1] Não");
            int reside = s.nextInt();

            //tem segundo grau completo
            System.out.println("Tem segundo grau completo? Sim[1] Não");
            int ensinom = s.nextInt();

            //tem experiencia
            System.out.println("Tem experiencia comprovada? Sim[1] Não");
            int exp = s.nextInt();

            if (ensinom != 1) {
                inaptosc++;
                inaptosi++;
            } else 
                if (reside != 1 || exp != 1) {
                inaptosc++;
                vgi++;
            } else {
                vgc++;
                vgi++;
                vga++;
            }
                
        } i--;
      
        //Inaptos por area:
        System.out.println((inaptosc/i)*100 + "% inaptos para comécio");
        System.out.println((inaptosi/i)*100 + "% inaptos para industria");

        //Aptos por area:
        System.out.println("Quantidade de candidatos aptos para:");
        System.out.println("Comércio: " + (vgc - vga));
        System.out.println("Industria: " + (vgi - vga));
        System.out.println("Ambas: " + vga);

        s.close();
    }
}