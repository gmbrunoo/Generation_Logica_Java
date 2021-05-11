package Exercicio1;

import java.util.Scanner;

public class Cliente {

	private String nome;
	private String sobrenome;
	private String telefone;
	private String cpf;
	private String logradouro;
	private int numero;
	private String bairro;
	
	public Cliente(String nome, String sobrenome, String telefone, String cpf, String logradouro, int numero,
			String bairro) {

		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
		this.cpf = cpf;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public void dadosPessoais() {
		System.out.println("Nome: " + nome);
		System.out.println("Sobrenome: " + sobrenome);
		System.out.println("CPF: " + cpf);
		System.out.println("Telefone: " + telefone);
		System.out.println("Endereço: " + logradouro +", " + bairro + " - " + numero);
	}
	
	public void cadastro() {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		setNome(ler.nextLine());
		
		System.out.println("Digite seu sobrenome");
		setSobrenome(ler.nextLine());
		
		System.out.println("CPF: ");
		setCpf(ler.nextLine());
		
		System.out.println("Telefone: ");
		setTelefone(ler.nextLine());
		
		System.out.println("Logradouro: ");
		setLogradouro(ler.nextLine());
		
		System.out.println("Bairro: ");
		setBairro(ler.nextLine());
		
		System.out.println("Numero: ");
		setNumero(ler.nextInt());
		
		System.out.println("\n==============================");
		System.out.println("Usuário cadastrado com sucesso");
		System.out.println("==============================");
		
		dadosPessoais();
		
	}
	

}
