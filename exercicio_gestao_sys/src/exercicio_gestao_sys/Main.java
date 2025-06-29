package exercicio_gestao_sys;

public class Main {
	public static void main(String[] args) {

		Desenvolvedor dev01 = new Desenvolvedor("Mateus", "back-end", Nivel.ESTAGIARIO);
		
		// Dados do desenvolvedor
		dev01.exibirInformacoes();
		dev01.baterPonto();
		dev01.codificar();
		
		Designer des01 = new Designer("Jucao", "UX/UI designer", Nivel.PLENO);		
		// Dados do designer
		des01.exibirInformacoes();
		des01.baterPonto();
		des01.criaPrototipos();
		des01.participaDeUX();

		Estagiario est01 = new Estagiario("Juquinha", "T.I (tudo incluso)", Nivel.ESTAGIARIO);
		// Dados do estagiario
		est01.exibirInformacoes();
		est01.baterPonto();
		est01.codificar();
		est01.criaPrototipos();
	}
}
