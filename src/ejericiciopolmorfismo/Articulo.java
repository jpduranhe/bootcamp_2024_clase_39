package ejericiciopolmorfismo;

public class Articulo {
	
	protected String nombre;
	protected double precio;
	
	
	public Articulo(String nombre,double precio) {
		this.nombre=nombre;
		this.precio=precio;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public double aplicarDescuento(double descuento) {
		return precio-=descuento;
	}
	public double aplicarDescuento(double descuento,Moneda moneda) {
		double descuentoTotal = (precio * moneda.getValor())  -descuento;
		
		return descuentoTotal;
	}


	@Override
	public String toString() {
		return "Articulo [nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
	
	

}
