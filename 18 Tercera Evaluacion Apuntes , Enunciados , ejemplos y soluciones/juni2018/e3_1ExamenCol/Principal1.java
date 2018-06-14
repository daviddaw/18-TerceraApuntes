package e3_1ExamenCol;
import java.io.*;
import java.util.*;



public class Principal1 {


	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		Empresa empresa = new Empresa();

		try {
			// deserializamos
			File fichero = new File("C:/Users/Daveto/Desktop/empresa.txt");
			// Si existe
			if (fichero.exists() == true) {				
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero));	
				empresa = (Empresa) ois.readObject();

				// Cierro lectura
				ois.close();

				// No existe el fichero (juego de pruebas)	
			} else {

				// C L I E N T E S

				Cliente cli3 = new Cliente("cli3","c/ perro",3000.0);
				Cliente cli2 = new Cliente("cli2","c/ pajaro",10001.0);
				Cliente cli1 = new Cliente("cli1","c/ pez",3000.0);





				empresa.coleccionClientes.listaClientes.add(cli1);
				empresa.coleccionClientes.listaClientes.add(cli2);



				// P R O Y E C T O S

				Proyecto pro1= new Proyecto("telefonica", false);
				Proyecto pro2= new Proyecto("MadridTaxis", true);
				Proyecto pro3= new Proyecto("Repsol", true);
				Proyecto pro4 = new Proyecto("ProyectoParam", true);
				Proyecto pro5 = new Proyecto("Proyecto34", false);

				empresa.coleccionProyectos.listaProyectos.add(pro1);
				empresa.coleccionProyectos.listaProyectos.add(pro2);
				empresa.coleccionProyectos.listaProyectos.add(pro3);
				empresa.coleccionProyectos.listaProyectos.add(pro4);
				empresa.coleccionProyectos.listaProyectos.add(pro5);



				//P E R S O N A L

				Personal per1= new Programador("Lucia",cli2) ;
				Personal per2 = new Programador("Pedro", cli1);
				Personal per3 = new Responsable("Pablo", cli3);

				empresa.coleccionPersonal.listaPersonal.add(per1);
				empresa.coleccionPersonal.listaPersonal.add(per2);
				empresa.coleccionPersonal.listaPersonal.add(per3);		

			}

		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		} finally {
			menu(empresa);
		}

		// SERIALIZO
		try {

			File fichero = new File("C:/Users/Daveto/Desktop/empresa.txt");

			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero));
			// serializo el objeto empresa
			oos.writeObject(empresa);
			oos.close();

		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}

	}

	public static void menu(Empresa empresa) {
		int opcion;

		do {
			do {
				System.out.println("Elige una opción:" + "\n	1. Alta personal." + "\n	2. Asignar un Proyecto." + "\n	3. Visualizar Proyectos de programadores." + "\n	4. Ordenar lista clientes." + "\n	5.  listar Clientes listar Personal ListarProyectos ."
						+ "\n	6. Seri.");
				opcion = in.nextInt();
			} while (opcion < 1 || opcion > 6);

			switch (opcion) {
			case 1:
				//	objeto.metodo(in);


				empresa.altaPersonal(in);

				break;
			case 2:
				//objeto.metodo(in);
				empresa.asignarProyecto(in);

				break;
			case 3:
				//objeto.metodo(in);;
				empresa.visualizarProyectosProgramadores();
				break;
			case 4:
				//Metodos
				empresa.ordenarListaClientes();


				break;
			case 5:
				//Metodos
				empresa.coleccionClientes.recorrer();
				empresa.coleccionPersonal.recorrer();
				empresa.coleccionProyectos.recorrer();
				break;

			}
		} while (opcion != 6);
	}
}
