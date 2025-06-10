package exercicioRefatoracao;

public class push extends Notificador {
	private String dispositivoDestino;
	private String titulo;
	private String mensagem;
	
	public push(String dispositivoDestino, String titulo, String mensagem) {
		this.dispositivoDestino = dispositivoDestino;
		this.titulo = titulo;
		this.mensagem = mensagem;
	}
	
	public String getDispositivoDestino() {
		return dispositivoDestino;
	}
	
	public String getMensagem() {
		return mensagem;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	@Override
	public void notificar() {
		if(!this.getDispositivoDestino().isEmpty() && !this.getMensagem().isEmpty() && !this.getTitulo().isEmpty()) {
			System.out.println("Notificacao push enviada ao dispositivo: " + this.getDispositivoDestino());
			System.out.println("Titulo: " + this.getTitulo());
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
