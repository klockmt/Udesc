package Fase_2.DOO1.EJ;

import java.util.Locale;
import java.util.Scanner;

/*Uma equação do segundo grau tem o seguinte formato:
ax2 + bx + c
Escreva um programa Java para resolver equações do segundo grau. O programa deve
ler os coeficientes a, b, e c, e resolver a equação conforme instruções abaixo.
x = −b ± √b2 − 4ac
2a

O seu programa deve calcular e imprimir a(s) raiz(es) da equação.
 Se o interior da raiz quadrada é igual a zero, então existe uma raiz.
 Se o interior da raiz quadrada é positivo, então existem duas raizes.
 Se o interior da raiz quadrada é negativo, então não existe raiz real.
 */

public class q2 {
    public static void main(String[] args) {
        Locale ptBr = Locale.forLanguageTag("pt-BR");
        Scanner s = new Scanner(System.in);
        s.useLocale(ptBr);

        System.out.println("Informe o valor A:");
        double a = s.nextDouble();

        System.out.println("Informe o valor B:");
        double b = s.nextDouble();

        System.out.println("Informe o valor C:");
        double c = s.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) {

            System.out.println("Sem raiz real");

        } else if (delta == 0) {

            double x = -b / (2 * a);
            System.out.printf(ptBr, "%.2f%n", x);

        } else {
            double x = (-b + Math.sqrt(delta))/ (2 * a);
            double x2 = (-b - Math.sqrt(delta))/ (2 * a);

            System.out.printf(ptBr, "%.2f;%.2f%n", x, x2);
        }

        s.close();
    }
}
