package Exercicio6;

public class TestaBanco {

	public static void main(String[] args) {
		
		Banco conta = new Banco();

		conta.setNome("nome");
		conta.setAgencia("agencia");
		conta.setConta("conta");
		conta.setPix("pix");
		conta.scan();
		conta.print();
		
	}
}
