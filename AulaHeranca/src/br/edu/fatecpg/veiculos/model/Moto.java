package br.edu.fatecpg.veiculos.model;

import java.util.Scanner;

public class Moto extends Veiculo{
	public String tipo;
	public int qtd_marcha;
	
	public Moto(String mod,String mrc,int ano, String cor,String tipo, int marcha) {
		super(mod,mrc,ano,cor);
		this.tipo = tipo;
		this.qtd_marcha = marcha;
		
	}
	
	public void acelerar() {
		System.out.println("Acelerando");
	}
	public void marcha() {
		int m;
		int ma = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Deseja ir para qual marcha?");
		m = scan.nextInt();
		if(ma<qtd_marcha) {
			while(ma!=m) {
				ma++;
				System.out.println(ma+" ºMarcha");
			}
			
		}
		else {
			System.out.println(ma);
			
		}
	}
}
