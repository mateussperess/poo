package exercicio_gestao_sys;

public class Estagiario extends Funcionario implements Codifica, CriaPrototipos, ParticipaDeUX{

	public Estagiario(String nome, String cargo, Nivel nivel) {
		super(nome, cargo, nivel);
	}

	@Override
	public void participaDeUX() {
		System.out.println(this.getNome() + " está fazendo parte dos processos UX.");
	}

	@Override
	public void criaPrototipos() {
		System.out.println(this.getNome() + " a criar protótipos.");
	}

	@Override
	public void codificar() {
		System.out.println(this.getNome() + " está desenvolvendo novas features.");
	}
}
