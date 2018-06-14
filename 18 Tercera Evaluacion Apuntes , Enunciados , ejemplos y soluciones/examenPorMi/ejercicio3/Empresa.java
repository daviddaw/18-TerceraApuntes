package ejercicio3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Empresa {
	protected Vector<Cliente> listaClientes;
	protected ArrayList<Personal> listaPersonal;
	protected LinkedList<Proyecto> listaProyectos;
	
	public Empresa(Vector<Cliente> listaClientes, ArrayList<Personal> listaPersonal,
			LinkedList<Proyecto> listaProyectos) {
		super();
		this.listaClientes = listaClientes;
		this.listaPersonal = listaPersonal;
		this.listaProyectos = listaProyectos;
		
		for (Personal personal : listaPersonal) {
			
		}
			
		}
	
}
