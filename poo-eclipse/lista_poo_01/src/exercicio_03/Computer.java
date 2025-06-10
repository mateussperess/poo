package exercicio_03;

public class Computer {
	private String marca;
	private String modelo;
	private PlacaMae placaMae;
	
	public Computer(String marca, String modelo, PlacaMae placaMae) {
		this.marca = marca;
		this.modelo = modelo;
		this.placaMae = placaMae;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public PlacaMae getPlacaMae() {
		return placaMae;
	}
	
	public void setPlacaMae(PlacaMae placaMae) {
		this.placaMae = placaMae;
	}
}
