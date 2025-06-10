package exercicioRefatoracao;

public class SMS extends Notificador{
	private String numeroTelefone;
	private String mensagem;
	
	public SMS(String numeroTelefone, String mensagem) {
		this.numeroTelefone = numeroTelefone;
		this.mensagem = mensagem;
	}
	
	public String getMensagem() {
		return mensagem;
	}
	
	public String getNumeroTelefone() {
		return numeroTelefone;
	}
	
	@Override
	public void notificar() {
		if(!this.getNumeroTelefone().isEmpty() && !this.getMensagem().isEmpty()) {
			System.out.println("SMS enviado!");
			System.out.println("Numero de telefone: " + this.getNumeroTelefone());
			System.out.println("Mensagem: " + this.getMensagem());
		} else {
			this.falha();
		}
	}
	
	@Override
	public void falha() {
		System.out.println("Canal de comunicacao invalido...");
	}
}
