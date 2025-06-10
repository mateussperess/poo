package exercicios_poli_heranca;

public class FuncionarioHorista extends Funcionario {
	protected int horasTrabalhadas;
	protected int valorHora = 20;
	
	public FuncionarioHorista(String nome, double salarioBase, int horasTrabalhadas) {
		super(nome, salarioBase);
		this.horasTrabalhadas = horasTrabalhadas;
	}

	@Override
	protected double calcularSalario() {
		return this.salarioBase + (horasTrabalhadas * valorHora);
	}

}
