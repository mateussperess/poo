package revisao_prova_01;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nome;
	private String cpf;
	private List<Aluguel> historicoAlugueis = new ArrayList<>();
	
	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public List<Aluguel> getHistoricoAlugueis() {
		return historicoAlugueis;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setHistoricoAlugueis(List<Aluguel> historicoAlugueis) {
		this.historicoAlugueis = historicoAlugueis;
	}
	
	public void addAluguelAoHistorico(Aluguel aluguel) {
		this.historicoAlugueis.add(aluguel);
	}
}
