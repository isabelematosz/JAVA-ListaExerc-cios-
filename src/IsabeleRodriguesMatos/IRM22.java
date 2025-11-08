package IsabeleRodriguesMatos;

import java.util.Scanner;

public class IRM22 {

	public static void main(String[] args) {
		System.out.println("*******************************************************************");
		System.out.println("*  Aluno : Isabele Rodrigues RA:0025583                           *");
		System.out.println("*  Classe : IRM22 - Exercício 22: Soma de números até digitar zero*");
		System.out.println("*******************************************************************");

		Scanner sc = new Scanner(System.in);
		int numero;
		int soma = 0;

		System.out.println("Digite números para somar (0 para sair):");
		numero = sc.nextInt();

		while (numero != 0) {
			soma += numero;
			numero = sc.nextInt();
		}

		System.out.println("A soma dos números digitados é: " + soma);
		sc.close();
	}

}
