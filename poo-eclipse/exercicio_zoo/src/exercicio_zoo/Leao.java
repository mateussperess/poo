package exercicio_zoo;

public class Leao extends Animal {
	
	public Leao(String nome) {
		super(nome);
	}

	@Override
	public String emitirSom() {
		return this.getNome() + " ruge!";
	}

	@Override
	public String mover() {
		return this.getNome() + " caminha/corre!";
	}

}
