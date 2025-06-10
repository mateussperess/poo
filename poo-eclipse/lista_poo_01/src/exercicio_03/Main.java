package exercicio_03;

import java.util.Scanner;

//	Crie uma classe Computador com os atributos marca, modelo e uma PlacaMae. A classe
//	PlacaMae deve conter fabricante, socket e quantidade de slots de memória. Implemente a
//	composição entre os objetos e exiba os dados completos do computador.

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe os dados da placa mãe: ");
		System.out.println("Fabricante: ");
		String fabricante = sc.nextLine();
		System.out.println("Socket: ");
		String socket = sc.nextLine();
		System.out.println("Slots de memória: ");
		int slots = sc.nextInt();
		sc.nextLine();
		
		PlacaMae placaMae = new PlacaMae(fabricante, socket, slots);
		
		System.out.println("Agora que voce já tem a placa mãe, informe os dados do computador: ");
		System.out.println("Marca: ");
		String marca = sc.nextLine();
		System.out.println("Modelo: ");
		String modelo = sc.nextLine();
		
		sc.close();
		
		System.out.println("Criando computador...");
		Computer computer = new Computer(marca, modelo, placaMae);
		
		System.out.println("Computador criado!");
		System.out.println("--- Dados do computador ---");
		System.out.println("Marca: " + computer.getMarca());
		System.out.println("Modelo: " + computer.getModelo());
		System.out.println("--- Dados da Placa mãe ---");
		System.out.println("Fabricante: " + computer.getPlacaMae().getFabricante());
		System.out.println("Socket: " + computer.getPlacaMae().getSocket());
		System.out.println("Quantidade de slots de memória: " + computer.getPlacaMae().getSlots());
	}
}
