package POO;

public class Pessoa {

	private String nome;
	private String sobrenome;
	
	public Pessoa (String primeiro, String ultimo) { // precisa de nomes diferentes das privates
		nome = primeiro;
		sobrenome = ultimo;
	}
	
	public String getNomeCompleto() {
		String nomeCompleto = nome + " " + sobrenome;
		return nomeCompleto;
	}
}
