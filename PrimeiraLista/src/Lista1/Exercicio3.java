package Lista1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int segundos, minutos, horas, totalEmSegundos;
		
		System.out.println("Digite o tempo em segundos: ");
		segundos = ler.nextInt();
		
		horas = segundos / 3600;
		minutos = (segundos % 3600) / 60;
		totalEmSegundos = (segundos % 3600) % 60;
		
		System.out.println("O tempo é: " + horas + " horas "
										 + minutos + " minutos e "
										 + totalEmSegundos + " segundos.");
	}
}
