package IsabeleRodriguesMatos;

import java.util.Scanner;

public class IRM29 {

		public static void main(String[] args) {
			System.out.println("*******************************************************************");
			System.out.println("*  Aluno : Isabele Rodrigues RA:0025583                           *");
			System.out.println("*  Classe : IRM29 - Exercício 29: Contar dígitos de um número     *");
			System.out.println("*******************************************************************");

			 Scanner sc = new Scanner(System.in);

		        System.out.print("Digite um número positivo: ");
		        int numero = sc.nextInt();

		        int contador = 0;

		        while (numero > 0) {
		            numero = numero / 10;
		            contador++;
		        }

		        System.out.println("O número tem " + contador + " dígitos.");
		        sc.close();

	}

}
