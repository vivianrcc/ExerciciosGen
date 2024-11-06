/*
Escreva um algoritmo em Java, que leia números inteiros via teclado, 
até que o número zero seja digitado. 
Ao final, mostre na tela a média de todos os números digitados, 
que sejam múltiplos de 3.
*/
package lacos.de.repeticao;

import java.util.Scanner;

public class Lista03Exe02DoWhile {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int num;
		float soma = 0;
		int contador = 0;

		// ENTRADA DE DADOS
		System.out.println("Digite números inteiros (digite 0 para encerrar):");

		// INICIANDO O DO-WHILE
		do {
			num = scanner.nextInt();

			if (num > 0 && num % 3 == 0) {
				soma += num;
				contador++;
			}
		} while (num != 0);

		// CÁLCULO DA MÉDIA
		if (contador > 0) {
			float media = soma / contador;
			System.out.println("A média dos números múltiplos de 3 digitados é: " + media);
		} else {
			System.out.println("Nenhum número múltiplo de 3 foi digitado.");
		}

		scanner.close();
	}
}
