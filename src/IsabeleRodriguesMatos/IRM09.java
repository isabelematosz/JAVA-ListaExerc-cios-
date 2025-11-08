package IsabeleRodriguesMatos;

import java.util.Scanner;

public class IRM09 {

	public static void main(String[] args) {
		System.out.println("****************************************************************");
		System.out.println("*  Aluno : Isabele Rodrigues RA:0025583                        *");
		System.out.println("*  Classe : IRM09 - Exercício 9: Ordem crescente (três números)*");
		System.out.println("****************************************************************");
		
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Digite o primeiro número: ");
	        int a = sc.nextInt();
	        System.out.print("Digite o segundo número: ");
	        int b = sc.nextInt();
	        System.out.print("Digite o terceiro número: ");
	        int c = sc.nextInt();

	        // Ordenação simples usando if
	        int menor, meio, maior;

	        if (a <= b && a <= c) {
	            menor = a;
	            if (b <= c) {
	                meio = b;
	                maior = c;
	            } else {
	                meio = c;
	                maior = b;
	            }
	        } else if (b <= a && b <= c) {
	            menor = b;
	            if (a <= c) {
	                meio = a;
	                maior = c;
	            } else {
	                meio = c;
	                maior = a;
	            }
	        } else {
	            menor = c;
	            if (a <= b) {
	                meio = a;
	                maior = b;
	            } else {
	                meio = b;
	                maior = a;
	            }
	        }

	        System.out.println("Ordem crescente: " + menor + ", " + meio + ", " + maior);

	        sc.close();
	}

}
