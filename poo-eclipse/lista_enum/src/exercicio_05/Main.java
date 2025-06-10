package exercicio_05;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		List<Livro> livros = new ArrayList<>();
		
		Livro livro01 = new Livro("O pequeno principe", "Jorge", GeneroLivro.EDUCATIVO);
		Livro livro02 = new Livro("Diario de um Banana", "Juca", GeneroLivro.EDUCATIVO);
		Livro livro03 = new Livro("O terror", "Maria", GeneroLivro.TERROR);
		Livro livro04 = new Livro("O choro", "Medeiros", GeneroLivro.ROMANCE);
		Livro livro05 = new Livro("Transformers", "Jairo", GeneroLivro.FICCAO);
		
		livros.add(livro01);
		livros.add(livro02);
		livros.add(livro03);
		livros.add(livro04);
		livros.add(livro05);

		Biblioteca biblioteca = new Biblioteca(livros);
		
		for (GeneroLivro genero : GeneroLivro.values()) {
			System.out.println("--- Livros do genero " +genero+ " ---");
			
			for (int i = 0; i < biblioteca.getLivros().size(); i++) {
				if(biblioteca.getLivros().get(i).getGenero() == genero) {
					System.out.println("Titulo: " +biblioteca.getLivros().get(i).getTitulo());
					System.out.println("Autor: " +biblioteca.getLivros().get(i).getAutor());
				}
				
			}
			System.out.println("-------------------------------");
		}
		
	}
}
