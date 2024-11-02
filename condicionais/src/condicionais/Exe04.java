/*
 * Escreva um algoritmo em Java, que leia 3 palavras (String), 
 * que definem as características de um tipo de animal possível segundo o diagrama abaixo, 
 * que deve ser lido da esquerda para a direita.
 * Na construção do Algoritmo, utilize os seguintes conteúdos:
 * Entrada e Saída de dados
 * Operadores
 * Laço Condicional If
 * No Java utilize o Método String.equals() ou String.equalsIgnoreCase() 
 * para comparar as palavras
*/
package condicionais;

import java.util.Scanner;

public class Exe04 { 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS 
        System.out.print("ESCOLHA UMA DAS OPÇÕES:\n"
                + "1. Vertebrado/Ave/Carnívoro\n"
                + "2. Vertebrado/Ave/Onívoro\n"
                + "3. Vertebrado/Mamífero/Onívoro\n"
                + "4. Vertebrado/Mamífero/Hervívoro\n"
                + "5. Invertebrado/Inseto/Hematófago \n" 
                + "6. Invertebrado/Inseto/Hervívoro\n"
                + "7. Invertebrado/Anelídeo/Hematófago\n"
                + "8. Invertebrado/Anelídeo/Onívoro\n"
                + "Digite sua escolha: ");
        String resposta = scanner.nextLine();

        // VERIFICANDO AS RESPOSTAS ESCOLHIDAS PELO USUÁRIO
        if (resposta.equals("1")) { 
            System.out.println("Você escolheu Vertebrado/Ave/Carnívoro.\nSeu animal escolhido é: ÁGUIA.");
        }

        if (resposta.equals("2")) {  
            System.out.println("Você escolheu Vertebrado/Ave/Onívoro.\nSeu animal escolhido é: POMBO.");
        }

        if (resposta.equals("3")) { 
            System.out.println("Você escolheu Vertebrado/Mamífero/Onívoro.\nSeu animal escolhido é: HOMEM.");
        }

        if (resposta.equals("4")) { 
            System.out.println("Você escolheu Vertebrado/Mamífero/Hervívoro.\nSeu animal escolhido é: VACA.");
        }

        if (resposta.equals("5")) { 
            System.out.println("Você escolheu Invertebrado/Inseto/Hematófago.\nSeu animal escolhido é: PULGA.");
        }

        if (resposta.equals("6")) { 
            System.out.println("Você escolheu Invertebrado/Inseto/Hervívoro.\nSeu animal escolhido é: LAGARTA.");
        }

        if (resposta.equals("7")) { 
            System.out.println("Você escolheu Invertebrado/Anelídeo/Hematófago.\nSeu animal escolhido é: SANGUESsUGA.");
        }

        if (resposta.equals("8")) { 
            System.out.println("Você escolheu Invertebrado/Anelídeo/Onívoro.\nSeu animal escolhido é: MINHOCA.");
        }

        // Caso a resposta não seja válida
        if (!resposta.equals("1") && !resposta.equals("2") && !resposta.equals("3") && 
            !resposta.equals("4") && !resposta.equals("5") && !resposta.equals("6") && 
            !resposta.equals("7") && !resposta.equals("8")) {
            System.out.println("Opção inválida! Por favor, escolha uma opção entre 1 e 8.");
        }

        scanner.close(); 
    }

}
