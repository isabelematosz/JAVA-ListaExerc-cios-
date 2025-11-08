package IsabeleRodriguesMatos;

import java.util.Scanner;

public class IRM26 {

	public static void main(String[] args) {
		System.out.println("*******************************************************************");
		System.out.println("*  Aluno : Isabele Rodrigues RA:0025583                           *");
		System.out.println("*  Classe : IRM26 - Exercício 26: Número primo com while          *");
		System.out.println("*******************************************************************");
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        int i = 1;
        int divisores = 0;

        while (i <= numero) {
            if (numero % i == 0) {
                divisores++;
            }
            i++;
        }

        if (divisores == 2) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }

        sc.close();

	}

}
