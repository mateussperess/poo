package exercicio_zoo;

public class Canguru extends Animal {
	
	public Canguru(String nome) {
		super(nome);
	}

	@Override
	public String emitirSom() {
		return this.getNome() + " tosse!";
	}

	@Override
	public String mover() {
		return this.getNome() + " pula!";
	}

}
