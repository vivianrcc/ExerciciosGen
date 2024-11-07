/*
 * Escreva um programa Java para criar uma Collection ArrayList
 * de Objetos da Classe String. O programa deverá solicitar ao usuário,
 * que ele digite via teclado 5 cores e deverá adicioná-las individualmente
 * no ARRAYLIST. Em seguida, faça o que se pede:
 * Mostre na tela todas as cores que foram adicionadas. 
 * Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente.
 */
package collection;

import java.util.Collections;

import java.util.ArrayList;

import java.util.Scanner;

public class Exe01ArrayList {

	public static void main(String[] args) {

		// CRIANDO O ARRAYLIST E DEFININDO O 'T' TIPO + NOME
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<>();

		// ADICIONANDO AS CORES QUE O USUARIO DIGITAR NA LISTA

		for (int i = 0; i < 5; i++) {
			System.out.print("Digite a " + (i + 1) + "ª cor: ");
			String cor = scanner.nextLine();

			cores.add(cor);

		}

		System.out.println("\nAs cores adicionadas foram:");
		for (String cor : cores) {
			System.out.println(cor);
		}

		Collections.sort(cores);

		// SAIDAA CORES ORDENADAS

		System.out.println("\nAs cores em ordem crescente são:");
		for (String cor : cores) {
			System.out.println(cor);
		}

		scanner.close();
	}

}
