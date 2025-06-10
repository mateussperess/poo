import java.util.Scanner;
import java.util.List;
// import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Informe o nome da biblioteca: ");
    String nomeLib = sc.nextLine();

    Biblioteca lib = new Biblioteca(nomeLib, null);
    List<Livro> livros = lib.criarBiblioteca();
    lib.lerBiblioteca(livros);
    sc.close();
  }
}