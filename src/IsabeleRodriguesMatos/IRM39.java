package IsabeleRodriguesMatos;

import java.util.Scanner;

public class IRM39 {

	public static void main(String[] args) {
		System.out.println("*******************************************************************");
		System.out.println("*  Aluno : Isabele Rodrigues RA:0025583                           *");
		System.out.println("*  Classe : IRM39 - Exercício 39:    Validar número entre 1 e 5   *");
		System.out.println("*******************************************************************");
		
	    Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número entre 1 e 5: ");
            numero = sc.nextInt();
        } while (numero < 1 || numero > 5);

        System.out.println("Número válido digitado: " + numero);
        sc.close();
	}

}
