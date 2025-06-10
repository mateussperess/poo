package prova_poo;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String nomeCliente;
		String enderecoCliente;
		FormaPagamento formaPagamentoCliente = FormaPagamento.PIX;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o nome do cliente: ");
		nomeCliente = sc.nextLine();
		System.out.println("Informe o endereco do cliente: ");
		enderecoCliente = sc.nextLine();
		
		Cliente cliente = new Cliente(nomeCliente, enderecoCliente, formaPagamentoCliente);
		
		Produto p1 = new Produto("PS5", 3000.0, CategoriaProduto.ELETRONICO);
		Produto p2 = new Produto("Livro tal", 350.0, CategoriaProduto.LIVRO);
		Produto p3 = new Produto("Colar", 123.0, CategoriaProduto.ACESSORIO);
		Produto p4 = new Produto("Televisão Smart", 2500.0, CategoriaProduto.ELETRONICO);
		Produto p5 = new Produto("Powerbank", 100.0, CategoriaProduto.ELETRONICO);
		Produto p6 = new Produto("Boné", 120.0, CategoriaProduto.ACESSORIO);

		Pedido pedido01 = new Pedido(cliente, CupomDesconto.DESCONTO70);
		pedido01.adicionarProduto(p1);
		pedido01.adicionarProduto(p2);
		pedido01.adicionarProduto(p3);
		pedido01.adicionarProduto(p5);
		pedido01.adicionarProduto(p6);
		
		Pedido pedido02 = new Pedido(cliente);
		pedido02.adicionarProduto(p1);
		pedido02.adicionarProduto(p2);

		pedido01.exibirDetalhesDaConta();
		pedido02.exibirDetalhesDaConta();
	}
}
