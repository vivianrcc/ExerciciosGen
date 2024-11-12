/*
 * Escreva um programa contendo uma Collection Stack (Pilha) de Objetos 
 * string, para organizar a retirada de livros de uma pilha. O programa 
 * deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
1: Adicionar um novo livro na pilha. Deve solicitar o nome do livro.
2: Listar todos os livros da Pilha
3: Retirar um livro da pilha 
0: O programa deve ser finalizado. 
   Caso a pilha esteja vazia, ao tentar retirar um livro da pilha,
   o programa deverá informar que a pilha está vazia.
 */ 
package estrutura.de.dados;

import java.util.Stack;
import java.util.Scanner;

public class Exe02Pilha {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//CRIANDO A COLLECTION STACK E DEFININDO O TIPO
		Stack<String> books = new Stack<String>();
		int opcao = -1;

		while (opcao != 0) {
			System.out.println("Bem-vindo ao Menu da LIvraria:");
			System.out.println("1: Adicionar um novo livro; ");
			System.out.println("2: Listar todos os livros: ");
			System.out.println("3: Retirar livro da pilha.");
			System.out.println("0: Sair");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				// ADICIONANDO NOVOS LIVROS
				System.out.println("Digite o nome do LIVRO: ");
				String nomeLivro = scanner.nextLine();
				books.add(nomeLivro);
				System.out.println("o Livro " + nomeLivro + " adicionado à fila.");
				break;

			case 2:
				// LISTANDO OS CLIENTES
				if (books.isEmpty()) {
					System.out.println("A pilha esta vazia.");
				} else {
					System.out.println("total livros:");
					for (String livro : books) {
						System.out.println(livro);
					}
				}
				break;

			case 3:

				if (books.isEmpty()) {
					System.out.println("Não tem livros.");
				} else {
					String proximoLivro = books.peek();
					System.out.println("O livro " + proximoLivro + " foi retirado");
				}
				break;

			case 0:
				// SAINDO DO pROGRAMA
				System.out.println("...");
				break;

			default:
				System.out.println("Opção inválida! Tente novamente.");
			}
		}

		scanner.close();

	
	}

}
