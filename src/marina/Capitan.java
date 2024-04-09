package marina;

public class Capitan extends Marinero {
	
	
	private double experticia;
	
	

	public Capitan(String nombre, String telefono, double sueldoBase,double experticia) {
		super(nombre, telefono, sueldoBase);
		this.experticia=experticia;
	}



	@Override
	public double sueldo() {
		/*
		 *  Si las horas de experticia es mayor igual a 5000 
		 *  y menor a 150000 tendrá un bono del 450.000. 
▪ 			Si las horas de experticia es mayor igual a 150000 y menor a 300000 tendrá un bono del 
			850.000. Y si es mayor a 300000 será un 75% de bono 
▪ 			Su sueldo total se calculará :  sueldo mas bono.
		 * 
		 * *
		 */
		double bono=0;
		if(this.experticia>= 5000 && this.experticia< 150000) {
			bono=450000;
		}else if(this.experticia>= 150000 && this.experticia< 300000) {
			bono=850000;
		}else if(this.experticia>= 300000){
			bono=1200000;
		}
		
		
		return this.sueldoBase+bono;
	}



	public double getExperticia() {
		return experticia;
	}



	public void setExperticia(double experticia) {
		this.experticia = experticia;
	}
	
	

}
