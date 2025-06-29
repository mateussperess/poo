package exercicio_gestao_sys;

public class GerenteDeProjetos extends Funcionario implements GerenciaProjetos, OrganizaSprint{

	public GerenteDeProjetos(String nome, String cargo, Nivel nivel) {
		super(nome, cargo, nivel);
	}

	@Override
	public void organizaSprint() {
		System.out.println(this.getNome() + " está se preparando para organizar um Sprint");
	}

	@Override
	public void gerenciaProjetos() {
		System.out.println(this.getNome() + " está gerenciando os projetos em andamento");
	}

}
