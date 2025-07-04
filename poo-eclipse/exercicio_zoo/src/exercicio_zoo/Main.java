package exercicio_zoo;

public class Main {
	
	public static void main(String[] args) {
		Animal leaoMufasa = new Leao("Mufasa");
		Animal canguruMarcio = new Canguru("Márcio");
		
		leaoMufasa.alimentar();
		canguruMarcio.alimentar();
		
		System.out.println(leaoMufasa.emitirSom());
		System.out.println(canguruMarcio.emitirSom());
		
		System.out.println(leaoMufasa.mover());
		System.out.println(canguruMarcio.mover());

	}
}
