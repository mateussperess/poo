package exercicio_09;

public class Passageiro {
	private String nome;
	private String sobrenome;
	
	public Passageiro(String nome, String sobreome) {
		this.nome = nome;
		this.sobrenome = sobreome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
}
