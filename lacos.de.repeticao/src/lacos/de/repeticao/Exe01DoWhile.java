/*Escreva um algoritmo em Java, que leia números inteiros via teclado,
 *  até que o número zero seja digitado. 
 *  Ao final,mostre na tela a soma de todos os números digitados, que sejam positivos.
 *  */
package lacos.de.repeticao;

import java.util.Scanner;

public class Exe01DoWhile {
	
	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        int somaPositivos = 0; 

        System.out.println("Digite números inteiros (digite 0 para encerrar):");
        
        //INICIANDO O DO-WHILE
        do {
            numero = scanner.nextInt(); 

            if (numero > 0) { 
                somaPositivos += numero; 
            }
        } while (numero != 0); 

        // SAIDA DE DADOS (SOMA)
        System.out.println("A soma dos números + digitados é: " + somaPositivos);

        scanner.close(); 
    }
}

