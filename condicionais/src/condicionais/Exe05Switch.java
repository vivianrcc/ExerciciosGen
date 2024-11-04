/*Escreva um algoritmo em Java que leia o código de um item 
 *(número inteiro de 1 a 6) e a quantidade comprada deste item (número inteiro).
 *A seguir, mostre na tela o valor total da conta e o nome do produto que foi comprado.
 */
package condicionais;

import java.util.Scanner;

public class Exe05Switch {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int codigoProduto, quantidade;
        double valor = 0, valorTotal;
        
        // ENTRADA DE DADOS 
        System.out.println("1. CACHORRO QUENTE R$ 10,00\n"
                + "2. X-SALADA R$ 15,00\n"
                + "3. X-BACON R$ 18,00\n"
                + "4. BAURU R$ 12,00\n"
                + "5. REFRIGERANTE R$ 8,00\n"
                + "6. SUCO DE LARANJA R$ 13,00\n"
                + "7. HAMGURGUER VEGANO COM BATATAS\n"
                + " DIGITE O CODIGO DO PRODUTO (1 a 7):");
        codigoProduto = scanner.nextInt();
        
        // COMEÇANDO O SWITCH
        switch (codigoProduto) {
            case 1:
                System.out.println("Cachorro quente");
                valor = 10.00;
                break;
            case 2:
                System.out.println("X salada");
                valor = 15.00; 
                break;
            case 3:
                System.out.println("X bacon");
                valor = 18.00; 
                break;
            case 4:
                System.out.println("Bauru");
                valor = 12.00; 
                break;
            case 5:
                System.out.println("Refrigerante");
                valor = 8.00; 
                break;
            case 6:
                System.out.println("Suco de laranja");
                valor = 13.00; 
                break;
            case 7:
                System.out.println("Hamburguer vegano + batata");
                valor = 18.00; 
                break;
            default:
                System.out.println("Número inválido! Deve ser de 1 a 7.");
                
                // ENCERRA O PROGRAMA SE O CODIGO NAO FOR VALIDO 
                scanner.close();
                return; 
        }

        // CONTINUA SE O CCODIGO FOR VALIDO 
        System.out.println("Digite a quantidade:");
        quantidade = scanner.nextInt();

        // CALCULANDO VALOR TOTAL 
        valorTotal = valor * quantidade;
        
        // MOSTRANDO O RESULTADO
        System.out.printf("O valor total é: R$ %.2f%n", valorTotal);
        
        scanner.close();
    }
}
//CODECAT
