package exercicio_02;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private List<Livro> livros = new ArrayList<>();
	
	public List<Livro> getLivros() {
		return livros;
	}
	
	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	
	public void adicionarLivros(Livro livro) {
		livros.add(livro);
	}
	
	public void removerLivro(Livro livro) {
		livros.remove(livro);
	}
	
	public void listarLivros() {
		if (livros.size() > 0) {
			System.out.println("--- Listando livros da biblioteca ---");
			for (int i = 0; i < livros.size(); i++) {
				System.out.println(i + " - " + livros.get(i).getTitulo() + ". Escrito por " + livros.get(i).getAutor() + " em " +livros.get(i).getAno() + ".");
			}
		} else {
			System.out.println("ERRO! Nenhum livro cadastrado na biblioteca!");
		}
		
	}
}
