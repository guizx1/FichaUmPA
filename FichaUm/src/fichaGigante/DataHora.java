package fichaGigante;

public class DataHora {
	Data data;
	Hora hora;
	
	public DataHora (Data data, Hora hora) {
	this.data = data;
	this.hora = hora;
	}
	
	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public Hora getHora() {
		return hora;
	}

	public void setHora(Hora hora) {
		this.hora = hora;
	}

	public String toString () {
		return "DATA: " + data.imprimirData() + "\nHORA: " + hora.imprimirHora();
	}
	
}