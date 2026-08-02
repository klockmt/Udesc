package idt08Lista2_Vetores;

/* VAMOS REFATORAR O EXERCÍCIO 2 DA LISTA 1.
Declare um vetor de inteiros de 10 posições e o preencha automaticamente com os 10 primeiros números ímpares e o escreva. 
Para cada número inserido no vetor deve ser impresso seu equivalente binário. */

public class q1 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int n = 1;

        for (int i = 0; i < 10; i++) {
            vetor[i] = n;
            n = n + 2;
        }

        System.out.println("Vetor de ímpares e seus equivalentes em binário:");
        for (int i = 0; i < 10; i++) {
            String binario = converterParaBinario(vetor[i]);
            System.out.println("Vetor[" + i + "] = " + vetor[i] + " -> Binário: " + binario);
        }
    }

    public static String converterParaBinario(int numero) {
        if (numero == 0) return "0";
        
        String binario = "";
        int aux = numero;
        
        while (aux > 0) {
            binario = (aux % 2) + binario;
            aux /= 2;
        }
        
        return binario;
    }
}