package exercicio_05;

public class Livro {
	private String titulo;
	private String autor;
	private GeneroLivro genero;
	
	public Livro(String titulo, String autor, GeneroLivro genero) {
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public GeneroLivro getGenero() {
		return genero;
	}
	
	public void setGenero(GeneroLivro genero) {
		this.genero = genero;
	}
}
