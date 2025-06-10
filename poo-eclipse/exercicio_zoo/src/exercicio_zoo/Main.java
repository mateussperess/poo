package exercicio_zoo;

public class Main {
	
	public static void main(String[] args) {
		Leao leaoMufasa = new Leao("Mufasa");
		Canguru canguruMarcio = new Canguru("Márcio");
		
		leaoMufasa.alimentar();
		canguruMarcio.alimentar();
		
		System.out.println(leaoMufasa.emitirSom());
		System.out.println(canguruMarcio.emitirSom());
		
		System.out.println(leaoMufasa.mover());
		System.out.println(canguruMarcio.mover());

	}
}
