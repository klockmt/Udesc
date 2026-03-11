import java.util.Scanner;

public class Q10 {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        while (true) {

            System.out.println("\nQuantos Kg de peixe foram pescados?");
            double peso = s.nextDouble();

            if (peso <= 0) {
            break;
            }
            double form = peso - 400;

            if (form > 400) {
            System.out.print("Você excedeu em " + form + "Kg \nE deve pagar: " + form*4 + " reais");

            }else {
            System.out.print("Tá tudo certo meu chapa");
            }
        }
        s.close();
    }
}     