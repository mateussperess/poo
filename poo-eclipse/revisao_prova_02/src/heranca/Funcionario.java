package heranca;

public class Funcionario extends Pessoa {
	int setor;
	
	public Funcionario(String nome, String cpf, int setor) {
		super(nome, cpf);
		this.setor = setor;
	}
	
	@Override
	public void informacoesBasicas() {
		super.informacoesBasicas();
		System.out.println("Setor do funcionario: " + this.setor);
	}

}
