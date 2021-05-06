package Lista2;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numeros, media = 0, contador = 0, soma=0;
		
		do {
			System.out.println("Digite sua idade ou digite 0 (zero) para finalizar: ");
			numeros = ler.nextInt();

			if(numeros % 3 == 0 && numeros != 0) {
				soma += numeros;
				contador++;
			}
			
		}while(numeros != 0);
			media = soma / ( contador -1 );
		
			System.out.println("A média dos numeros digitadas é: " + media);
	}
}
