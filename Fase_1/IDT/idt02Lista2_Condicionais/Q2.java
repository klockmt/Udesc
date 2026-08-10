package Fase_1.IDT.idt02Lista2_Condicionais;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Digite sua idade: ");
            int idade = s.nextInt();

            String unidade = null;
            String dezena = null;

            if(idade < 1 || idade > 99) {
                System.out.println("Digite uma idade entre 1 e 99 por favor!");
                idade = s.nextInt();
            } else 
                if (idade < 20) {
                    switch (idade) {
                        case 1:
                            unidade = "um";
                            break;
                        case 2:
                            unidade = "dois";
                            break;
                        case 3:
                            unidade = "três";
                            break;
                        case 4:
                            unidade = "quatro";
                            break;
                        case 5:
                            unidade = "cinco";
                            break;
                        case 6:
                            unidade = "seis";
                            break;
                        case 7:
                            unidade = "sete";
                            break;
                        case 8:
                            unidade = "oito";
                            break;
                        case 9:
                            unidade = "nove";
                            break;
                        case 10:
                            unidade = "dez";
                            break;
                        case 11:
                            unidade = "onze";
                            break;
                        case 12:
                            unidade = "doze";
                            break;
                        case 13:
                            unidade = "treze";
                            break;
                        case 14:
                            unidade = "quatorze";
                            break;
                        case 15:
                            unidade = "quinze";
                            break;
                        case 16:
                            unidade = "dezesseis";
                            break;
                        case 17:
                            unidade = "dezesete";
                            break;
                        case 18:
                            unidade = "dezoito";
                            break;
                        default:
                            unidade = "dezenove";
                            break;
                    }
                    System.out.println(unidade + " anos");
                } else {
                    int idadeD = idade / 10;
                    int idadeU = idade % 10;
                    switch (idadeU) {
                        case 1:
                            unidade = "um";
                            break;
                        case 2:
                            unidade = "dois";
                            break;
                        case 3:
                            unidade = "três";
                            break;
                        case 4:
                            unidade = "quatro";
                            break;
                        case 5:
                            unidade = "cinco";
                            break;
                        case 6:
                            unidade = "seis";
                            break;
                        case 7:
                            unidade = "sete";
                            break;
                        case 8:
                            unidade = "oito";
                            break;
                        case 9:
                            unidade = "nove";
                            break;
                        default:
                            unidade = "nada ;)";
                            break;
                    }
                    switch (idadeD) {
                        case 2:
                            dezena = "vinte";
                            break;
                        case 3:
                            dezena = "trinta";
                            break;
                        case 4:
                            dezena = "quarenta";
                            break;
                        case 5:
                            dezena = "cinquenta";
                            break;
                        case 6:
                            dezena = "sessenta";
                            break;
                        case 7:
                            dezena = "setenta";
                            break;
                        case 8:
                            dezena = "oitenta";
                            break;
                        default:
                            dezena = "noventa";
                            break;
                    }
                    System.out.println(dezena + " e " + unidade);
           s.close();
        }
        } 
       
    }
}
