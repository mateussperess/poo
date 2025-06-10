package exercicio_01;

public class Agenda {
	private DiaDaSemana diaComprimisso;
	private String descricaoCompromisso;
	
	public Agenda(DiaDaSemana diaComprimisso, String descricaoCompromisso) {
		this.diaComprimisso = diaComprimisso;
		this.descricaoCompromisso = descricaoCompromisso;
	}
	
	public DiaDaSemana getDiaComprimisso() {
		return diaComprimisso;
	}
	
	public void setDiaComprimisso(DiaDaSemana diaComprimisso) {
		this.diaComprimisso = diaComprimisso;
	}
	
	public String getDescricaoCompromisso() {
		return descricaoCompromisso;
	}
	
	public void setDescricaoCompromisso(String descricaoCompromisso) {
		this.descricaoCompromisso = descricaoCompromisso;
	}
}
