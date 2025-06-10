package exercicio_02;

public class Camiseta {
	private Tamanho tamanho;
	private String cor;
	
	public Camiseta(Tamanho tamanho, String cor) {
		this.tamanho = tamanho;
		this.cor = cor;
	}
	
	public Tamanho getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(Tamanho tamanho) {
		this.tamanho = tamanho;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
}
