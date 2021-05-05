package Lista1;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double primeiraNota, segundaNota, terceiraNota, resultado = 0.0;
		double pesoNota1, pesoNota2, pesoNota3, somaPeso;
		
		System.out.println("Digite a primeira nota: ");
		primeiraNota = ler.nextDouble();
		
		System.out.println("Digite o peso da primeira nota: ");
		pesoNota1 = ler.nextDouble();
		
		
		System.out.println("Digite a segunda nota: ");
		segundaNota = ler.nextDouble();
		
		System.out.println("Digite o peso da segunda nota: ");
		pesoNota2 = ler.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		terceiraNota = ler.nextDouble();
		
		System.out.println("Digite o peso da terceira nota: ");
		pesoNota3 = ler.nextDouble();
		
		somaPeso = pesoNota1 + pesoNota2 + pesoNota3;
		
		resultado = (((primeiraNota * pesoNota1) + (segundaNota * pesoNota2) + (terceiraNota * pesoNota3)) / somaPeso);
		
		System.out.println("A média ponderada é: " + resultado);
	}
}
