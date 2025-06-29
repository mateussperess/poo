package exercicio_gestao_sys;

public class Desenvolvedor extends Funcionario implements Codifica, RevisaPullRequest {

	public Desenvolvedor(String nome, String cargo, Nivel nivel) {
		super(nome, cargo, nivel);
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
