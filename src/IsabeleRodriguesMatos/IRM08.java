package IsabeleRodriguesMatos;

import java.util.Scanner;

public class IRM08 {

	public static void main(String[] args) {
		System.out.println("************************************************************");
		System.out.println("*  Aluno : Isabele Rodrigues RA:0025583                    *");
		System.out.println("*  Classe : IRM08 - Exercício 8: Login simples             *");
		System.out.println("************************************************************");
		
		Scanner sc = new Scanner(System.in);

        String usuarioCorreto = "admin";
        String senhaCorreta = "1234";

        System.out.print("Digite o usuário: ");
        String usuario = sc.nextLine();

        System.out.print("Digite a senha: ");
        String senha = sc.nextLine();

        if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Usuário ou senha incorretos.");
        }

        sc.close();
	}

}
