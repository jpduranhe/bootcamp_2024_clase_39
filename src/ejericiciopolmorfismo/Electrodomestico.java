package ejericiciopolmorfismo;

public class Electrodomestico extends Articulo {

	private int consumoWhatsHora;
	
	
	public Electrodomestico(String nombre, double precio,int consumoWhatsHora) {
		super(nombre, precio);
		this.consumoWhatsHora=consumoWhatsHora;
	}


	public int getConsumoWhatsHora() {
		return consumoWhatsHora;
	}


	public void setConsumoWhatsHora(int consumoWhatsHora) {
		this.consumoWhatsHora = consumoWhatsHora;
	}
	
	
	


	@Override
	public double aplicarDescuento(double descuento) {
		
		return this.precio-=(descuento+990);
	}


	@Override
	public String toString() {
		return "Electrodomestico [consumoWhatsHora=" + consumoWhatsHora + ", nombre=" + nombre + ", precio=" + precio
				+ "]";
	}
	
	
	

}
