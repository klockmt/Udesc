package Lista2_Condicionais;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        float n1 = 0;
        float n2 = 0;
        float n3 = 0;

        float peso1 = 0;
        float peso2 = 0;
        float peso3 = 0;

        float media = 0;

        System.out.print("Digite a nota 1: ");
        n1 = s.nextFloat();
        System.out.print("Digite a nota 2: ");
        n2 = s.nextFloat();
        System.out.print("Digite a nota 3: ");
        n3 = s.nextFloat();

        System.out.println("Desejas média ponderada(Digite S)?");
        char boleano = Character.toUpperCase(s.next().charAt(0)); //n existe nextChat, deve usar charat(caracter no lugar x); o to upper case é obvio.

        if(boleano != 'S') {

            media = (n1 + n2 + n3)/3;
            System.out.print("A média é: " + media);

        } else {

            System.out.print("Digite o peso 1(em decimal): ");
            peso1 = s.nextFloat();
            System.out.print("Digite o peso 2(em decimal): ");
            peso2 = s.nextFloat();
            System.out.print("Digite o peso 3(em decimal): ");
            peso3 = s.nextFloat();

            peso1 *= n1; 
            peso2 *= n2; 
            peso3 *= n3;
            
            media = (peso1 + peso2 + peso3);

            System.out.println("A média é: " + media);

        }
        s.close();
}}
