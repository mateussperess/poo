package exercicios_poli_heranca;

// Você está desenvolvendo um sistema simples de folha de pagamento para uma empresa. 
// A empresa possui diferentes tipos de funcionários, e você precisa calcular 
// o salário de cada um com base em suas características.

public class Main {

	public static void main(String[] args) {
		FolhaPagamento folhaPagamento = new FolhaPagamento();
		
		FuncionarioCLT funcCLT = new FuncionarioCLT("Mateus", 2200);
		FuncionarioComissionado funcComiss = new FuncionarioComissionado("Jeremias", 1500, 5000);
		FuncionarioHorista funcHorista = new FuncionarioHorista("Dante", 2000, 8);
		
		folhaPagamento.adicionarFuncionario(funcCLT);
		folhaPagamento.adicionarFuncionario(funcComiss);
		folhaPagamento.adicionarFuncionario(funcHorista);
		folhaPagamento.processarPagamento();
	}
}
