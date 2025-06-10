package exercicioRefatoracao;

public class Main {
	public static void main(String[] args) {
		Notificador notificacaoEmail = new Email("mateus@email.com", "teste email");
		Notificador notificacaoSMS = new SMS("123456789", "teste sms");
		Notificador noficicacaoPush = new push("Smartphone Samsung", "Ei... voce tem uma nova mensagem!", "Ola mundo!");
		
		notificacaoEmail.notificar();
		System.out.println("------------------");
		notificacaoSMS.notificar();
		System.out.println("------------------");
		noficicacaoPush.notificar();
	}
}
