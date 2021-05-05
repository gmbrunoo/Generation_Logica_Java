package ListaExtra1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
        
        int numero1, numero2, numero3, maior1, maior2, maior3; 
        
        System.out.println("Insira os três números que deseja ordenar:");
        numero1 = entrada.nextInt();
        numero2 = entrada.nextInt();
        numero3 = entrada.nextInt();
        entrada.close();
        
        maior2 = numero1; 
        
        if(numero2 <= maior2) {
            maior1 = numero2;
        } else { 
            maior1 = maior2;
            maior2 = numero2;
        }
        
        if(numero3 >= maior2) {
            maior3 = numero3;
        } else {
            maior3 = maior2;
            maior2 = numero3;
            if(maior2 < maior1) {
                maior2 = maior1;
                maior1 = numero3;
            }
        }
        
        System.out.println("A ordem crescente dos números inseridos é: " + maior1 + " " + maior2 +
                            " " + maior3);
	}
}
