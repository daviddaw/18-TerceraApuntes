package e3_1ExamenCol;

import java.io.Serializable;
import java.util.Scanner;



public class Empresa implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6935287943587562067L;
	ColeccionClientes coleccionClientes = new ColeccionClientes();
	ListaPersonalArrayList coleccionPersonal = new ListaPersonalArrayList();
	ListaProyectos coleccionProyectos = new ListaProyectos();
			
	public void altaPersonal(Scanner in){
		Personal personalAux;
		Cliente clienteAux;
		String tipoPersonal;
		
		tipoPersonal = validarPersonal_P_R(in);
		
		System.out.println("Dame un Cliente que ya exista");
		String nombreCliente = in.next();
		clienteAux=coleccionClientes.buscarCliente(nombreCliente);//busco en lista clientes
		
		if (clienteAux==null) {
			System.out.println("Cliente no existente");
		}else {
			System.out.println("Cliente existente");	
		    System.out.println("Dame el nombre del trabajador");
		    String nombre=in.next();
		     	
		    if (tipoPersonal.equalsIgnoreCase("p")) {
			personalAux = new Programador(nombre, clienteAux);//new programador
			coleccionPersonal.insertarPersonal(personalAux);//inserto
			
		    }else {
		    personalAux = new Responsable(nombre, clienteAux);//new responsble
			coleccionPersonal.insertarPersonal(personalAux);//inserto 
		    }
			
		}
		

		
		
	}

	public void asignarProyecto(Scanner in){
		Personal personalAux;
		
		System.out.println("Dame el registro personal de un trabajador");
		String registroPersonal = in.next();
		
		personalAux=coleccionPersonal.buscarPersonal(registroPersonal);
		
		coleccionProyectos.buscarPrioridadAltaEnLista(personalAux);
		personalAux.buscarProyectoPrioridadAlta();

	}

	public void visualizarProyectosProgramadores() {
		//1- listo solo los programadores
		coleccionPersonal.recorrerSoloProg_ySusProyectos();
		
		
	}
	public void ordenarListaClientes(){
	    
		
		coleccionClientes.ordenar();
	}
	
	
	
	private String validarPersonal_P_R(Scanner in) {
		String tipoPersonal;
		System.out.println("Quieres dar de alta un programador o un responsable P/R");
		do {
			tipoPersonal=in.next();
			if (!(tipoPersonal.equalsIgnoreCase("P")) && !(tipoPersonal.equalsIgnoreCase("R"))) {
				System.out.println("no has introducido un tipo correcto vuelve a insertarlo P/R");
			}
		} while (!(tipoPersonal.equalsIgnoreCase("P")) && !(tipoPersonal.equalsIgnoreCase("R")) );
		return tipoPersonal;
		
	}



	

}
