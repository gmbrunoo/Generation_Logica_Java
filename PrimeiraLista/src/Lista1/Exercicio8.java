package Lista1;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double carroNovo, custoFabricacao, carroLoja;
		double distribuidor = 0.28, imposto = 0.45;
		
		System.out.println("Indique o custo de fabrica: ");
		custoFabricacao = ler.nextDouble();
		
		carroLoja = (custoFabricacao * distribuidor) + custoFabricacao;
		carroNovo = carroLoja + (carroLoja * imposto);
		
		System.out.println("O valor do carro para o consumidor final é de: " + carroNovo);
	}
}
