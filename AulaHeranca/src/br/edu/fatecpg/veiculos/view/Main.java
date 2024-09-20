package br.edu.fatecpg.veiculos.view;

import br.edu.fatecpg.veiculos.model.Caminhao;
import br.edu.fatecpg.veiculos.model.Carro;
import br.edu.fatecpg.veiculos.model.Moto;
import br.edu.fatecpg.veiculos.model.Veiculo;

public class Main {

	public static void main(String[] args) {
		Carro carro = new Carro("REnault","LOgan",2024,"Prata",5,"Sedan");
		carro.ligar();
		carro.ligarAr();
		carro.acelerar();
		carro.desligar();
		
		Moto moto = new Moto("Honda","CG160 Start",2024,"Preta","Street",8);
		moto.ligar();
		moto.marcha();
		moto.acelerar();
		moto.desligar();
		
		Caminhao caminhao = new Caminhao("Scania","ABCD",2024,"Azul",3,3.500);
		caminhao.ligar();
		caminhao.carregarCarga();
		caminhao.descarregar();
		caminhao.desligar();
	}

}
