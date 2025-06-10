package exercicio_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<Camiseta> camisetas = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		int opt;
		do {
			
			System.out.println("Informe o tamanho da Camiseta: ");
			String tamanhoCamiseta = sc.nextLine().toUpperCase();
			
			try {
				Tamanho tamanho = Tamanho.valueOf(tamanhoCamiseta);
				System.out.println("Informe a cor da camiseta: ");
				String cor = sc.nextLine();
				
				Camiseta camiseta = new Camiseta(tamanho, cor);
				camisetas.add(camiseta);
			} catch (IllegalArgumentException e) {
				System.out.println("--- Tamanho inválido! ---");
			}
			
			System.out.println("--- Deseja cadastrar mais uma camiseta? ---");
			System.out.println("0 - Não");
			System.out.println("1 - Sim");
			opt = sc.nextInt();
			sc.nextLine();
			
			if(opt == 0) {
				System.out.println("--- Encerrando ---");
			}
		} while (opt != 0);
		
		sc.close();
		
		if(camisetas.size() > 0) {
			listarCamisetas(camisetas);
		}
	}
	
	public static void listarCamisetas(List<Camiseta> camisetas) {
		System.out.println("--- Camisetas cadastradas ---");
		for (Camiseta camiseta : camisetas) {
			System.out.println("Tamanho: " +camiseta.getTamanho());
			System.out.println("Cor: " +camiseta.getCor());		
			System.out.println("-----------------------------");
		}
	}
}
