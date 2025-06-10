package exercicio_08;

import java.util.Scanner;

//Crie uma classe Hotel que contenha nome, endereço e uma lista de Quartos. A classe Quarto
//deve conter número, capacidade e preço por diária. A existência de um Quarto depende do
//Hotel. Permita adicionar quartos, fazer reserva e calcular o valor total da hospedagem.

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("--- Informe os dados do hotel ---");
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		System.out.println("Endereço: ");
		String endereco = sc.nextLine();

		Hotel hotel = new Hotel(nome, endereco);
		
		// criando quartos (considerando que tambem seja permitido add quartos, so nao fiz ainda)
		int numeroQuarto1 = 001;
		int capacidadeQuarto1 = 3;
		double precoDiariaQuarto1 = 320.0;
		
		int numeroQuarto2 = 002;
		int capacidadeQuarto2 = 5;
		double precoDiariaQuarto2 = 550.0;
		
		int numeroQuarto3 = 003;
		int capacidadeQuarto3 = 7;
		double precoDiariaQuarto3 = 1050.0;
		
		Quarto quarto1 = new Quarto(numeroQuarto1, capacidadeQuarto1, precoDiariaQuarto1, hotel);
		Quarto quarto2 = new Quarto(numeroQuarto2, capacidadeQuarto2, precoDiariaQuarto2, hotel);
		Quarto quarto3 = new Quarto(numeroQuarto3, capacidadeQuarto3, precoDiariaQuarto3, hotel);

		hotel.quartos.add(quarto1);
		hotel.quartos.add(quarto2);
		hotel.quartos.add(quarto3);
		
		hotel.listarQuartos();
		
		System.out.println("--- Selecione o numero de um quarto ---");
		int quartoReserva = sc.nextInt();
		sc.nextLine();
		
		Quarto quartoParaReserva = hotel.getQuartoByNum(quartoReserva);
		System.out.println("Quarto escolhido: " + quartoParaReserva.getNumero());
		System.out.println("Informe quantos dias deseja reservar: ");
		
		int diasReserva = sc.nextInt();
		sc.nextLine();
		
		double totalReserva = quartoParaReserva.calcularReserva(diasReserva);
		
		System.out.println("O valor total da reserva custará R$ " + totalReserva);
		
		sc.close();
	}
}
