package br.com.algaworks.sobrecarga;

public class Relogio {
	private int hora, min, seg;

	public Relogio(int hora, int min, int seg) {
		this.hora = hora;
		this.min = min;
		this.seg = seg;
	}

	public Relogio(int hora, int min) {

		this.seg = 1;
		this.hora = hora;
		this.min = min;
	}

	public Relogio(int hora) {

		this.seg = 1;
		this.hora = hora;
		this.min = 1;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getSeg() {
		return seg;
	}

	public void setSeg(int seg) {
		this.seg = seg;
	}

}
