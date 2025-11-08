package IsabeleRodriguesMatos;

public class IRM28 {

	public static void main(String[] args) {
		System.out.println("*******************************************************************");
		System.out.println("*  Aluno : Isabele Rodrigues RA:0025583                           *");
		System.out.println("*  Classe : IRM28 - Exercício 28: Soma dos pares entre 1 e 100    *");
		System.out.println("*******************************************************************");

		int soma = 0;
        int i = 1;

        while (i <= 100) {
            if (i % 2 == 0) {
                soma += i;
            }
            i++;
        }

        System.out.println("A soma dos números pares entre 1 e 100 é: " + soma);
	}

}
