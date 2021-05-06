package Lista2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade, menores = 0, maiores = 0;
		
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
		
		System.out.println("A quantidade de pessoas que tem menos de 21 anos é: " + menores);
		System.out.println("A quantidade de pessoas com mais de 50 anos é: " + maiores);
		
	}
	
}
