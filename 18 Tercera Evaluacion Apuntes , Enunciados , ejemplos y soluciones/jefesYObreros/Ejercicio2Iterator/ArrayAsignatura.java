package Ejercicio2Iterator;
/*
 * 2.- Crea un array de objetos de clase Asignatura (código, nombre y horas) llamado ArrayAsig. 
 * Recorre este array usando una interfaz Iterator con un bucle while-hasNext para visualizar todas 
 * las asignaturas. (Recuerda que debes crear una clase que implemente la interfaz Iterator). 
 * */

import java.util.Iterator;

public class ArrayAsignatura {
	private int longitud;
	private Asignatura[] array;
	
	
	public ArrayAsignatura() {
		longitud=5;
		array =new Asignatura[longitud];
		array[0]=new Asignatura();
		array[1]=new Asignatura();
		array[2]=new Asignatura();
	}

	public Iterator<Asignatura> iterator(){
		Iterator<Asignatura> it = new IteratorArray(array);
		return it;
	}
	


}
