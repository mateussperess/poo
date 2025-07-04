package classes_abstratas;

public class Main {
	public static void main(String[] args) {
		Transporte bike = new Bicicleta();
		Transporte carrao = new Carro();
		
		bike.mover();
		carrao.mover();
	}
}
