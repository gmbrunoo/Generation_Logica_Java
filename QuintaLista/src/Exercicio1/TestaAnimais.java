package Exercicio1;

public class TestaAnimais {

	
	public static void main(String[] args) {
		
		Cavalo cavalo = new Cavalo();
		Cachorro cachorro = new Cachorro();
		Preguica preguica = new Preguica();

		cavalo.setNome("Pé de pano");
		System.out.println("\n	Nome: " + cavalo.getNome());
		
		cavalo.setIdade(25);
		System.out.println("	idade: " + cavalo.getIdade() + " anos, melhor idade");
		
		cavalo.setCorrer("O cavalo esta de buenas");
		System.out.println("	" + cavalo.getCorrer() + "\n");
		
		cavalo.getImagem();
		cavalo.emitirSom();
		
		cachorro.setNome("CãoDog");
		System.out.println("\n	Nome: " + cachorro.getNome());
		
		cachorro.setIdade(10);
		System.out.println("	idade: " + cachorro.getIdade() + " anos, melhor idade");
		
		cachorro.setCorrer("O cãoDo esta de buenas");
		System.out.println("	" + cachorro.getCorrer() + "\n");
		
		cachorro.getImagem();
		
		preguica.setNome("Sid - Deus do fogo");
		System.out.println(" 	" +preguica.getNome());
		
		preguica.setIdade(25);
		System.out.println(" 	" +preguica.getIdade() + " anos, melhor idade");
		
		preguica.setSubirEmArvore("A gente vai viver!");
		System.out.println(" 	" +preguica.getSubirEmArvore());
		
		preguica.getImagem();
		preguica.emitirSom();
		
	}
}
