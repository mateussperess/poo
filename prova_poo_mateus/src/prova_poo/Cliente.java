package prova_poo;

public class Cliente {
	private String nome;
	private String endereco;
	private FormaPagamento formaPagamento;
	
	public Cliente(String nome, String endereco, FormaPagamento formaPagamento) {
		this.nome = nome;
		this.endereco = endereco;
		this.formaPagamento = formaPagamento;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
