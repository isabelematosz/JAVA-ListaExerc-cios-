package IsabeleRodriguesMatos;

import java.util.Scanner;

public class IRM03 {

	public static void main(String[] args) {
		System.out.println("************************************************************");
		System.out.println("*  Aluno : Isabele Rodrigues RA:0025583                    *");
		System.out.println("*  Classe : IRM03 - Exercício 3: Maior de dois números     *");
		System.out.println("************************************************************");
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        if (num1 > num2) {
            System.out.println("O maior número é: " + num1);
        } else if (num2 > num1) {
            System.out.println("O maior número é: " + num2);
        } else {
            System.out.println("Os dois números são iguais.");
        }

        sc.close();

	}

}
