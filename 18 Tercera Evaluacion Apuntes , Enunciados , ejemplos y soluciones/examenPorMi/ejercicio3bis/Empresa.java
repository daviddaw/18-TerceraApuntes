package ejercicio3bis;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class Empresa {
	static Scanner in = new Scanner(System.in);
	Vector<Cliente> listaClientes;
	ArrayList<Personal>listaPersonal;
	LinkedList<Proyecto> listaProyectos;
	
	
	
	public Empresa() {
		
		this.listaClientes = new Vector<Cliente>();
		this.listaPersonal = new ArrayList<Personal>();
		this.listaProyectos = new LinkedList<Proyecto>();
	}

	public Vector<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(Vector<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public ArrayList<Personal> getListaPersonal() {
		return listaPersonal;
	}

	public void setListaPersonal(ArrayList<Personal> listaPersonal) {
		this.listaPersonal = listaPersonal;
	}

	public LinkedList<Proyecto> getListaProyectos() {
		return listaProyectos;
	}

	public void setListaProyectos(LinkedList<Proyecto> listaProyectos) {
		this.listaProyectos = listaProyectos;
	}

	
	
	
	//añadir
	public void altaPersonal(Scanner in) {
		Personal per1;
		String tipoPersonal;
		Cliente c;
		String nombrePersonal;
		//1) alta un informático o un responsable
		System.out.println("Que vas a crear Programador o Responsable  P/R");
		do {
			tipoPersonal=in.next();
			if (!(tipoPersonal.equalsIgnoreCase("P")) && !(tipoPersonal.equalsIgnoreCase("R"))) {
				System.out.println("no has introducido un tipo correcto vuelve a insertarlo P/R");
			}
		} while (!(tipoPersonal.equalsIgnoreCase("P")) && !(tipoPersonal.equalsIgnoreCase("R")) );
		
		System.out.println(tipoPersonal);
		
		
		//segun cual sea hara algo
		//pedir Datos nombre obligatorio
		System.out.println("Dame un nombre del cliente");
		String nombreCliente=in.next();	

		//necesito pasarle un cliente del array

		c=buscarCliente(nombreCliente);//4) Se pedirá un cliente de los existentes para asignárselo
		//No hace falta validar el nombre
		if (c==null) {
			System.out.println("Cliente no existente");
		}
		else {
			System.out.println("Cliente existente");
			//2) se pedirán los datos necesarios no hace falta validar el nombre
			//3) sueldo y productividad se pueden generar automaticos
			//5) se generará el campo registro Personal según corresponda.
			System.out.println("inserta el nombre del personal");
			nombrePersonal=in.next();
			if (tipoPersonal.equalsIgnoreCase("p")) {
				
				 per1 = new Programadores(nombrePersonal,c);
				//per1.generarRegistro(tipoPersonal);
				System.out.println( per1.toString());
				// deberá insertarse en la listaPersonal.
				listaPersonal.add(per1);
			}else  {
				
				 per1 = new Responsables(nombrePersonal,c);		
				 //per1.generarRegistro(tipoPersonal);
				 System.out.println( per1.toString());
				// deberá insertarse en la listaPersonal.
				listaPersonal.add(per1);
			}


			

		}

		
		
	}
//	
/*private void generarRegistro(String tipoPersonal) {
	
	
		
	}*/

	public Cliente buscarCliente(String nombre) {

		boolean encontrado = false;
		Cliente clienteAux = null;
		for (int i = 0; i < listaClientes.size() && !encontrado; i++) {
			if (listaClientes.get(i) != null && listaClientes.get(i).getNombre().compareTo(nombre) == 0) {
				encontrado = true;
				clienteAux = listaClientes.get(i);

				//break; 
				//se podria romper el for con un break si se encuentra en lugar de usar el switch en la condición del for
			}
		}
		return clienteAux;
	}

	public void recorrerLista() {
		for (int i = 0; i < listaPersonal.size(); i++) {
			System.out.println(listaPersonal.get(i));

		}
	}
	public void annadirProyectos(Proyecto pro) {
		listaProyectos.add(pro);
		System.out.println(pro.toString());

	}

	public void asignarProyectos() {
		//Pedir campo registropersonal
		String registroLocal;
		System.out.println("dame el  registro personal");
		registroLocal=in.next();
		Personal personal=buscarEmpleadoRegistro(registroLocal);
		if (personal != null) {///exixte
			System.out.println(personal.toString());

			if (personal.proyectosAsignados == null) {
				System.out.println("No tiene proyectos asignados");


			}else {
				System.out.println("La lista tiene algun proyecto");
				for (int i = 0; i < listaProyectos.size(); i++) {
					Proyecto proyecto=listaProyectos.get(i);
					
					while (proyecto.getPrioridadAlta()==false) {
						System.out.println(111);
						personal.proyectosAsignados.add(proyecto);
						
					} 
				}
				System.out.println(personal.toString());
					/*				for (int i = 0; i < personal.proyectosAsignados.size(); i++) {
					Proyecto proyecto=personal.proyectosAsignados.get(i);
						if (proyecto.getPrioridadAlta()==true) {
							System.out.println("no admite mas proyectos");
							break;
						}else {
							Proyecto proyecto2 = new Proyecto("proyectoParam", true);




							personal.proyectosAsignados.add(proyecto2);
							System.out.println("Proyecto añadido");
							System.out.println(personal.toString());						
							System.out.println("..");
							listaProyectos.remove(proyecto2);

						}

				}*/


				}
			}else
				System.out.println(" personal no encontrado");


			//asignar tantos proyectos como se pueda


			//asignar al programador mientras no tenga un proyecto de alta pririda. 

			//comprobarPrioridad();
			//El programador tiene un array de asignados  se comprobara que no haya uno de prioridad alta
			//se recorrera el array buscando si alguno cuincide con true

			//ojo prooridad
			//los proyectos se sacaran del arraylista y se almacenaran en el array asignado
		}

		public Personal buscarEmpleadoRegistro(String registro) {

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

		public void recorrerListaClientes() {
			for (int i = 0; i < listaClientes.size(); i++) {
				System.out.println(listaClientes.get(i));
			}

		}

		public void annadirClientes(Cliente cliente) {
			listaClientes.add(cliente);

		}
	}


	/*
Número positivo: la cadena 1 es mayor que la cadena 2.
0: las cadenas son iguales.
Número negativo: la cadena 1 es menor que la cadena 2.
Recuerda que no sigue el alfabeto original sino según la tabla ASCII, es decir, que a es menor que z.
	 */

	//buscar

	/*	private void comprobarPrioridad() {
		Personal p =new Personal() {



	}

	//borrar

}*/
