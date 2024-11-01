/*
 * Faça um algoritmo em Java que leia 3 valores inteiros A, B e C 
 * e imprima na tela se a soma de A + B é maior, menor ou igual a C.
 * Na construção do Algoritmo, utilize os seguintes conteúdos:
 * Entrada e Saída de dados ,Operadores e Laço Condicional IF.
 */
package condicionais;

import java.util.Scanner; //IMPORT BIBLIOTECA SCANNER

public class Exe01 {
	
	public static void main(String[] args)	{
		
		Scanner scanner = new Scanner(System.in);
		
		int a, b, c, soma;
		
		//ENTRADA DE DADOS
		
		System.out.println("Digite o número A: ");
		a = scanner.nextInt();
		
		System.out.println("Digite o número B: ");
		b = scanner.nextInt();
		
		System.out.println("Digite o número C: ");
		c = scanner.nextInt();
		
		//SOMANDO OS DOIS PRIMEIROS NUMEROS
		
		soma = (a + b);
		
		//INICIANDO O LAÇO CONDICIONAL IF
		
		if(soma > c) {
			System.out.println("A Soma de A + B é Maior do que C");
		}
		
		if(soma < c) {
			System.out.println("A Soma de A + B é Menor do que C");
		}
		
		if(soma == c) {
			System.out.println("A Soma de A + B é igual do que C");
		}
		
		scanner.close();		
	}
}
