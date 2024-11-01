/*Para doar sangue é necessário ter entre 18 e 69 anos de idade.
 *Pessoas com idade entre 60 e 69 anos, só podem doar se não for a sua primeira doação.
 *Escreva um Algoritmo em Java que obtenha via teclado o nome do doador (String),
 *a idade (inteiro) do doador e se é a primeira doação (boolean). 
 *De acordo com as Regras para a doação, mostre na tela se o doador está Apto 
 *ou Não Apto para doar sangue.
 */
package condicionais;

import java.util.Scanner;

public class Exe03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean apto = false;

        // ENTRADA DE DADOS
        System.out.println("DIGITE O NOME COMPLETO DO DOADOR:");
        String nome = scanner.nextLine();

        System.out.println("DIGITE A IDADE DO DOADOR: ");
        int idade = scanner.nextInt();

        // VERIFICANDO SE A IDADE É MENOR QUE 18 OU MAIOR QUE 69
        if (idade < 18 || idade > 69) {
            System.out.println(nome + ", você não está Apto para doar sangue.");
        }

        // SE A IDADE ESTIVER DENTRO DO INTERVALO, CONTINUUAR !
        if (idade >= 18 && idade <= 69) {
            System.out.print("É a primeira doação? (sim/não): ");
            String resposta = scanner.next().toLowerCase();

            // ARMAZENANDO SE O DOADOR ESTÁ APTO
            boolean primeiraDoacao = resposta.equals("sim");

            // VERIFICANDO SE O DOADOR ESTÁ APTO
            if (idade < 60) {
                apto = true; // MENOR QUE 60 ANOS ESTÁ APTO
            }

            if (idade >= 60 && !primeiraDoacao) {
                apto = true; // SE FOR MAIOR QUE 60 E NÃO FOR A PRIMEIRA DOAÇÃO
            }

            // SAÍDA DE DADOS
            if (apto) {
                System.out.println(nome + ", você está Apto para doar sangue.");
            }

            if (!apto) {
                System.out.println(nome + ", você não está Apto para doar sangue.");
            }
        }

        scanner.close();
    }
}
