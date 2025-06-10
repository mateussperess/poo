package exercicios_chat_1;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	private String cpf;
	private String nome;
	private int idade;
	
	private List<Telefone> numeros = new ArrayList<>();
	
	public Pessoa(String cpf, String nome, int idade) {
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void adicionarTelefone(Telefone telefone) {
		numeros.add(telefone);
	}
	
	public void listarTelefones() {
		System.out.println("Telefones da pessoa " +this.getNome());
		int i = 1;
		for (Telefone telefone : numeros) {
			System.out.println("Numero " +i+ ": " + telefone.getNumero());
			i++;
		}
	}
	
}
