package exercicio_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		List<Agenda> compromissos = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		int opt;
		
		do {
			System.out.println("Informe o dia (apenas o dia) do compromisso: ");
			String entrada = sc.nextLine().toUpperCase();
			
			try {
				DiaDaSemana dia = DiaDaSemana.valueOf(entrada);
				System.out.println("--- Voce digitou: " +dia+ " ---");
				System.out.println("Informe a descricao do seu comprimisso de " + dia);
				String descricao = sc.nextLine();
				
				Agenda compromisso = new Agenda(dia, descricao);
				compromissos.add(compromisso);
			} catch (IllegalArgumentException e) {
				System.out.println("--- DIA INVÁLIDO ---");
			}
			
			
			System.out.println("--- Deseja cadastrar um comprimisso ? ---");
			System.out.println("0 - Encerrar");
			System.out.println("1 - Continuar");
			
			opt = sc.nextInt();
			sc.nextLine();
			
			if(opt == 0) {
				System.out.println("--- Encerrando entradas ---");
			}
			
		} while (opt != 0);
		
		exibirInformacoes(compromissos);
		
		sc.close();
	}
	
	public static void exibirInformacoes(List<Agenda> compromissos) {
		System.out.println("--- Agenda ---");
		for (Agenda agenda : compromissos) {
			System.out.println("Dia: " +agenda.getDiaComprimisso());
			System.out.println("Descricao: " +agenda.getDescricaoCompromisso());
			System.out.println("--------------");
		}
	}
}
