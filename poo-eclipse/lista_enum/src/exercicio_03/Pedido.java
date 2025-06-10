package exercicio_03;

public class Pedido {
	private int numeroPedido;
	private StatusPedido status;
	
	public Pedido(int numeroPedido, StatusPedido status) {
		this.numeroPedido = numeroPedido;
		this.status = status;
	}
	
	public int getNumeroPedido() {
		return numeroPedido;
	}
	
	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	
	public StatusPedido getStatus() {
		return status;
	}
	
	public void setStatus(StatusPedido status) {
		this.status = status;
	}
}
