package polimorfismo;

public class Circulo extends Forma {
	double raio;

	@Override
	void desenhar() {
		System.out.println("Circulo desenhado");
	}
}
