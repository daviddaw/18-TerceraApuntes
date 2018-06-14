import java.util.Iterator;
import java.util.LinkedList;

public class ColeccionVehReparacion {
	LinkedList<Vehiculo> listaReparacion;



	public ColeccionVehReparacion() {
		super();
		this.listaReparacion = new LinkedList<Vehiculo>();
	}



	public void recorrerReparacion() {
		System.out.println("for");
		for (int i = 0; i < listaReparacion.size(); i++) {
			System.out.println(listaReparacion.get(i));
		}
		
		System.out.println("foreach");
		for (Vehiculo vehiculo : listaReparacion) {
			System.out.println(vehiculo);
		}
		
	}
	
	public void iterator() {
		Iterator<Vehiculo> it = listaReparacion.iterator();
		//listaReparacion.iterator();
		
		while(it.hasNext()) {
			Vehiculo v1 =it.next();
			System.out.println(v1.toString());
			it.remove();
		}
		

		
		
	}
	

}
