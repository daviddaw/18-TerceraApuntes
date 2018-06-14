package e2RepasoCol;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class ColeccionVehiculosEspera {
	Queue<Vehiculo> listaEspera;
	//donde se guardarán los vehículos que no pueden ser reparados en ese momento por falta de mecánicos libres

	public ColeccionVehiculosEspera() {
		super();
		this.listaEspera = new Queue<Vehiculo>() {

			@Override
			public boolean addAll(Collection<? extends Vehiculo> arg0) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean contains(Object arg0) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean containsAll(Collection<?> arg0) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Iterator<Vehiculo> iterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean remove(Object arg0) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean removeAll(Collection<?> arg0) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean retainAll(Collection<?> arg0) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public <T> T[] toArray(T[] arg0) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean add(Vehiculo arg0) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Vehiculo element() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean offer(Vehiculo arg0) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Vehiculo peek() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Vehiculo poll() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Vehiculo remove() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

	public Queue<Vehiculo> getListaEspera() {
		return listaEspera;
	}

	public void setListaEspera(Queue<Vehiculo> listaEspera) {
		this.listaEspera = listaEspera;
	}

	@Override
	public String toString() {
		return "ColeccionVehiculosEspera [listaEspera=" + listaEspera + "]";
	}

	public Vehiculo sacarVehiculoCola() {
		Vehiculo v=listaEspera.poll();
		return v;
	}

	public void recorrerVehiculosEspera() {
		for (int i = 0; i < listaEspera.size(); i++) {
			System.out.println(listaEspera.peek());
		}
		
	}
	

	

}
