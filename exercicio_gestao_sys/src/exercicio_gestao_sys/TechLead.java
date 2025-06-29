package exercicio_gestao_sys;

public class TechLead extends Funcionario implements Codifica, RevisaPullRequest, OrganizaSprint, MentoraTime {

	public TechLead(String nome, String cargo, Nivel nivel) {
		super(nome, cargo, nivel);
	}

	@Override
	public void mentoraTime() {
		System.out.println(this.getNome() + " está mentorando o time. Segue o pai.");
	}

	@Override
	public void organizaSprint() {
		System.out.println(this.getNome() + " está liderando o Sprint.");
	}

	@Override
	public void revisarPullRequest() {
		System.out.println(this.getNome() + " está revisando um pull request.");
	}

	@Override
	public void codificar() {
		System.out.println(this.getNome() + " está codificando novas features.");
	}

}
