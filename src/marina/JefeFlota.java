package marina;

public class JefeFlota extends Marinero {
	
	
	private double pesoPescado; 
	private double pesoMarisco; 
	

	public JefeFlota(String nombre, String telefono, double sueldoBase,double pesoPescado,double pesoMarisco) {
		super(nombre, telefono, sueldoBase);
		this.pesoPescado=pesoPescado;
		this.pesoMarisco=pesoMarisco;
	}

	@Override
	public double sueldo() {
		// Si son pescados, se multiplicará la cantidad 1 y 
		// si son mariscos por 2. 
		
		
		return sueldoBase + (pesoPescado*1)+ (pesoMarisco*2);
	}

}
