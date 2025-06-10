// import java.util.Scanner;

public class Autor {
  private String nome;
  private String nacionalidade;

  public Autor(String nome, String nacionalidade) {
    this.nome = nome;
    this.nacionalidade = nacionalidade;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setNacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
  }

  public String getNome() {
    return this.nome;
  }

  public String getNacionalidade() {
    return this.nacionalidade;
  }
}
