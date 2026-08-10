package EJ;

/*Faça um programa Java que calcula e imprime a área das seguintes figuras geométricas:
quadrado, retângulo, círculo e triângulo.
Para cada tipo de figura, deve-se implementar um método que calcula e retorna a área.*/

import java.util.Locale;
import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Locale ptBr = Locale.forLanguageTag("pt-BR");
        Scanner s = new Scanner(System.in);
        s.useLocale(ptBr);
        s.useDelimiter(";");

        String tipo = s.next();
        double resultado = 0;

        switch (tipo) {
            case "Q":
                resultado = areaQuadrado(s.nextDouble());
                break;
            case "R":
                resultado = areaRetangulo(s.nextDouble(), s.nextDouble());
                break;
            case "C":
                resultado = areaCirculo(s.nextDouble());
                break;
            case "T":
                resultado = areaTriangulo(s.nextDouble(), s.nextDouble(), s.nextDouble());
                break;
        }

        System.out.printf(ptBr, "%.2f%n", resultado);

        s.close();
    }

    private static double areaQuadrado(double lado) {
        return Math.pow(lado, 2);
    }

    private static double areaRetangulo(double base, double altura) {
        return base * altura;
    }

    private static double areaCirculo(double raio) {
        return Math.PI * Math.pow(raio, 2);
    }

    private static double areaTriangulo(double lado1, double lado2, double lado3) {
        double semiPerimetro = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(semiPerimetro * (semiPerimetro - lado1)
                * (semiPerimetro - lado2) * (semiPerimetro - lado3));
    }
}