package exercicio_gestao_sys;

public class Designer extends Funcionario implements CriaPrototipos, ParticipaDeUX {

	public Designer(String nome, String cargo, Nivel nivel) {
		super(nome, cargo, nivel);
	}
	
	@Override
	public void criaPrototipos() {
		System.out.println(this.getNome() + " está desenvolvendo protótipos.");
	}
	
	@Override
	public void participaDeUX() {
		System.out.println(this.getNome() + " está fazendo parte dos processos UX.");
	}

}
