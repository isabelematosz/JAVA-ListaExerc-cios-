package IsabeleRodriguesMatos;

import java.util.Scanner;

public class IRM02 {

	public static void main(String[] args) {
		System.out.println("************************************************************");
		System.out.println("*  Aluno : Isabele Rodrigues RA:0025583                    *");
		System.out.println("*  Classe : IRM02 - Exercício 2: Par ou Ímpar              *");
		System.out.println("************************************************************");
		
		
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Digite um número : ");
		        int numero = sc.nextInt();

		        if (numero % 2 == 0) {
		            System.out.println("O número é par.");
		        } else {
		            System.out.println("O número é ímpar.");
		        }

		        sc.close();	}

}
