package exercicio_gestao_sys;

public class GerenteDeProjetos extends Funcionario implements GerenciaProjetos, OrganizaSprint{

	public GerenteDeProjetos(String nome, String cargo, Nivel nivel) {
		super(nome, cargo, nivel);
	}

	@Override
	public void exibirInformacoes() {
		// TODO Auto-generated method stub
	}

	@Override
	public void baterPonto() {
		// TODO Auto-generated method stub
	}

	@Override
	public void organizaSprint() {
		// TODO Auto-generated method stub
	}

	@Override
	public void gerenciaProjetos() {
		// TODO Auto-generated method stub
	}

}
