package exercicio_gestao_sys;

public class Desenvolvedor extends Funcionario implements Codifica, RevisaPullRequest {

	public Desenvolvedor(String nome, String cargo, Nivel nivel) {
		super(nome, cargo, nivel);
	}

	@Override
	public void exibirInformacoes() {
		System.out.println("==== Desenvolvedor ====");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Cargo: " + this.getCargo());
		System.out.println("Nível: " + this.getNivel().getDescricao());
	}

	@Override
	public void baterPonto() {
		System.out.println(this.getNome() + "bateu ponto.");
		System.out.println("Ponto batido como: " + this.getCargo());
	}

	@Override
	public void codificar() {
		System.out.println(this.getNome() + " está codificando novas features.");
	}
	

	@Override
	public void revisarPullRequest() {
		System.out.println(this.getNome() + " está revisando um pull request.");
	}
}
