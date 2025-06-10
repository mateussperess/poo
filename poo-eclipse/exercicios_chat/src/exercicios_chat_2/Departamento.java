package exercicios_chat_2;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
	String nome;
	int andar;
	private List<Funcionario> funcionarios = new ArrayList<>();
	
	public Departamento(String nome, int andar) {
		this.nome = nome;
		this.andar = andar;
	}
	
	public int getAndar() {
		return andar;
	}
	
	public void setAndar(int andar) {
		this.andar = andar;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void addFuncionarios(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}
	
	public void listarFuncionariosDpt() {
		System.out.println("---- Funcionarios do departamento " +this.getNome()+ " ----");
		int i = 1;
		for (Funcionario funcionario : funcionarios) {
			System.out.println("Nome do funcionario " + i + ": " + funcionario.getNome());
			System.out.println("Idade do funcionario " + i + ": " + funcionario.getIdade());
			i++;
		}
	}
}
