package fichaGigante;

public class Triangulo {
	private double ladoA;
	private double ladoB;
	private double ladoC;
	
	public Triangulo (double a, double b, double c) {
		this.ladoA = a;
		this.ladoB = b;
		this.ladoC = c;
	}

	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	public double getLadoC() {
		return ladoC;
	}

	public void setLadoC(double ladoC) {
		this.ladoC = ladoC;
	}
	
	public double calcularArea (double h, double b) {
		return (h * b) / 2;
	}
	
}