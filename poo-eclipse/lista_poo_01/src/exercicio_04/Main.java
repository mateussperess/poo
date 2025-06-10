package exercicio_04;

import java.util.Date;
import java.util.Scanner;

//Implemente a classe Produto com atributos nome, preco e estoque. Crie três métodos
//sobrecarregados para atualizar o estoque: um que receba apenas a nova quantidade, um
//que receba a quantidade e uma justificativa (String), e outro que receba quantidade e data
//(LocalDate). Demonstre o uso na main.


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o nome do produto: ");
		String nomeProduto = sc.nextLine();
		System.out.println("Informe o preco do produto: ");
		double precoProduto = sc.nextDouble();
		sc.nextLine();
		System.out.println("Informe a quantidade do produto: ");
		int quantidadeProduto = sc.nextInt();
		sc.nextLine();
		
		Produto produto = new Produto(nomeProduto, precoProduto, quantidadeProduto);
		System.out.println("--- Produto criado ---");
		System.out.println("Nome do produto: " +produto.getNome());
		System.out.println("Preço do produto: " +produto.getPreco());
		System.out.println("Estoque do produto: " +produto.getEstoque());
		System.out.println("----------------------");

		System.out.println("Atualizando quantidade apenas com a nova quantidade: ");
		produto.ajustarEstoque(5);
		System.out.println("Novo estoque do produto: " +produto.getEstoque());
		System.out.println("----------------------");

		System.out.println("Atualizando quantidade com a nova quantidade e uma justificativa: ");
		produto.ajustarEstoque(10, "Corrigindo estoque");
		System.out.println("Novo estoque do produto: " +produto.getEstoque());
		System.out.println("----------------------");

		System.out.println("Atualizando quantidade com a nova quantidade e uma data: ");
		Date agora = new Date();
		produto.ajustarEstoque(15, agora);
		System.out.println("Novo estoque do produto: " +produto.getEstoque());
		System.out.println("----------------------");

		sc.close();
	}
}
