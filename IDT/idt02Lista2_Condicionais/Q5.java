package idt02Lista2_Condicionais;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    boolean b = true;
        while (b == true) {
            System.out.print("Digite o valor 1: ");
            int v1 = s.nextInt();
            System.out.print("Digite o valor 2: ");
            int v2 = s.nextInt();
            System.out.print("Digite o valor 3: ");
            int v3 = s.nextInt();

            int maior = v1;
            int medio = v2;
            int menor = v3;

            System.out.println("Queres em ordem crescente[1] ou decrescente[2]?\nOutro valor para parar o programa!");
            byte esc = s.nextByte();
            
            if (v1 >= v3 && v3 >= v2) {
                medio = v3;
                menor = v2;
            }else
                if (v3 >= v2 && v2 >= v1) {
                    maior = v3;
                    menor = v1;
                } else
                    if (v2 >= v3 && v3 >= v1) {
                        maior = v2;
                        medio = v3;
                        menor = v1;
                    } else
                        if (v2 >= v1 && v1 >= v3) {
                            maior = v2;
                            medio = v1;
                            menor = v3;
                        } else
                            if (v3 >= v1 && v1 >= v2) {
                                maior = v3;
                                medio = v1;
                                menor = v2;
                            } else {
                        //v1 >= v2 && v2 >= v3
                    }

            if (esc == 1) {
                System.out.println(menor + " " + medio + " " + maior );
            }else
                if (esc == 2) {
                    System.out.println(maior + " " + medio + " " + menor);
                }else {
                    b = false;
                }        
            }
    s.close();       
}}
