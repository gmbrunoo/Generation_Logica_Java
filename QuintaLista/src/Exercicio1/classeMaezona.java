package Exercicio1;

public abstract class classeMaezona {

	protected String Imagem;
	private String nome;
	private int idade;
	private String correr;
	
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

	public String getCorrer() {
		return correr;
	}
	public void setCorrer(String correr) {
		this.correr = correr;
	}

	public String getImagem(String imagem) {
		return Imagem;
	}
	public void setImagem(String imagem) {
		Imagem = imagem;
	}
	
	
	
	

	public abstract void barulhoBicho();	
	
}
