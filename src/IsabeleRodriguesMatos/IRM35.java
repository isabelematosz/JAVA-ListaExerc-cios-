package IsabeleRodriguesMatos;

import java.util.Scanner;

public class IRM35 {

	public static void main(String[] args) {
		System.out.println("*******************************************************************");
		System.out.println("*  Aluno : Isabele Rodrigues RA:0025583                           *");
		System.out.println("*  Classe : IRM35 - Exercício 35:  Número positivo obrigatório    *");
		System.out.println("*******************************************************************");
		
	    Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número positivo: ");
            numero = sc.nextInt();
        } while (numero <= 0);

        System.out.println("Número aceito: " + numero);
        sc.close();

	}

}
