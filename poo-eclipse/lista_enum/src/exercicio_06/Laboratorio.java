package exercicio_06;

import java.util.ArrayList;
import java.util.List;

public class Laboratorio {
	private String nome;
	private List<Computador> computadores = new ArrayList<>();
	
	public Laboratorio(String nome, List<Computador> computadores) {
		this.nome = nome;
		this.computadores = computadores;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Computador> getComputadores() {
		return computadores;
	}
	
	public void setComputadores(List<Computador> computadores) {
		this.computadores = computadores;
	}
}
