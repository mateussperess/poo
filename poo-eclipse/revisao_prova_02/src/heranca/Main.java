package heranca;

public class Main {
	public static void main(String[] args) {
		Pessoa gerente = new Gerente("Mateus", "123456", 1);
		Pessoa funcionario = new Funcionario("Suetam", "654321", 1);
		
		gerente.informacoesBasicas();
		funcionario.informacoesBasicas();
	}
}
