package ejericiciopolmorfismo;

public class Moneda {
	
	private String simbolo;
	private double valor;
	
	
	
	public Moneda(String simbolo, double valor) {
		this.simbolo = simbolo;
		this.valor = valor;
	}
	public String getSimbolo() {
		return simbolo;
	}
	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
}
