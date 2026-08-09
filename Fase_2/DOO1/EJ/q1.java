package EJ;

/*Fa¸ca um programa Java que determine o volume V de uma caixa d’´agua cil´ındrica, sendo
que o raio e a altura devem ser fornecidos(lidos pelo teclado) */

import java.util.Scanner;

public class q1 {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
            
        System.out.println("Informe o raio: ");
        double raio = s.nextDouble();

        System.out.println("Informe a altura: ");
        double altura = s.nextDouble();

        double resultado = Math.PI * Math.pow(raio, 2) * altura;

        System.out.println(resultado);

        s.close();
    }
}
