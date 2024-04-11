package fichaGigante;

public class Empresa {
	private String nome;
	private String cpnj;
	
	public Empresa(String nome, String cpnj) {
		this.nome = nome;
		this.cpnj = cpnj;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpnj() {
		return cpnj;
	}
	public void setCpnj(String cpnj) {
		this.cpnj = cpnj;
	}
	
}
