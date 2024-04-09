package marina;

public abstract class Marinero {
	
	protected String nombre;
	protected String telefono;
	protected double sueldoBase;
	
	
	
	public Marinero(String nombre, String telefono, double sueldoBase) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.sueldoBase = sueldoBase;
	}


	public abstract double sueldo();


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public double getSueldoBase() {
		return sueldoBase;
	}


	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	
	
	
}
