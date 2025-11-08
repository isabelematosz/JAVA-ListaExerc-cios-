package IsabeleRodriguesMatos;

import java.util.Scanner;

public class IRM24 {

	public static void main(String[] args) {
		System.out.println("********************************************************************");
		System.out.println("*  Aluno : Isabele Rodrigues RA:0025583                            *");
		System.out.println("*  Classe : IRM24 - Exercício 24: Verificar se um número é positivo*");
		System.out.println("********************************************************************");
		
		Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();
        } while (numero <= 0);

        System.out.println("Você digitou um número positivo: " + numero);
        sc.close();

	}

}
