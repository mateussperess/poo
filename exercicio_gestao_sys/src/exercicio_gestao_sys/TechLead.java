package exercicio_gestao_sys;

public class TechLead extends Funcionario implements Codifica, RevisaPullRequest, OrganizaSprint, MentoraTime {

	public TechLead(String nome, String cargo, Nivel nivel) {
		super(nome, cargo, nivel);
	}

	@Override
	public void exibirInformacoes() {
		System.out.println("==== Tech Lead ====");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Cargo: " + this.getCargo());
		System.out.println("Nível: " + this.getNivel().getDescricao());		
	}

	@Override
	public void baterPonto() {
		System.out.println(this.getNome() + " bateu ponto.");
		System.out.println("Ponto batido como: " + this.getCargo());	
	}

	@Override
	public void mentoraTime() {
		System.out.println(this.getNome() + " está mentorando o time.");
	}

	@Override
	public void organizaSprint() {
		System.out.println(this.getNome() + " está organizando o Sprint.");
	}

	@Override
	public void revisarPullRequest() {
		System.out.println(this.getNome() + " está revisando um pull request.");
	}

	@Override
	public void codificar() {
		System.out.println(this.getNome() + " está revisando um pull request.");
	}

}
