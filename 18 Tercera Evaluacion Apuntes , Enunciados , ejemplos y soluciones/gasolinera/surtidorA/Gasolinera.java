package surtidorA;
import java.util.Arrays;
import java.util.Scanner;

public class Gasolinera {
	//4surtidores
	static Scanner in = new Scanner(System.in);
	private Surtidor[] arraySurtidores;
	int contadorSurtidoresOcupados;



	public Gasolinera() {
		this.arraySurtidores = new Surtidor[4];//Una cosa es crear un array de surtidores.
		for (int i = 0; i < arraySurtidores.length; i++) {                         
			arraySurtidores[i] = new Surtidor();//y otra crear un surtidor en cada posicion del array(vacio).   		//Surtidor surtidor = new Surtidor();  
		}
	}

	public Surtidor[] getArraySurtidores() {
		return arraySurtidores;
	}

	public void setArraySurtidores(Surtidor[] arraySurtidores) {
		this.arraySurtidores = arraySurtidores;
	}

	@Override
	public String toString() {
		return "Gasolinera [arraySurtidores=" + Arrays.toString(arraySurtidores) + "]";
	}



	public Surtidor buscarSurtidorLibre() {//recojer varias cosas con un surtidor
		boolean encontrado = false;
		Surtidor surtidor=null;
		for (int i = 0; i < arraySurtidores.length && !encontrado; i++) {
			if (arraySurtidores[i].isSurtidorLibre()) {
				encontrado=true;
				surtidor=arraySurtidores[i];
				System.out.println(i+" posicion");
			}

		}
		
		return surtidor;

	}

	public void llegadaCoche() {
		Surtidor surtidor = null;	
		Coche coche = new Coche();
		int posicion = 0;
		System.out.println("Ha llegado el  "+coche.toString()+" a repostar, buscando surtidor libre...");

		if (contadorSurtidoresOcupados>=arraySurtidores.length) {//por que  entra dentro de null cuando el array se llena?
			System.out.println("Los surtidores estan Ocupados");
			
			System.out.println("buscando surtidor con la cola menos llena ");
			//
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < arraySurtidores.length; i++) {
				if (arraySurtidores[i].getColaCoches().size()<min) {
					min=arraySurtidores[i].getColaCoches().size();
					posicion = i;	
				}
			}
			//
			System.out.println("El surtidor con menos cola es el surtidor  "+posicion+", con   "+min+" coches");
			System.out.println("Insertando coche en la cola del surtidor");
			arraySurtidores[posicion].insertarCocheEnCola(coche);
		}else {
			System.out.println("buscando un surtidor libre..");
			surtidor=buscarSurtidorLibre();
			if (surtidor != null) {
				System.out.println("surtidor libre encontrado");
				System.out.println("añadiendo coche a surtidor");
				surtidor.setCocheRepostando(coche);
				///
			//	arraySurtidores[contadorSurtidoresOcupados].setCocheRepostando(coche);
				System.out.println("Marcando surtidor como ocupado");
				surtidor.setSurtidorLibre(false);
				System.out.println("insertado surtidor");
					contadorSurtidoresOcupados++;
				}
			else {
				System.out.println("no existe");
			}



		}







	}

public void salidaCoche() {

	Surtidor surtidor = null;
	Coche coche = null;
	System.out.println("Salida de un coche del surtidor");
	System.out.println("Introduce la matricula del coche que sale");
	String matricula = in.next();
	System.out.println("comprobando si el coche está en el surtidor");
	surtidor=buscarCocheSurtidor(matricula);
	if (surtidor == null) {
		System.out.println(" ");//nose que poner aqui
	}else {
		System.out.println("sacando el coche"+surtidor.getCocheRepostando().toString());
		System.out.println("comprobando si la cola del surtidor esta vacia");
		if (surtidor.getColaCoches().size()==0) {
			System.out.println("la cola esta vacia");//marcar surtidor como libre
			surtidor.setCocheRepostando(null);//no lo pone pero meimagino
			surtidor.setSurtidorLibre(true);
		}else {
			
			System.out.println("No esta vacia");
			System.out.println("buscando el primer coche  de la cola");//Marcar en el surtidor el coche
			System.out.println("buscando primer coche de la cola");
			coche = surtidor.cogerPrimerCoche();
			System.out.println(coche.toString());
			System.out.println("asignado coche al surtidor");
		}

		
		//borrarCocheDeSurtidor();
		


		
		
	}
	//matricula=1111AAA
	//buscarCocheEn el surtidor();
	
}

private Surtidor buscarCocheSurtidor(String matricula) {
	boolean encontrado=false;
	Coche coche = null;
	Surtidor surtidor = null;
	for (int i = 0; i < arraySurtidores.length && !encontrado; i++) {
		if (arraySurtidores[i] == null) {
			System.out.println("no esta creadala lista de surtidores");
		}  

		//arraySurtidores[i] != null          .getCocheRepostando() != null 
		if (arraySurtidores[i].getCocheRepostando() != null && arraySurtidores[i].getCocheRepostando().getMatricula().equalsIgnoreCase(matricula)) {
			encontrado=true;
			coche = arraySurtidores[i].getCocheRepostando();
			surtidor = arraySurtidores[i];
		}


	}
	if (encontrado) {
		System.out.println("Matricula encontrada "+coche+" el coche esta en la lista");
	}else {
		System.out.println("el coche no esta en la lista");
	}

	return surtidor;
	
	
}



public void mostrarListadoSurtidores() {
	for (int i = 0; i < arraySurtidores.length; i++) {
		System.out.println(arraySurtidores[i]);
	}
	
}
	
}
