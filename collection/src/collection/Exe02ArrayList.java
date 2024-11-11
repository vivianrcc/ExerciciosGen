/*
 * Escreva um programa Java para criar uma Collection ArrayList 
 * de Objetos da Classe Wrapper Integer, inicializada com 10 valores inteiros. 
 * O programa deverá solicitar ao usuário, que ele digite via teclado 
 * 1 número inteiro e caso ele seja encontrado no ArrayList, exiba na tela 
 * a posição deste número na Collection. Caso o número não seja encontrado, 
 * ele deverá exibir na tela a mensagem: O número NN não foi encontrado!
 */
package collection;

import java.util.ArrayList;

import java.util.Scanner;

public class Exe02ArrayList {
	
	public static void main(String[] args) {
		
		//CRIANDO A COLLECTION ARRAYLIST DO TIPO INTEIRO
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		numeros.add(6);
		numeros.add(7);
		numeros.add(8);
		numeros.add(9);
		numeros.add(0);
		
		//ENTRADA DE DADOS
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int numeroBuscado = scanner.nextInt();
		
		//VERIFICANDO A POSIÇÃO
		int posicao = numeros.indexOf(numeroBuscado);
        
        if (posicao != -1) {
            System.out.println("O número inserido " + numeroBuscado + " foi localizado na posição: " + posicao);
        } else {
            System.out.println("O número inserido " + numeroBuscado + " não foi encontrado!");
        }

        scanner.close();
	}

}
