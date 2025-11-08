package IsabeleRodriguesMatos;

public class IRM13 {

	public static void main(String[] args) {
		System.out.println("****************************************************************************");
		System.out.println("*  Aluno : Isabele Rodrigues RA:0025583                                    *");
		System.out.println("*  Classe : IRM13 - Exercício 13: Soma dos 100 primeiros números naturais  *");
		System.out.println("****************************************************************************");

		int soma = 0;

		for (int i = 1; i <= 100; i++) {
			soma += i;
		}

		System.out.println("A soma dos 100 primeiros números naturais é:  " + soma);
	}

}
