package Lista1_Subprogramas;

/*Faça uma função que recebe por parâmetro um valor inteiro e positivo e retorna o valor lógico V caso o valor seja primo e F em caso contrário.  */

import java.util.Scanner;

public class Q3prog {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            while (true) {
                
        System.out.println("Qual o valor? ");
        int n = s.nextInt();

        String resultado = processo(n);

        System.out.println("Resultado = " + resultado);

    }
}
    public static String processo(int n){

        boolean b = false;
        int i = 2;

        if (n == 1) {
            return "F";
        }else
        if (n == 2) {
            return "V";
        } else
            while (b == false && i <= Math.sqrt(n)){
            if (n % i == 0) {
                return "F";
            }else{
                i++;
            }
        }
        return "V";
    }
}
