package variaveiseoperadores;

import	java.util.Scanner; 

public class Exe01 {
	
	public static void main(String[] args)	{
		
		Scanner reader = new Scanner(System.in);
		
		//ENTRADA DE DADOS
		
		float salariomensal, abono,  mesestrabalhados, salarioLiq;
		
		System.out.print("Digite o seu salario mensal: R$ ");
		salariomensal = reader.nextFloat();
		
		System.out.print("Quantos meses você trabalha na empresa : ");
		mesestrabalhados = reader.nextFloat();

		//CALCULANDO O ABONO SALARIAL PROPORCIONAL AOS MESES TRABALHADOS 
        
		abono = (salariomensal / 12) * mesestrabalhados;

		salarioLiq = salariomensal  + abono;
        
		//SAIDA DE DDADOS
		
		System.out.printf("Seu Salario liquido + seu abono é: R$ %.2f" , salarioLiq );
        
		reader.close();
	
	}

}
//CODECAT