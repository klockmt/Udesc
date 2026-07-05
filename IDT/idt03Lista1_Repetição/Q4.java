package Lista1_Repetição;
import java.util.Scanner;
import java.util.ArrayList;

//    4. Elabore um programa que leia 10 valores inteiros e positivos e:   
//a) encontre o maior valor; 
//b) encontre o menor valor; 
//c) calcule a média dos números lidos.

public class Q4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        ArrayList<Float> numeros = new ArrayList<>();

        boolean b = true;
        float soma = 0;
        int i = 0;
        while(b == true){
        for (i = 1; i <= 10; i++){
                System.out.println("\nDigite o valor " + i + " só aceito positivos e inteiros!");
                float valor = s.nextFloat();
                numeros.add(valor);
                if (valor < 0 || valor % 1 != 0) {
                    b = false;
                    break;
                } 
                if (b == false) {
                    break;
                }
            }
            i--;
            float maior = numeros.get(0);
            float menor = numeros.get(0);
            for (Float natual : numeros) {
                if (natual > maior) {
                    maior = natual;
                } else
                    if (natual < menor) {
                        menor = natual;
                    }
                    soma += natual;
            }  System.out.println("O maior valor foi: " + maior + "\nO menor foi: " + menor + "\nA média foi: " + soma/i);
        }
        s.close();;
    }
}

