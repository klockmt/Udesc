package Fase_1.IDT;
import java.util.Scanner;

public class template {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        s.close();
    }

    public static int lerEntrada(Scanner s) {

        System.out.print("valor = ");
        int valor = s.nextInt();

        return valor;
    }

}
