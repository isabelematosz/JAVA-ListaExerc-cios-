package IsabeleRodriguesMatos;

import java.util.Scanner;

public class IRM04 {

	public static void main(String[] args) {
		System.out.println("************************************************************");
		System.out.println("*  Aluno :Isabele Rodrigues RA:0025583                     *");
		System.out.println("*  Classe : IRM04 - Exercício 4: Pode votar?               *");
		System.out.println("************************************************************");
		
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Digite sua idade: ");
	        int idade = sc.nextInt();

	        if (idade < 16) {
	            System.out.println("Você ainda não pode votar.");
	        } else if (idade >= 16 && idade < 18 || idade > 70) {
	            System.out.println("O voto é opcional.");
	        } else {
	            System.out.println("O voto é obrigatório.");
	        }

	        sc.close();

	}

}
