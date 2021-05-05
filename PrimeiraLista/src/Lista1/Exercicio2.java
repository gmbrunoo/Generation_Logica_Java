package Lista1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idadeEmAnos, idadeEmMeses, idadeEmDias;
		int totalEmDias, bissexto, totalEmAnos;
		
		System.out.println("Digite sua idade em dias: ");
		idadeEmDias = ler.nextInt();
		
		totalEmAnos = (idadeEmDias / 365);
		bissexto = (totalEmAnos / 4);
		idadeEmMeses = (idadeEmDias % 365) / 30;
		totalEmDias = ((idadeEmDias % 365) % 30) - bissexto;
		
		System.out.println("A sua idade é: " + totalEmAnos + " anos "
											 + idadeEmMeses + " meses "
											 + totalEmDias + " dias.");
	}
}
