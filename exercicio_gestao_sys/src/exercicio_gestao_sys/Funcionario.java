package exercicio_gestao_sys;

public abstract class Funcionario {

	private String nome;
	private String cargo;
	private Nivel nivel;
	
	protected Funcionario(String nome, String cargo, Nivel nivel) {
		this.nome = nome;
		this.cargo = cargo;
		this.nivel = nivel;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public Nivel getNivel() {
		return nivel;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract void exibirInformacoes();
	public abstract void baterPonto();
}
