package e3_1ExamenCol;

import java.io.Serializable;
import java.util.LinkedList;



public class ListaProyectos implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9100049041865631558L;
	LinkedList<Proyecto> listaProyectos;

	
	public ListaProyectos() {
		this.listaProyectos = new LinkedList<Proyecto>();
	}
	
	public LinkedList<Proyecto> getListaProyectos() {
		return listaProyectos;
	}

	public void setListaProyectos(LinkedList<Proyecto> listaProyectos) {
		this.listaProyectos = listaProyectos;
	}

	@Override
	public String toString() {
		return "ListaProyectos [listaProyectos=" + listaProyectos + "]";
	}

	public void buscarProyectos(){  }
	public void insertarProyectos(){ }
	public void borrarProyectos(){  }

	public void buscarPrioridadAltaEnLista(Personal personalAux) {
		boolean encontrado=false;
		Proyecto proyecto;
		for (int i = 0; i < listaProyectos.size() && !encontrado; i++) {// //recorremoslos proyectos de la lista mientras no se acabe la lista de proyectos o no se llene el array (versión array)
			
			boolean prioridaAlta = personalAux.buscarProyectoPrioridadAlta();
			if (!prioridaAlta) {//si notiene proyectos de prioridad alta lo cogeremos y lo enviaremos  a la lista de asignados 
				proyecto=listaProyectos.get(i);
				personalAux.proyectosAsignados.add(proyecto);
				listaProyectos.remove(proyecto);
			}else {
				System.out.println("Se ha encontrado un proyecto de prioridad alta, no se insertaran mas proyectos");
				encontrado=true;
			}
			
		}
		
		System.out.println(personalAux.proyectosAsignados.toString());	;
		
		
		
	
		
	}

	public void recorrer() {
		for (int i = 0; i < listaProyectos.size(); i++) {
			System.out.println(listaProyectos.get(i).toString());
		}
		
	}
}
