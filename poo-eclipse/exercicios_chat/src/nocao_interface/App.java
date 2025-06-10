package nocao_interface;

public class App implements Notificacao {
	private String mensagem;
	
	public App(String mensagem) {
		this.mensagem = mensagem;
	}

	@Override
	public void enviarMensagem() {
		System.out.println("Enviando mensagem via app: " + this.getMensagem());
	}
	
	public String getMensagem() {
		return mensagem;
	}

}
