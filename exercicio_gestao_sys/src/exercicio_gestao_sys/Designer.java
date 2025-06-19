package exercicio_gestao_sys;

public class Designer extends Funcionario implements CriaPrototipos, ParticipaDeUX {

	public Designer(String nome, String cargo, Nivel nivel) {
		super(nome, cargo, nivel);
	}
	
	@Override
	public void exibirInformacoes() {
		System.out.println("==== Designer ====");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Cargo: " + this.getCargo());
		System.out.println("Nível: " + this.getNivel().getDescricao());	}

	@Override
	public void baterPonto() {
		System.out.println(this.getNome() + "bateu ponto.");
		System.out.println("Ponto batido como: " + this.getCargo());	
	}

	@Override
	public void criaPrototipos() {
		System.out.println(this.getNome() + " está criando protótipos.");
	}
	
	@Override
	public void participaDeUX() {
		System.out.println(this.getNome() + " está participando dos processos UX.");
	}

}
