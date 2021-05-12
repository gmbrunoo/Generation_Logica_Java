package OutroTeste;

import java.util.ArrayList;

public class Lista {
	
	private static ArrayList<Pessoa> listaDePessoas = new ArrayList();
	
	//metodo Get
	public static ArrayList<Pessoa> getListaDePessoas() {
		return listaDePessoas;
	}
	
	//Adicionar na lista
	static public void adicionar(Pessoa p) {
		listaDePessoas.add(p);
	}
	
	//listar os dados
	static public String listar() {
		String saida = "";
		int i = 1;
		for(Pessoa p : listaDePessoas) {
			saida += "\n ============== Pessoa Nº" + (i++) + "==============\n";
			saida += p.imprimir() + "\n";
		}
		return saida;
	}
	
	//Pesquisar por nome
	static public int pesquisarNome(String nome) {
		int qtd = 0;
		
		for(Pessoa p : listaDePessoas) {
			if(p.getNome().equalsIgnoreCase(nome)) {
				qtd++;
			}
		}
		return qtd;
	}
	
	//Pesquisar por sobrenome
	static public int pesquisarSobrenome(String sobrenome) {
		int qtd = 0;
		
		for(Pessoa p : listaDePessoas) {
			if(p.getNome().equalsIgnoreCase(sobrenome)) {
				qtd++;
			}
		}
		return qtd;
	}
	
	//remover 
	static public boolean remover(String nome) {
		for(Pessoa p : listaDePessoas) {
			if(p.getNome().equalsIgnoreCase(nome)) {
				listaDePessoas.remove(p);
				return true;
			}
		}
		return false;
	}
		
	
	
	
}
