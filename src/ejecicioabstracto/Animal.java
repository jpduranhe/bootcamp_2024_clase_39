package ejecicioabstracto;

public abstract class Animal {

	protected String nombre;
	protected int cantidadExtremidades;
	
	
	
	public Animal() {}
	
	public Animal(String nombre, int cantidadExtremidades) {
		this.nombre = nombre;
		this.cantidadExtremidades = cantidadExtremidades;
	}
	
	
	public abstract String emitirSonido();
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidadExtremidades() {
		return cantidadExtremidades;
	}
	public void setCantidadExtremidades(int cantidadExtremidades) {
		this.cantidadExtremidades = cantidadExtremidades;
	}
	
	
	
}
