package nocao_interface;

public class Main {

	public static void main(String[] args) {
		Notificacao n1 = new Email("Mateus", "Jeremias", "Salve mano dalton via email");
		Notificacao n2 = new SMS("51995365718", "51995365718", "Salve mano dalton via SMS");
		Notificacao n3 = new App("Salve mano dalton via APP");
		
		n1.enviarMensagem();
		n2.enviarMensagem();
		n3.enviarMensagem();
	}
}
