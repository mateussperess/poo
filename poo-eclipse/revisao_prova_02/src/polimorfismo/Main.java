package polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		List<Forma> formas = new ArrayList<>();

		Forma quadrado = new Quadrado();
		Forma circulo = new Circulo();
		
		formas.add(quadrado);
		formas.add(circulo);
		
		for (Forma forma : formas) {
			forma.desenhar();
		}
	}
}
