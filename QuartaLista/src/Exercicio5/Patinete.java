package Exercicio5;

import java.util.Scanner;

public class Patinete {

	private String motor;
	private int velocidadeMaxima;
	private String marca;
	private String modelo;
	private double preco;
	
	public Patinete(String motor, int velocidadeMaxima, String marca, String modelo, double preco) {
		this.motor = motor;
		this.velocidadeMaxima = velocidadeMaxima;
		this.marca = marca;
		this.modelo = modelo;
		this.preco = preco;
	}

	public String isMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	public void scan() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Seu patinete é motorizado? ");
		setMotor(input.nextLine());
		
		System.out.println("Digite a marca do seu patinete:  ");
		setMarca(input.nextLine());
		
		System.out.println("Digite o modelo do seu patinete: ");
		setModelo(input.nextLine());
		
		System.out.println("Digite o preço do seu patinete ");
		setPreco(input.nextDouble());
		
		System.out.println("Digite a velocidade maxima do seu patinete: ");
		setVelocidadeMaxima(input.nextInt());
		
		mostrarPatinete();
	}
	
	public void mostrarPatinete() {
		
		System.out.println("Seu patinete possui motor: " + motor ); 
		System.out.println("A velocidade Maxima é: " + velocidadeMaxima); 
		System.out.println("A marca é: " + marca); 
		System.out.println("O modelo é: " + modelo); 
		System.out.println("O preço do patinete foi: " + preco); 
	}
	

	
	
}
