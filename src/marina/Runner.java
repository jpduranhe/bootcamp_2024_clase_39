package marina;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Capitan capitanJuan= new Capitan("Juan Perez","5555555",4500000,5000);
		Capitan capitanJaime= new Capitan("Jaime Villagran","5555555",4500000,300000);
		
		JefeFlota jefeFlotaPedro= new JefeFlota("Pedro Rojas","5555555",1500000,50000,12000);
		JefeFlota jefeFlotaMatias= new JefeFlota("Marias Duran","5555555",1500000,80000,25000);
		
	
		Marinero[] marineros= new Marinero[4];
		
		marineros[0]=capitanJuan ;
		marineros[1]=capitanJaime ;		
		marineros[2]=jefeFlotaPedro ;
		marineros[3]=jefeFlotaMatias ;
		
		
		for(Marinero marinero : marineros) {
			System.out.print(marinero.getNombre()+" :");
			System.out.println(marinero.sueldo());
		}
	}

}
