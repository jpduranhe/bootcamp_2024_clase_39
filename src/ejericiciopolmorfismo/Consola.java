package ejericiciopolmorfismo;

public class Consola extends Articulo {

	private boolean tieneLectorDvd;
	
	public Consola(String nombre, double precio,boolean tieneLectorDvd) {
		super(nombre, precio);
		this.tieneLectorDvd=tieneLectorDvd;
	}

	public boolean isTieneLectorDvd() {
		return tieneLectorDvd;
	}

	public void setTieneLectorDvd(boolean tieneLectorDvd) {
		this.tieneLectorDvd = tieneLectorDvd;
	}

	@Override
	public String toString() {
		return "Consola [tieneLectorDvd=" + tieneLectorDvd + ", nombre=" + nombre + ", precio=" + precio + "]";
	}

	
	
	
}
