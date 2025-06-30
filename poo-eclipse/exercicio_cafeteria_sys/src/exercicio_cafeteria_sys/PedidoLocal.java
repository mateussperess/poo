package exercicio_cafeteria_sys;

import java.util.List;

public class PedidoLocal extends Pedido {

	public PedidoLocal(String id, List<Produto> produtos) {
		super(id, produtos);
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
				total -= ((Descontavel) produto).calcularDesconto();
			}
		}
		
		return total;
	}

}
