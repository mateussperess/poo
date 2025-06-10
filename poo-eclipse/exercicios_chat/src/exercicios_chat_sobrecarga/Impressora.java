package exercicios_chat_sobrecarga;

/*
 	Criar uma classe Conversor com métodos converter que:
	Converta um número inteiro em sua versão double.

	Converta um número double em String.

	Converta um char em String.
*/

public class Impressora {
	public void Imprimir(int numero) {
		System.out.println(numero);
	}

	public void Imprimir(double numero) {
		System.out.println(numero);
	}
	
	public void Imprimir(String string) {
		System.out.println(string);
	}
}
