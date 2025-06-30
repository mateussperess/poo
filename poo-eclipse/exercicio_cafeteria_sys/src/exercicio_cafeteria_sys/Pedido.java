package exercicio_cafeteria_sys;

import java.util.ArrayList;
import java.util.List;

public abstract class Pedido {

	private String id;
	private List<Produto> produtos = new ArrayList<>();
	
	public Pedido(String id, List<Produto> produtos) {
		this.id = id;
		this.produtos = produtos;
	}
	
	public void adicionarProduto(Produto produto) {
		if(produto == null) {
			throw new ProdutoInvalidoException("Produto nulo nao pode ser adicionado!");
		}
		
		produtos.add(produto);
	}
	
	public abstract double calcularTotal();
	
	public String getId() {
		return id;
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

}
