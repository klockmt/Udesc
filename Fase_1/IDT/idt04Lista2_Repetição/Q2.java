package Fase_1.IDT.idt04Lista2_Repetição;


import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int somaNaoPrimos = 0;
        int somaPrimos = 0;
        int maiorPrimo = -1;
        int menorNaoPrimo = Integer.MAX_VALUE; //maior valor possivel
        boolean temPrimo = false;
        boolean temNaoPrimo = false;
        
        int i = 1;
        
        while (i <= 10) {
            System.out.println("\nDigite o valor " + i + " (só aceito positivos e inteiros!):");
            
            if (s.hasNextInt()) {
                int valor = s.nextInt();
                
                if (valor > 0) {
                    boolean primo = true;
                    
                    if (valor == 1) {
                        primo = false;
                    } else {
                        for (int d = 2; d * d <= valor; d++) {
                            if (valor % d == 0) {
                                primo = false;
                                break;
                            }
                        }
                    }
                    
                    if (primo) {
                        somaPrimos += valor;
                        if (!temPrimo || valor > maiorPrimo) {
                            maiorPrimo = valor;
                            temPrimo = true;
                        }
                    } else {
                        somaNaoPrimos += valor;
                        if (!temNaoPrimo || valor < menorNaoPrimo) {
                            menorNaoPrimo = valor;
                            temNaoPrimo = true;
                        }
                    }
                    i++;
                } else {
                    System.out.println("Valor inválido! Digite um número positivo.");
                }
            } else {
                System.out.println("Valor inválido! Digite um número inteiro.");
                s.next(); 
            }
        }
        
        System.out.println("\na) O somatório dos números não primos informados: " + somaNaoPrimos);
        System.out.println("b) O somatório dos números primos informados: " + somaPrimos);
        
        if (temPrimo) {
            System.out.println("c) Dentre os números primos, o maior: " + maiorPrimo);
        } else {
            System.out.println("c) Dentre os números primos, o maior: Nenhum primo foi informado.");
        }
        
        if (temNaoPrimo) {
            System.out.println("d) Dentre os números não primos, o menor: " + menorNaoPrimo);
        } else {
            System.out.println("d) Dentre os números não primos, o menor: Nenhum não primo foi informado.");
        }
        
        s.close();
    }
}