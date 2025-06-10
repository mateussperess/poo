package exercicio_06;

public class ContaBancaria {
	private String numero;
	private double saldo;
	private Cliente cliente;
	
	public ContaBancaria(String numero, double saldo, Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.cliente = cliente;
	}
	
	public void depositarSaldo(double valorDeposito) {
		this.saldo += valorDeposito;
	}
	
	public boolean sacarSaldo(double valorSaque) {
		if (valorSaque > 0 && saldo >= valorSaque) {
			this.saldo -= valorSaque;
			return true;
		}
		return false;
	}
	
	public void transferirSaldo(ContaBancaria contaParaTransferir, double valorTransferir) {
		if (valorTransferir > 0 && this.saldo >= valorTransferir) {
			this.saldo -= valorTransferir;
			contaParaTransferir.depositarSaldo(valorTransferir);
			System.out.println("Saldo transferido: " + valorTransferir + " para o usuário " + contaParaTransferir.getCliente().getNome());
		} else {
			System.out.println("ERRO! Saldo insuficiente ou valor de transferência inválido");
		}
		
	}
		
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
