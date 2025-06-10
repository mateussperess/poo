package exercicios_chat_sobrecarga;

/*
	Criar uma classe chamada Impressora que tenha métodos chamados imprimir para:
	Imprimir um número inteiro.

	Imprimir um número real (double).

	Imprimir uma frase (String).
 */

public class Main {
	public static void main(String[] args) {
		Impressora impressora = new Impressora();
		
		impressora.Imprimir(228);
		impressora.Imprimir(228.0);
		impressora.Imprimir("Imprimindo string...");
		
		Conversor conversor = new Conversor();
		
		double numero_convertido = conversor.Converter(228);
		System.out.println("Numero convertido para double: " +numero_convertido);

		String numero_convertido_string = conversor.Converter(numero_convertido);
		System.out.println("Numero convertido para String: " +numero_convertido_string);
		System.out.println("Confirmando o tipo da variavel:");
		
		if(numero_convertido_string instanceof String) {
			System.out.println("String"); // if apenas para verificar o tipo da variável numero_convertido_string
		}

	}
}
