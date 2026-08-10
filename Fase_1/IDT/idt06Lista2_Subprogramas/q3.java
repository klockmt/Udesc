package Fase_1.IDT.idt06Lista2_Subprogramas;

/* Um determinado material radioativo perde metade de sua massa a cada 50 segundos.
 Dada a massa inicial, em gramas, fazer um programa que determine o tempo necessário para que essa massa se torne menor do que 0,5 grama.
Escreva a massa inicial, a massa final e o tempo calculado em horas, minutos e segundos. */

import java.util.Scanner;

public class q3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int tick = 0;

        System.out.println("Qual a massa do material em decaimento:");
        double minicial = s.nextDouble();

        String resultado = massa(minicial, tick);

        System.out.println(resultado);

        s.close();
    }

    public static String massa(double minicial, int tick) {
        double mfinal = minicial;

        while (mfinal > 0.5) {
            tick++;
            mfinal = mfinal / 2;
        }

        int segundos = tick * 50;
        int horas = segundos / 3600;
        int minutos = segundos % 3600 / 60;
        segundos = segundos % 3600 % 60;

        return "A masssa final é " + mfinal +
                "\nO tempo até esse decaimento foi: " + horas + ":" + minutos + ":" + segundos;
    }
}
