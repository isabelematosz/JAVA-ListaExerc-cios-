package IsabeleRodriguesMatos;

import java.util.Scanner;

public class IRM15 {

	public static void main(String[] args) {
		System.out.println("************************************************************");
		System.out.println("*  Aluno : Isabele Rodrigues RA:0025583                    *");
		System.out.println("*  Classe : IRM15 - Exercício 15: Fatorial de um número    *");
		System.out.println("************************************************************");

		  Scanner sc = new Scanner(System.in);

	        System.out.print("Digite um número para calcular o fatorial: ");
	        int numero = sc.nextInt();

	        long fatorial = 1;

	        for (int i = 1; i <= numero; i++) {
	            fatorial *= i;
	        }

	        System.out.println("O fatorial de " + numero + " é: " + fatorial);

	        sc.close();

	}

}
