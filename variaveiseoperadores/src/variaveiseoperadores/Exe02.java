/*
 * ELABORE UM ALGORITMO EM JAVA QUE LEIA 4 NOTAS DE UM PARTICIPANTE
 * EM VARIAVEIS DO TIPO (FLOAT) E EXIBA NA TELA A MÉDIA FINAL DO MESMO.
 */
package variaveiseoperadores;

import	java.util.Scanner;

public class Exe02 {
	
	public static void main(String[] args) {
		
		Scanner	scanner = new Scanner(System.in);  
		
		//COMETAR A ENTRADA DE DADOS SE PREFERIR USAR Do FLOAT AQUI EMBAIXO. 
		
		//float nota1b = 10.0f, nota2b = 8.0f, nota3b = 7.0f, nota4b = 7.5f; 
		
		//ENTRADA DE DADOS
		
		System.out.print("Digite a nota do 1 Bimestre: ");
		float nota1b = scanner.nextFloat();
		
		System.out.print("Digite a nota do 2 bimestre: ");
		float nota2b = scanner.nextFloat();
		
		System.out.print("Digite a nota do 3 bimestre: ");
		float nota3b = scanner.nextFloat();
		
		System.out.print("Digite a nota do 4 bimestre: ");
		float nota4b = scanner.nextFloat();
		
		// */ 
		
		//CALCULANDO A MEDIA DO ALUNO 
		
		float notafinal = (nota1b + nota2b + nota3b + nota4b )/ 4f;
		
		System.out.printf("Sua nota final é: %.1f \n", notafinal);
		
		scanner.close();
		
	}

}

//NA ENTRADA DE DADOS DEPENDENDO DO IDE PODE PEDIR QUE INSIRA A NOTA COM "," COMO NO PADRÃO DO BRASIL 