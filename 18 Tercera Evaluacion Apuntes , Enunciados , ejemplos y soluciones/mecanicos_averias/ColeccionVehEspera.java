
import java.util.LinkedList;
import java.util.Queue;

public class ColeccionVehEspera {
	Queue<Vehiculo> colaEspera;//= new Queue<Vehiculo>();
	public ColeccionVehEspera() {
		this.colaEspera = new LinkedList<Vehiculo>();
	}
	
	public int longitud() {
		
		return colaEspera.size();
		
	}
	
	public boolean colaVacia() {
		return colaEspera.isEmpty();
	}
	
	
	public Vehiculo buscar(Vehiculo e) {
		
		for (Vehiculo vehiculo : colaEspera) {
			if (vehiculo.equals(e)) {
				return e;
			}
		}
		return null;
	}
	/*
	 * 	
	 * public void borrarPrimero();
	public E mostrarPrimero();
	public void longitud();
	public boolean colaVacia();
	void insertarCola(E e);
	 */
	
	//añadir
	public void insertarCola(Vehiculo e) {
		colaEspera.add(e);
	}
	public void insertarCola2(Vehiculo e) {
		colaEspera.offer(e);
	}
	//sacar
	public Vehiculo MostraryBorrarPrimero() {
		Vehiculo v =colaEspera.remove();
		System.out.println(colaEspera.remove());
		 ;//Recupera y elimina el encabezado de esta cola.
		return v;
	}
	public void MostraryBorrarPrimero2() {
		colaEspera.poll();//Recupera y elimina el encabezado de esta cola, o devuelve nulo si esta cola está vacía.
	}
	
	
	public void InsertarCochesDespuesDelUltimo(Vehiculo e) {
		LinkedList<Vehiculo> colaEsperaL =(LinkedList<Vehiculo>)colaEspera;
		   int  tamaño=colaEsperaL.size();
		for (int i = 0; i < tamaño; i++) {
			
			if ( colaEsperaL.get(i) instanceof Motocicleta) {
				colaEsperaL.add(i, e);
			}
		}
		
		
		
		}
		
	

		
	    public void recorrerEspera()  {
	        for(Vehiculo v: colaEspera){
	          System.out.println(v.toString());
	        }	

		
	}
	
	public Vehiculo buscarEspera() {
		
		
		Vehiculo vehiculo= null;
		for (int i = 0; i < colaEspera.size(); i++) {
			
			vehiculo=colaEspera.poll();
		}
		if (vehiculo !=null) {
			System.out.println(vehiculo.toString());
		}else {
			System.out.println("listavacia");
		}
		return vehiculo;
		
	}
	public Queue<Vehiculo> getColaEspera() {
		return colaEspera;
	}



	public void setColaEspera(Queue<Vehiculo> colaEspera) {
		this.colaEspera = colaEspera;
	}

}
