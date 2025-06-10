package aula_lanchonete;

public class Main {
	public static void main(String[] args) {
		Cliente cliente01 = new Cliente("Mateus", "51123456");
		Cliente cliente02 = new Cliente("Ana Laura", "51231231");
		Cliente cliente03 = new Cliente("Jeremias", "123131");

		Produto produto01 = new Produto("Xis Carne", 21);
		Produto produto02 = new Produto("Xis Coração", 25);
		Produto produto03 = new Produto("Xis Vegano", 19.50);
		
		TipoPagamento pagamento01 = TipoPagamento.DEBITO;
		TipoPagamento pagamento02 = TipoPagamento.CREDITO;
		TipoPagamento pagamento03 = TipoPagamento.PIX;
		
		CupomDesconto cupomDesconto01 = CupomDesconto.PROMO20;
		CupomDesconto cupomDesconto02 = CupomDesconto.PROMO5;
		CupomDesconto cupomDesconto03 = CupomDesconto.PROMO10;
		
		Pedido pedido01 = new Pedido(cliente03, pagamento01, cupomDesconto01);
		pedido01.adicionarProduto(produto01);
		pedido01.adicionarProduto(produto02);
		pedido01.adicionarProduto(produto03);
		pedido01.adicionarProduto(produto03);
		pedido01.adicionarProduto(produto01);
		
		Pedido pedido02 = new Pedido(cliente01, pagamento03, cupomDesconto03);
		pedido02.adicionarProduto(produto01);
		pedido02.adicionarProduto(produto01);
		pedido02.adicionarProduto(produto01);
		pedido02.adicionarProduto(produto01);
		
		Pedido pedido03 = new Pedido(cliente02, pagamento02, cupomDesconto02);
		pedido03.adicionarProduto(produto02);
		pedido03.adicionarProduto(produto03);
		pedido03.adicionarProduto(produto01);
		pedido03.adicionarProduto(produto02);
		
		pedido01.exibirResumo();
		pedido02.exibirResumo();
		pedido03.exibirResumo();

	}
}
