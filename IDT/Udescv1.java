
import java.util.Scanner;

public class Udescv1 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

            System.out.println("Modo Limitado de 0 a 100, tecle [1]");
            System.out.println("Modo Ilimitado, tecle [2]");
                int esc = s.nextByte();

                if(esc == 1 || esc == 2){

            System.out.println("Informe o valor 1");
                int v1 = s.nextInt();
        
            System.out.println("Informe o valor 2");
                int v2 = s.nextInt();

            System.out.println("Informe a sua opção [1]Soma [2]Mult.");
                int opcao = s.nextInt();
                
                int res = 0;

                if (esc == 1 && v1 >= 0 && v1 <= 100 && opcao == 1 || opcao == 2) {
                    
                    if (opcao == 1) {
                    res = v1 + v2;
                    }

                    else {
                    res = v1 * v2; 
                    }

            System.out.println("O resultado é:" + res);

                } else
                    if (esc == 2 && opcao == 1 || opcao == 2) {
                    
                        if (opcao == 1) {
                        res = v1 + v2;
                        }

                        else {
                        res = v1 * v2; 
                        }

                System.out.println("O resultado é:" + res);

                    } else {
                    System.out.println("Você cometeu um erro");
                }

             } else {
                    System.out.println("Modo não identificado");
                }

        s.close();
    }
}
