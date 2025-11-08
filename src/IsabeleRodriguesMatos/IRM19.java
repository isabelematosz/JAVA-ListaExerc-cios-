package IsabeleRodriguesMatos;

import java.util.Scanner;

public class IRM19 {

	public static void main(String[] args) {
		System.out.println("*******************************************************************");
		System.out.println("*  Aluno : Isabele Rodrigues RA:0025583                           *");
		System.out.println("*  Classe : IRM19 - Exercício 19: Verificar se um número é primo  *");
		System.out.println("*******************************************************************");
		
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Digite um número: ");
	        int numero = sc.nextInt();

	        int divisores = 0;

	        for (int i = 1; i <= numero; i++) {
	            if (numero % i == 0) {
	                divisores++;
	            }
	        }

	        if (divisores == 2) {
	            System.out.println(numero + " é um número primo.");
	        } else {
	            System.out.println(numero + " não é primo.");
	        }

	        sc.close();

	}

}
