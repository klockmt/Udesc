package EJ;

/*Faça um programa Java que lê uma matriz M(5,5) de inteiros, calcula e imprime as somas:

a) da quarta linha de M.
b) da segunda coluna de M.
c) da diagonal principal.
d) da diagonal secundária.
e) de todos os elementos da matriz. 

dica do professor:

Para que o Scanner leia adequadamente as diversas linhas, após ler o último
valor de uma linha é necessário executar o comando scan.nextLine() para que o
Scanner pule para a próxima linha.
*/

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.useDelimiter(";");

        int[][] matriz = new int[5][5];

        for (int lin = 0; lin < 5; lin++) {
            for (int col = 0; col < 5; col++) {
                matriz[lin][col] = s.nextInt();
            }
            s.nextLine();
        }

        int somaQuartaLinha = 0;
        for (int col = 0; col < 5; col++) {
            somaQuartaLinha += matriz[3][col];
        }

        int somaSegundaColuna = 0;
        for (int lin = 0; lin < 5; lin++) {
            somaSegundaColuna += matriz[lin][1];
        }

        int somaDiagonalPrincipal = 0;
        for (int lin = 0; lin < 5; lin++) {
            somaDiagonalPrincipal += matriz[lin][lin];
        }

        int somaDiagonalSecundaria = 0;
        for (int lin = 0; lin < 5; lin++) {
            somaDiagonalSecundaria += matriz[lin][4 - lin];
        }

        int somaTotal = 0;
        for (int lin = 0; lin < 5; lin++) {
            for (int col = 0; col < 5; col++) {
                somaTotal += matriz[lin][col];
            }
        }

        System.out.println(somaQuartaLinha);
        System.out.println(somaSegundaColuna);
        System.out.println(somaDiagonalPrincipal);
        System.out.println(somaDiagonalSecundaria);
        System.out.println(somaTotal);

        s.close();
    }
}