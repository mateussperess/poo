package exercicios_chat_sobrecarga;

public class Conversor {
	public double Converter(int numero_double) {
		return (double) numero_double;
	}
	
	public String Converter(double numero) {
		return Double.toString(numero);
	}
}
