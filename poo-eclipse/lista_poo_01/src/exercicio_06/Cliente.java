package exercicio_06;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nome;
	private String cpf;
	private List<ContaBancaria> contas = new ArrayList<>();
	
	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public void addContas(ContaBancaria conta) {
		contas.add(conta);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public List<ContaBancaria> getContas() {
		return contas;
	}
	
	public void setContas(List<ContaBancaria> contas) {
		this.contas = contas;
	}


}
