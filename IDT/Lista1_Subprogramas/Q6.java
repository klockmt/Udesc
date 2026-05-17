package Lista1_Subprogramas;

import java.util.Scanner;

/*Faça uma função que recebe a idade de uma pessoa em anos, meses e dias e retorna essa idade expressa em dias.  */

public class Q6 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Anos: ");
        int anos = s.nextInt();
        System.out.println("Meses: ");
        int meses = s.nextInt();
        System.out.println("Dias: ");
        int dias = s.nextInt();

        int resultado = calculo(anos, meses, dias);

        System.out.println("Idade aproximada em dias: " + resultado);

        s.close();
    }

    public static int calculo(int anos, int meses, int dias) {
        return anos * 365 + meses * 30 + dias;
    }

}
