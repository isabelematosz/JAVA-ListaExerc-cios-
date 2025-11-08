package IsabeleRodriguesMatos;

import java.util.Scanner;

public class IRM23 {

	public static void main(String[] args) {
		System.out.println("*******************************************************************");
		System.out.println("*  Aluno : Isabele Rodrigues RA:0025583                           *");
		System.out.println("*  Classe : IRM23 - Exercício 23: Senha correta                   *");
		System.out.println("*******************************************************************");

		Scanner sc = new Scanner(System.in);
        String senhaCorreta = "1234";
        String senha;

        do {
            System.out.print("Digite a senha: ");
            senha = sc.nextLine();
        } while (!senha.equals(senhaCorreta));

        System.out.println("Senha correta! Acesso liberado.");
        sc.close();

	}

}
