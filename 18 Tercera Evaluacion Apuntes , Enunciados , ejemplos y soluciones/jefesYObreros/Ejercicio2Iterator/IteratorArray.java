package Ejercicio2Iterator;

import java.util.Iterator;

public class IteratorArray implements Iterator<Asignatura> {
	private Asignatura[] array;	
	private int posicion;

	
	public IteratorArray (Asignatura[] array) {
		this.array=array;
		posicion=0;
	}
	
	
	@Override
	public boolean hasNext() {
		if (posicion<array.length && array[posicion] != null) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public Asignatura next() {
		Asignatura a= array[posicion];
		posicion++;
		return a;
	}
	
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
		
	}

}
