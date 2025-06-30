package exercicio_cafeteria_sys;

public class Cafe implements Produto {

	String nome = "Café";
	double preco = 5.00;
	
	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public double getPreco() {
		return this.preco;
	}

}
