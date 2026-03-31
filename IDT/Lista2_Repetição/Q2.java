package Lista2_Repetição;

//Elabore um programa que leia 5 valores inteiros positivos e ao final responda quantos destes valores são números primos.
/*     2. VAMOS REFATORAR O EXERCÍCIO 5 DA LISTA 1. A ADIÇÃO É A SEGUINTE: o programa deve ler 10 números ao invés de apenas 5.
 Então ao final o programa deve ser capaz de dizer:
a) o somatório dos números não primos informados
b) o somatório dos números primos informados
c) dentre os números primos, o maior
d) dentre os números não primos, o menor*/

import java.util.Scanner;

public class Q2 {
     public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        boolean b = true;
        int valoresp = 0;
        float soma = 0;
        float somap = 0;
        float maior = 0;
        float menor = 0;
        
        while( b == true ){
            for (int i = 1; i <= 5; i++) { //lembrar de mudar i

                System.out.println("\nDigite o valor " + i + " só aceito positivos e inteiros!");
                float valor = s.nextFloat();

                if (valor < 0 || valor % 1 != 0) {
                    b = false;
                    break;
                }

                if (b == false) {
                    break;
                }

            //acima quebra de loop

                if (valor == 1) {
                        soma = soma + valor;
                        menor = valor;
                }
                for (int d = 2; d <= valor; d++) {
                        if (valor == 2) {
                            valoresp++;
                            somap = somap + valor; 
                            if (valor > maior) {
                            maior = valor;
                        }
                            break;
                        } else
                            if (valor % d == 0) {
                        soma = soma + valor; 
                        if (menor == 0 || valor < menor) {
                            menor = valor;
                        }
                        break;
                    } else {
                        valoresp++;
                        somap = somap + valor; 
                        if (valor > maior) {
                            maior = valor;
                        }
                        break;
                    }
                }
            }

         System.out.println("Essa é a quantidade números que são primos: " + valoresp);
         System.out.println("Essa é a soma dos números que não são primos: " + soma);
         System.out.println("Essa é a soma dos números que são primos: " + somap);
         System.out.println("Esse é o maior número primo: " + maior);
         System.out.println("Esse é o menor número não primo: " + menor);

        }
        s.close();       
    }
}

