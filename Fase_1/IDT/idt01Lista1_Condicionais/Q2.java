package Fase_1.IDT.idt01Lista1_Condicionais;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Informe seu peso: ");
        int peso = s.nextInt();

        System.out.print("Informe sua altura(metros): ");
        double alt = s.nextDouble();

//imc = peso/altura²
        double imc = peso /  Math.pow(alt, 2);
        String res = null;
        res = "Abaixo do Peso";
        if (imc <= 20) {
    }else
        if (imc <= 25) {
                res = "Peso Ideal";
            }else 
                if (imc <= 30) {
                res = "Acima do Peso";
            }else 
                if (imc <= 40) {
                 res = "Obeso";
            }else {
                res = "Obesidade Mórbida";
            }
            System.out.println(res);
            s.close();
}}