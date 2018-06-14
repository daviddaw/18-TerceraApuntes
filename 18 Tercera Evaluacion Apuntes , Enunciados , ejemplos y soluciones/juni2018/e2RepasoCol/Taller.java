package e2RepasoCol;

import java.util.Scanner;

public class Taller {
	static Scanner in = new Scanner(System.in);
	ColeccionAverias coleccionAverias= new ColeccionAverias();
	ColeccionVehiculos coleccionVehiculos= new ColeccionVehiculos();
	ColeccionMecanicos coleccionMecanicos= new ColeccionMecanicos();
	ColeccionVehiculosEspera coleccionVehiculosEspera= new ColeccionVehiculosEspera();



	public void recepcionVehiculo() {
		String tipoVehiculo;
		Vehiculo vehiculoParaAsignar;
		System.out.println("Que vehiculo ha llegado, coche o Moto? C/M");
		do {
			tipoVehiculo=in.next();
		} while (!tipoVehiculo.equalsIgnoreCase("c") && !tipoVehiculo.equalsIgnoreCase("m"));
		System.out.println("Has escogido "+tipoVehiculo);//tengo si sera coche o moto

			//asignar vehiculo al mecanico
			if (tipoVehiculo.equalsIgnoreCase("c")) 
				vehiculoParaAsignar = new Coche();
			else 
				vehiculoParaAsignar= new Motocicleta();
			
			Mecanico mecanicoLibre = coleccionMecanicos.buscarMecanicoLibre();//tengo el mecanico libre		o null

			if (mecanicoLibre==null) {
				System.out.println("******************************************");
				System.out.println("*No hay mecanicos libres, coche en espera*");
				System.out.println("******************************************");
				coleccionVehiculosEspera.listaEspera.add(vehiculoParaAsignar);
				vehiculoParaAsignar.setEstado("En Espera");
			} 
			
			else {
				
				mecanicoLibre.setLibre(false);
				vehiculoParaAsignar.setEstado("En reparacion");
				coleccionVehiculos.listaVehiculos.add(vehiculoParaAsignar);
				mecanicoLibre.setVehiculoReparacion(vehiculoParaAsignar);
				System.out.println(mecanicoLibre.toString());
			}



			
			
		}



	public void finalizacionReparacion() {
		Mecanico mecanicoAux;
		System.out.println("Introduce el codigo del mecanico");
		
		//en su vehiculo para repararar añadir averias en su arraylist
		
		//calcular coste reparacion
		// cambiar a estado reparado
		
		//soy mecanico
		if (!coleccionVehiculosEspera.listaEspera.isEmpty()) {
			System.out.println(coleccionVehiculosEspera.listaEspera.size());//NO deberia ser cero
			//2. Si la lista de espera no está vacía, se asignará un nuevo vehículo al mecánico que acaba de terminar la reparación;
			coleccionVehiculosEspera.sacarVehiculoCola();
			
		}else {
			//2.  si está vacía, el mecánico se marcará como libre y el vehículoReparación asignado se pondrá a null. 
			System.out.println(coleccionVehiculosEspera.listaEspera.size());//NO deberia ser cero
			
		}
		
	}



	}


