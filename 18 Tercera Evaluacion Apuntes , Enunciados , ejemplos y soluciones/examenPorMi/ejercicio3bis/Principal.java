package ejercicio3bis;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.gc();
		//objeto new
		Empresa empresa = new Empresa();
		
		// C L I E N T E S
		Cliente cliente1 = new Cliente("cli1","c/ pez",3000.0);
		Cliente cliente2 = new Cliente("cli2","c/ pajaro",30001.0);
		empresa.annadirClientes(cliente1);
		empresa.annadirClientes(cliente2);
		
		
		// P R O Y E C TO S
		Proyecto pro1= new Proyecto("telefonica", false);
		Proyecto pro2= new Proyecto("MadridTaxis", false);
		Proyecto pro4 = new Proyecto("proyectoParam", true);
		Proyecto pro5 = new Proyecto("proyecto34", false);
		
		empresa.annadirProyectos(pro1);
		empresa.annadirProyectos(pro2);
		empresa.annadirProyectos(pro4);
		empresa.annadirProyectos(pro5);
		
		//P E R S O N A L


		Personal per1= new Programadores("lucia",cliente2) ;
		Personal per2 = new Programadores("Pedro", cliente1);
		Personal per3 = new Responsables("Pablo", cliente1);
		//insertar
		empresa.listaPersonal.add(per1);
		
		
		
		int opcion;

		do {
			do {
				System.out.println(
						"Elige una opción:" + "\n	1. AltaPersonal." + "\n	2. AsignarProyectos." + "\n	3. Visualizar Proyectos asignados." + "\n	4. Ordenar Clientes." + "\n	5. fin." + "\n	6. .");
				opcion = in.nextInt();
			} while (opcion < 1 || opcion > 6);

			switch (opcion) {
			case 1:
				//	objeto.metodo(in);
				empresa.altaPersonal(in);
				

				break;
			case 2:
				//objeto.metodo(in);
				empresa.asignarProyectos();
				break;
			case 3:
				//objeto.metodo(in);;
				empresa.recorrerLista();
				empresa.recorrerListaClientes();
				break;
			case 4:
				//Metodos
				break;
			case 5:
				//Metodos
				break;

			}
		} while (opcion != 6);

	
	}

}