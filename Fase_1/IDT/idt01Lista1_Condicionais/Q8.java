package idt01Lista1_Condicionais;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);

        float n1 = 0;
        float n2 = 0;
        float n3 = 0;
        float n4 = 0;

        while (true) {
            System.out.println("\nDigite -1 para sair!\n ");
            System.out.print("Digite a nota 1: ");
            n1 = s.nextFloat();
            System.out.print("Digite a nota 2: ");
            n2 = s.nextFloat();
            System.out.print("Digite a nota 3: ");
            n3 = s.nextFloat();
            System.out.print("Digite a nota 4: ");
            n4 = s.nextFloat();
            
            if(n1 == -1 || n2 == -1 || n3 == -1 || n4 == -1) {
                break;
            }

            float media = (n1 + n2 + n3 + n4) /4;
            String res = null;

            if(media >= 7) {
                res = "Aluno aprovado\nMédia: ";
            }else {
                System.out.print("Aluno reprovado\\nMédia: " + media + "\nDigite a nota do exame: ");
                float n5 = s.nextFloat();

                media = (n1 + n2 + n3 + n4 + n5) / 5;

                if(media >= 5) {
                    res = "Aluno aprovado\nMédia: ";
                }else {
                    res = "Aluno reprovado\nMédia: ";
                }
            }
            System.out.print(res + media);
            s.close();
        }
    }
}
