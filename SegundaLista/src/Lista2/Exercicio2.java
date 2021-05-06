package Lista2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int par = 0, impar = 0, valor;
		
		for (int i = 1; i <= 10 ; i++) {
			
			System.out.println("Digite um valor: ");
			valor = ler.nextInt();
			
			if(valor % 2 == 0) {
				par ++;
			}else {
				impar ++;
			}
			
		}
		System.out.println("A quantidade de numeros pares é: " + par);
		
		System.out.println("A quantidade de numeros impar é: " + impar);
		
	}
}
