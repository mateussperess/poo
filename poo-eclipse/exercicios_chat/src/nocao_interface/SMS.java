package nocao_interface;

public class SMS implements Notificacao {
	private String remetente;
	private String destinatario;
	private String mensagem;
	
	public SMS(String remetente, String destinatario, String mensagem) {
		this.remetente = remetente;
		this.destinatario = destinatario;
		this.mensagem = mensagem;
	}

	@Override
	public void enviarMensagem() {
		System.out.println("Enviando SMS: " + this.getMensagem());
	}

	public String getDestinatario() {
		return destinatario;
	}
	
	public String getMensagem() {
		return mensagem;
	}
	
	public String getRemetente() {
		return remetente;
	}
}
