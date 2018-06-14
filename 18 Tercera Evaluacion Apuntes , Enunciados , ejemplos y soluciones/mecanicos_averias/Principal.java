
import java.io.*;
import java.util.*;



public class Principal {
	
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		Taller taller = new Taller();

		try {
			
			// deserializamos
			File fichero = new File("C:/Users/Daveto/Desktop/empresa.txt");
			// Si existe
			if (fichero.exists() == true) {
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero));	
				taller = (Taller) ois.readObject();
				ois.close();// Cierro lectura

				
			} else {// No existe el fichero (juego de pruebas)	

				// A V E R I  A S

				Averia a1 = new Averia(1,1000);
				Averia a2 = new Averia(2,40);
				Averia a3 = new Averia(3,100);
				
				taller.coleccionAverias.listaAverias.add(a3);
				taller.coleccionAverias.listaAverias.add(a2);
				taller.coleccionAverias.listaAverias.add(a1);
				
				
				// V E H I C U L O S
				Coche c1 = new Coche("COC-1111",4);
				Motocicleta mo1 = new Motocicleta("MOT-1111",500);
			    taller.coleccionVehReparacion.listaReparacion.add(c1);
			    taller.coleccionVehReparacion.listaReparacion.add(mo1);

				
				// M E C A N I C O S
				Mecanico me1 = new Mecanico(1,"pepe",false,c1);
				taller.coleccionMecanicos.listaMecanicos.add(me1);
				Mecanico me2 = new Mecanico(2,"juan",false,mo1);
				taller.coleccionMecanicos.listaMecanicos.add(me2);
				
				 //R E P A R A C I O N
				 Motocicleta mo2 = new Motocicleta("REP-2222",600);
				 taller.coleccionVehReparacion.listaReparacion.add(mo2);
				 
				//E S P E R A
				 Motocicleta mo3 = new Motocicleta("ESP-3333",250);
				 taller.coleccionVehEspera.colaEspera.add(mo3);
				 //taller.coleccionVehEspera.colaEspera.offer(mo3);

			}

		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		} finally {
			int opcion;

			do {
				do {
					System.out.println("Elige una opción:" + "\n	1. Recepion Vehiculo." + "\n	2. TerminacionReparacion." + "\n	3. Entrega reparados." +/* "\n	4. ordenar lista clientes." + "\n	5.  listar Clientes listar Personal ListarProyectos ."
							+*/ "\n	6. Seri.");
					opcion = in.nextInt();
				} while (opcion < 1 || opcion > 6);

				switch (opcion) {
				case 1:
						taller.recepcionVehiculo();
					
					break;
				case 2:
					
					taller.finalizacioReparacion(in);
				

					break;
				case 3:
				taller.entregaVehiculosReparados();
					
					break;
				case 4:
					//Metodos
				


					break;
				case 5:
					//Metodos
					System.out.println("***************");
					System.out.println("*Base de datos*");
					System.out.println("***************");
					System.out.println("*Averias*");
					taller.coleccionAverias.recorrerAverias();
					System.out.println("*Mecanicos*");
					taller.coleccionMecanicos.recorrerMecanicos();
					System.out.println("*En Espera*");
					taller.coleccionVehEspera.recorrerEspera();
					System.out.println("*En Reparacion*");
					taller.coleccionVehReparacion.recorrerReparacion();
					System.out.println("**");
					break;

				}
			} while (opcion != 6);
		}

		// ***************SERIALIZO*****************************************************************************
		try {

			File fichero = new File("C:/Users/Daveto/Desktop/empresa.txt");

			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero));
			// serializo el objeto empresa
			oos.writeObject(taller);
			oos.close();

		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}

	}


}
