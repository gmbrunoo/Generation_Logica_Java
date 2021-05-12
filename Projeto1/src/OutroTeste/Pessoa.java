package OutroTeste;

public class Pessoa {

	// atributos
	protected String nome;
	protected String sobrenome;
	
	//construtores
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}
	
	public Pessoa(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	// Getters and Setters
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
	
	public String imprimir() {
		return "Nome: " + nome + " " + sobrenome;
	}
	
}
