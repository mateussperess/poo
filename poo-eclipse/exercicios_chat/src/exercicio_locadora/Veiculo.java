package exercicio_locadora;

public abstract class Veiculo {
	private String placa;
	private String modelo;
	private int ano;
	private boolean isLocado = false;
	
	public Veiculo(String placa, String modelo, int ano) {
		this.placa = placa;
		this.modelo = modelo;
		this.ano = ano;
	}	
	
	public String getPlaca() {
		return this.placa;
	}
	
	public String getModelo() {
		return this.modelo;
	}

	public int getAno() {
		return this.ano;
	}
	
	public boolean isLocado() {
		return isLocado;
	}
	
	public void setLocado(boolean isLocado) {
		this.isLocado = isLocado;
	}
	
	public void mostrarDadosDoVeiculo() {
		System.out.println("=== Dados do veículo ====");
		System.out.println("Veículo: " + this.getClass().getSimpleName());
		System.out.println("Modelo: " + this.getModelo());			
		System.out.println("Ano: " + this.getAno());
		System.out.println("Placa: " + this.getPlaca());
		System.out.println("=== Especificações do veículo ====");
		this.especificacoesVeiculo();
	}
	
	
	public abstract String velocidadeMaximaPermitida();
	public abstract int quantidadePassageirosPermitida();
	public abstract void especificacoesVeiculo();
	public abstract String tipoDeUso();
}
