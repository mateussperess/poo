package exercicio_locadora;

public class Cliente {
	private String nome;
	private String sobrenome;
	private String cpf;
	private String telefone;
	private boolean hasLocacao = false;

	public Cliente(String nome, String sobrenome, String cpf, String telefone) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.telefone = telefone;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public boolean hasLocacao() {
		return this.hasLocacao;
	}
	
	public void setLocacao(boolean hasLocacao) {
		this.hasLocacao = hasLocacao;
	}

}
