package Fase_1.IDT.idt04Lista2_Repetição.While_only;

/* Dado um país A, com 5.000.000 de habitantes e uma taxa de natalidade de 3% ao ano, 
e um país B com 7.000.000 de habitantes e uma taxa de natalidade de 2% ao ano, 
calcular e imprimir o tempo necessário para que a população do país A ultrapasse a população do país B. */

public class Q13w {
    public static void main(String[] args) {
        double popA = 5000000;
        double popB = 7000000;
        int anos = 0;

        while (popA <= popB) {
            popA += popA * 0.03;
            popB += popB * 0.02;
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos para o país A ultrapassar a população do país B.");
    }
}