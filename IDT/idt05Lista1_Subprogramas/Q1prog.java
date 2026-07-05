package idt05Lista1_Subprogramas;

import java.util.Scanner;

/*Faça uma função que recebe por parâmetro o raio de uma esfera e retorne o seu volume (v = 4/3.Pi .R3).  */

public class Q1prog {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Qual o raio?");
        float raio = s.nextFloat();

        double resultadu = volume(raio); 

        System.out.println(resultadu);
        s.close();
    }

    public static double volume(float raio) {
        double resultado = 4d/3d*Math.PI*Math.pow(raio, 3);
        return resultado;
    }

}   