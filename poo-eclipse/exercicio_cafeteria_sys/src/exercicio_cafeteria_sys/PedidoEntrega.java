package exercicio_cafeteria_sys;

import java.util.List;

public class PedidoEntrega extends Pedido {
	private String endereco;
	double taxa = 5.00;
	
	public PedidoEntrega(String id, List<Produto> produtos, String endereco) {
		super(id, produtos);
		this.setEndereco(endereco);
	}

	@Override
	public double calcularTotal() {
		if(getProdutos().isEmpty()) {
			throw new PedidoVazioException("O pedido está vazio!");
		}
		
		double total = 0.0;
		
		for (Produto produto : getProdutos()) {
			total += produto.getPreco();
			
			if(produto instanceof Descontavel) {
				total -= ((Descontavel) produto).calcularDesconto(); // se o produto for uma instância de produto em que possui desconto, esse valor é descontado através dessa linha diretamente
			}
		}
		
		return total + taxa;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		if(endereco == null || endereco.trim().isEmpty()) {
			throw new EnderecoInvalidoException("Informe um endereço válido!");
		}
		
		this.endereco = endereco;
	}

}
