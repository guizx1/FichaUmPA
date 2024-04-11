package fichaGigante;

public class Cachorro {
	private String raca;
	private String nome;
	private int idade;
	
	public Cachorro(String raca, String nome, int idade) {
		this.raca = raca;
		this.nome = nome;
		this.idade = idade;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String latir () {
		return "Au au!";
	}

}
