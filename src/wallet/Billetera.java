package wallet;

public class Billetera {
	
	
	private double montoPago;
	private FormaDePago formaDePagar;

	
	public void realizarProcesoPago() {
		
		formaDePagar.realizarPago();
		
	}
	
	
	public FormaDePago getFormaDePago() {
		return formaDePagar;
	}

	public void setFormaDePagar(FormaDePago formaDePagar) {
		this.formaDePagar = formaDePagar;
	}

	public double getMontoPago() {
		return montoPago;
	}

	public void setMontoPago(double montoPago) {
		this.montoPago = montoPago;
	}
	
	
	
	
}
