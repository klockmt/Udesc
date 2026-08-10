package Fase_1.IDT.idt05Lista1_Subprogramas;

import java.util.Scanner;

/*Escreva uma função que recebe as 3 notas de um aluno por parâmetro e uma letra e retorna a media de um aluno.
Se a letra for A a função calcula a média aritmética das notas do aluno, se for P, a sua média ponderada (pesos: 5, 3 e 2).  */

public class Q2prog {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        boolean b = true;

        while(b == true){
            
            System.out.println("\n Qual a nota1 do aluno?");
            double n1 = s.nextDouble();
            
            System.out.println("Qual a nota1 do aluno?");
            double n2 = s.nextDouble();
            
            System.out.println("Qual a nota1 do aluno?");
            double n3 = s.nextDouble();
            
            System.out.println("Qual a letra parametro?");
            String p = s.next();
        
        double resultado = calculo(n1, n2, n3, p);

        System.out.print("A média é: " + resultado);
        }
        s.close();
    }
    public static double calculo(double n1, double n2, double n3, String p){
        if(p.equalsIgnoreCase("a")){
            return (n1+n2+n3)/3;
    }
        else
            if (p.equalsIgnoreCase("p")) 
                {
        return (n1*0.5) + (n2*0.3) + (n1*0.2); 
    }

        return 0;
    }



}
