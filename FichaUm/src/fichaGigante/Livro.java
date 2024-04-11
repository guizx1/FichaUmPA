package fichaGigante;

public class Livro {
	private String autora;
	private String editora;
	private String titulo;
	private int anoPublicacao;
	public Livro(String autora, String editora, String titulo, int anoPublicacao) {
		this.autora = autora;
		this.editora = editora;
		this.titulo = titulo;
		this.anoPublicacao = anoPublicacao;
	}
	public String getAutora() {
		return autora;
	}
	public void setAutora(String autora) {
		this.autora = autora;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
}
