package fichaGigante;

public class Animal {
	private String nome;
	private String tipo;
	private boolean emitir;
	
	
	public Animal (String nome, String tipo,boolean emitir) {
		this.nome = nome;
		this.tipo = tipo;
		this.emitir = emitir;
	}
	
	public String getNome() {
		return nome;
	}
	public String getTipo() {
		return tipo;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public boolean emitirSom() {
		return this.emitir = true;
	}
}
