package idt05Lista1_Subprogramas;

/* Faça uma função que recebe, por parâmetro, a altura (alt) e o sexo de uma pessoa e retorna o seu peso ideal. 
Para homens, peso ideal = 72.7 x alt - 58.
Para mulheres, peso ideal = 62.1 x alt - 44.7. */

import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Qual a altura?");
        double alt = s.nextDouble();

        System.out.println("Qual o sexo? (M/F)");
        String sexo = s.next();

        double resultado = pesoIdeal(alt, sexo);

        System.out.printf("Peso ideal: %.2f kg\n", resultado);
        s.close();
    }

    public static double pesoIdeal(double alt, String sexo) {
        if (sexo.equalsIgnoreCase("M")) {
            return (72.7 * alt) - 58;
        } else if (sexo.equalsIgnoreCase("F")) {
            return (62.1 * alt) - 44.7;
        }
        return 0;
    }
}