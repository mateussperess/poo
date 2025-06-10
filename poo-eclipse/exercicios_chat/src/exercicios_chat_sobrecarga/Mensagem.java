package exercicios_chat_sobrecarga;

/*
 *	Criar uma classe Mensagem com métodos enviar que:
	Envie uma mensagem para uma pessoa (passando nome).

	Envie uma mensagem para duas pessoas (passando dois nomes).

	Envie uma mensagem genérica (sem parâmetros).
 */

public class Mensagem {
	public void Enviar() {
		System.out.println("Mensagem genérica, presta atenção!");
	}
	
	public void Enviar(String nome) {
		System.out.println("Faaaaaaala " +nome+ "!");
	}
	
	public void Enviar(String nome, String nome2) {
		System.out.println("Faaaaaaala " +nome+ "! E você, " +nome2+" tudo certo?");
	}
}
