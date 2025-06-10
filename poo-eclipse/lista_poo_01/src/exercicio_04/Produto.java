package exercicio_04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Produto {
	private String nome;
	private double preco;
	private int estoque;
	
	public Produto(String nome, double preco, int estoque) {
		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
	}
	
	public void ajustarEstoque(int novaQuantidade) {
		this.estoque = novaQuantidade;
	}
	
	public void ajustarEstoque(int novaQuantidade, String justificativa) {
		System.out.println("Estoque atualizado de " +this.estoque+ " para " +novaQuantidade+ " por motivos de: " +justificativa);
		this.estoque = novaQuantidade;
	}
	
	public void ajustarEstoque(int novaQuantidade, Date data) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Estoque atualizado de " +this.estoque+ " para " +novaQuantidade+ " em: " +sdf.format(data));
		this.estoque = novaQuantidade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getEstoque() {
		return estoque;
	}
	
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
}
