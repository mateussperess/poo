package exercicios_chat_3;

import java.util.ArrayList;
import java.util.List;

public class Casa {
	private int numero;
	private List<Comodo> comodos = new ArrayList<>();
	
	public Casa(int numero) {
		this.numero = numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void adicionarComodo(Comodo comodo) {
		comodos.add(comodo);
	}
	
	public void listarComodos() {
		if(!comodos.isEmpty()) {
			System.out.println("---- Comodos da casa numero : "+this.getNumero()+" ----");
			for (Comodo comodo : comodos) {
				System.out.println("Nome do comodo: " +comodo.getNome());
				System.out.println("Quantidade de janelas do comodo " +comodo.getNome()+ ": " +comodo.getQuantidadeJanelas());
			}
		} else {
			System.out.println("A casa de numero" +this.getNumero()+ " foi demolida!");
		}
	}
	
	public void demolirCasa() {
		comodos.clear();
	}
}
