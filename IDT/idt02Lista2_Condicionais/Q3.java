package Lista2_Condicionais;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.println("Me diga sua idade!");
        System.out.print("Quantos anos: ");
        byte idadeA = s.nextByte();

        System.out.print("\nQuantos meses: ");
        byte idadeM = s.nextByte();

        System.out.print("\nQuantos dias: ");
        byte idadeD = s.nextByte();

        int res = (idadeA*365) + (idadeM*30) + idadeD;

        System.out.println("Você tem aproximadamente " + res + " dias vividos");
        s.close();
    }
}