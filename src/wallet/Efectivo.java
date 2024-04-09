package wallet;

public class Efectivo extends FormaDePago {
	@Override
	public void realizarPago() {
		System.out.println("Pagando con Efectivo");
	}
}
