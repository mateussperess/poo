package exercicios_chat_3;

import java.util.Scanner;

/*
	Modele as classes Casa e Cômodo.
	Uma casa é composta por cômodos. Se a casa for destruída, os cômodos também deixam de existir.
	Pergunta: Qual o tipo de relacionamento? Como seria a composição no código?
	
	Implemente isso no código com um método demolirCasa() que também elimina os cômodos associados.
*/

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o numero da casa:");
		int numeroCasa = sc.nextInt();
		sc.nextLine();
		
		Casa casa = new Casa(numeroCasa);
		
		System.out.println("Quantos comodos essa casa possui?");
		int qtdComodos = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < qtdComodos; i++) {
			Comodo comodo = new Comodo("", 0);
			System.out.println("Informe o nome do comodo: ");
			comodo.setNome(sc.nextLine());
			System.out.println("Informe a quantidade de janelas do comodo " +comodo.getNome()+ ": ");
			comodo.setQuantidadeJanelas(sc.nextInt());
			sc.nextLine();
			
			casa.adicionarComodo(comodo);
		}
		
		casa.listarComodos();
		
		sc.close();
		
		
		casa.demolirCasa();
		
		casa.listarComodos();
	}
}
