package exercicio_locadora;

public class Main {

	public static void main(String[] args) {
		Locadora locadora = new Locadora();
		
		Carro carro01 = new Carro("ABC-123", "Voyage", 1987, 2, false, "G. Aditivada");
		Moto moto01 = new Moto("BCA-231", "160cv", 2004, 2, false, "G. Comum");
		locadora.adicionarVeiculoEstoque(carro01);
		locadora.adicionarVeiculoEstoque(moto01);

		// carro01.mostrarDadosDoVeiculo();
		// moto01.mostrarDadosDoVeiculo();
		
		Cliente cliente01 = new Cliente("Mateus", "Peres", "12345", "5199663388");
		Cliente cliente02 = new Cliente("Ana Laura", "Mota", "54321", "5199663388");
		
		Locacao loc01 = new Locacao(cliente01, moto01);
		locadora.adicionarLocacaoAtiva(loc01);
		
		Locacao loc02 = new Locacao(cliente02, carro01);
		locadora.adicionarLocacaoAtiva(loc02);

		locadora.listarLocacoesAtivas();
		locadora.listarVeiculosDisponiveis();
		
	}

}
