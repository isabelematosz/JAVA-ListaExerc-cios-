package IsabeleRodriguesMatos;

import java.util.Scanner;

public class IRM12 {

	public static void main(String[] args) {
		System.out.println("************************************************************");
		System.out.println("*  Aluno : Isabele Rodrigues RA:0025583                    *");
		System.out.println("*  Classe : IRM12 - Exercício 12: Tabuada de um número     *");
		System.out.println("************************************************************");
		
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Digite um número para ver sua tabuada: ");
	        int numero = sc.nextInt();

	        for (int i = 1; i <= 10; i++) {
	            System.out.println(numero + " x " + i + " = " + (numero * i));
	        }

	        sc.close();
	}

}
