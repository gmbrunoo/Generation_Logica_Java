package Lista1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idadeEmAnos, idadeEmMeses, idadeEmDias;
		int totalEmDias, bissexto;
		
		System.out.println("Digite sua idade em anos: ");
		idadeEmAnos = ler.nextInt();
		
		System.out.println("Digite quantos meses: ");
		idadeEmMeses = ler.nextInt();
		
		System.out.println("Digite quantos dias: ");
		idadeEmDias = ler.nextInt();
		
		bissexto = (idadeEmAnos / 4);
		
		totalEmDias = (idadeEmAnos * 365) + (idadeEmMeses * 30) + idadeEmDias + bissexto;
		
		System.out.println("Sua idade em dias é: " + totalEmDias);
	}
}
