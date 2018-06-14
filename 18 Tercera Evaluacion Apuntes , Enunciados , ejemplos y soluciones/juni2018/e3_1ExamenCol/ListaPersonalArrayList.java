package e3_1ExamenCol;

import java.io.Serializable;
import java.util.ArrayList;


public class ListaPersonalArrayList implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9133615183374960134L;
	//************************************************   T R E E    M A P                ********************************************
	ArrayList<Personal> listaPersonal;

	
	public ListaPersonalArrayList() {
		
		this.listaPersonal = new ArrayList<Personal>();
	}


	public ArrayList<Personal> getListaPersonal() {
		return listaPersonal;
	}

	public void setListaPersonal(ArrayList<Personal> listaPersonal) {
		this.listaPersonal = listaPersonal;
	}

	@Override
	public String toString() {
		return "ListaPersonal [listaPersonal=" + listaPersonal + "]";
	}
	
	public Personal buscarPersonal(String registro){

		boolean encontrado = false;
		Personal personalAux = null;
		for (int i = 0; i < listaPersonal.size() && !encontrado; i++) {
			if (listaPersonal.get(i) != null && listaPersonal.get(i).getRegistroPersonal().compareTo(registro) == 0) {
				encontrado = true;
				personalAux = listaPersonal.get(i);

			}
		}

		return personalAux;
    }
	
	public void insertarPersonal(Personal personalAux){
		System.out.println( personalAux.toString());
		listaPersonal.add(personalAux);
		
	}
	public void borrarPersonal(){  }


	public void recorrer() {
		for (int i = 0; i < listaPersonal.size(); i++) {
			System.out.println(listaPersonal.get(i).toString());
		}
		
	}

	public void recorrerSoloProg_ySusProyectos() {
		Personal pe;
		for (int i = 0; i < listaPersonal.size(); i++) {
			
				 pe = listaPersonal.get(i);
				if (pe instanceof Programador) {
					System.out.println(pe.nombre);
					System.out.println(pe.proyectosAsignados);
				}
			

		}
		
	}
	

	

}
