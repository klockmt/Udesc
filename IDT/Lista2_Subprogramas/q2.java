package Lista2_Subprogramas;

import java.util.Scanner;

/*Implemente um programa que verifique se um valor é perfeito ou não.
Um valor é dito perfeito quando ele é igual a soma dos seus divisores excetuando ele próprio.
 (Ex: 6 é perfeito, 6 = 1 + 2 + 3, que são seus divisores).
 A função deve retornar também a lista dos divisores, apenas quando o número for perfeito.  */

public class q2 {

    static String lista = "";

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        boolean b = true;

        while (b == true) {
            System.out.println("Qual o valor?");
            int n = s.nextInt();

            boolean resultado = calculo(n);

            if (resultado == true) {

                System.out.println("O numero é perfeito");
                System.out.println("Esses são os divisores:");
                System.out.println(lista);

            } else {
                System.out.println("O numero não é perfeito");
            }
            lista = "";
        }
        s.close();
    }

    public static boolean calculo(int n) {

        int divisores = 0;

        if ((double) n % 2 > 0) {
            return false;
        } else {
            for (int i = n / 2; i > 0; i--) {
                if (n % i == 0) {
                    lista = " " + i + lista;
                    divisores += i;
                }
            }
            if (divisores == n) {
                return true;
            }
        }
        return false;
    }
}
