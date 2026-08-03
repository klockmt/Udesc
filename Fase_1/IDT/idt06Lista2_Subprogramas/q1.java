package idt06Lista2_Subprogramas;

import java.util.Scanner;

/*    1) Elabore um programa que, dado um tipo de forma geométrica, calcule seu volume e escreva. Este programa poderá calcular volumes das seguintes formas:
    a) Cubos (private double  Calcula_Cubo)
, onde s é o comprimento de um lado
    b) Paralelepípedos (private double  Calcula_Paralelepipedo)
, onde l=largura, c=comprimento e a=altura
    c) Cilindros (private double  Calcula_Cilindros)
, onde r=raio de uma face circular e h=altura
    d) Esferas (private double  Calcula_Esferas)
, onde r=raio da esfera
    e) Cones (private double  Calcula_Cones)
, onde r=raio do circulo na base e h=altura */

public class q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        boolean b = true;
        double r = 0;
        double h = 0;
        double resultado = 0;

        while (b == true) {
            System.out.println("Qual calculo desejas fazer?" +
                    "\n[1]Cubo [2]Paralelepipedo [3]Cilindro [4]Esfera [5]Cones [0]Parar");
            int esc = s.nextInt();

            switch (esc) {
                case 1:
                    System.out.println("Qual o comprimento da aresta?");
                    double aresta = s.nextDouble();

                    resultado = calccubo(aresta);
                    break;
                case 2:
                    System.out.println("Qual a largura?");
                    double l = s.nextDouble();
                    System.out.println("Qual o comprimento?");
                    double c = s.nextDouble();
                    System.out.println("Qual a altura?");
                    double a = s.nextDouble();

                    resultado = calcpara(l, c, a);
                    break;
                case 3:
                    System.out.println("Qual o raio?");
                    r = s.nextDouble();
                    System.out.println("Qual a altura?");
                    h = s.nextDouble();

                    resultado = calccili(r, h);
                    break;
                case 4:
                    System.out.println("Qual o raio?");
                    r = s.nextDouble();

                    resultado = calcesfe(r);
                    break;
                case 5:
                    System.out.println("Qual o raio da base?");
                    r = s.nextDouble();
                    System.out.println("Qual a altura?");
                    h = s.nextDouble();

                    resultado = calccone(r, h);
                    break;
                default:
                    b = false;
                    break;
            }
            System.out.println(resultado);
        }
        s.close();
    }

    private static double calccubo(double aresta) {
        return Math.pow(aresta, 3);
    }

    private static double calcpara(double l, double c, double a) {
        return l * c * a;
    }

    private static double calccili(double r, double h) {
        return Math.PI * Math.pow(r, 2) * h;
    }

    private static double calcesfe(double r) {
        return 4d / 3d * Math.PI * Math.pow(r, 3);
    }

    private static double calccone(double r, double h) {
        return 1d / 3d * Math.PI * Math.pow(r, 2) * h;
    }
}
