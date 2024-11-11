/*
 * Escreva um programa Java para criar uma Collection Set 
 * de Objetos da Classe Wrapper Integer. O programa deverá solicitar ao usuário,
 *  que ele digite via teclado 10 valores inteiros não repetidos e 
 *  adicione-os individualmente na Collection Set. 
 *  Em seguida, faça o que se pede:Mostre na tela todos os elementos da 
 *  Collection Set, utilizando a Classe Iterator. 
 *  Na construção do Algoritmo, utilize os seguintes conteúdos:
  - Entrada e Saída de dados
  - Collection Set
  - Classe Iterator
 */
package collection;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Exe03CollectionSet {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// CRIANDO A COLLECTION SET DO TIPO INTEIRO "INTEGER"
		Set<Integer> numeroSet = new HashSet<Integer>();

		// ENTRADA DE DADOS
		System.out.println("Digite 10 números inteiros sem repetir: ");
		for (int i = 0; i < 10; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			int num = scanner.nextInt();

			// ADICIONANDO NÚMEROS AO COLLECTION SET
			if (numeroSet.add(num)) {
				System.out.println(num + " foi adicionada com sucesso.");
			} else {
				System.out.println(num + " já está no conjunto e não será adicionada novamente.");
				i--; // DECREMENTA CASO O NÚMERO SEJA INSERIDO 2 VZS GARANTINDO A ENTRADA DE 10
						// NUMEROS
			}
		}

		// EXIBINDO LISTA
		System.out.println("Lista de números:");
		for (Integer num : numeroSet) {
			System.out.println(num);
		}

		scanner.close();
	}
}