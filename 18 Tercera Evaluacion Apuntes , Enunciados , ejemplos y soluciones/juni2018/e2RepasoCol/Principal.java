package e2RepasoCol;

import java.util.Scanner;

import e3_1ExamenCol.Empresa;

public class Principal {
	static Scanner in =new Scanner(System.in);
	public static void main(String[] args) {
		
		Taller taller = new Taller();	
		//se pueden rellenar los atributos listaAverías, listaMecánicos, listaVehículos y listaEspera con algunos datos.
		
		System.out.println("******************");
		System.out.println("*Juego de pruebas*");
		System.out.println("******************");
		System.out.println("");
		System.out.println("");
		
		// AVERIAS
		Averia averia1 = new Averia();
		Averia averia2 = new Averia();
		Averia averia3 = new Averia();
		taller.coleccionAverias.listaAverias.add(averia1);
		taller.coleccionAverias.listaAverias.add(averia2);
		taller.coleccionAverias.listaAverias.add(averia3);
		System.out.println("*********");
		System.out.println("*Averias*");
		System.out.println("*********");

		taller.coleccionVehiculos.recorrerVehiculos();
		System.out.println("");
		System.out.println("");
		
		//V E H I C U L O S  Constructor especial eliminando  pedir por scanner 
		Motocicleta motocicleta1 = new Motocicleta(500,"5555-tyh","En espera");//////dudaa se hace solo
		Coche coche1 = new Coche("1111-jjj","En Espera",4);
		Vehiculo vehiculo3 = new Vehiculo("4444-jkg","En espera");///que pasa con esto sirve para algo?? 
		//cuando se puede poner el new diferente  de la declaracion
		taller.coleccionVehiculos.listaVehiculos.add(motocicleta1);
		taller.coleccionVehiculos.listaVehiculos.add(coche1);
		taller.coleccionVehiculos.listaVehiculos.add(vehiculo3);
		System.out.println("***********");
		System.out.println("*Vehiculos*");
		System.out.println("***********");

		taller.coleccionVehiculos.recorrerVehiculos();
		System.out.println("");
		System.out.println("");
				
		//MECANICOS costructor eliminando  pedir por scanner 
	  /*Mecanico mecanico1 = new Mecanico(false);
		Mecanico mecanico2 = new Mecanico(false);*/
		Mecanico mecanico1 = new Mecanico("David",3000);
		Mecanico mecanico2 = new Mecanico("Marco",3000);
		Mecanico mecanico3 = new Mecanico(" Pedrito",1000);
	  /*Mecanico mecanico4 = new Mecanico();*/
		taller.coleccionMecanicos.listaMecanicos.add(mecanico1);
/*		taller.coleccionMecanicos.listaMecanicos.add(mecanico2);
		taller.coleccionMecanicos.listaMecanicos.add(mecanico3);*/
		System.out.println("***********");
		System.out.println("*Mecanicos*");
		System.out.println("***********");
		taller.coleccionMecanicos.recorrerMecanicos();
		System.out.println("");
		System.out.println("");
		
		
		//LISTA ESPERA
		taller.coleccionVehiculosEspera.listaEspera.add(motocicleta1);
		taller.coleccionVehiculosEspera.listaEspera.add(coche1);
		taller.coleccionVehiculosEspera.listaEspera.add(vehiculo3);
		System.out.println("*********************");
		System.out.println("*Vehiculos En Espera*");
		System.out.println("*********************");

		//taller.coleccionVehiculosEspera.listaEspera.
		System.out.println("");
		System.out.println("");
		
		
		

		
		
		
		
		
		
		//public void altaArticulo(Scanner in) {
		int opcion;
		do {
			do {
				System.out.println("Elige una opción:" + "\n	1. Recepción de vehículo." + "\n	2. Terminación de una reparación." + "\n	3. Entrega de vehículos reparados:.");
				opcion = in.nextInt();
			} while (opcion < 1 || opcion > 4);
			
			switch (opcion) {
			case 1:			
				taller.recepcionVehiculo();
				
				System.out.println("...");
				break;
			case 2:
				taller.finalizacionReparacion();
				break;
				
			case 3:
				break;
				
				
			case 4:
				taller.coleccionVehiculos.recorrerVehiculos();
				taller.coleccionAverias.recorrerAverias();
				System.out.println("***********");
				System.out.println("***********");
				System.out.println("***Veh*****");
				taller.coleccionVehiculos.recorrerVehiculos();
				System.out.println("***Esp*****");
				taller.coleccionVehiculosEspera.recorrerVehiculosEspera();
				System.out.println("***Mec*****");
				System.out.println("*Mecanicos*");
				taller.coleccionMecanicos.recorrerMecanicos();
				System.out.println("***********");
				
				
				
				
				break;

			default:
				break;
			}
			
		} while (opcion != 4);//


		//}
		
	}
	
	

	
	

}
