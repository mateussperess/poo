package heranca;

public class Gerente extends Pessoa {
	public int codGestao;
	
	public Gerente(String nome, String cpf, int codGestao) {
		super(nome, cpf);
		this.codGestao = codGestao;
	}
	
	@Override
	public void informacoesBasicas() {
		super.informacoesBasicas();
		System.out.println("Codigo da Gestao: " + this.codGestao);
	}
}
