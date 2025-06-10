package exercicio_10;

public class Autor {
	private String nome;
	private String sobrenome;
	private String usuario;
	
	public Autor(String nome, String sobrenome, String usuario) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.usuario = usuario;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
}
