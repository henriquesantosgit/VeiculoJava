package br.edu.fatecpg.veiculos.model;

//sub classe
public class Carro extends Veiculo {
	//atributos só dele
	public int num_passageiros;
	public String tipo; 
	
	public Carro(String mod, String mrc, int ano, String cor,int num_p,String tipo) {
		//usando a superclasse , chamando os atributos de veiculo
		super(mod,mrc,ano,cor);
		
		
		this.num_passageiros = num_p;
		this.tipo = tipo;
		
	}
	public void acelerar() {
		System.out.println("Acelerando");
	}
	public void ligarAr() {
		System.out.println("Ar-condicionado ligado!");
	}
}
