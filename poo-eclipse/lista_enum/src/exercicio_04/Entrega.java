package exercicio_04;

public class Entrega {
	private TipoEntrega tipoEntrega;
	private String destinatario;
	
	public Entrega(TipoEntrega tipoEntrega, String destinatario) {
		this.tipoEntrega = tipoEntrega;
		this.destinatario = destinatario;
	}
	
	public TipoEntrega getTipoEntrega() {
		return tipoEntrega;
	}
	
	public void setTipoEntrega(TipoEntrega tipoEntrega) {
		this.tipoEntrega = tipoEntrega;
	}
	
	public String getDestinatario() {
		return destinatario;
	}
	
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
}
