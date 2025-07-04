package heranca;

public class Pessoa {
	public String nome;
	public String cpf;
	
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public void informacoesBasicas() {
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
	}
}
