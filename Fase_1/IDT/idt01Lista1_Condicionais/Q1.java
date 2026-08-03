package idt01Lista1_Condicionais;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.print("Informe o valor: ");
        int v1 = s.nextInt();

        int rd10 = v1 % 10;
        int rd5 = v1 % 5;
        int rd2 = v1 % 2;
        String ava = null;

        if(rd10 == 0 && rd5 == 0 && rd2 == 0){
            ava = "Seu valor é divisível por 10, 5 e 2.";
        }else
            if (rd10 == 0 && rd5 == 0) {
                ava = "Seu valor é divisível por 10 e 5.";
            }else
                if (rd10 == 0 && rd2 == 0) {
                    ava = "Seu valor é divisível por 10 e 2.";
                }else
                    if (rd5 == 0 && rd2 == 0) {
                        ava = "Seu valor é divisível por 5 e 2.";
                    }else
                        if (rd5 == 0) {
                            ava = "Seu valor é divisível por 5.";
                        }else 
                            if (rd2 == 0) {
                            ava = "Seu valor é divisível por 2.";
                        }else
                            ava = "Seu valor é indivisível";

                            System.out.println(ava);
    s.close();
}}