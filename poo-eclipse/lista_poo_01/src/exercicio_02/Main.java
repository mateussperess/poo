package exercicio_02;

import java.util.Scanner;

//	Crie a classe Biblioteca com um atributo List<Livro>. A classe Livro deve conter título, autor
//	e ano. Permita adicionar e remover livros da biblioteca e mostre todos os livros
//	cadastrados. A biblioteca deve existir mesmo que nenhum livro esteja presente.

public class Main {
	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		
		Scanner sc = new Scanner(System.in);
		int optMain;
		
		do {
			System.out.println("O que deseja fazer?");
			System.out.println("1 - Adicionar Livro à biblioteca");
			System.out.println("2 - Remover Livro da biblioteca");
			System.out.println("3 - Mostrar Livros da biblioteca");
			int opt = sc.nextInt();
			sc.nextLine();
			
			switch (opt) {
			case 1:
				System.out.println("Informe os dados do livro: ");
				System.out.println("Titulo: ");
				String titulo = sc.nextLine();
				System.out.println("Autor: ");
				String autor = sc.nextLine();
				System.out.println("Ano: ");
				int ano = sc.nextInt();
				sc.nextLine();
				
				Livro livro = new Livro(titulo, autor, ano);
				biblioteca.adicionarLivros(livro);
				break;
				
			case 2:
				if(biblioteca.getLivros().size() < 0) {
					System.out.println("Nenhum livro para remover!");
					break;
				} else {
					System.out.println("Escolha o livro que deseja remover: ");
					
					for (int i = 0; i < biblioteca.getLivros().size(); i++) {
						System.out.println(i + " - " + biblioteca.getLivros().get(i).getTitulo());
					}
					
					int opcao = sc.nextInt();
					sc.nextLine();
					
					if(opcao >= 0 && opcao < biblioteca.getLivros().size()) {
						Livro livroRemover = biblioteca.getLivros().get(opcao);
						biblioteca.removerLivro(livroRemover);
						System.out.println("Livro "+livroRemover.getTitulo()+" removido com sucesso");
					} else {
						System.out.println("Opcao invalida. Nenhum livro removido.");
					}
					
				}
				break;

			case 3:
				biblioteca.listarLivros();
				break;
				
			default:
				System.out.println("Opcao inválida! Tente novamente.");
				break;
			}
			
			
			System.out.println("--- Menu ---");
			System.out.println("0 - Sair");
			System.out.println("1 - Voltar ao Início");
			optMain = sc.nextInt();
			sc.nextLine();
		} while (optMain != 0);
		
	
		sc.close();
	}
}
