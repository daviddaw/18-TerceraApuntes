package ejercicio3;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		//objeto new
		Scanner in = new Scanner(System.in);
		int c=0;
		String nombre;
		for (int i = 0; i < 2; i++) {
			System.out.println("tipo de empleado");
			String tipo=in.next();
			System.out.println("nombre del empleado");
			nombre=in.next();
			c++;
			System.out.println(c);
			String nombreFinal= tipo+c+nombre;
			System.out.println(nombreFinal);
			
		}
		////////////////////////////////////////////JUEGO DE PRUEBAS
		Cliente cli1 = new Cliente("cli1","calle perro",1000.0);
		Cliente cli2 = new Cliente("cli2","calle perro",3000.0);
		Cliente cli3 = new Cliente("cli3","calle perro",1500.0);
		
		Proyecto pro1 =new Proyecto("proyecto1", true);
		Proyecto pro2 =new Proyecto("proyecto2", false);
		Proyecto pro3 =new Proyecto("proyecto3", false);
		
		
		///////////////////////////////////////////
		int opcion;

		do {
			do {
				System.out.println(
						"Elige una opción:" + "\n	1. Alta Personal." + "\n	2. Asignar protectos." + "\n	3. Visualizar Proyectos." + "\n	4. Ordenar lista Clientes." + "\n	5. fin.");
				opcion = in.nextInt();
			} while (opcion < 1 || opcion > 5);

			switch (opcion) {
			case 1:
				//	objeto.metodo(in);

				break;
			case 2:
				//objeto.metodo(in);
				break;
			case 3:
				//objeto.metodo(in);;
				break;
			case 4:
				//Metodos
				break;
			case 5:
				//Metodos
				break;

			}
		} while (opcion != 5);

		in.close();
	}

}
