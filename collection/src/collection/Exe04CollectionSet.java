/*
 * Escreva um programa Java para criar uma Collection Set de Objetos 
 * da Classe Wrapper Integer, inicializada com 10 valores inteiros. 
 * O programa deverá solicitar ao usuário, que ele digite via teclado 
 * 1 número inteiro e caso ele seja encontrado no Set, exiba na tela 
 * a mensagem: Número 00 Encontrado! Caso o número não seja encontrado, 
 * ele deverá exibir na tela a mensagem: O número NN não foi encontrado!
 * Na construção do Algoritmo, utilize os seguintes conteúdos:
 - Entrada e Saída de dados
 - Laços Condicionais
 - Laços de Repetição
 - Collection Set
 */
package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Exe04CollectionSet {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// CRIANDO A COLLECTION SET DO TIPO INTEGER
		Set<Integer> valores = new HashSet<Integer>();

		valores.add(1);
		valores.add(2);
		valores.add(3);
		valores.add(4);
		valores.add(5);
		valores.add(6);
		valores.add(7);
		valores.add(8);
		valores.add(9);
		valores.add(10);

		// ENTRADA DE DADOS

		System.out.println("Digite um número: ");
		int numBuscado = scanner.nextInt();

		// VERIFICANDO SE O NÚMERO ESTÁ NO SET
		if (valores.contains(numBuscado)) {
			System.out.println("O número " + numBuscado + " foi Encontrado!");
		} else {
			System.out.println("O número " + numBuscado + " não foi encontrado!");
		}

		scanner.close();

	}

}
