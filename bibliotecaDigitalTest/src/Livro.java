// import java.util.Scanner;

public class Livro {
  private String nome;
  private int anoPublicacao;
  private Autor autor;

  public Livro(String nome, int anoPublicacao, Autor autor) {
    this.nome = nome;
    this.anoPublicacao = anoPublicacao;
    this.autor = autor;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setAnoPublicacao(int anoPublicacao) {
    this.anoPublicacao = anoPublicacao;
  }

  public void setAutor(Autor autor) {
    this.autor = autor;
  }

  public String getNome() {
    return this.nome;
  }

  public int getAnoPublicacao() {
    return this.anoPublicacao;
  }

  public Autor getAutor() {
    return this.autor;
  }
}
