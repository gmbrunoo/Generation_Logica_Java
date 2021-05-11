package Exercicio2;

import java.util.Scanner;

public class Aviao {

	private String prefixo;
	private String modelo;
	private String fabricante;
	private int quantVoos;	
	
	public Aviao(String prefixo, String modelo, String fabricante, int quantVoos) {
		this.prefixo = prefixo;
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.quantVoos = quantVoos;
	}
	
	public String getPrefixo() {
		return prefixo;
	}
	public void setPrefixo(String prefixo) {
		this.prefixo = prefixo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public int getQuantVoos() {
		return quantVoos;
	}
	public void setQuantVoos(int quantVoos) {
		this.quantVoos = quantVoos;
	}
	
	
	public void avioesCadastrados(String prefixo, String modelo, String fabricante, int quantVoos) {
		
		System.out.println("Prefixo: " + prefixo);
		System.out.println("Modelo: " + modelo);
		System.out.println("Fabricante: " + fabricante);
		System.out.println("Voos efetuados: " + quantVoos);
		
	}
	
	public void cadastrarAviao() {
		Scanner input = new Scanner(System.in);
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o prefixo");
		setPrefixo(ler.nextLine());
		
		System.out.println("Informe o modelo");
		setModelo(ler.nextLine());
		
		System.out.println("Informe o fabricante");
		setFabricante(ler.nextLine());
		
		System.out.println("Informe o Quant. Voos");
		setQuantVoos(input.nextInt());
		
		System.out.println("\nAvião cadastrado com sucesso!");
		
		avioesCadastrados(prefixo, modelo, fabricante, quantVoos);
	}
}
