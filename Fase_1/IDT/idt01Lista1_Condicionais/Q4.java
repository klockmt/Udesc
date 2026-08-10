package Fase_1.IDT.idt01Lista1_Condicionais;

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Informe sua idade: ");
        byte y = s.nextByte();
        String res = null;

        if(y < 16){
            res = "Não eleitor";
        }else
            if (y < 18 || y > 65) {
                res = "Eleitor facultativo";
            }else {
                res = "Eleitor obrigatório";
            }
            System.out.print(res);

        s.close();
    }
}
