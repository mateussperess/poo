package exercicios_poli_heranca;

import java.util.ArrayList;
import java.util.List;

public class FolhaPagamento {
	List<Funcionario> funcionarios;
	
	public FolhaPagamento() {
		this.funcionarios = new ArrayList<>();
	}
	
	public void adicionarFuncionario(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
	}
	
	public void processarPagamento() {
		System.out.println("==== Processo de Pagamento ====");

		for (Funcionario funcionario : funcionarios) {
			System.out.println("Tipo de funcionario: "+funcionario.getClass().getSimpleName());
			System.out.println("Nome: " + funcionario.nome);
			System.out.println("R$: " + funcionario.calcularSalario());
			System.out.println("=====================");
		}
	}

}
