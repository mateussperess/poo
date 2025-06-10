package exercicios_poli_heranca;

public class FuncionarioComissionado extends Funcionario {
	protected double vendasRealizadas;
	protected double comissao = 0.1; // 10% 
	
	public FuncionarioComissionado(String nome, double salarioBase, double vendasRealizadas) {
		super(nome, salarioBase);
		this.vendasRealizadas = vendasRealizadas;
	}
	
	@Override
	protected double calcularSalario() {
		return this.salarioBase + (vendasRealizadas * comissao);
	}
}
