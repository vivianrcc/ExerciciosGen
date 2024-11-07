/*
 * Dado um vetor contendo 10 números inteiros não ordenados 
 * e não repetidos, construa um algoritmo que consiga pesquisar
 * dados no vetor, onde o usuário irá digitar um número 
 * e o programa deve exibir na tela a posição deste número no vetor.
 * Caso o número não seja encontrado, 
 * a mensagem: “Não foi encontrado!” deve ser exibida na tela.
 * Na construção do Algoritmo, utilize os seguintes conteúdos:
 * -Saída de dados
 * -Laços Condicionais
 * -Laços de Repetição
 * -Vetores
 */
package vetores.matrizes;

import java.util.Scanner;

public class Exe01Vetores {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// CRIANDO O VETOR

		int vetorInt[] = { 1, 2, 30, 50, 60, 40, 55, 34, 70, 656 };
		int posicao = -1;

		// ENTRADA DE DADOS
		System.out.println("Digite o número inteiro que deseja encontrar: ");
		int num = scanner.nextInt();

		for (int indice = 0; indice < vetorInt.length; indice++) {
			if (vetorInt[indice] == num) {
				posicao = indice;
				break;
			}

		}

		// SAIDA DE DADOS
		if (posicao >= 0) {
			System.out.println("O elemento foi encontrado e está na posição: " + posicao);
		} else {
			System.out.println("Elemento não encontrado!");
		}

		scanner.close();
	}
}
