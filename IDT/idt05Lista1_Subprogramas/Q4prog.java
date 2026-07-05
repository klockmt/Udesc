package Lista1_Subprogramas;

import java.util.Scanner;

/*Faça uma função que recebe por parâmetro os valores necessários para o cálculo da fórmula de baskara e retorna, a soma das raízes, caso seja possível calcular. */

public class Q4prog {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        boolean vdd = true;

        while(vdd == true){

            System.out.println("Qual o valor de A?");
            double a = s.nextDouble();

            System.out.println("Qual o valor de B?");
            double b = s.nextDouble();

            System.out.println("Qual o valor de C?");
            double c = s.nextDouble();

            String resultado = soma(a, b, c);

            System.out.println(resultado);
        } s.close();
    }

    public static String soma(double a, double b, double c) {

        double delta = Math.pow(b, 2) - 4*(a*c);

        if(delta < 0){
            return "Não é possivel fazer soma de raizes";
        }else
        return "A soma das raizes é: " + -b/a;
    }
}
