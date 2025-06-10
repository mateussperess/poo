package exercicios_chat_3;

public class Comodo {
	private String nome;
	private int quantidadeJanelas;
	
	public Comodo(String nome, int quantidadeJanelas) {
		this.nome = nome;
		this.quantidadeJanelas = quantidadeJanelas;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setQuantidadeJanelas(int quantidadeJanelas) {
		this.quantidadeJanelas = quantidadeJanelas;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getQuantidadeJanelas() {
		return quantidadeJanelas;
	}
}
