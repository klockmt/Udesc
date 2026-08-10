package Fase_1.IDT.idt01Lista1_Condicionais;

import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        //criação da variable nu
        byte nu;

        //while em true(verdade), para quando for um número diferente de 0
        while (true) { //essa chave fecha na chave while
            System.out.print("Informe o número do dia da Semana (0 para sair): ");
            nu = s.nextByte();

            if (nu == 0) {
                break;
                //sendo 0 o código para de repetir
            }

            String day = null;

            if (nu == 1) {
                day = "Domingo";
            } else if (nu == 2) {
                day = "Segunda-Feira";
            } else if (nu == 3) {
                day = "Terça-Feira";
            } else if (nu == 4) {
                day = "Quarta-Feira";
            } else if (nu == 5) {
                day = "Quinta-Feira";
            } else if (nu == 6) {
                day = "Sexta-Feira";
            } else if (nu == 7) {
                day = "Sábado";
            } else {
                day = "Número incorreto";
            }
            
            System.out.println(day + "\n");
        }//chave while

        s.close();
    }
}