package exercicio_zoo;

/* Classe abstrata para representar um animal genérico */

public abstract class Animal {
	private String nome;
	
	public Animal(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	// Comportamento comum a todas as espécies
	public boolean alimentar() {
		System.out.println("Animal " +this.getClass().getName()+ " alimentado!");
		return true;
	}
	
	// Comportamento que varia de acordo com a espécie (definido pelas subclasses)
	public abstract String emitirSom();
	public abstract String mover();
}
