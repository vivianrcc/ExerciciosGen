/*Escreva um algoritmo em Java que leia o 
 *Nome do Colaborador (String), o Código do Cargo do Colaborador 
 *(número inteiro de 1 a 6) e o Salário (número float). 
 *A seguir, mostre na tela o Nome do Colaborador, o Cargo e o novo Salário reajustado.
 */
package condicionais;

import java.util.Scanner;

public class Exe06Switch {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int codigoCargo;
		double  salarioAtual, reajuste, novoSalario;
	
		//ENTRADA DE DADOS 
		System.out.println("DIGITE SEU NOME:");
		String nome = scanner.nextLine();
	
		System.out.println("ESCOLHA SER CARGO: (1-6)\n"
			+ "1.GERENTE \n"
			+ "2.VENDEDOR \n"
			+ "3.SUPERVISOR \n"
			+ "4.MOTORISTA \n"
			+ "5.ESTOQUISTA \n"
			+ "6.TECNICO DE TI");
	
		codigoCargo = scanner.nextInt();
	
		//COMEÇANDO OS SWITCH 
		switch (codigoCargo) {
		
			case 1:
				System.out.println("CARGO: GERENTE");
				reajuste = 0.10;//REAJUSTE DE 10%
				break;
    	
			case 2:
				System.out.println("CARGO: VENDEDOR");
				reajuste = 0.7;//7% DE REAJUSTE 
				break;
			
			case 3:
				System.out.println("CARGO: SUPERVISOR");
				reajuste = 0.9;//9% DE REAJUSTE
				break;
			
			case 4:
				System.out.println("CARGO : MOTORISTA");
				reajuste = 0.6;
				break;
			
			case 5:
				System.out.println("CARGO: ESTOQUISTA");
				reajuste = 0.5;
				break;
			
			case 6:
				System.out.println("CARGO : TECNICO DE TI");
				reajuste = 0.8;
				break;
			
			default:
				System.out.println("Número inválido! Deve ser de 1 a 6.");
            
            // ENCERRA O PROGRAMA SE O CODIGO NAO FOR VALIDO 
            scanner.close();
            return; 
		}
    
		// ENTRADA DE SALARIO ATUAL 
		System.out.print("Digite o salário atual: R$ ");
		salarioAtual = scanner.nextDouble();
    
		//CALCULANDO SALARIO FINAL 
		novoSalario = salarioAtual + (salarioAtual * reajuste); 
    
		//SAIDA DE DADOS 
		 System.out.printf("%s, seu novo salário é: R$ %.2f%n", nome, novoSalario);
    
		scanner.close();
	}

}
//CATCODE