/*
 * Escreva um programa contendo uma Collection Queue (Fila) de Objetos do 
 * tipo string, para organizar uma fila por ordem de chegada dos Clientes 
 * de um Banco. O programa deverá ter um Menu que aceitará as opções 
 * 0, 1, 2 e 3:
1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
2: Listar todos os Clientes na fila
3: Chamar (retirar) uma pessoa da fila 
0: O programa deve ser finalizado. 
Caso a fila esteja vazia, o programa deverá informar que a fila está 
vazia ao tentar retirar (chamar) um cliente da fila.
*/

package estrutura.de.dados;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Exe01Fila {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// CRIANDO A FILA E DEFININDO O TIPO
		Queue<String> filaDeClientes = new LinkedList<String>();

		int opcao = -1;

		while (opcao != 0) {
			System.out.println("\nMenu:");
			System.out.println("1: Adicionar um novo Cliente; ");
			System.out.println("2: Listar todos os Clientes na fila");
			System.out.println("3: Chamar  uma pessoa da fila");
			System.out.println("0: Sair");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				// ADICIONANDO CLIENTES
				System.out.println("Digite o nome do Cliente: ");
				String nomeCliente = scanner.nextLine();
				filaDeClientes.add(nomeCliente);
				System.out.println("Cliente " + nomeCliente + " adicionado à fila.");
				break;

			case 2:
				// LISTANDO OS CLIENTES
				if (filaDeClientes.isEmpty()) {
					System.out.println("A fila está vazia.");
				} else {
					System.out.println("Clientes na fila:");
					for (String cliente : filaDeClientes) {
						System.out.println(cliente);
					}
				}
				break;

			case 3:

				if (filaDeClientes.isEmpty()) {
					System.out.println("A fila está vazia. Não há clientes para chamar.");
				} else {
					String chamandoCliente = filaDeClientes.poll();
					System.out.println("Cliente " + chamandoCliente + " chamado.");
				}
				break;

			case 0:
				// SAINDO DO ROGRAMA
				System.out.println("...");
				break;

			default:
				System.out.println("Opção inválida! Tente novamente.");
			}
		}

		scanner.close();

	}
}
