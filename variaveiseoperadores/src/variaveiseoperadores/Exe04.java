/*
 * LEIA QUATRO VALORES FLOAT (N1, N2, N3,N4).
 * A SEGUIR, CALCULE E MOSTRE A DIFERENÇA DO PRODUTO
 * ENTRE N1 E N2 PELO PRODUTO ENTRE O N3 E N4. 
*/

package variaveiseoperadores;

import java.util.Scanner;

public class Exe04 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// DESCOMENTE O FLOAT ABAIXO CASO QUEIRA TER VARIAVEIS FIXAS E COMENTE A ENTRADA DE DADOS
		
		//float n1 = 5.0f, n2 = 6.0f, n3 = 7.0f, n4 = 8.0f;
		
		//ENTRADA DE DADOS 
		
		System.out.println("Digite o primeiro valor:");
		float n1 = scanner.nextFloat();
		
		System.out.println("Digite o segundo valor:");
		float n2 = scanner.nextFloat();
		
		System.out.println("Digite o terceiro valor:");
		float n3 = scanner.nextFloat();
		
		System.out.println("Digite o terceiro valor");
		float n4 = scanner.nextFloat(); 
		
		// */ 
		
		//CALCULANDO A DIFERENÇA 
		
		float calculo = (n1 * n2) - (n3 * n4);
		
		System.out.printf("A diferença é: %.1f\n", calculo);
		
		scanner.close();
					
		}

}
//CODECAT