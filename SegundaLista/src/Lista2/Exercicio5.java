package Lista2;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade, soma = 0;
		
		do {
			
			System.out.println("Digite sua idade: ");
			idade = ler.nextInt();
			soma += idade;
			
		}while(idade != 0);
		
			System.out.println("A soma das idades digitadas é: " + soma);
	}
}
