package fichaGigante;

public class Professor {
	private String nome;
	private String departamento;
	private String titulacao;
	
	public Professor(String nome, String departamento, String titulacao) {
		this.nome = nome;
		this.departamento = departamento;
		this.titulacao = titulacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	
}
