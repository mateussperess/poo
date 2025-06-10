package exercicios_poli_heranca;

public abstract class Funcionario {
	protected String nome;
	protected double salarioBase;
	
	protected Funcionario(String nome, double salarioBase) {
		this.nome = nome;
		this.salarioBase = salarioBase;
	}
	
	protected abstract double calcularSalario();
}
