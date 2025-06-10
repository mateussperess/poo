package exercicio_07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Implemente uma classe Contato com nome, email e telefone. Crie uma sobrecarga de
//método chamada cadastrarContato: um que receba apenas nome e telefone, e outro que
//receba todos os dados. Armazene os contatos em uma lista e exiba apenas os válidos
//(verifique se o telefone tem 9 dígitos).

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Contato> contatos = new ArrayList<>();
		
		System.out.println("Informe quantos contatos deseja cadastrar: ");
		int qtdContatos = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < qtdContatos; i++) {
			System.out.println("--- Informe os dados do contato " +(i + 1)+ " ---");
			
			System.out.println("Nome: ");
			String nome = sc.nextLine();
			System.out.println("Telefone: ");
			String telefone = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			
			if(!(email.isEmpty())) {
				Contato contato = new Contato(nome, telefone, email);
				contatos.add(contato);
				System.out.println("--- Contato criado com sucesso ---");
			} else {
				Contato contato = new Contato(nome, telefone);
				contatos.add(contato);
				System.out.println("--- Contato criado com sucesso ---");
			}
		}
		
		sc.close();
		
		
		System.out.println("--- Lista de contatos válidos ---");
		for (Contato contato : contatos) {
			if(contato.getTelefone().length() >= 9) {
				System.out.println("Nome: " + contato.getNome());
				System.out.println("Telefone: " + contato.getTelefone());
				System.out.println("Email: " + (contato.getEmail() != null ? contato.getEmail() : "Email nao informado no cadastro.") );
			}
		}
	}
}
