package IsabeleRodriguesMatos;

import java.util.Scanner;

public class IRM33 {

	public static void main(String[] args) {
		System.out.println("*******************************************************************");
		System.out.println("*  Aluno : Isabele Rodrigues RA:0025583                           *");
		System.out.println("*  Classe : IRM33 - Exercício 33:  Menu com opção de sair         *");
		System.out.println("*******************************************************************");
		
	    Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Mensagem");
            System.out.println("2 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Você escolheu a mensagem!");
            } else if (opcao != 2) {
                System.out.println("Opção inválida. Tente novamente!");
            }
        } while (opcao != 2);

        System.out.println("Programa encerrado.");
        sc.close();

	}

}
