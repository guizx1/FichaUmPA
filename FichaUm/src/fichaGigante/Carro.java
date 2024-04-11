package fichaGigante;

public class Carro {
	private String modelo;
	private String marca;
	private String ano;
	private String placa;
	public Carro(String modelo, String marca, String ano, String placa) {
		
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
}
