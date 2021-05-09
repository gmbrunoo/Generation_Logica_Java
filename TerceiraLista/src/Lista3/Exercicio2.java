package Lista3;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int [] numeros = new int[6];
		int somaPar = 0, somaImpar = 0, qtdImpar = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um número: ");
			numeros[i] = ler.nextInt();
			
			if(numeros[i] % 2 == 0) {
				somaPar += numeros[i];
			}
			else {
				somaImpar += numeros[i];
				qtdImpar ++;
			}
			
		}
		
		for (int j = 0; j < numeros.length; j++) {
			
			if(numeros[j] % 2 == 0) {
				System.out.println("Os numeros pares digitados foram: " + numeros[j]);
			}
		}
		
		System.out.println("A soma dos numeros pares é: " + somaPar);
		System.out.println("A soma dos numeros impares é: " + somaImpar);
		System.out.println("A quantidade de numeros impares é: " + qtdImpar);
		
	}
}
