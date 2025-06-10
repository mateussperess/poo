import java.util.List;

public class Livro {
  private String titulo;
  private String autor;
  private int anoPublicacao;
  private int disponivel;
  private double preco;

  public Livro(String titulo, String autor, int anoPublicacao, int disponivel, double preco) {
    this.titulo = titulo;
    this.autor = autor;
    this.anoPublicacao = anoPublicacao;
    this.disponivel = disponivel;
    this.preco = preco;
  }

  public String getTitulo() {
    return this.titulo;
  }

  public String getAutor() {
    return this.autor;
  }

  public int getAnoPublicacao() {
    return this.anoPublicacao;
  }

  public int isDisponivel() {
    return this.disponivel;
  }

  public double getPreco() {
    return this.preco;
  }

  public void imprimirLivros(List<Livro> livros) {
    int i = 1;
    for (Livro livro: livros) {
      System.out.println("==== Livro " .concat(Integer.toString(i).concat(" ====")));
      System.out.println("Titulo: " .concat(livro.getTitulo()));
      System.out.println("Autor: " .concat(livro.getAutor()));
      System.out.println((livro.isDisponivel() == 1)
          ? "Preco: R$".concat(Double.toString(livro.getPreco()))
          : "Produto nao disponivel no estoque");
      i++;
      System.out.println("=================");
    }
  }
}
