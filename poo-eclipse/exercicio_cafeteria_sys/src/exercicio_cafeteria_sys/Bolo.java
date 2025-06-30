package exercicio_cafeteria_sys;

public class Bolo implements Produto, Descontavel {
	String nome = "Bolo";
	double preco = 10.00;
	
	@Override
	public double calcularDesconto() {
		return preco * 0.10;
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public double getPreco() {
		return this.preco;
	}

}
