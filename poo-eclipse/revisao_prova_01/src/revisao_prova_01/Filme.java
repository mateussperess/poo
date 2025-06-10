package revisao_prova_01;

public class Filme {
	private String titulo;
	private GeneroFilme generoFilme;
	private double precoAluguel;
	
	public Filme(String titulo, GeneroFilme generoFilme, double precoAluguel) {
		this.titulo = titulo;
		this.generoFilme = generoFilme;
		this.precoAluguel = precoAluguel;
	}
	
	public GeneroFilme getGeneroFilme() {
		return generoFilme;
	}
	
	public double getPrecoAluguel() {
		return precoAluguel;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setGeneroFilme(GeneroFilme generoFilme) {
		this.generoFilme = generoFilme;
	}
	
	public void setPrecoAluguel(double precoAluguel) {
		this.precoAluguel = precoAluguel;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void dadosFilme() {
		System.out.println("Titulo: " + this.getTitulo());
		System.out.println("Genero: " + this.getGeneroFilme().toString());
		System.out.println("Preco: R$" + this.getPrecoAluguel());
	}
}
