package Lista3;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int [] numeros = {1,0,5,-2,-5,7};
		int soma = 0;
				
		soma = numeros[0] + numeros[1] + numeros[5];
		
		numeros[4] = 100;
		
		System.out.println("Os valores do vetor s�o: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Posi��o " + i + ": " + numeros[i]);
		}
		
		System.out.println("\nA soma das posi��es [0], [1] e [5] �: " + soma);
	}
}
