package exercicios_chat_2;

import java.util.Scanner;

/*
	Modele a relação entre as classes Departamento e Funcionário.
	Um departamento pode ter vários funcionários, mas os funcionários continuam existindo mesmo que o departamento seja encerrado.
	Pergunta: Qual o tipo de relacionamento? Como você representaria isso no diagrama UML?
	
	Crie as classes em código. Adicione funcionários ao departamento e mostre como listar todos os funcionários de um determinado departamento.
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o nome do departamento: ");
		String nomeDpt = sc.nextLine();
		System.out.println("Informe o andar do departamento: ");
		int andarDpt = sc.nextInt();
		sc.nextLine();
		
		Departamento dpt = new Departamento(nomeDpt, andarDpt);
		
		System.out.println("Quantos funcionarios deseja adicionar nesse departamento?");
		int numFuncionarios = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < numFuncionarios; i++) {
			Funcionario func = new Funcionario("", 0);
			System.out.println("Informe o nome do funcionario "+ (i + 1) +":");
			func.setNome(sc.nextLine());
			System.out.println("Informe a idade do funcionario "+ (i + 1) +":");
			func.setIdade(sc.nextInt());
			sc.nextLine();
			
			dpt.addFuncionarios(func);
		}
		
		sc.close();
		
		dpt.listarFuncionariosDpt();
	}
}
