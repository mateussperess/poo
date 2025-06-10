package exercicios_chat_2;

public class Funcionario {
	String nome;
	int idade;

	public Funcionario(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
