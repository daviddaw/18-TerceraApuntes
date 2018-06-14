package e2RepasoCol;

import java.util.LinkedList;

public class ColeccionVehiculos {
	LinkedList<Vehiculo> listaVehiculos;

	public ColeccionVehiculos() {
		super();
		this.listaVehiculos = new LinkedList<Vehiculo>();
	}

	public LinkedList<Vehiculo> getListaVehiculos() {
		return listaVehiculos;
	}

	public void setListaVehiculos(LinkedList<Vehiculo> listaVehiculos) {
		this.listaVehiculos = listaVehiculos;
	}

	@Override
	public String toString() {
		return "ColeccionVehiculos [listaVehiculos=" + listaVehiculos + "]";
	}
	
	public void recorrerVehiculos() {
		
		for (int i = 0; i < listaVehiculos.size(); i++) {
			System.out.println(listaVehiculos.get(i).toString());
			
		}
		
	}
	
	
}
