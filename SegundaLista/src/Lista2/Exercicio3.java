package Lista2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade, menores = 0, maiores = 0;
		String a, b;
		
		System.out.println("Digite sua idade: ");
		idade = ler.nextInt();
				
		while(idade != -99) {
			
			System.out.println("Digite sua idade: ");
			idade = ler.nextInt();
			
			if(idade < 21) {
				menores ++;
			}
			if (idade > 50) {
				maiores ++;
			}	
		}
		
		System.out.println("A quantidade de pessoas que tem menos de 21 anos �: " + menores);
		System.out.println("A quantidade de pessoas com mais de 50 anos �: " + maiores);
		System.out.println("Asda");
		a = ler.next();
		System.out.println("Asda");
		b = ler.next();
		
		
		
	}
	
}
