package prova_poo;

public class Produto {
	private String nome;
	private double preco;
	private CategoriaProduto categoriaProduto;
	
	public Produto(String nome, double preco, CategoriaProduto categoriaProduto) {
		this.nome = nome;
		this.preco = preco;
		this.categoriaProduto = categoriaProduto;
	}
	
	public CategoriaProduto getCategoriaProduto() {
		return categoriaProduto;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setCategoriaProduto(CategoriaProduto categoriaProduto) {
		this.categoriaProduto = categoriaProduto;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
}	
