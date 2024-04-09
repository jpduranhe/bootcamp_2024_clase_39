package ejecicioabstracto;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Perro objetoPerro= new Perro();
		Gato objetoGato= new Gato();
		Animal objetoAnimalPerro= new Perro();
		
		Perro[] arregloPerros= new Perro[3];
		arregloPerros[0]=objetoPerro;
		
		
		Animal[] arregloAnimales= new Animal[3];
		
		arregloAnimales[0]=objetoPerro;
		arregloAnimales[1]=objetoGato;
		arregloAnimales[2]=objetoAnimalPerro;
		
		
		for(Animal animal : arregloAnimales) {
			System.out.println(animal.emitirSonido());
		}
	}

}
