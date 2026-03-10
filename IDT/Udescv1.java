
import java.util.Scanner;

public class Udescv1 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

            System.out.println("Informe o valor 1");
                int v1 = s.nextInt();
        
            System.out.println("Informe o valor 2");
                int v2 = s.nextInt();

            System.out.println("Informe a sua opção [1]Soma [2]Mult.");
                int opcao = s.nextInt();

            int res = 0;
            if(opcao == 1 || opcao == 2){

            if (opcao == 1) {
                res = v1 + v2;
            }
            if (opcao == 2) {
                res = v1 * v2; 
            }
            System.out.println("O resultado é:" + res);
            
        } else 
        

        System.out.println("Erro");
        
        s.close();
    }
}
