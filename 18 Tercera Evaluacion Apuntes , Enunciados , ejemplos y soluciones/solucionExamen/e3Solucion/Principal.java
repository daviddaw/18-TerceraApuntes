package e3Solucion;

import java.io.*;
import java.util.*;

public class Principal {

	
	static Scanner S = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Empresa empresa = new Empresa();
		
		try {
			// deserializamos
			File fichero = new File("Empresa.dat");
			// Si existe
			if (fichero.exists() == true) {				
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero));				
				empresa = (Empresa) ois.readObject();
				// Cierro lectura
				ois.close();
				
			// No existe el fichero (juego de pruebas)	
			} else {
				
				Cliente c1 = new Cliente("Cli1", "C/ Uno", 3000);
				Cliente c2 = new Cliente("Cli2", "C/ Dos", 2000);
				Cliente c3 = new Cliente("Cli3", "C/ Tres", 3000);
				Cliente c4 = new Cliente("Cli4", "C/ Cuatro", 4000);
				Cliente c5 = new Cliente("Cli5", "C/ Cinco", 3000);
				
				Programador p1 = new Programador("Programador1", c4, 1000);
				Programador p2 = new Programador("Programador2", c5, 2000);
				Programador p3 = new Programador("Programador3", c5, 2400);
				
				Responsable r1 = new Responsable("Responsable1", c1, 3000, 500);
				Responsable r2 = new Responsable("Responsable2", c2, 2000, 800);
				Responsable r3 = new Responsable("Responsable3", c3, 2000, 600);
				
				
				Proyecto py1 = new Proyecto("Proyecto1", false);
				Proyecto py2 = new Proyecto("Proyecto2", true);
				Proyecto py3 = new Proyecto("Proyecto3", false);
				Proyecto py4 = new Proyecto("Proyecto4", false);
				Proyecto py5 = new Proyecto("Proyecto5", false);
				Proyecto py6 = new Proyecto("Proyecto6", false);
				Proyecto py7 = new Proyecto("Proyecto7", false);
				Proyecto py8 = new Proyecto("Proyecto8", true);
				
				// añadir clientes
				empresa.anadirCliente(c1);
				empresa.anadirCliente(c2);
				empresa.anadirCliente(c3);
				empresa.anadirCliente(c4);
				empresa.anadirCliente(c5);
				
				//añaidr programadores
				empresa.anadirPersonal(p1);				
				empresa.anadirPersonal(p2);
				empresa.anadirPersonal(p3);
				
				//añadir responsables
				empresa.anadirPersonal(r1);
				empresa.anadirPersonal(r2);
				empresa.anadirPersonal(r3);
				
				//añadir proyectos				
				empresa.anadirProyecto(py1);
				empresa.anadirProyecto(py2);
				empresa.anadirProyecto(py3);
				empresa.anadirProyecto(py4);
				empresa.anadirProyecto(py5);
				empresa.anadirProyecto(py6);
				empresa.anadirProyecto(py7);
				empresa.anadirProyecto(py8);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			menu(empresa);
		}
		
		// SERIALIZO
		try {
			
			File fichero = new File("Empresa.dat");
			
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero));
			// serializo el objeto empresa
			oos.writeObject(empresa);
			oos.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	public static void menu(Empresa empresa) {
		int opcion = -1;
		
		do {
			System.out.println("MENU:");
			System.out.println("0 - SALIR");
			System.out.println("1 - Alta Personal");
			System.out.println("2 - Asignar Proyectos");
			System.out.println("3 - Visualizar proyectos asignados");
			System.out.println("4 - Ordenar clientes");
			System.out.println("5 - Ver empresa ");
			
			opcion = S.nextInt();
			opcionMenu(opcion, empresa);
			
		} while (opcion != 0);
	}
	
	public static void opcionMenu(int opcion, Empresa empresa) {
		switch (opcion) {
		case 1: empresa.altaPersonal();
			break;
		case 2: empresa.asignarProyecto();
			break;
		case 3: empresa.visualizarProyectosAsignados();
			break;
		case 4 : empresa.ordenarClientes();
			break;	
		case 5 : System.out.println(empresa.toString());
			break;
		}
	}
}
