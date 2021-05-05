package Lista1;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double x1, x2, y1, y2, resultado = 0.0;
		
		System.out.println("Digite a coordenada do ponto X1: ");
		x1 = ler.nextDouble();
		
		System.out.println("Digite a coordenada do ponto Y1: ");
		y1 = ler.nextDouble();
		
		System.out.println("Digite a coordenada do ponto X2: ");
		x2 = ler.nextDouble();
		
		System.out.println("Digite a coordenada do ponto Y2: ");
		y2 = ler.nextDouble();
		
		resultado = Math.sqrt( Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		
		System.out.println("A distancia entre os pontos é: " + resultado);
	}
}
