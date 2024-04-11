package fichaGigante;

public class Cliente {
	private String nome;
	private String cpf;
	Data data;
	
	public Cliente (String nome, String cpf, Data data) {
		this.nome = nome;
		this.cpf = cpf;
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public Data getData() {
		return data;
	}
	
	public void setData(Data data) {
		this.data = data;
	}
}
