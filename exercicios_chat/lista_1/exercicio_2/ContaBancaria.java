package exercicio_2;

public class ContaBancaria {
  private String titular;
  private int numero;
  private double saldo;

  public ContaBancaria(String titular, int numero, double saldo) {
    this.titular = titular;
    this.numero = numero;
    this.saldo = saldo;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public String getTitular() {
    return titular;
  }

  public void setTitular(String titular) {
    this.titular = titular;
  }

  public void depositar(double valor) {
    if(valor > 0) {
      saldo += valor;
    }
  }

  public boolean sacar(double valor) {
    if(valor > 0 && saldo >= valor) {
      saldo -= valor;
      return true;
    } else {
      return false;
    }
  }

  public void contaInfo() {
    System.out.println("Titular: " + this.getTitular());
    System.out.println("Numero da conta: " + this.getNumero());
    System.out.println("Saldo: " + this.getSaldo());
  }
}
