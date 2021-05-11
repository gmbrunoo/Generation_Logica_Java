package Exercicio6;

import java.util.Scanner;

public class Banco {

	private String nome, agencia, conta, pix;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getPix() {
		return pix;
	}

	public void setPix(String pix) {
		this.pix = pix;
	}

	void scan() {

	Scanner input = new Scanner(System.in);

		System.out.println("Informe o seu nome: ");
		nome = input.nextLine();

		System.out.println("Digite o numero da sua Agência: ");
		agencia = input.nextLine();

		System.out.println("Digite o número de sua conta: ");
		conta = input.nextLine();

		System.out.println("Digite sua chave Pix: ");
		pix = input.nextLine();

	}


	 void print() {
		 System.out.println("O seu nome é: " + nome + "\nSua agência é :" + 
	 agencia + "\nSua conta é:" + 
				 conta + "\nE sua chave PIX é: " + pix);


}
}
