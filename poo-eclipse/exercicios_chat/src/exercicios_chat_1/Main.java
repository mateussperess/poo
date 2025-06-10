package exercicios_chat_1;
import java.util.Scanner;

/* 
	Exercício 1:
	Modele a relação entre as classes Pessoa e Telefone.
	
	-> Cada pessoa pode ter vários telefones. Um telefone pode pertencer a uma pessoa.
	Pergunta: Essa é uma relação de associação, agregação ou composição? Por quê?
	
	- Resposta:  É uma relação de associação, pois um objeto não depende do outro. 
	Pessoa nao depende do telefone para existir e embora tenham 
	uma lista telefonica (mesmo que a pessoa nao tenha nenhum numero), 
	os telefones existem sem saber de quem pertencem.
	
	DESAFIO: Implemente essa estrutura em código. Faça um método que imprima todos os telefones de uma pessoa.

*/

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Pessoa pessoa = new Pessoa("", "", 0);
		System.out.println("Informe o nome da pessoa:");
		pessoa.setNome(sc.nextLine());
		System.out.println("Informe o cpf da pessoa:");
		pessoa.setCpf(sc.nextLine());
		System.out.println("Informe a idade da pessoa:");
		pessoa.setIdade(sc.nextInt());
		sc.nextLine();
		
		System.out.println("Informe o telefone da pessoa:");
		int numero = sc.nextInt();
		sc.nextLine();

		sc.close();
		
		Telefone telefone = new Telefone(numero);
		pessoa.adicionarTelefone(telefone);
		
		pessoa.listarTelefones();
	}
}
