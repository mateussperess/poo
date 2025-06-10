package exercicio_08;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
	private String nome;
	private String endereco;
	List<Quarto> quartos = new ArrayList<>();
	
	public Hotel(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public void listarQuartos() {
		System.out.println("--- Quartos disponiveis para reserva ---");
		for (Quarto quarto : quartos) {
			System.out.println("--- Quarto ---");
			quarto.dadosQuarto();
			System.out.println("--------------");
		}
	}
	
	public Quarto getQuartoByNum(int numero) {
		Quarto quartoEscolhido = null; 

		for (Quarto quarto : quartos) {
			if(quarto.getNumero() == numero) {
				quartoEscolhido = quarto;
			}
		}
		
		return quartoEscolhido;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public List<Quarto> getQuartos() {
		return quartos;
	}
	
	public void setQuartos(List<Quarto> quartos) {
		this.quartos = quartos;
	}
}
