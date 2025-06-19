package exercicio_gestao_sys;

public enum Nivel {
    ESTAGIARIO("Estagiário"),
    JUNIOR("Júnior"),
    PLENO("Pleno"),
    SENIOR("Sênior"),
    TECH_LEAD("Tech Lead"),
    GERENTE("Gerente"),
    ESPECIALISTA("Especialista");
	
	private String descricao;
	
	Nivel(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
