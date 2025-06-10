package exercicio_locadora;

public class Caminhao extends Veiculo {
	private double capacidadeCarga;
	private boolean isAbastecido;
	private int numeroDeEixos;
	private String tipoCombustivel = "Diesel";

	public Caminhao(String placa, String modelo, int ano, double capacidadeCarga, boolean isAbastecido, int numeroDeEixos) {
		super(placa, modelo, ano);
		this.capacidadeCarga = capacidadeCarga;
		this.isAbastecido = isAbastecido;
		this.numeroDeEixos = numeroDeEixos;
	}
	
	public double getCapacidadeCarga() {
		return this.capacidadeCarga;
	}
	
	public int getNumeroDeEixos() {
		return this.numeroDeEixos;
	}
	
	public boolean isAbastecido() {
		return isAbastecido;
	}
	
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	@Override
	public String velocidadeMaximaPermitida() {
		return "Rodovias: 90km/h. Estradas: 60km/h";
	}

	@Override
	public int quantidadePassageirosPermitida() {
		return 3;
	}
	
	@Override
	public void especificacoesVeiculo() {
		System.out.println("Quantidade de passageiros permitida: " + this.quantidadePassageirosPermitida());
		System.out.println("Velocidade máxima permitida: " + this.velocidadeMaximaPermitida());
		System.out.println("Número de eixos: " + this.getNumeroDeEixos());
		String precisaAbastecer = (this.isAbastecido()) ? "Não precisa abastecer" : "Precisa abastecer" ;
		System.out.println("Combustível: "+ precisaAbastecer);
		System.out.println("Tipo de Combustível: " + this.getTipoCombustivel());
	}
	
	@Override
	public String tipoDeUso() {
		return "Comercial";
	}
}
