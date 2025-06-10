package exercicio_3;

public class Livro {
  private String titulo;
  private String autor;
  private int anoPublicacao;

  public Livro(String titulo, String autor, int anoPublicacao) {
    this.titulo = titulo;
    this.autor = autor;
    this.anoPublicacao = anoPublicacao;
  }

  public Livro(String titulo, String autor) {
    this.titulo = titulo;
    this.autor = autor;
  }
  
  public void exibirInfo() {
    System.out.println("Dados do livro: ");
    System.out.println("Titulo: " +this.getTitulo());
    System.out.println("Autor: " +this.getAutor());
    System.out.println("Ano: " +this.getAnoPublicacao());
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

  public int getAnoPublicacao() {
    return anoPublicacao;
  }

  public void setAnoPublicacao(int anoPublicacao) {
    this.anoPublicacao = anoPublicacao;
  }
}
