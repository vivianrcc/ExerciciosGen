/*
 * Escreva um algoritmo em Java, que leia a idade de várias pessoas
 * (números inteiros), via teclado e mostre na tela o total de pessoas 
 * cuja idade seja menor que 21 anos e o total de pessoas cuja idade 
 * seja maior que 50 anos. 
 * A leitura dos dados deve ser finalizada ao digitar uma idade negativa. 
 */
package lacos.de.repeticao;

import java.util.Scanner;

public class Lista02While {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int idade;
		int menores = 0;
		int maiores = 0;

		// ENTRADA DE DADOS E INICIO DO WHILE

		System.out.println("Digite uma idade:\nO programa se encerra se digitar um valor negativo");

		while (true) {
			idade = scanner.nextInt();

			if (idade <= 0) {
				break;
			}
			// CONTADOR
			if (idade < 21) {
				menores++;
			} else if (idade > 50) {
				maiores++;
			}

		}

		// SAIDA DE DADOS
		System.out.println("Total de pessoas menores que 21 anos: " + menores);
		System.out.println("Total de pessoas maiores que 50 anos: " + maiores);
		
		scanner.close();
		
	}

}

