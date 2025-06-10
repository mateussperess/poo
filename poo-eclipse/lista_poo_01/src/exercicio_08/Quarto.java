package exercicio_08;

public class Quarto {
	private int numero;
	private int capacidade;
	private double precoDiaria;
	private Hotel hotel;
	
	public Quarto(int numero, int capacidade, double precoDiaria, Hotel hotel) {
		this.numero = numero;
		this.capacidade = capacidade;
		this.precoDiaria = precoDiaria;
		this.hotel = hotel;
	}
	
	public void dadosQuarto() {
		System.out.println("Numero: " + this.getNumero());
		System.out.println("Capacidade: " + this.getCapacidade());
		System.out.println("Preco da Diaria: " + this.getPrecoDiaria());
	}
	
	public double calcularReserva(int quantidadeDias) {
		return this.precoDiaria*(quantidadeDias);
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getCapacidade() {
		return capacidade;
	}
	
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	public double getPrecoDiaria() {
		return precoDiaria;
	}
	
	public void setPrecoDiaria(double precoDiaria) {
		this.precoDiaria = precoDiaria;
	}
	
	public Hotel getHotel() {
		return hotel;
	}
	
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
}
