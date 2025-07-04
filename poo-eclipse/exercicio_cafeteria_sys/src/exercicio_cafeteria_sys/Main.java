package exercicio_cafeteria_sys;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		try {
			Produto bolo = new Bolo();
			Produto cafe = new Cafe();
			
			PedidoLocal pedidoLocal = new PedidoLocal("001", new ArrayList<>());
			pedidoLocal.adicionarProduto(bolo);
			pedidoLocal.adicionarProduto(cafe);
			
			System.out.println("Total do pedido local: R$" + pedidoLocal.calcularTotal());
			
			PedidoEntrega pedidoEntrega = new PedidoEntrega("002", new ArrayList<>(), "Andradas");
			pedidoEntrega.adicionarProduto(cafe);
			System.out.println("Total do pedido para entrega: R$" + pedidoEntrega.calcularTotal());
			
			// PedidoLocal testePedidoLocal	 = new PedidoLocal("003", new ArrayList<>());
			// bolo = null;
			// testePedidoLocal.adicionarProduto(bolo); // caso de exception
			
			// PedidoEntrega testePedidoEntrega = new PedidoEntrega("004", new ArrayList<>(), null); // caso de exception
			
			// PedidoEntrega testePedidoEntrega = new PedidoEntrega("004", new ArrayList<>(), "teste"); // caso de exception
			// testePedidoEntrega.calcularTotal(); // exception
			
			
			
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}
}
