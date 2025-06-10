package exercicio_09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Implemente as classes Passageiro, Motorista e Corrida. Cada Corrida deve conter um
//Passageiro e um Motorista, além da distância percorrida. Implemente os métodos
//necessários para calcular o valor da corrida com base em R$ 2,50 por km. Crie 3 corridas e
//mostre o relatório final de cada uma.

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Corrida> corridas = new ArrayList<>();
		
		Motorista motorista1 = new Motorista("Mateus", "Peres");
		Passageiro passageiro1 = new Passageiro("Ana Laura", "Mota");

		Passageiro passageiro2 = new Passageiro("Jeremias", "de Abreu");
		
		Motorista motorista2 = new Motorista("Luciano", "Garcia");
		Passageiro passageiro3 = new Passageiro("Carla", "Peres");
		
		Corrida corrida1 = new Corrida(passageiro1, motorista1, 6.65);
		Corrida corrida2 = new Corrida(passageiro2, motorista1, 3.01);
		Corrida corrida3 = new Corrida(passageiro3, motorista2, 53.01);
		corridas.add(corrida1);
		corridas.add(corrida2);
		corridas.add(corrida3);
		
		for (Corrida corrida : corridas) {
			System.out.println("--- Infos de Corrida ---");
			System.out.println("Passageiro: " +corrida.getPassageiro().getNome()+ " " +corrida.getPassageiro().getSobrenome());
			System.out.println("Motorista: " +corrida.getMotorista().getNome()+ " " +corrida.getMotorista().getSobrenome());
			System.out.println("Distancia percorrida: " +corrida.getDistanciaPercorrida());
			System.out.println("Total a pagar pela corrida: R$ " +corrida.totalCorrida());
			System.out.println("------------------------");
		}
		
		sc.close();
	}
}
