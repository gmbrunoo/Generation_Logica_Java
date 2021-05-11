package Exercicio4;

public class Funcionario {

	private String nome;
	private int idade;
	
	public void fazerAniversario() {
		this.idade++;
		System.out.println("Meu nome é " + nome + ", tenho " + idade + " anos");
	}
	
	public Funcionario(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}	

}
