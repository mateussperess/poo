package prova_poo;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private Cliente cliente;
	List<Produto> produtos = new ArrayList<>();
	private CupomDesconto cupomDesconto;
	private double valorTotal;
	
	public Pedido(Cliente cliente) {
		this.cliente = cliente;
		// this.valorTotal = valorTotal;
	}
	
	public Pedido(Cliente cliente, CupomDesconto cupomDesconto) {
		this.cliente = cliente;
		this.cupomDesconto = cupomDesconto;
		// this.valorTotal = valorTotal;
	}
	
	public void adicionarProduto(Produto produto) {
		this.produtos.add(produto);
	}
	
	public void exibirDetalhesDaConta() {
		System.out.println("***** Detalhes da Compra *****");
		
		System.out.println("Nome do cliente: " + this.cliente.getNome());
		System.out.println("Endereço do cliente: " + this.cliente.getEndereco());
		
		System.out.println("---- Lista de Produtos de " +this.cliente.getNome()+ "----");
		double total = 0;
		for (Produto produto : produtos) {
			System.out.println("Nome: " + produto.getNome());
			System.out.println("Preco: " + produto.getPreco());
			System.out.println("Categoria: " + produto.getCategoriaProduto().toString());
			total += produto.getPreco();
			System.out.println("*************");
		}
		
		this.setValorTotal(total);
		
		System.out.println("-------------------------");
		
		System.out.println("Forma de Pagamento: " + this.getCliente().getFormaPagamento().toString());
		
		if (this.getCupomDesconto() != null) {
			System.out.println("Cupom inserido: " + this.getCupomDesconto().toString());
			double valorTotal = aplicarCupom(this.getCupomDesconto());
		} else {
			System.out.println("Valor total: R$" + this.getValorTotal());
		}
	}
	
	public double aplicarCupom(CupomDesconto cupomDesconto) {
		double valorTotal = 0;
		boolean flagDesc70 = false;
		boolean flagDesc50 = false;
		boolean flagDesc20 = false;
		boolean flagFreteGratis = false;
		boolean flagDesc15 = false;
		boolean flagCustoFrete = false;

		switch (cupomDesconto) {
		case DESCONTO70:
			if(this.getValorTotal() >= 350 && this.cliente.getFormaPagamento() == FormaPagamento.PIX) {
				for (Produto produto : produtos) {
					if(produto.getCategoriaProduto() == CategoriaProduto.ELETRONICO) {
						System.out.println("Requisitos aceitos para aplicar o cupom: " + this.getCupomDesconto().toString());
						flagDesc70 = true;
						break;
					}
				}
			}
			
			break;
		
		case DESCONTO50:
			if(this.getValorTotal() > 350) {
				for (Produto produto : produtos) {
					if(produto.getCategoriaProduto() == CategoriaProduto.ELETRONICO) {
						System.out.println("Requisitos aceitos para aplicar o cupom: " + this.getCupomDesconto().toString());
						flagDesc50 = true;
						break;
					}
				}
			}
			break;
			
		case DESCONTO20:
			if(this.getValorTotal() > 150 && this.produtos.size() > 3) {
				System.out.println("Requisitos aceitos para aplicar o cupom: " + this.getCupomDesconto().toString());
				flagDesc20 = true;
				break;
			}
			break;
			
		case FRETEGRATIS: 
			if(this.getValorTotal() > 100) {
				System.out.println("Requisitos aceitos para aplicar o cupom: " + this.getCupomDesconto().toString());
				flagFreteGratis = true;
				break;			
			}
			break;
			
		case DESCONTO15: 
			System.out.println("Requisitos aceitos para aplicar o cupom: " + this.getCupomDesconto().toString());
			flagDesc15 = true;
			break;
			
		case CUSTOFRETE: 
			System.out.println("Requisitos aceitos para aplicar o cupom: " + this.getCupomDesconto().toString());
			flagCustoFrete = true;
		}
		
		
		if(flagDesc70 == true) {
			double valorAplicado = this.getValorTotal() - this.getCupomDesconto().getValorCupom();
			this.setValorTotal(valorAplicado);
			System.out.println("Valor total com cupom aplicado: R$" + this.getValorTotal());

		} else if (flagDesc50 == true) {
			double valorAplicado = this.getValorTotal() - this.getCupomDesconto().getValorCupom();
			this.setValorTotal(valorAplicado);
			System.out.println("Valor total com cupom aplicado: R$" + this.getValorTotal());

		} else if (flagDesc20 == true) {
			double valorAplicado = this.getValorTotal() - this.getCupomDesconto().getValorCupom();
			this.setValorTotal(valorAplicado);
			System.out.println("Valor total com cupom aplicado: R$" + this.getValorTotal());

		} else if (flagFreteGratis == true) {
			double valorAplicado = this.getValorTotal() + this.getCupomDesconto().getValorCupom();
			this.setValorTotal(valorAplicado);
			System.out.println("Valor total com cupom aplicado: R$" + this.getValorTotal());

		} else if(flagDesc15 == true) {
			double valorAplicado = this.getValorTotal() - this.getCupomDesconto().getValorCupom();
			this.setValorTotal(valorAplicado);
			System.out.println("Valor total com cupom aplicado: R$" + this.getValorTotal());
		
		} else if(flagCustoFrete == true) {
			double valorAplicado = this.getValorTotal() + this.getCupomDesconto().getValorCupom();
			this.setValorTotal(valorAplicado);
			System.out.println("Valor total com cupom aplicado: R$" + this.getValorTotal());
		}
		
		return valorTotal;
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
	
	public double getValorTotal() {
		return valorTotal;
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
	
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
}
