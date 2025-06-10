package exercicio_10;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//Crie a classe Repositorio com nome, linguagem e uma lista de Commits. A classe Commit
//deve conter mensagem, data e autor. Implemente dois métodos sobrecarregados para
//adicionar commit: um com todos os dados, outro com mensagem e autor (data atual). Exiba
//um resumo dos commits de cada repositório.

public class Main {
	public static void main(String[] args) {
		List<Commit> commits = new ArrayList<>();
		
		Autor autor1 = new Autor("Mateus", "Peres", "mplopes");
		Commit commit1 = new Commit("first commit", autor1);
		
		Autor autor2 = new Autor("Jeremias", "de Abreu", "jpiontkoski");
		Date dataCommit2 = new Date();
		Commit commit2 = new Commit("segundo commit", dataCommit2, autor2);
		
		commits.add(commit1);
		commits.add(commit2);
		
		int i = 1;
		for (Commit commit : commits) {
			System.out.println("--- Lista de Commits ---");
			System.out.println("--- Commit" +i+ " ---");
			System.out.println("Mensagem: " + commit.getMensagem());
			System.out.println("Autor: " + commit.getAutor().getUsuario());
			System.out.println("Realizado em: " + (commit.getData() != null ? commit.getMensagem() : "Data não informada"));
			i++;
		}
	}
}
