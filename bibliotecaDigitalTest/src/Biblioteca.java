import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
  private String nome;
  List<Livro> livros = new ArrayList<>();

  public Biblioteca(String nome, List<Livro> livros) {
    this.nome = nome;
    this.livros = livros;
  }

  public List<Livro> criarBiblioteca() {
    Scanner sc = new Scanner(System.in);
    List<Livro> livros = new ArrayList<>();

    System.out.println("Informe a quantidade de livros: ");
    int quantidadeLivros = sc.nextInt();
    sc.nextLine();

    for (int i = 0; i < quantidadeLivros; i++) {
      System.out.println("--------- Livro " +i+ " --------");
      Livro livro = new Livro(null, 0, null);
      Autor autor = new Autor(null, null);

      System.out.println("Informe o nome do livro: ");
      String nomeLivro = sc.nextLine();
      livro.setNome(nomeLivro);
      System.out.println("Informe o ano de publicacao do livro: ");
      int ano = sc.nextInt();
      livro.setAnoPublicacao(ano);
      sc.nextLine();

      System.out.println("Informe os dados do autor:");
      System.out.println("Nome:");
      autor.setNome(sc.nextLine());
      System.out.println("Nacionalidade:");
      autor.setNacionalidade(sc.nextLine());
      livro.setAutor(autor);

      livros.add(livro);
      System.out.println("-------- Livro criado com sucesso! --------");
      sc.close();
    }

    System.out.println("biblioteca criada!");
    return livros;
  }

  public void lerBiblioteca(List<Livro> livros){
    int contador = 0;
    for (int i = 0; i < livros.size(); i++) {
      System.out.println("Dados do livro " + (i + 1) );
      System.out.println("Nome: " + livros.get(i).getNome());
      System.out.println("Ano de Publicacao: " + livros.get(i).getAnoPublicacao());

      Autor autor = livros.get(i).getAutor();
      System.out.println("Nome do autor: " + autor.getNome());
      System.out.println("Nacionalidade do autor: " + autor.getNacionalidade());
      System.out.println("------------------");
      contador++;
    }

    System.out.println("Total de livros em estoque: " + contador);
    System.out.println("------------------");
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }
}
