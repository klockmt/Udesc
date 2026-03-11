import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Informe Seu Prato");
        System.out.println("\n1 - Vegetariano\n2 – Peixe\n3 – Frango\n4 – Carne");
        int pr = s.nextInt();

        if(pr == 1) {
            pr = 180; 
        }if (pr == 2) {
            pr = 230;
        }if (pr == 3) {
            pr = 250;
        }if (pr == 4) {
            pr = 350;
        }

        System.out.print("\nInforme Sua Sobremesa");
        System.out.println("\n1 – Abacaxi\n2 – Sorvete diet\n3 – Mouse diet\n4 – Mouse chocolate");
        int sb = s.nextInt();

        if(sb == 1) {
            sb = 75; 
        }if (sb == 2) {
            sb = 110;
        }if (sb == 3) {
            sb = 170;
        }if (sb == 4) {
            sb = 200;
        }

        System.out.print("\nInforme Sua Bebida");
        System.out.println("\n1 – Chá\n2 - Suco de laranja\n3 – Suco de melão\n4 – Refrigerante diet");
        byte dk = s.nextByte();

        if(dk == 1) {
            dk = 20; 
        }if (dk == 2) {
            dk = 70;
        }if (dk == 3) {
            dk = 100;
        }if (dk == 4) {
            dk = 75;
        }
        
        int res = pr + sb + dk;

        System.out.print("\nRefeição totalizando " + res + " kcal");

        s.close();
    }
}