package exercicio_05;

import java.util.Scanner;

//Crie uma classe Animal com nome, espécie e dono (Pessoa). A classe Pessoa deve conter
//nome, telefone e uma lista de animais. Implemente a associação bidirecional entre as classes
//e imprima os dados do dono e seus animais.

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--- Informe os dados da pessoa ---");
		Pessoa pessoa = new Pessoa("", "");
		System.out.println("Nome:");
		pessoa.setNome(sc.nextLine());
		System.out.println("Telefone:");
		pessoa.setTelefone(sc.nextLine());
		System.out.println("-----------------------------------");
		
		System.out.println("Quantos animais essa pessoa tem?");
		int qtdAnimais = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < qtdAnimais; i++) {
			System.out.println("----------------------------");
			System.out.println("Informe o nome do animal " +(i + 1)+ ": ");
			String nomeAnimal = sc.nextLine();
			System.out.println("Informe a especie do animal " +(i + 1)+ ": ");
			String especieAnimal = sc.nextLine();
			
			Animal animal = new Animal(nomeAnimal, especieAnimal, pessoa);
			pessoa.addAnimal(animal);
		}

		System.out.println("-----------------------------------");
		
		pessoa.listarDados();

		sc.close();
	}
}
