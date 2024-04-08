package runner;

import ejericiciopolmorfismo.*;

public class Runner {

	public static void main(String[] args) {
		
		MonedaUS dolar= new MonedaUS();
		MonedaCLP pesoChileno=  new MonedaCLP();
		
		
		Electrodomestico electrodomestico = new Electrodomestico("Microonda",50000,13);
		Consola consola = new Consola("Nintendo",250000,false);
		
		System.out.println(electrodomestico);
		System.out.println(consola);
		
		
		System.out.println(electrodomestico.aplicarDescuento(50,dolar));
		System.out.println(consola.aplicarDescuento(10000,pesoChileno));
	}

}
