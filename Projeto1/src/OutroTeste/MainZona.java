package OutroTeste;

import java.util.Scanner;

public class MainZona {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // para int - Para não dar bug
		Scanner inputString = new Scanner(System.in);// para string -
		
		int menu;
		Pessoa objPessoa;
		String nome, sobrenome;
		
		do {
			exibirMenu();
			menu = input.nextInt();
			
			switch (menu) {
			case 1: // Cadastrar
				System.out.println("============== Cadastrar ==============");
				System.out.println("Digite seu nome: ");
				nome = inputString.nextLine();
				System.out.println("\nDigite seu sobrenome: ");
				sobrenome = inputString.nextLine();
				
				// cria objeto
				objPessoa = new Pessoa(nome, sobrenome);
				
				// cadastra
				Lista.adicionar(objPessoa);
				break;
				
			case 2: // Listar
				System.out.println("============== Listar ==============");
				System.out.println(Lista.listar());
				break;
				
			case 3: // Excluir
				System.out.println("============== Excluir ==============");
				System.out.println("Digite seu nome: ");
				nome = inputString.nextLine();
				
				if(!(Lista.getListaDePessoas().isEmpty())) { // Lista cheia
					if(Lista.remover(nome)) {
						System.out.println("Cadastro Removido");
					}else {
						System.out.println("Cadastro não encontrado");
					}
				}else {
					System.out.println("Não há dados cadastrados");
				}
				break;
				
			case 4: // Pesquisar por nome
				System.out.println("============== Pesquisar ==============");
				System.out.println("Digite seu nome: ");
				nome = inputString.nextLine();
				
				System.out.println("Existem " + Lista.pesquisarNome(nome) + " "
											  + "Pessoas com o nome: " + nome);
				break;
				
			case 5: // Pesquisar por sobrenome
				System.out.println("============== Pesquisar ==============");
				System.out.println("Digite seu sobrenome: ");
				nome = inputString.nextLine();
				
				System.out.println("Existem " + Lista.pesquisarNome(nome) + " "
											  + "Pessoas com o sobrenome: " + nome);
				break;
				
			case 0: // Saindo
				System.out.println("Saindo... ");
				break;

			default:
				System.out.println("Opção inválida!");
				break;
			}
				
		}while (menu != 0);
	}
	
	static void exibirMenu() {
		System.out.println("============= Pessoas Cadastradas =============");
		System.out.println("[1] - Cadastrar");
		System.out.println("[2] - Listar");
		System.out.println("[3] - Excluir");
		System.out.println("[4] - Pesquisar por nome");
		System.out.println("[5] - Pesquisar por sobrenome");
		System.out.println("[0] - Sair");
		System.out.println("============== Escolha uma opção ==============");
	}
}
