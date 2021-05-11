package Exercicio7;

public class TestaPaciente {

	public static void main(String[] args) {
		
		Paciente paciente = new Paciente();

		paciente.setNome("nome");
		paciente.setAltura("altura");
		paciente.setPeso("peso");
		paciente.scan();
		paciente.print();
		
	}
}
