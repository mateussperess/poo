package exercicio_06;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Laboratorio> ambientes = new ArrayList<>();
		
		List<Computador> computadores = new ArrayList<>();
		List<Computador> computadores2 = new ArrayList<>();
		
		Computador computador01 = new Computador("Notebook", TipoComputador.ESCRITORIO);
		Computador computador02 = new Computador("PC", TipoComputador.GAMER);
		Computador computador03 = new Computador("PC", TipoComputador.SERVIDOR);
		Computador computador04 = new Computador("Notebook Gamer", TipoComputador.GAMER);
		Computador computador05 = new Computador("MacBook", TipoComputador.ESCRITORIO);
		Computador computador06 = new Computador("MacBook", TipoComputador.ESCRITORIO);
		Computador computador07 = new Computador("PC", TipoComputador.GAMER);

		computadores.add(computador01);
		computadores.add(computador02);
		computadores.add(computador03);
		computadores.add(computador04);
		computadores.add(computador05);
		
		computadores2.add(computador06);
		computadores2.add(computador07);

		Laboratorio lab = new Laboratorio("Professores", computadores);
		Laboratorio escritorioCasa = new Laboratorio("Quarto", computadores2);
		
		ambientes.add(lab);
		ambientes.add(escritorioCasa);

		for (Laboratorio ambiente : ambientes) {
			System.out.println("--- Computadores do Ambiente: " +ambiente.getNome()+ " ---");
				for (Computador computador : ambiente.getComputadores()) {
					System.out.println("Modelo: " + computador.getModelo());
					System.out.println("Tipo: " + computador.getTipoComputador());
				}
			
			System.out.println("---------------------------------");
		}
	}
}
