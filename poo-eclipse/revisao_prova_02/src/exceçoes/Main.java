package exceçoes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculadora calc = new Calculadora();
		
		try {
			System.out.println("Informe um numero: ");
			double numero = sc.nextDouble();
			sc.nextLine();
			
			System.out.println("Informe o divisor: ");
			double divisor = sc.nextDouble();
			sc.nextLine();
			
			double result = calc.calcular(numero, divisor);
			
			System.out.println("Resultado: " + result);
		} catch (ContaInvalidaException e) {
			System.out.println("Erro: " + e.getMessage());
		} finally {
			System.out.println("Encerrando...");
			sc.close();
		}
	}
}
