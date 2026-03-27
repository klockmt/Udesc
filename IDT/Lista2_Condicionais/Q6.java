package Lista2_Condicionais;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

        while (true) {
        System.out.print("Digite o valor do cateto adjacente:");
        float v1 = s.nextFloat();

        System.out.print("Digite o valor do cateto oposto:");
        float v2 = s.nextFloat();

        System.out.print("Digite o valor da hipotenusa:");
        float v3 = s.nextFloat();

        double calc = (v1 * v1) + (v2 * v2) - (v3 * v3);

        if (calc == 0) {
            System.out.println("Você tem um triângulo retângulo");
        } else 
            System.out.println("Não é um triângulo retângulo");

        if (v1 == 0) {
            break;
        }
        } s.close();
    }
}
