package idt02Lista2_Condicionais;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.println("Me diga sua idade!");
        System.out.print("Em dias: ");
        int idadeD = s.nextInt();

        int resA = idadeD / 365;
        int resM = (idadeD % 365) / 30;
        int resD = (idadeD % 365) % 30;

        System.out.println("Você tem aproximadamente " + resA + " anos,\n" + resM + " meses e " + resD + " dias");
        s.close();
    }
}
