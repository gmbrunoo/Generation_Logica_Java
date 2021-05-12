package Projeto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Metodo extends Acessibilidade{
	
	Scanner ler = new Scanner(System.in);
	Acessibilidade aces = new Acessibilidade();
	ArrayList<String> teste = new ArrayList();
	
	public void cadastrarPessoa() {
		
		System.out.println("==Pesquisa IBGE==\n");
		System.out.println("Digite seu primeiro nome: ");
		aces.setNome(ler.next());
		
		System.out.println("Digite seu CPF: ");
		aces.setCpf(ler.next());
		
		System.out.println("Digite sua idade: ");
		aces.setIdade(ler.nextInt());
		
		


		cadastrarFamilia();
		
	}
	
	public void cadastrarFamilia() {
		System.out.println("Digite a quantidade de pessoas na casa: ");
		aces.setQtdPessoas(ler.nextInt());
		
		System.out.println("Digite a renda familiar: ");
		aces.setRendaFamiliar(ler.nextDouble());
		
		System.out.println("Digite a quantidade de geladeiras: ");
		aces.setGeladeira(ler.nextInt());
		
		System.out.println("Digite a quantidade de carros: ");
		aces.setCarro(ler.nextInt());
		
		System.out.println("Digite a quantidade de televisões: ");
		aces.setTelevisao(ler.nextInt());
		
		System.out.println("Digite a quantidade de computadores: ");
		aces.setComputador(ler.nextInt());
		
		cadastrarAcessibilidade();
	}
	
	public void cadastrarAcessibilidade() {
		int i;
		int d;
		
		System.out.println("Tem acesso a educação? (Sim = 1/Não = 2)");
		i = ler.nextInt();
		if(i == 1) {
			aces.setEducacao("Sim");
		}else if (i == 2){
			aces.setEducacao("Não");
		}else {
			System.out.println("Opção inválida");
			return;
		}
		System.out.println("Tem acesso a internet? (Sim = 1/Não = 2)");
		d = ler.nextInt();
		if(d == 1) {
			aces.setInternet("Sim");
		}else if (d == 2){
			aces.setInternet("Não");
		}else {
			System.out.println("Opção inválida");
			return;
		}
		
		teste.add("Nome: "   + aces.getNome()  + "\n" +
				  "Idade: "  + aces.getIdade() + "\n" +
				  "CPF :" + aces.getCpf() + "\n" +
				  "Quantidade Pessoas :"+ aces.getQtdPessoas() + "\n" +
				  "Renda Familiar :"+ aces.getRendaFamiliar() + "\n" +
				  "Geladeiras :" + aces.getGeladeira() + "\n" +
				  "Carros :"+ aces.getCarro()+ "\n" +
				  "Televisores :" + aces.getTelevisao()+ "\n" +
				  "Computadores :"+ aces.getComputador()+ "\n" +
				  "Educação :"+ aces.isEducacao()+ "\n" +
				  "Internet :"+ aces.isInternet());
		
		cadastrarNovamente();
	}
	
	public void exibirDados() {
		//System.out.println(teste);
		
//		System.out.println("==========================================");
//		System.out.println("===== Cadastro efetuado com sucesso! =====");
//		System.out.println("==========================================\n");
//		System.out.println("============= Dados Pessoais =============");
//		System.out.println("Nome: " + aces.getNome());
//		System.out.println("Idade: " + aces.getIdade());
//		System.out.println("CPF: " + aces.getCpf());
//		System.out.println("============= Renda Familiar =============");
//		System.out.println("Nucleo familiar: " + aces.getQtdPessoas() + " pessoas");
//		System.out.println("Renda familiar: " + aces.getRendaFamiliar() + " R$");
//		System.out.println("================== Bens ==================");
//		System.out.println("Geladeiras: " + aces.getGeladeira());
//		System.out.println("Carros: " + aces.getCarro());
//		System.out.println("Televisores: " + aces.getTelevisao());
//		System.out.println("Computadores: " + aces.getComputador());
//		System.out.println("============ Acesso a Educação ============");
//		System.out.println("Educação: " + aces.isEducacao());
//		System.out.println("Internet: " + aces.isInternet());
//		System.out.println("==========================================");
//		System.out.println("===== Cadastro efetuado com sucesso! =====");
//		System.out.println("==========================================\n");

       for (String teste : teste) {
		System.out.println(teste);
	}
		return;
	}
	
	public void cadastrarNovamente() {
		int i;
		
		System.out.println("Deseja cadastrar outra familia? ");
		i = ler.nextInt();
		
		if(i == 1) {
			cadastrarPessoa();
		}else {
			exibirDados();
		}
	}
}
