package ListaExtra1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double numero = 0;
		
		System.out.println("Digite um numero: ");
		numero = ler.nextDouble();
		
		if(numero % 2 == 0) {
			System.out.println("O numero digitado foi: " + numero);
			System.out.println("O seu numero �: PAR");
			System.out.println("Sua raiz quadrada �: " + Math.sqrt(numero));
		}
		else {
			System.out.println("O numero digitado foi: " + numero);
			System.out.println("O seu numero �: IMPAR");
			System.out.println("Seu numero elevado ao quadrado �: " + Math.pow(numero,2));
		}
	}
}
