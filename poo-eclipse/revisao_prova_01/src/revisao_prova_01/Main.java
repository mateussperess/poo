package revisao_prova_01;

/*
 * Você deve desenvolver um sistema de locadora de filmes que permita o cadastro de clientes, 
 * filmes e o registro de aluguéis. O sistema precisa considerar descontos, formas de pagamento 
 * e o histórico de aluguéis de cada cliente.
*/

public class Main {
	public static void main(String[] args) {
		
		
		Filme filme01 = new Filme("Filme 01", GeneroFilme.ACAO, 20.80);
		Filme filme02 = new Filme("Filme 02", GeneroFilme.COMEDIA, 15.80);
		Filme filme03 = new Filme("Filme 03", GeneroFilme.DRAMA, 10.80);
		Filme filme04 = new Filme("Filme 04", GeneroFilme.DOCUMENTARIO, 8.80);
		Filme filme05 = new Filme("Filme 05", GeneroFilme.TERROR, 2.80);

		Cliente cliente01 = new Cliente("Mateus", "12345");
		
		Aluguel aluguel01 = new Aluguel(cliente01, FormaPagamento.DINHEIRO, DescontoPromocional.DESCONTO_10);
		aluguel01.adicionarFilme(filme01);
		aluguel01.adicionarFilme(filme02);
		// aluguel01.adicionarFilme(filme03);
		
		cliente01.addAluguelAoHistorico(aluguel01);
		
		aluguel01.exibirResumoAluguel();
	}
}
