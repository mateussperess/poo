package exercicio_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//	Crie a classe ContaBancaria com número, saldo e cliente. A classe Cliente deve conter nome,
//	CPF e uma lista de contas bancárias. Implemente métodos para depósito, saque e
//	transferência com validações. Mostre na main as movimentações e saldo final.

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Cliente> clientes = new ArrayList<>();
		
		System.out.println("Informe quantos clientes deseja cadastrar: ");
		int qtdClientes = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < qtdClientes; i++) {
			System.out.println("--- Informe os dados do cliente " +(i + 1)+ " ---");
			System.out.println("Nome: ");
			String nomeCliente = sc.nextLine();
			System.out.println("CPF: ");
			String cpfCliente = sc.nextLine();
			Cliente cliente = new Cliente(nomeCliente, cpfCliente);

			System.out.println("--- Cliente criado com sucesso ---");
			System.out.println("Quantas contas esse cliente possui?");
			int qtdContas = sc.nextInt();
			sc.nextLine();
			
			for (int j = 0; j < qtdContas; j++) {
				System.out.println("--- Informe os dados do conta " +(j + 1)+ " do cliente " +cliente.getNome()+ " ---");
				System.out.println("Informe o numero da conta: ");
				String numeroConta = sc.nextLine();
				System.out.println("Informe o saldo da conta: " + numeroConta);
				double saldo = sc.nextDouble();
				sc.nextLine();
				
				ContaBancaria conta = new ContaBancaria(numeroConta, saldo, cliente);
				System.out.println("-----------------------------------------------");
				
				cliente.addContas(conta);
			}
			
			clientes.add(cliente);
		}
		
		System.out.println("--- Informe um cliente ---");

		for (int i = 0; i < clientes.size(); i++) {
			System.out.println(i + " - " + clientes.get(i).getNome());
		}
		
		int opcaoCliente = sc.nextInt();
		sc.nextLine();
		
		Cliente clienteEscolhido = clientes.get(opcaoCliente);
		System.out.println("--- Informe uma conta do cliente " +clienteEscolhido.getNome()+ " ---");
		for (int i = 0; i < clienteEscolhido.getContas().size(); i++) {
			System.out.println(i + " - Nº " + clienteEscolhido.getContas().get(i).getNumero());
		}
		
		int opcaoConta = sc.nextInt();
		sc.nextLine();		
		
		ContaBancaria contaEscolhida = clienteEscolhido.getContas().get(opcaoConta);
		
		int opcaoMenu;
		
		do {

			System.out.println("--- Selecione uma acao da conta " +contaEscolhida.getNumero()+ " ---");
			System.out.println("1 - Depositar valor na conta ");
			System.out.println("2 - Sacar valor da conta ");
			System.out.println("3 - Realizar uma transferência ");

			int opcaoAcao = sc.nextInt();
			sc.nextLine();
			
			switch (opcaoAcao) {
			case 1:
				System.out.println("--- Informe o valor para depositar ---");
				double valorDeposito = sc.nextDouble();
				sc.nextLine();
				
				if(valorDeposito > 0) {
					contaEscolhida.depositarSaldo(valorDeposito);
					System.out.println("Saldo depositado com sucesso! Saldo total em conta: " + contaEscolhida.getSaldo());
					} else {
						System.out.println("ERRO! Valor para depósito inválido");
					}
				break;
				
			case 2:
				System.out.println("--- Informe o valor para sacar ---");
				double valorSaque = sc.nextDouble();
				sc.nextLine();
				
				if(valorSaque > 0 && valorSaque <= contaEscolhida.getSaldo()) {
					contaEscolhida.sacarSaldo(valorSaque);
					System.out.println("Saldo sacado com sucesso! Saldo total em conta: " + contaEscolhida.getSaldo());
				} else {
					System.out.println("ERRO! Saldo insuficiente ou valor para saque inválido!");
				}
				break;
				
			case 3:
				System.out.println("--- Informe a conta que você deseja transferir ---");
				for (int i = 0; i < clientes.size(); i++) {
					if (!clientes.get(i).getCpf().equals(contaEscolhida.getCliente().getCpf())) {
						System.out.println(i + " - " +clientes.get(i).getNome());
					}
				}
				
				int clienteTransferir = sc.nextInt();
				sc.nextLine();
				Cliente clienteParaTransferir = clientes.get(clienteTransferir);
				
				System.out.println("--- Informe a conta de " + clienteParaTransferir.getNome() + " que voce deseja transferir ---");
				
				for (int i = 0; i < clienteParaTransferir.getContas().size(); i++) {
					System.out.println(i + " - Conta numero " + clienteParaTransferir.getContas().get(i).getNumero());
				}
				
				int opcaoContaTransferir = sc.nextInt();
				
				ContaBancaria contaParaTransferencia = clienteParaTransferir.getContas().get(opcaoContaTransferir);
				sc.nextLine();
				
				System.out.println("--- Informe o valor que você deseja transferir para o cliente " + clienteParaTransferir.getNome() + " na conta " + contaParaTransferencia.getNumero() + " ---");
				
				double valorTransfeir = sc.nextDouble();
				sc.nextLine();

				contaEscolhida.transferirSaldo(contaParaTransferencia, valorTransfeir);
				
				break;

			default:
				System.out.println("Opção inválida, tente novamente!");
				break;
			}
			
			System.out.println("Deseja realizar outra operação?");
			System.out.println("0 - Não, encerrar programa");
			System.out.println("1 - Sim, continuar operando");

			opcaoMenu = sc.nextInt();
			sc.nextLine();
		} while (opcaoMenu != 0);
		
		sc.close();
	}
}
