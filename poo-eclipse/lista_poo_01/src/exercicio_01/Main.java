package exercicio_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 	Crie uma classe Curso com os atributos nome, cargaHoraria e uma lista de Aluno.
	Implemente os construtores, getters e setters necessários. A classe Aluno deve conter nome,
	matrícula e curso (associação). Instancie dois cursos diferentes com suas respectivas listas
	de alunos e imprima as informações no console
 */

public class Main {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos cursos deseja cadastrar?");
		int qtdCursos = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < qtdCursos; i++) {
			Curso curso = new Curso("", 0);
			System.out.println("--- Dados do curso " +(i + 1)+ " ---");
			System.out.println("Informe o nome do curso: ");
			curso.setNome(sc.nextLine());
			System.out.println("Informe a carga horária do curso: ");
			curso.setCargaHoraria(sc.nextDouble());
			sc.nextLine();
			
			System.out.println("-----");
			cursos.add(curso);
		}
		
		System.out.println("Deseja cadastrar quantos alunos?");
		int qtdAlunos = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < qtdAlunos; i++) {
			Aluno aluno = new Aluno("", 0, null);
			System.out.println("Informe o nome do aluno: ");
			aluno.setNome(sc.nextLine());
			System.out.println("Informe a matricula do aluno (int): ");
			aluno.setMatricula(sc.nextInt());
			sc.nextLine();
			System.out.println("Informe o numero do curso correspondente do aluno: ");
			
			for (int j = 0; j < cursos.size(); j++) {
				System.out.println(j + " - " +cursos.get(j).getNome()+ " - " + cursos.get(j).getCargaHoraria() + "h");
			}
			
			int opcaoCurso = sc.nextInt();
			sc.nextLine();
			
			Curso cursoEscolhido = cursos.get(opcaoCurso);
			aluno.setCurso(cursoEscolhido);
			cursoEscolhido.adicionarAluno(aluno);
		}
		
		for (Curso curso : cursos) {
			curso.listarAlunosCurso();
		}
		
		sc.close();
	}
}
