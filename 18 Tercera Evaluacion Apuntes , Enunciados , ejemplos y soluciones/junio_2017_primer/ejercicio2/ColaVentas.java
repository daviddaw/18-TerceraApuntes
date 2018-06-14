package ejercicio2;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.LinkedList;

public class ColaVentas extends AbstractQueue<Ventas>{

	private LinkedList<Ventas> colaVentas;
	
	public ColaVentas(){
		colaVentas=new LinkedList<Ventas>();
	}

	@Override
	public boolean offer(Ventas arg0) {
		return colaVentas.offer(arg0);
	}

	@Override
	public Ventas peek() {
		return colaVentas.peek();
	}

	@Override
	public Ventas poll() {
		return colaVentas.poll();
	}

	@Override
	public Iterator<Ventas> iterator() {
		return colaVentas.iterator();
	}

	@Override
	public int size() {
		return colaVentas.size();
	}

	public LinkedList<Ventas> getColaVentas() {
		return colaVentas;
	}
}
