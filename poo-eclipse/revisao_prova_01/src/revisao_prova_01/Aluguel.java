package revisao_prova_01;

import java.util.ArrayList;
import java.util.List;

public class Aluguel {
	private Cliente cliente;
	private List<Filme> filmesAlugados = new ArrayList<>();
	private FormaPagamento formaPagamento;
	private DescontoPromocional descontoPromocional;
	
	public Aluguel(Cliente cliente, FormaPagamento formaPagamento) {
		this.cliente = cliente;
		this.formaPagamento = formaPagamento;
	}
	
	public Aluguel(Cliente cliente, FormaPagamento formaPagamento, DescontoPromocional descontoPromocional) {
		this.cliente = cliente;
		this.formaPagamento = formaPagamento;
		this.descontoPromocional = descontoPromocional;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public DescontoPromocional getDescontoPromocional() {
		return descontoPromocional;
	}
	
	public List<Filme> getFilmesAlugados() {
		return filmesAlugados;
	}
	
	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void setDescontoPromocional(DescontoPromocional descontoPromocional) {
		this.descontoPromocional = descontoPromocional;
	}
	
	public void setFilmesAlugados(List<Filme> filmesAlugados) {
		this.filmesAlugados = filmesAlugados;
	}
	
	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
	public void adicionarFilme(Filme filme) {
		this.filmesAlugados.add(filme);
	}
	
	public void exibirResumoAluguel() {
		System.out.println("********** Resumo do aluguel **********");
		System.out.println("Nome do cliente: " + this.getCliente().getNome());
		System.out.println("Forma de pagamento: " );
		System.out.println("---- Lista de filmes ----");
		
		double total = 0;
		for (Filme filme : filmesAlugados) {
			filme.dadosFilme();
			System.out.println("************");
			total += filme.getPrecoAluguel();
		}
		System.out.println("-------------------------");
		String formaPgto = formaPagamento(this.getFormaPagamento());
		System.out.println("Forma de Pagamento: " + formaPgto);
		
		System.out.println(String.format("Valor total: R$%.2f", total));
		
		if(filmesAlugados.size() >= 3 && this.getDescontoPromocional() == null) {
			System.out.println("DESCONTO APLICADO: DESCONTO_20");
			this.setDescontoPromocional(DescontoPromocional.DESCONTO_20);
			total = total - 20.0;
		} else if (this.getDescontoPromocional() == DescontoPromocional.DESCONTO_10) {
			System.out.println("DESCONTO APLICADO: DESCONTO_10");
			total = total - 10.0;
		} else if(this.getDescontoPromocional() == null){
			this.setDescontoPromocional(DescontoPromocional.NENHUM);
		}
		
		if (this.getDescontoPromocional() != DescontoPromocional.NENHUM) {
		    System.out.println(String.format("Valor total com cupom "+this.getDescontoPromocional().toString()+" aplicado: R$%.2f", total));
		}
	}
	
	public static String formaPagamento(FormaPagamento formaPagamento) {
		String retornoForPag = "";
		switch (formaPagamento) {
		case DINHEIRO:
			retornoForPag = "Dinheiro";
			break;
		case CARTAO_DEBITO:
			retornoForPag = "Cartão de Débito";
			break;
		case CARTAO_CREDITO:
			retornoForPag = "Cartão de Crédito";

			break;
		case PIX:
			retornoForPag = "Pix";
			break;
		}
		
		return retornoForPag;
	}
}
