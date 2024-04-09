package wallet;

public class Runner {
	
	public static void main(String[] args) {
		
		TarjetaDeCredito tc= new TarjetaDeCredito();
		Efectivo efectivo= new Efectivo();
		Transferencia transferencia= new Transferencia();
		
		Billetera billetera= new Billetera();
		
		billetera.setMontoPago(100);
		billetera.setFormaDePagar(transferencia);
		
		
		billetera.realizarProcesoPago();
	}
}
