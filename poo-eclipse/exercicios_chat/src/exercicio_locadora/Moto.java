package exercicio_locadora;

public class Moto extends Veiculo{
	private int quantidadeBancos;
	private boolean isAbastecido;
	private String tipoCombustivel;
	
	public Moto(String placa, String modelo, int ano, int quantidadeBancos, boolean isAbastecido, String tipoCombustivel) {
		super(placa, modelo, ano);
		this.quantidadeBancos = quantidadeBancos;
		this.isAbastecido = isAbastecido;
		this.tipoCombustivel = tipoCombustivel;
	}
	
	public int getQuantidadeBancos() {
		return this.quantidadeBancos;
	}
	
	public boolean isAbastecido() {
		return isAbastecido;
	}
	
	public String getTipoCombustivel() {
		return this.tipoCombustivel;
	}

	@Override
	public String velocidadeMaximaPermitida() {
		return "Rodovias: 110km/h. Estradas: 80km/h";
	}

	@Override
	public int quantidadePassageirosPermitida() {
		if(this.getQuantidadeBancos() == 1) {
			return 1;
		} else {
			return 2;
		}
	}
	
	@Override
	public void especificacoesVeiculo() {
		System.out.println("Quantidade de passageiros permitido: " + this.quantidadePassageirosPermitida());
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
