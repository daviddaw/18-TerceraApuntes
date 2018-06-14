package surtidorA;
import java.util.Scanner;

public class Principal {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		Gasolinera gasolinera = new Gasolinera();
		int opcion;
		
		do {
			do {
				System.out.println("Elige una opción:" + "\n	1. Llegada a la gasolinera." + "\n	2. Salida de gasolinera." 
			+ "\n	3. Listado de los surtidores. (si está libre u ocupado, el coche que lo ocupa en ese caso y  los coches que hay en las colas)" 
			+ "\n	4. Salir.");
				opcion = in.nextInt();
			} while (opcion < 1 || opcion > 4);
			
			switch (opcion) {
			case 1:
				//	objeto.metodo(in);
				gasolinera.llegadaCoche();
				
				break;
			case 2:
				//objeto.metodo(in);
				gasolinera.salidaCoche();
				break;
			case 3:
				//objeto.metodo(in);
				gasolinera.mostrarListadoSurtidores();
				break;

				
			}
		} while (opcion != 4);
		
		in.close();
	}
	
}
