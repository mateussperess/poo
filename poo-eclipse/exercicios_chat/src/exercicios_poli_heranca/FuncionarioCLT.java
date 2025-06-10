package exercicios_poli_heranca;

public class FuncionarioCLT extends Funcionario {

	public FuncionarioCLT(String nome, double salarioBase) {
		super(nome, salarioBase);
	}
	
	@Override
	protected double calcularSalario() {
		return this.salarioBase;
	}
}
