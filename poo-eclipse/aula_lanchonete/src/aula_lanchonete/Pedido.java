package aula_lanchonete;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private Cliente cliente;
	private List<Produto> produtos = new ArrayList<>();
	private TipoPagamento tipoPagamento;
	private CupomDesconto cupomDesconto;
	
	public Pedido(Cliente cliente, TipoPagamento tipoPagamento) {
		this.cliente = cliente;
		this.tipoPagamento = tipoPagamento;
	}
	
	public Pedido(Cliente cliente, TipoPagamento tipoPagamento, CupomDesconto cupomDesconto) {
		this.cliente = cliente;
		this.tipoPagamento = tipoPagamento;
		this.cupomDesconto = cupomDesconto;
	}
	
	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
	}
	
	public void exibirResumo() {
		System.out.println("--- Resumo pedido " +this.cliente.getNome()+ " ---");
		System.out.println("Nome do cliente: " + this.cliente.getNome());
		
		double total = 0;
		
		System.out.println("--- Lista de Produtos ---");
		if(!(produtos.isEmpty())) {
			for (Produto produto : produtos) {
				System.out.println(produto.getNome() +" - R$"+ produto.getPreco());
				total += produto.getPreco();
			}

			System.out.println("--- Total pedido: " +this.cliente.getNome()+ " ---");
			System.out.println("--- Valor: R$" +total);
			
			if(this.getCupomDesconto() != null) {
				switch (cupomDesconto) {
				case PROMO5:
					System.out.println("--- DECONTO APLICADO: PROMO5 ---");
					total -= 5;
					break;
				case PROMO10:
					System.out.println("--- DECONTO APLICADO: PROMO10 ---");
					total -= 10;
					
					break;
				case PROMO20:
					System.out.println("--- DECONTO APLICADO: PROMO20 ---");
					total -= 20;
					
					break;
					
				default:
					break;
				}
			} else if(produtos.size() >= 5) {
				System.out.println("--- DESCONTO APLICADO SEM CUPOM: 10% ---");
				total -= 10;
			}
			
			
			if(this.getTipoPagamento() == TipoPagamento.PIX || this.getTipoPagamento() == TipoPagamento.DINHEIRO) {
				System.out.println("Pagamento efetuado com sucesso");
			} else if (this.getTipoPagamento() == TipoPagamento.CREDITO) {
				System.out.println("Pagamento efetuado na modalidade Crédito");
			} else if (this.getTipoPagamento() == TipoPagamento.DEBITO) {
				System.out.println("Pagamento efetuado na modalidade Débito");
			}
			
			System.out.println("Total: " +total);
			
		} else {
			System.out.println("--- O cliente ainda não realizou nenhum pedido ---");
		}
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public CupomDesconto getCupomDesconto() {
		return cupomDesconto;
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}
	
	public TipoPagamento getTipoPagamento() {
		return tipoPagamento;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void setCupomDesconto(CupomDesconto cupomDesconto) {
		this.cupomDesconto = cupomDesconto;
	}
	
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public void setTipoPagamento(TipoPagamento tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
}
