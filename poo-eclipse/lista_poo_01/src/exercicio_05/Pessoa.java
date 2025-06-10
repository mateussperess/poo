package exercicio_05;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	private String nome;
	private String telefone;
	private List<Animal> animais = new ArrayList<>();
	
	public Pessoa(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public void addAnimal(Animal animal) {
		animais.add(animal);
	}
	
	public void listarDados() {
		System.out.println("--- Dados da pessoa " +this.getNome()+ " ---");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Telefone: " + this.getTelefone());
		
		if(animais.size() > 0) {
			for (Animal animal : animais) {
				System.out.println("Nome do animal: " + animal.getNome());
				System.out.println("Especie do animal: " + animal.getEspecie());

			}
		} else {
			System.out.println("Essa pessoa não possui animais.");
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
