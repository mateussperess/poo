package exercicioRefatoracao;

public class Email extends Notificador{
	private String emailDestinatario;
	private String conteudo;
	
	public Email(String emailDestinatario, String conteudo) {
		this.emailDestinatario = emailDestinatario;
		this.conteudo = conteudo;
	}
	
	public String getConteudo() {
		return conteudo;
	}
	
	public String getEmailDestinatario() {
		return emailDestinatario;
	}
	
	@Override
	public void notificar() {
		if(!this.getEmailDestinatario().isEmpty() && !this.conteudo.isEmpty()) {
			System.out.println("Email enviado!");
			System.out.println("Destinatario: " + this.getEmailDestinatario());
			System.out.println("Conteudo: " + this.getConteudo());
		} else {
			this.falha();
		}
	}
	
	@Override
	public void falha() {
		System.out.println("Canal de comunicacao invalido...");
	}
}
