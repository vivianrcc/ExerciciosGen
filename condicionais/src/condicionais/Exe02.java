/*
 * ESCREVA UM ALGORITMO EM JAVA, QUE LEIA UM NUMERO E MOSTRE NA TELA UMA MENSAGEM INDICANDDO SE ESTE É PAR OU IMPAR
 * E SE É + OU - .
 * NA CONSTRUÇÃO DO ALGORITMO, UTILIZE OS SEGUINTES CONTEUDOS:
 * ENTRADA E SAIDA DE DADOS;
 * OPERADORES:
 * LAÇO CONDICIONAL "IF".
*/
package condicionais;

import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// ENTRADA DE DADOS
		System.out.println("Digite um número: Exemplo= 1, -2, 3");
		int num1 = scanner.nextInt();

		// VERIFICANDO SE É PAR OU ÍMPAR E + OU -
		if (num1 % 2 == 0 && num1 > 0) {
			System.out.println("O número " + num1 + " é par e positivo!");
		}
		if (num1 % 2 == 0 && num1 < 0) {
			System.out.println("O número " + num1 + " é par e negativo!");
		}
		if (num1 % 2 != 0 && num1 > 0) {
			System.out.println("O número " + num1 + " é ímpar e positivo!");
		}
		if (num1 % 2 != 0 && num1 < 0) {
			System.out.println("O número " + num1 + " é ímpar e negativo!");
		}
		if (num1 == 0) {
			System.out.println("O número " + num1 + " é zero!"); // SE DIGITAR "0"
		}

		// ENTRADA DO 2 NUMERO
		System.out.println("Digite um número: Exemplo= 1, -2, 3");
		int num2 = scanner.nextInt();

		if (num2 % 2 == 0 && num2 > 0) {
			System.out.println("O número " + num2 + " é par e positivo!");
		}
		if (num2 % 2 == 0 && num2 < 0) {
			System.out.println("O número " + num2 + " é par e negativo!");
		}
		if (num2 % 2 != 0 && num2 > 0) {
			System.out.println("O número " + num2 + " é ímpar e positivo!");
		}
		if (num2 % 2 != 0 && num2 < 0) {
			System.out.println("O número " + num2 + " é ímpar e negativo!");
		}
		if (num2 == 0) {
			System.out.println("O número " + num2 + " é zero!"); // CASO DIGITE ZERO
		}

		// ENTRADA DE DADOS
		System.out.println("Digite um número: Exemplo= 1, -2, 3");
		int num3 = scanner.nextInt();

		// VERIFICANDE SE E PAR OU IMPAR OU SE E - OU +

		if (num3 % 2 == 0 && num3 > 0) {
			System.out.println("O número " + num3 + " é par e positivo!");
		}
		if (num3 % 2 == 0 && num3 < 0) {
			System.out.println("O número " + num3 + " é par e negativo!");
		}
		if (num3 % 2 != 0 && num3 > 0) {
			System.out.println("O número " + num3 + " é ímpar e positivo!");
		}
		if (num3 % 2 != 0 && num3 < 0) {
			System.out.println("O número " + num3 + " é ímpar e negativo!");
		}
		if (num3 == 0) {
			System.out.println("O número " + num3 + " é zero!"); // CASODIGITE ZERO
		}

		// VERIFICANDO O 4
		System.out.println("Digite um número: Exemplo= 1, -2, 3");
		int num4 = scanner.nextInt();

		// VERIFICANDE SE E PAR OU IMPAR OU SE E - OU +

		if (num4 % 2 == 0 && num4 > 0) {
			System.out.println("O número " + num4 + " é par e positivo!");
		}
		if (num4 % 2 == 0 && num4 < 0) {
			System.out.println("O número " + num4 + " é par e negativo!");
		}
		if (num4 % 2 != 0 && num4 > 0) {
			System.out.println("O número " + num4 + " é ímpar e positivo!");
		}
		if (num4 % 2 != 0 && num4 < 0) {
			System.out.println("O número " + num4 + " é ímpar e negativo!");
		}
		if (num4 == 0) {
			System.out.println("O número " + num4 + " é zero!"); // CASO DIGITE 0
		}

		scanner.close();
	}
}
//CATCODE nunca fiz tanto if na vida ........