package Lista1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		double primeiroValor, segundoValor, terceiroValor, resultado = 0.0;
		
		System.out.println("Digite o primeiro valor: ");
		primeiroValor = ler.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		segundoValor = ler.nextDouble();
		
		System.out.println("Digite o terceiro valor: ");
		terceiroValor = ler.nextDouble();
		
		resultado = (Math.pow((primeiroValor + segundoValor), 2) + Math.pow((segundoValor + terceiroValor), 2)) / 2;
		
		System.out.println("O resultado da expressão é: " + resultado);
	}
}
