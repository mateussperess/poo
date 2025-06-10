package nocao_interface;

public class Email implements Notificacao {
	private String remetente;
	private String destinatario;
	private String mensagem;
	
	public Email(String remetente, String destinatario, String mensagem) {
		this.remetente = remetente;
		this.destinatario = destinatario;
		this.mensagem = mensagem;
	}

	@Override
	public void enviarMensagem() {
		System.out.println("Enviando email: " + this.getMensagem());
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
	
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
}
