package exercicio_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<Pedido> pedidos = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		StatusPedido status1 = StatusPedido.PENDENTE;
		StatusPedido status2 = StatusPedido.PROCESSANDO;
		StatusPedido status3 = StatusPedido.ENVIADO;
		StatusPedido status4 = StatusPedido.ENTREGUE;

		Pedido pedido1 = new Pedido(1, status1);
		Pedido pedido2 = new Pedido(2, status2);
		Pedido pedido3 = new Pedido(3, status3);
		Pedido pedido4 = new Pedido(4, status4);
		
		pedidos.add(pedido1);
		pedidos.add(pedido2);
		pedidos.add(pedido3);
		pedidos.add(pedido4);
		
		if(!(pedidos.isEmpty())) {
			for (Pedido pedido : pedidos) {
				switch (pedido.getStatus()) {
				case PENDENTE:
					System.out.println("O seu pedido se encontra pendente, aguarde!");
					break;
					
				case PROCESSANDO:
					System.out.println("O seu pedido está sendo processado, aguarde para mais informações.");
					break;
					
				case ENVIADO:
					System.out.println("O seu pedido foi enviado, aguarde o recebimento.");
					break;
					
				case ENTREGUE:
					System.out.println("O seu pedido foi entregue, que tal fornecer uma avaliação?");
					break;
					
				default:
					System.out.println("Status inválido");
					break;
				}
			}
		} else {
			System.out.println("--- Lista de pedidos vazia ---");
		}
		
		sc.close();
	}
}
