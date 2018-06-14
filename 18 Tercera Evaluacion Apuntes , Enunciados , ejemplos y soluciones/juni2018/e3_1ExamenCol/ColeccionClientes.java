package e3_1ExamenCol;


import java.io.Serializable;
import java.util.*;


public class ColeccionClientes implements Serializable{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 808726790404957229L;
	/**
	 * 
	 */
	
	Vector<Cliente> listaClientes;

	
	public ColeccionClientes() {
		this.listaClientes = new Vector<Cliente>();
	}

	public Vector<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(Vector<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	@Override
	public String toString() {
		return "ListaClientes [listaClientes=" + listaClientes + "]";
	}
	
	public Cliente buscarCliente(String nombreCliente) {

		boolean encontrado = false;
		Cliente clienteAux = null;
		for (int i = 0; i < listaClientes.size() && !encontrado; i++) {
			if (listaClientes.get(i) != null && listaClientes.get(i).getNombreCliente().compareTo(nombreCliente) == 0) {
				encontrado = true;
				clienteAux = listaClientes.get(i);
			}
		}
		return clienteAux;
	}
	
	
	public void insertarCliente() { }
	public void borrarCliente() {  }

	public void recorrer() {
		for (int i = 0; i < listaClientes.size(); i++) {
			System.out.println(listaClientes.get(i).toString());
		}
		
	}

	public void ordenar() {
		Collections.sort(listaClientes);
		
		
	}

}
