package Lista2_Repetição;

import java.util.Scanner;

public class bonus {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        boolean divisivel = true;
        String bin = "";

        System.out.println("Qual o número que você quer em binario?");
        int n = s.nextInt();

        while (divisivel = true) {
            bin = (n % 2) + bin; 
            

            if (n / 2 == 1){
                divisivel = false;
                break;
            } else
                if (n == 1) {
                    break;
                }
            n = n / 2;
        }
        System.out.println(bin);
    }
}
