package IsabeleRodriguesMatos;

import java.util.Scanner;

public class IRM34 {

	public static void main(String[] args) {
		System.out.println("*******************************************************************");
		System.out.println("*  Aluno : Isabele Rodrigues RA:0025583                           *");
		System.out.println("*  Classe : IRM34 - Exercício 34:  Pedir senha até acertar        *");
		System.out.println("*******************************************************************");
		
		Scanner sc = new Scanner(System.in);
        int senha;

        do {
            System.out.print("Digite a senha: ");
            senha = sc.nextInt();
        } while (senha != 1111);

        System.out.println("Acesso liberado!");
        sc.close();

	}

}
