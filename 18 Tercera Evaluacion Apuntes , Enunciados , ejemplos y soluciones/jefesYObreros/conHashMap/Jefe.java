package conHashMap;

import java.util.ArrayList;

public class Jefe extends Empleado {
	static int autonumerico2;
	ArrayList<Obrero> listaObreros;
	
	



	public Jefe() {
		super();
		this.listaObreros= new ArrayList<Obrero>();
	}

	public ArrayList<Obrero> getListaObreros() {
		return listaObreros;
	}

	public void setListaObreros(ArrayList<Obrero> listaObreros) {
		this.listaObreros = listaObreros;
	}

	@Override
	public String toString() {
		return "Jefe [listaObreros=" + listaObreros + ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad()
				+ ", getSueldo()=" + getSueldo() + ", getCodigo()=" + getCodigo() + "]";
	}

	public void insertarEnArray(Obrero o) {
		//Aqui hago el new del array?? cada vez que lo cree se me va borrar
		
		listaObreros.add(o);
		
	}

	@Override
	public String generadorCodigo() {
		autonumerico2++;
		return "J"+autonumerico2;
	}

	public void recorrerListaJefeMostrarNombreDeEmpleados() {
		for (int i = 0; i < listaObreros.size(); i++) {
			System.out.println(listaObreros.get(i).getNombre());
		}
		
	}

	public void quitarJefeDelEmpleado() {
		for (int i = 0; i < listaObreros.size(); i++) {
			listaObreros.get(i).setJefe(null);
		}
		
	}

	public void borrarDeListaDeJefe(Obrero oAux) {
		for (int i = 0; i < listaObreros.size(); i++) {
			if (listaObreros.get(i).equals(oAux)) {//hace falta hacer el equals?
				listaObreros.remove(oAux);
			}
		}
		
	}
	
	
	
	
	

}
