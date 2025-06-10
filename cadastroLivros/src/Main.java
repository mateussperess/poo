import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  static List<Livro> livros = new ArrayList<>();
  public static int quantidadeLivros;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Quantos livros voce gostaria de cadastrar? ");
    quantidadeLivros = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Quantidade de Livros escolhidas: " .concat(Integer.toString(quantidadeLivros)));

    for (int i = 0; i < quantidadeLivros; i++) {
      System.out.println("Informe os dados do livro ".concat(Integer.toString(i + 1)).concat("/").concat(Integer.toString(quantidadeLivros)));
      System.out.println("Titulo: ");
      String titulo = scanner.nextLine();
      System.out.println("Autor: ");
      String autor = scanner.nextLine();
      System.out.println("Ano da Publicaçao: ");
      int anoPublicacao = scanner.nextInt();
      scanner.nextLine();
      System.out.println("Este livro está disponivel ? 1 - Sim, 2 - Nao");
      int disponivel = scanner.nextInt();
      scanner.nextLine();
      System.out.println("Preco: ");
      double preco = scanner.nextDouble();
      scanner.nextLine();

      Livro livro = new Livro(titulo, autor, anoPublicacao, disponivel, preco);
      livros.add(livro);
    }

    System.out.println("Livros cadastrados com sucesso!: ");
    Livro livro = new Livro("", "", 0, 0, 0.0);  // instanciândo objeto para acessar o método
    livro.imprimirLivros(livros);
  }
}