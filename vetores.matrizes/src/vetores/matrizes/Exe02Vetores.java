/*
 *Elabore um algoritmo que leia 10 números inteiros e armazene em um vetor. 
 *Em seguida, mostre na tela:
 *Todos os elementos dos índices ímpares do vetor 
 *Todos os elementos do vetor que são números pares
 *A Soma de todos os elementos do vetor
 *A Média de todos os elementos do vetor, armazenada em uma variável do tipo real. 
 */
package vetores.matrizes;

import java.util.Scanner;

public class Exe02Vetores {

	public static void main(String[] args) {

		int[] vetorInteiros = new int[10];
		Scanner scanner = new Scanner(System.in);
		int soma = 0;
		double media;

		// ENTRADA DE DADOS
		for (int indice = 0; indice < 10; indice++) {
			System.out.println("Digite o " + (indice + 1) + "º Número: ");
			vetorInteiros[indice] = scanner.nextInt();
			soma += vetorInteiros[indice];
		}

		// IMPRIMINDOS PARES
		System.out.println("Total números ímpares:");
		for (int indice = 1; indice < 10; indice += 2) {
			System.out.println(vetorInteiros[indice]);
		}

		// SAIDA NUMEROS PARES
		System.out.println("Números pares:");
		for (int indice = 0; indice < 10; indice++) {
			if (vetorInteiros[indice] % 2 == 0) {
				System.out.println(vetorInteiros[indice]);
			}
		}

		// CALCULANDO A MEDIA
		media = (double) soma / vetorInteiros.length;
		System.out.println("A Soma de todos os números do vetor é: " + soma);
		System.out.printf("A Média de todos os números do vetor é: %.2f%n", media);

		scanner.close();
	}
}