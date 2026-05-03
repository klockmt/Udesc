package Lista1_Subprogramas;

import java.util.Scanner;

/*Faça uma função que recebe por parâmetro o raio de uma esfera e retorne o seu volume (v = 4/3.Pi .R3).  */

public class Q1prog {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Qual o raio?");
        float raio = s.nextFloat();

        float resultadu = volume(raio); 

        System.out.println(resultadu);

    }

    public static float volume(float raio) {
        float resultado = 4f/3f*3.14f*(raio*raio*raio);
        return resultado;
    }



}