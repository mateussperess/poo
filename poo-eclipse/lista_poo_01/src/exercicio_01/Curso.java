package exercicio_01;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	private String nome;
	private double cargaHoraria;
	
	private List<Aluno> alunos = new ArrayList<>();
	
	public Curso(String nome, double cargaHoraria) {
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCargaHoraria(double cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public void adicionarAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public void listarAlunosCurso() {
		System.out.println("--- Alunos do curso " +this.nome+ " ---");
		for (Aluno aluno : alunos) {
			System.out.println("------");
			System.out.println("Nome do aluno: " + aluno.getNome());
			System.out.println("Matricula do aluno: " +aluno.getMatricula());
			System.out.println("------");
		}
	}
}
