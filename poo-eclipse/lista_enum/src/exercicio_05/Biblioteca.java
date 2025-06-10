package exercicio_05;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private List<Livro> livros = new ArrayList<>();
	
	public Biblioteca(List<Livro> livros) {
		this.livros = livros;
	}
		
	public List<Livro> getLivros() {
		return livros;
	}
	
	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
}
