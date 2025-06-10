package exercicio_03;

public class PlacaMae {
	private String fabricante;
	private String socket;
	private int slots;
	
	public PlacaMae(String fabricante, String socket, int slots) {
		this.fabricante = fabricante;
		this.socket = socket;
		this.slots = slots;
	}
	
	public String getFabricante() {
		return fabricante;
	}
	
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	public String getSocket() {
		return socket;
	}
	
	public void setSocket(String socket) {
		this.socket = socket;
	}
	
	public int getSlots() {
		return slots;
	}
	
	public void setSlots(int slots) {
		this.slots = slots;
	}
}
