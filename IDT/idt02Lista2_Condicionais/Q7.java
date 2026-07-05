package Lista2_Condicionais;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

        System.out.print("Informe x1: ");
        float x1 = s.nextFloat();

        System.out.print("Informe y1: ");
        float y1 = s.nextFloat();

        System.out.print("Informe x2: ");
        float x2 = s.nextFloat();

        System.out.print("Informe y2: ");
        float y2 = s.nextFloat();

        if(x1 > x2) {
            System.out.println("X2 incorreto");
        }else {
        double d = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
            System.out.println("A distância entre os pontos é: " + d);
        }
        s.close();
}}