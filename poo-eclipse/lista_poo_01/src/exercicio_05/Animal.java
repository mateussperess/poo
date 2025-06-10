package exercicio_05;

public class Animal {
	private String nome;
	private String especie;
	private Pessoa pessoa;
	
	public Animal(String nome, String especie, Pessoa pessoa) {
		this.nome = nome;
		this.especie = especie;
		this.pessoa = pessoa;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEspecie() {
		return especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
}
