/*
 * Escreva um algoritmo em Java, que leia 2 números inteiros via teclado, 
 * onde o primeiro número deve ser menor do que o segundo número. 
 * Caso contrário, deve ser exibida uma mensagem na tela informando que o intervalo é inválido 
 * e sair do programa. 
 * No intervalo informado, mostre na tela todes os números que são múltiplos de 3 e 5. 
 */
package lacos.de.repeticao;

import java.util.Scanner;

public class Exe01For {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        
        // ENTRADA DE DADOS
        System.out.print("Digite o número 1: ");
        num1 = scanner.nextInt();
        
        System.out.print("Digite o número 2: ");
        num2 = scanner.nextInt();
        
        // VERIFICANDO SE NUM1 E MENOR QUE NUM2
        if (num1 > num2) {
            System.out.println("Intervalo inválido! O primeiro número deve ser menor que o segundo.");
            scanner.close();
            return; 
        }

        System.out.println("Números múltiplos de 3 e 5 entre " + num1 + " e " + num2 + ":");
        
        // INICIO DO LOO´P FOR 
        for (int i = num1; i <= num2; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
        
        scanner.close();
    }
}
	
