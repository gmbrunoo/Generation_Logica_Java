package Lista2;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		  int totalCalmas = 0, totalNervosas = 0, totalAgressivas = 0, totalOutrosCalmos = 0;
		  int totalJovensCalmos = 0, totalVelhos = 0, totalPessoas = 0, idade;
		  char genero, personalidade;
		  int i = 6;
		  
		  while (i > 0) {
			  System.out.println("Obtendo dados...");
			  System.out.println("Digite a sua idade: ");
			  idade = ler.nextInt();
			  
			  System.out.println("genero: ");
			  System.out.println("[M]asculino [F]eminino [O]utros");
			  genero = ler.next().charAt(0);
			  
			  System.out.println("Digite a sua personalidade: ");
			  System.out.println("[C]almo [N]ervoso [A]gressivo");
			  personalidade = ler.next().charAt(0);
			  
			  if(personalidade == 'c') {
				  totalCalmas++;
			  }
			  
			  if(personalidade != 'c' || personalidade != 'n' || personalidade != 'a' ) {
				  System.out.println("Entrada inválida para a personalidade");
				  return;
			  }
			  
			  if(genero != 'm' || genero != 'f' || genero != 'o' ) {
				  System.out.println("Entrada inválida para o genero");
				  return;
			  }
			  
			  if(genero == 'f' && personalidade =='n') {
				  totalNervosas ++;
			  } 
			  
			  if(genero == 'm' && personalidade =='a') {
				  totalAgressivas ++;
			  }
			  
			  if(genero == 'o' && personalidade == 'c') {
				  totalOutrosCalmos++;
			  }
			  
			  if(idade > 40 && personalidade == 'n') {
				  totalVelhos ++;
			  }
			 
			  if(idade < 18 && personalidade == 'c') {
				  totalJovensCalmos ++;
			  }
			  
			  i--;
			  
		  }
		  System.out.println("Total de pessoas calmas: " + totalCalmas);
		  System.out.println("Total de mulheres nervosas: " + totalNervosas);
		  System.out.println("Total de homens agressivos: " + totalAgressivas);
		  System.out.println("Total de pessoas com genero outro e calmos: " + totalOutrosCalmos);
		  System.out.println("Total de pessoas nervosas com + de 40: " + totalVelhos);
		  System.out.println("Total de pessoas calmas com menos de 18: " + totalJovensCalmos);

	}
}
