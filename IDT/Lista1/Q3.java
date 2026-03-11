import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Informe seu saldo médio: ");
        double saldo = s.nextDouble();
        String res = "O seu crédito é de: ";
        double cred = 0;
        if (saldo <= 500) {
            res = "Nenhum crédito ";
        }else 
            if (saldo <= 1000) {
            cred = saldo * 0.3;
        }else 
            if (saldo <= 3000) {
            cred = saldo * 0.4;
        }else {
            cred = saldo * 0.5;
        }
        System.out.print(res + cred);
        s.close();
    }
}
