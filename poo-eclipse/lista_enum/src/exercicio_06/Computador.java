package exercicio_06;

public class Computador {
	private String modelo;
	private TipoComputador tipoComputador;
	
	public Computador(String modelo, TipoComputador tipoComputador) {
		this.modelo = modelo;
		this.tipoComputador = tipoComputador;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public TipoComputador getTipoComputador() {
		return tipoComputador;
	}
	
	public void setTipoComputador(TipoComputador tipoComputador) {
		this.tipoComputador = tipoComputador;
	}
}
