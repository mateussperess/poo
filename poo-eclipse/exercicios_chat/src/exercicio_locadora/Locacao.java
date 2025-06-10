package exercicio_locadora;

public class Locacao {
	private Cliente cliente;
	private Veiculo veiculo;
	
	public Locacao(Cliente cliente, Veiculo veiculo) {
		if(cliente.hasLocacao()) {
			System.out.println("O cliente "+ cliente.getNome() +" "+ cliente.getSobrenome() +" já possui um veículo alugado!");
			
		} else if(veiculo.isLocado()) {
			System.out.println("O veículo de placa "+ veiculo.getPlaca() + " já está locado!");
			
		} else {
			this.cliente = cliente;
			this.veiculo = veiculo;
			
			cliente.setLocacao(true);
			veiculo.setLocado(true);
			System.out.println("Locação registrada com sucesso!");
		}
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	public Veiculo getVeiculo() {
		return veiculo;
	}
}
