package br.edu.fatecpg.veiculos.model;

public class Caminhao extends Veiculo {
	public int qtd_eixo;
	public double max_carga;
	
	public  Caminhao(String mod,String mrc, int ano, String cor, int eixo,double carga) {
		super(mod,mrc,ano,cor);
		this.qtd_eixo = eixo;
		this.max_carga = carga;
		
	}
	public void carregarCarga() {
		System.out.println("Carregando");
	}
	public void descarregar() {
		System.out.println("Descarregando");
	}
}
