import java.util.Scanner;
import java.util.ArrayList;

public class Q9 {
    public static void main(String[] args){

        //Scannner em suma, sempre fora da repetição, pois não vai ficar gastando processamento atoa
        Scanner s = new Scanner(System.in);

        while (true) {
            // Array serve como se fosse uma caixa lógica que no modelo list, vai adicionando mais entradas(variable numeros, nesse caso)
            ArrayList<Integer> numeros = new ArrayList<>();
            
            // Prepara a variable booleana, para que por padrão passe 
            boolean querSair = false; 

            System.out.println("\n--- Nova rodada (Digite um número negativo para sair) ---");

            // O 'for' vai rodar 5 vezes (for é preferencial para repetição previsivel)
            for(int i = 0; i < 5; i++) {
                System.out.print("Digite o número " + (i+1) + ": ");
                int valorDigitado = s.nextInt(); 
                
                // Se for negativo, levantamos a bandeira e saímos do 'for'
                if(valorDigitado < 0) {
                    querSair = true; // Vai parar o for e depois que sair dessa chave, vai quebrar o while
                    break;
                }

                // Se o valor digitado não for negativo o for continua e guarda na Array com o '.add' na variable
                numeros.add(valorDigitado); 
            }

            // O 'while' verifica: a bandeira foi levantada lá no 'for'?
            if (querSair == true) {
                System.out.println("Saindo do programa...");
                break; // Agora sim, quebra o 'while' e o programa acaba!
            }
            System.out.println("Os números guardados foram: " + numeros);
            
            float soma = 0;

            // O for tem a capacidade de for-each, assim ele vai pegar cada um dentro, pela quantidade de 'numeros'
            for (int numeroAtual : numeros) {
                soma += numeroAtual;
                // Mesma coisa que soma = soma + numeroAtual
            }
            float media = soma / 5;

            System.out.println("A média calculada foi: " + media + " \nNúmeros maiores que a média: ");

            for (int numeroAtual : numeros) {
                if(numeroAtual > media) {
                    System.out.print(numeroAtual + " ");
                } 
            }
        }     
        //Em suma, close deve ficar aqui em todos os códigos, para fechar apenas quando necessário
        s.close();
    }
}     