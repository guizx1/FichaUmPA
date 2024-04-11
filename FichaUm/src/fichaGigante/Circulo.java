package fichaGigante;

public class Circulo {
	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double calcularArea () {
		return (this.raio * this.raio) * 3.14;
	}
	public double calcularPerimetro () {
		return this.raio * 3.14 * 2;
	}
	
}
