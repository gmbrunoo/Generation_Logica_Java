package Lista3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int [][] matriz = new int[3][3];
		
		
		Scanner ler = new Scanner(System.in);
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("Digite um numero para a posição " + i + " " + j);
				matriz[i][j] = ler.nextInt();
			}
		}
		
		for (int i = 0; i <3; i++) {
			for (int j = 0; j < 3; j++) {

				if(matriz[i][j] > 10) {
					System.out.println("Os números maiores que 10 digitados foram: " 
										+ matriz[i][j] 
										+ " na posição " 
										+ i + " " + j);
				}
				
			}
		}
	}
}

