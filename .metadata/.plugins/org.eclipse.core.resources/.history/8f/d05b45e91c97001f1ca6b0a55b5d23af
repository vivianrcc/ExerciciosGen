/*
 * ELABORE UM ALGORITMO EM JAVA, QUE LEIA O SALARIO BRUTO,
 * O ADICIONAL NOTURNO, AS HORAS EXTRAS E OS DESCONTOS DE UM COLABORADOR, EM VARIAVEIS
 * DO TIPO (FLOAT) E EXIBA NA TELA O SALÁRIO LIQUIDO.
 */
package variaveiseoperadores; 

import java.util.Scanner;

public class Exe03 {
	
	public static void main(String[] args)	{
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Digite o valor de seu salário mensal:R$");
		float salarioBruto = reader.nextFloat();
		
		System.out.println("Digite o número de horas trabalhadas à noite (Adicional Noturno):");
		float horasadicionalnoturno = reader.nextFloat();

		System.out.println("Quantas horas extras você tem  este mês:");
		float horasExtras = reader.nextFloat();

		System.out.println("Digite o total dos descontos:");
		float descontos = reader.nextFloat();
		
		//CALCULANDO O ADICIONAL NOTURNO (ESCALA 5X2) 40HRS (220 SE FOR 6X1) 
		
		float salarioHora = salarioBruto / 160; 
		
		// ADICIONAL NOTURNO 20% do salário-hora COM BASE NA LEI  BRASILEIRA
		
		float adicionalnoturno = salarioHora * 0.20f * horasadicionalnoturno;
		
		//CALCULANDO O SALARIO LIQUIDO 
        
        float salarioLiq = salarioBruto + adicionalnoturno +(horasExtras *  5) - descontos;
        
        
        System.out.printf("Salário liquido é:\nR$ %.2f", salarioLiq);
        
        reader.close();
	
	}

}
//CODECAT