import java.util.Scanner;

import exercicio_1.Pessoa;
import exercicio_2.ContaBancaria;
import exercicio_3.Livro;

public class Main {
  public static void main(String[] args) {
    // exercicio_1();
    // exercicio_2();
    exercicio_3();
  }

  public static void exercicio_3() {
    String titulo;
    String autor;
    int anoPublicacao;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe o titulo do livro: ");
    titulo = scanner.nextLine();
    System.out.println("Informe o autor do livro: ");
    autor = scanner.nextLine();
    System.out.println("Informe o ano de publicacao do livro: ");
    anoPublicacao = scanner.nextInt();
    scanner.nextLine();
    
    Livro livro1 = new Livro(titulo, autor, anoPublicacao); // construtor 1
    livro1.exibirInfo();
    Livro livro2 = new Livro(titulo, autor); // construtor 2 
    livro2.exibirInfo();

    scanner.close();
  }

  public static void exercicio_2() {
    String titular;
    int numeroConta;
    double saldoConta;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe o nome do titular: ");
    titular = scanner.nextLine();
    System.out.println("Informe o numero da conta: ");
    numeroConta = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Informe o saldo da conta: ");
    saldoConta = scanner.nextDouble();
    scanner.nextLine();

    ContaBancaria conta = new ContaBancaria(titular, numeroConta, saldoConta);
    conta.contaInfo();

    System.out.println("Informe o valor que deseja depositar: ");
    double valorDeposito = scanner.nextDouble();
    conta.depositar(valorDeposito);
    
    System.out.println("Informe o valor que deseja sacar: ");
    double valorSaque = scanner.nextDouble();
    
    if(conta.sacar(valorSaque)) {
      System.err.println("Sucesso... Saque realizado!");
    } else {
      System.err.println("Falha... Saldo insuficiente!");
    }

    System.out.println("Infos atualizadas: ");
    conta.contaInfo();

    scanner.close();
  }

  public static void exercicio_1() {
    String nome;
    int idade;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe o nome de uma pessoa: ");
    nome = scanner.nextLine();
    System.out.println("Informe a idade de uma pessoa: ");
    idade = scanner.nextInt();
    scanner.nextLine();
    scanner.close();

    Pessoa pessoa = new Pessoa(nome, idade);
    pessoa.dadosPessoa();
  }
}
