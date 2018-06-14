package e3Solucion;

import java.io.*;
import java.util.*;

public class Empresa implements Serializable {

	private static final long serialVersionUID = 1L;

	static Scanner teclado = new Scanner(System.in); // Scanner
	
	private Vector<Cliente> listaClientes;
	
	private TreeMap<String, Personal> listaPersonal;
	
	private LinkedList<Proyecto> listaProyectos;
	
	
	// Constructor
	public Empresa() {
		this.listaClientes = new Vector<Cliente>();
		this.listaPersonal = new TreeMap<String, Personal>();
		this.listaProyectos = new LinkedList<Proyecto>();
	}


	// Getters & Setters
	public Vector<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(Vector<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public TreeMap<String, Personal> getListaPersonal() {
		return listaPersonal;
	}

	public void setListaPersonal(TreeMap<String, Personal> listaPersonal) {
		this.listaPersonal = listaPersonal;
	}

	public LinkedList<Proyecto> getListaProyectos() {
		return listaProyectos;
	}

	public void setListaProyectos(LinkedList<Proyecto> listaProyectos) {
		this.listaProyectos = listaProyectos;
	}
	
	
	public void anadirCliente(Cliente cliente) {
		listaClientes.addElement(cliente);
	}
		
	public Cliente buscarCliente(String nombre) {
		Cliente encontrado = null;
		
		for (Cliente cliente : listaClientes) {
			if (nombre.equalsIgnoreCase(cliente.getNombreCliente())) {
				encontrado = cliente;
				break;
			}			
		}		
		return encontrado;
	}
	
	//En Personal
	public void anadirPersonal(Personal personal) {
		listaPersonal.put(personal.getRegistroPersonal(), personal);
	}
	
		
	public Personal buscarPersonal(String registroPersonal) { 
		Personal encontrado = null;
		
		// Cojo las claves del TreeMap para el for..each
		Set<String> claves = listaPersonal.keySet();
				
		// Las recorro con un for
		for (String clave : claves) {
			Personal aux = listaPersonal.get(clave); 
			if (registroPersonal.equalsIgnoreCase(aux.getRegistroPersonal())) {
				encontrado = aux;
				break;
			}				
		}		
		return encontrado;
	}
	
	
	public void anadirProyecto(Proyecto proyecto) {
		listaProyectos.add(proyecto);
	}
	
		
	// Metodos del menu
	public void altaPersonal() {
		System.out.println("Alta de personal: Seleccione Programador o Responsable (P/R)");
		String tipo;
		do {
			tipo = teclado.nextLine();
		}
		while (!tipo.equalsIgnoreCase("P") && !tipo.equalsIgnoreCase("R"));
		

		System.out.println("Introduce nombre del nuevo personal");
		String nombre = teclado.nextLine();

		System.out.println("Introduce nombre de un cliente");
		String nombreCliente = teclado.next();

		// Buscamos si existe el cliente
		Cliente aux = buscarCliente(nombreCliente);
		if (aux == null) {
			System.out.println("Lo sentimos, no existe dicho cliente");
		} else { 
			Personal personal;
			System.out.println("Introduce sueldo");
			double sueldo = teclado.nextDouble();
			if (tipo.equalsIgnoreCase("P")) {
				// Creo el programador
				personal = new Programador(nombre, aux, sueldo);
			}
			else {
				System.out.println("Introduce productividad del responsable");
				int productividad = teclado.nextInt();
				// Creo el responsable
				personal = new Responsable(nombre, aux, sueldo, productividad);
			}
			// Inserto en el TreeMap a través del registro de Personal
			listaPersonal.put(personal.getRegistroPersonal(), personal);
		}

	}
	
		
	
	public void asignarProyecto() {
		System.out.println("Introduce registroPersonal del Personal al que desea agregar proyectos");
		String registroPersonal = teclado.next();

		// Busco si existe ese personal en el TreeMap
		Personal personal = buscarPersonal(registroPersonal);
		if (personal == null) {
			System.out.println("Lo sentimos, no existe este personal");
		} else {

			//sacamos proyectos de la lista mientras el personal no tenga ningún proyecto de prioridad alta
			// o no se acabe la lista de proyectos o no se llene el array (versión array)
			while (!personal.proyPriorAlta && !listaProyectos.isEmpty() && personal.numeroProyAsig<5) {

				//el último and es solo si se trabaja con arrayProyectos para comprobar que no está lleno
				//sacamos el primer proyecto de la lista y lo borramos de la misma
				Proyecto proyecto=listaProyectos.getFirst();
				personal.proyectosAsignados.add(proyecto); //se lo añadimos al personal (versión arrayList)
				//o al array
				int i=personal.numeroProyAsig;
				personal.arrayProyectos[i]=proyecto;
				personal.numeroProyAsig++; //incrementamos el numero de proyectos
				//preguntamos si el proyecto es de prioridad alta para actualizar el campo del personal
				if(proyecto.isPrioridadAlta())
					personal.proyPriorAlta=true;
				//borramos el proyecto de la lista
				listaProyectos.removeFirst();
				
			}
			if (personal.proyPriorAlta)
				System.out.println("El personal ya tiene un proyecto de prioridad alta y no se le puede asigar más a partir de ahora");
			if (listaProyectos.isEmpty())
				System.out.println("No quedan más proyectos en la lista pendientes de asignación");
			if (personal.numeroProyAsig==5) //solo con array
				System.out.println("El personal tiene ya cinco proyectos asignados y no puede trabajar en más");

		}		

	}	
	
	
	public void visualizarProyectosAsignados() {
		// Cojo las claves del TreeMap
		Set<String> claves = listaPersonal.keySet();
						
		// Las recorro con un for
		for (String clave : claves) {
			Personal personal = listaPersonal.get(clave); // Cojo uno a uno todos los Empleados
			//preguntamos si es programador
			if (personal instanceof Programador)
				//preguntamos si hay proyectos en la lista o array
				if (!personal.proyectosAsignados.isEmpty()) {
					//también podría ser if(personal.numeroProyAsig!=0) ) 
				
					System.out.println("Proyectos a cargo del programador "+personal.nombre);
					System.out.println();
					for (Proyecto proyecto : personal.proyectosAsignados) {
						System.out.println(proyecto.toString());
					}
			}
				}	
	}		
	
	
	// toString
	@Override
	public String toString() {
		String salida = new String();
		
		salida += "CLIENTES________________________________________\n";
		for (Cliente c : listaClientes) {
			salida += c.toString()+"\n";
		}
		
		salida += "PROYECTOS______________________________________\n";
		for (Proyecto py : listaProyectos) {
			salida += py.toString()+"\n";
		}
		
		salida += "PERSONAL_______________________________________\n";
		// Cojo las claves del TreeMap
		Set<String> claves = listaPersonal.keySet();
						
		// Las recorro con un for each
		for (String clave : claves) {
			Personal aux = listaPersonal.get(clave); 
			salida += aux.toString()+"\n";
		}
		
		return salida;
	}


	public void ordenarClientes() {
		Collections.sort(listaClientes);
		
	}
	
	
	
	
	
	
}
