import java.util.ArrayList;
import java.util.Scanner;

public class Taller {
	static Scanner in = new Scanner(System.in);
	ColeccionAverias coleccionAverias = new ColeccionAverias();
	ColeccionVehReparacion coleccionVehReparacion = new ColeccionVehReparacion ();
	ColeccionMecanicos coleccionMecanicos = new ColeccionMecanicos();
	ColeccionVehEspera coleccionVehEspera = new ColeccionVehEspera();
	public void recepcionVehiculo() {
		String tipoV, matricula;
		Vehiculo vehiculoAux;

		System.out.println(
				 "*Alta de Vehiculo*\n"
				 + "Inserta los siguientes datosdel vehiculo\n"
				 + "¿Coche o Motocileta? C/M \n");
		do {
			tipoV=in.next();
			if (!tipoV.equalsIgnoreCase("c") && !tipoV.equalsIgnoreCase("M")) {
				System.out.println("Introduce una opcion valida -> C/M");
			}
		} while (!tipoV.equalsIgnoreCase("C") && !tipoV.equalsIgnoreCase("M"));
		
		System.out.println("inserta la matricula");
		matricula=in.next();
		if (tipoV.equalsIgnoreCase("c")) {
			vehiculoAux = new Coche(matricula);
		}
		else {
			vehiculoAux = new Motocicleta(matricula);
		}
		
		System.out.println("buscando un mecanico libre...");
		Mecanico mecanicolibre=coleccionMecanicos.mecanicoLibre();
		
		
		
		
		if (mecanicolibre==null) {
			
			System.out.println("No hay mecanicos libres");
			System.out.println("Añadiendo vehiculo a lista de espera...");
			coleccionVehEspera.colaEspera.add(vehiculoAux);
			System.out.println(" ");
			
		}else {
			
			System.out.println("Mecanico encontrado "+mecanicolibre.toString());
			System.out.println("Añadiendo vehiculo al mecanico...");
			mecanicolibre.setVehiculoReparacion(vehiculoAux);
			
			System.out.println("Poniendo a ocupado al mecanico...");
			mecanicolibre.setLibre(false);
			System.out.println(mecanicolibre.toString());
			
			System.out.println("Añadiendo vehiculo a lista de vehiculos en reparacion");
			coleccionVehReparacion.listaReparacion.add(vehiculoAux);			
			
		}
				
	}
	public void finalizacioReparacion(Scanner in) {
		int codMec,codigoAveria;
		int respuesta = 0;
		Mecanico mec;
		
		Averia averia;
		ArrayList<Averia> listaAverias = new ArrayList<Averia>();

		System.out.println("Introduce el codigo del mecanico");
		codMec=in.nextInt();
		System.out.println("Buscando mecanico...");
		mec =coleccionMecanicos.buscarMecanicoCodigoInt(codMec);
		if (mec==null) {
			System.out.println("El codigo  de mecanico no es valido");
		}else {
			System.out.println("mecanico encontrado");
			System.out.println(mec.toString());
			
			System.out.println("Añadir codigo/s de averia/s del vehiculo");
			System.out.println("inserta el codigo de averia");

			do {
				if (respuesta==1) {
					System.out.println("inserta otro codigo");
				}
				codigoAveria=in.nextInt();
				averia=coleccionAverias.buscarAveriaPorcodigo(codigoAveria);
				if (averia==null) {
					System.out.println("La averia no existe");
				}else {
					System.out.println("averia Encontrada");
					// System.out.println(averia.toString());
					listaAverias.add(averia);
				}

				System.out.println("Insertar mas averias? \n1. Si \n2. No");
				respuesta=in.nextInt();
			} while (respuesta==1);
			
			if (mec.getVehiculoReparacion() == null) {
				System.out.println("Este mecanico no tiene ningun coche asignado");
			}else{
				Vehiculo vehiculo = mec.getVehiculoReparacion();
				
				System.out.println(listaAverias);
				vehiculo.setListaAverias(listaAverias);
				
				System.out.println("buscando los codigos de averias en el listado..calculando importe de la reparacion");
				System.out.println("El coste de reparacion es "+vehiculo.costeReparacion());
				
				System.out.println("marcando vehiculo como reparado");
				vehiculo.setEstado("Reparado");
			
				System.out.println("comprobando si hay otro vehiculo en la lista de espera...");
				Vehiculo vehiculoAux = coleccionVehEspera.buscarEspera();

				
				System.out.println("La lista de espera no esta vacia. Asignando nuevo vehiculo al mecanico");
				coleccionVehReparacion.listaReparacion.add(vehiculoAux);
				System.out.println("Lista de espera vacia, cambiando mecanico a libre, sin vehiculos asignados");
				mec.setLibre(true);
				mec.setVehiculoReparacion(null);
			}
;
			

		}

		
		
		
	}
	public void entregaVehiculosReparados() {
		coleccionVehReparacion.listaReparacion.iterator();

		//coleccionVehReparacion.recorrerReparacion();
		//3. Entrega de vehículos reparados: Se recorrerá toda la lista de vehículos imprimiendo y borrando los reparados 
		//a través de la interfaz Iterable.
	}
	
	
	

}
