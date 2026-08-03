package idt06Lista2_Subprogramas.Lista3;

/* Refatore o código do exercício 4 da Lista2, de modo que o programa, além das funcionalidades originais, responda mais o seguinte:
- Se houve alguma tentativa do usuário em informar valor inválido para a quantidade de brinquedos (valor negativo ou zero).
- Sendo o caso, o programa deve informar qual inclusão foi uma tentativa inválida (1°, 2°, 3°,...,etc). */

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int totalInclusoes = 0;
        String tentativasInvalidas = "";

        boolean continuar = true;

        while (continuar == true) {
            System.out.println("Digite o nome da caixa ou tipo ('SAIR' para encerrar):");
            String nome = s.next();

            if (nome.equalsIgnoreCase("SAIR")) {
                continuar = false;
                break;
            }

            totalInclusoes++;

            System.out.println("Digite a quantidade de brinquedos:");
            int qtd = s.nextInt();

            if (qtd <= 0) {
                tentativasInvalidas += totalInclusoes + "º ";
                System.out.println("Quantidade inválida registrada na " + totalInclusoes + "ª inclusão!\n");
            } else {
                System.out.println("Caixa cadastrada com sucesso com " + qtd + " brinquedos.\n");
            }
        }

        System.out.println("\n--- RELATÓRIO DE INCLUSÕES ---");
        if (!tentativasInvalidas.isEmpty()) {
            System.out.println("Houve tentativas de valores inválidos!");
            System.out.println("Inclusões que foram tentativas inválidas: " + tentativasInvalidas);
        } else {
            System.out.println("Não houve nenhuma tentativa de inserção com valor inválido.");
        }

        s.close();
    }
}