/*    3. Um comerciante deseja fazer o levantamento do lucro das mercadorias que ele comercializa.
Fazer um programa que determine e escreva quantas mercadorias proporcionam:
    a) lucro < 10%
    b) 10% <= lucro <= 20%
    c) lucro > 20%

Ao final, determine e escreva o valor total de compra e de venda de todas as mercadorias, assim como o lucro total.
Este programa deverá calcular o lucro das mercadorias até o momento em que o usuário resolver terminar o programa (nome da mercadoria = “X”). */
import java.util.Scanner;

public class Q3w {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            boolean b = true;

            float valorcomp = 0;
            float valorvend = 0;

            int lucromenor10 = 0;
            int lucro1020 = 0;
            int lucromaior20 = 0;

            while(b == true) {
                
            System.out.print("Qual a mercadoria? \n ('X' para terminar)\n "); 
            String veri = s.next();

                if (veri == "X") {
                    b = false;
                    break;
                }

            System.out.print("Qual o valor de compra? ");
            valorcomp = s.nextFloat();
            
            System.out.print("Qual o valor de venda? ");
            valorvend = s.nextFloat();

                float lucro = ((valorvend/valorcomp)*100)-100; 

                if (lucro < 10) {
                    lucromenor10++;
                } else
                    if (lucro <= 10 && lucro >= 20) {
                        lucro1020++;
                    } else {
                        lucromaior20++;
                    }

                    System.out.print("Mercadorias com lucro menor que 10%: ");
                    System.out.print("Mercadorias com lucro menor que igual 10%: ");
                    System.out.print("Mercadorias com lucro menor que 10%: ");


            }
            s.close();
    }
}
