package idt07Lista1_Vetores;

/*2.	Declare um vetor de inteiros de 10 posições e o preencha automaticamente com os 10 primeiros números impares e o imprima.
 */

public class q2 {
    public static void main(String[] args) {

        int[] vetor = new int[10];
        int n = 1;

        for (int i = 0; i < 10; i++) {

            vetor[i] = n;
            n = n + 2;
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
