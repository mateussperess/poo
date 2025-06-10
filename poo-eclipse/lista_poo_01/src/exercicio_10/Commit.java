package exercicio_10;

import java.util.Date;

public class Commit {
	private String mensagem;
	private Date data;
	private Autor autor;
	
	public Commit(String mensagem, Date data, Autor autor) {
		this.mensagem = mensagem;
		this.data = data;
		this.autor = autor;
	}
	
	public Commit(String mensagem, Autor autor) {
		this.mensagem = mensagem;
		this.autor = autor;
	}
	
	public String getMensagem() {
		return mensagem;
	}
	
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	
	public Autor getAutor() {
		return autor;
	}
	
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	
}
