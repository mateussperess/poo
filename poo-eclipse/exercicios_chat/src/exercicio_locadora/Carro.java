package exercicio_locadora;

public class Carro extends Veiculo {
	private int quantidadePortas;
	private boolean isAbastecido;
	private String tipoCombustivel;

	public Carro(String placa, String modelo, int ano, int quantidadePortas, boolean isAbastecido, String tipoCombustivel) {
		super(placa, modelo, ano);
		this.quantidadePortas = quantidadePortas;
		this.isAbastecido = isAbastecido;
		this.tipoCombustivel = tipoCombustivel;
	}
	
	public int getQuantidadePortas() {
		return this.quantidadePortas;
	}
	
	public boolean isAbastecido() {
		return this.isAbastecido;
	}
	
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	@Override
	public String velocidadeMaximaPermitida() {
		return "Rodovias: 110km/h. Estradas: 80km/h";
	}

	@Override
	public int quantidadePassageirosPermitida() {
		return 5;
	}
	
	@Override
	public void especificacoesVeiculo() {
		System.out.println("Quantidade de portas: " + this.getQuantidadePortas());
		System.out.println("Quantidade de passageiros permitida: " + this.quantidadePassageirosPermitida());
		System.out.println("Velocidade máxima permitida: " + this.velocidadeMaximaPermitida());
		String precisaAbastecer = (this.isAbastecido()) ? "Não precisa abastecer" : "Precisa abastecer" ;
		System.out.println("Combustível: "+ precisaAbastecer);
		System.out.println("Tipo de Combustível: " + this.getTipoCombustivel());
	}
	
	@Override
	public String tipoDeUso() {
		return "Pessoal/Comercial";
	}
}
