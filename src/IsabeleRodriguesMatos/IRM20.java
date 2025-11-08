package IsabeleRodriguesMatos;

import java.util.Scanner;

public class IRM20 {

	public static void main(String[] args) {
		System.out.println("*******************************************************************");
		System.out.println("*  Aluno : Isabele Rodrigues RA:0025583                           *");
		System.out.println("*  Classe : IRM20 - Exercício 20: Números de Fibonacc             *");
		System.out.println("*******************************************************************");
		
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Digite quantos termos da sequência deseja ver: ");
	        int n = sc.nextInt();

	        int a = 0, b = 1, c;

	        System.out.print("Sequência de Fibonacci: ");

	        for (int i = 1; i <= n; i++) {
	            System.out.print(a + " ");
	            c = a + b;
	            a = b;
	            b = c;
	        }
	       
	        sc.close();
	}

}
