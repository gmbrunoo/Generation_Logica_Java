package Lista3;

import java.util.Random;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Random gerador = new Random();
		Scanner ler = new Scanner(System.in);
		
		int matriz1[][] = new int[2][2];
		int matriz2[][] = new int[2][2];
		int matrizResultado[][] = new int[2][2];
		int valor = 0;
		char opcao;
		
		System.out.println("Escolha uma opção: ");
		System.out.println("[1] para somar duas matrizes");
		System.out.println("[2] para subtrair duas matrizes");
		System.out.println("[3] para adicionar uma constante as duas matrizes");
		opcao = ler.next().charAt(0);
		
		if(opcao == '1') {
			System.out.println("A soma das matrizes é: ");
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					matriz1[i][j] = gerador.nextInt(9);
					matriz2[i][j] = gerador.nextInt(9);
					
					matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
					
					System.out.print(matrizResultado[i][j]  + "\t");
				}
				System.out.println("");
			}
			System.out.println("");
		}
		else if(opcao == '2'){
			System.out.println("A subtração das matrizes é: ");
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					matriz1[i][j] = gerador.nextInt(10);
					matriz2[i][j] = gerador.nextInt(10);
					
					matrizResultado[i][j] = matriz1[i][j] - matriz2[i][j];
					
					System.out.print(matrizResultado[i][j]  + "\t");
				}
				System.out.println("");
			}
			System.out.println("");
		} 
		else if (opcao == '3') {
			System.out.println("Qual valor deseja adicionar? ");
			valor = ler.nextInt();		
			System.out.println("Sua matriz 1 é:  ");
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					
					matriz1[i][j] = gerador.nextInt(10) + valor;
					
					System.out.print( matriz1[i][j] + "\t");
				}
				System.out.println("");
			}
			
			System.out.println("Sua matriz 2 é:  \n");
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					
					matriz2[i][j] = gerador.nextInt(10) + valor;
					
					System.out.print( matriz2[i][j] + "\t");
				}
				System.out.println("");
			}
		}
		else {
			System.out.println("Opção inválida");
			return;
		}
		
		// =====================================================================
		
		System.out.println("Matrizes 1 original");
		
		for (int i = 0; i <2; i++) {
			for (int j = 0; j < 2; j++) {

			System.out.print(matriz1[i][j] - valor + "\t");
							
			}
			System.out.println("");
		}
		
		System.out.println("");
		System.out.println("Matrizes 2 original");
		for (int i = 0; i <2; i++) {
			for (int j = 0; j < 2; j++) {

			System.out.print(matriz2[i][j] - valor + "\t");
							
			}
			System.out.println("");
		}
		
	}
}
