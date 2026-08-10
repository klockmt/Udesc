package Fase_1.IDT.idt05Lista1_Subprogramas;

import java.util.Scanner;

/*Faça uma função que recebe por parâmetro o tempo de duração de um processo em uma fábrica
expressa em segundos e retorna esse tempo em horas, minutos e segundos.  */

public class Q5prog {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Qual o tempo da fabrica em segundos?");
        int processo = s.nextInt();

        String resultado = calculo(processo);

        System.out.println(resultado);
        s.close();
    } 

    public static String calculo(int processo) {

        int horas = processo/3600;
        int minutos = processo%3600/60;
        int segundos = processo%3600%60;

        return "Horas: " + horas + "\nMinutos: " + minutos + "\nSegundos: " + segundos;
    }
}