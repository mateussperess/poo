package exercicio_locadora;

import java.util.ArrayList;
import java.util.List;

public class Locadora {
    private List<Veiculo> veiculosDisponiveis = new ArrayList<>();
    private List<Locacao> locacoesAtivas = new ArrayList<>();	
	
    public void listarVeiculosDisponiveis() {
        if(this.veiculosDisponiveis.size() != 0) {
        	System.out.println("==== Veículos disponíveis para locação ====");
        	for (Veiculo veiculo : veiculosDisponiveis) {
        		if (!veiculo.isLocado()) {
        			System.out.println("Veículo: " + veiculo.getClass().getSimpleName());
        			System.out.println("Uso: " + veiculo.tipoDeUso());
        			System.out.println("Passageiros: " + veiculo.quantidadePassageirosPermitida());
        			System.out.println("Placa: " + veiculo.getPlaca());
        			System.out.println("------------------------");
        		}
        	}
        } else {
			System.out.println("Não há veículo disponível para locação!!");
        }
    }
	
	public void listarLocacoesAtivas() {
		if(this.locacoesAtivas.size() != 0) {
	        System.out.println("==== Locações ativas ====");
			int contadorLocacao = 0;
			for (Locacao locacao : locacoesAtivas) {
				System.out.println("Locação: " + contadorLocacao);
				System.out.println("Cliente: " + locacao.getCliente().getNome() +" "+ locacao.getCliente().getSobrenome() + " - CPF: " + locacao.getCliente().getCpf());
				System.out.println("Veículo: " + locacao.getVeiculo().getModelo() +" - Placa: "+ locacao.getVeiculo().getPlaca());
				contadorLocacao++;
			}
		} else {
			System.out.println("Não há nenhuma locação ativa no momento!");
		}
	}
	
	public void adicionarVeiculoEstoque(Veiculo veiculo) {
		this.veiculosDisponiveis.add(veiculo);
	}
	
	public void adicionarLocacaoAtiva(Locacao locacao) {
		this.locacoesAtivas.add(locacao);
	}
}
