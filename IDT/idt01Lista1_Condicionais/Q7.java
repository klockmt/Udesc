import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        while (true) {
            
        System.out.print("Qual o seu número inteiro(0 para sair)? ");
        long num = s.nextLong();

        if (num == 0) {
                break;
            }

        String res = null;

        if(num % 2 == 0) {
            res = "É par";
        } else {
            res = "É ímpar";
        }
        System.out.print(res + "\n");
        }
        s.close();
    }
}