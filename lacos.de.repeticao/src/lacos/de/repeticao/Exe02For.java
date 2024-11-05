/*
 * Escreva um algoritmo em Java, que leia 10 números inteiros via teclado 
 * e mostre na tela quantos números são pares e quantos números são ímpares.
 */
package lacos.de.repeticao;

import java.util.Scanner;

public class Exe02For {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int pares = 0;
		int impares = 0;
		
		// ENTRADA DE DADOS
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um número:");
			int num = scanner.nextInt();

			if (num % 2 == 0) {
				pares = pares + 1;
			} else {
				impares = impares + 1;

			}
		}

		// EXIBINDO A RESPOSTA

		System.out.println("\nNúmeros pares: " + pares);
		System.out.println("\nNúmeros impares: " + impares);

	}

}
