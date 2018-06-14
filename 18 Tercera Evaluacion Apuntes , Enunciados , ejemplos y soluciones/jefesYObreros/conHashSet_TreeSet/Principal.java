package conHashSet_TreeSet;

import java.util.Scanner;

public class Principal {
	
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		int opcion;
		
/*			Empleado e1 = new Empleado();
			Empleado e2 = new Empleado();
			Empleado e3 = new Empleado();
			
			System.out.println(e1.toString());
			System.out.println(e2.toString());
			System.out.println(e3.toString());*/
		
		
		do {
			do {
				System.out.println("Elige una opción:" + "\n	1. Añadir Empleado." + "\n	2. Subir Sueldo." + "\n	3. Listar nombre de Obreros de un jefe." 
						 + "\n	4. Mostrar jefe de un obrero." + "\n	5. Listar todos los datos." + "\n	6. Borrar un empleado." + "\n	7. Salir.");
				opcion = in.nextInt();
			} while (opcion < 1 || opcion > 7);
			
			switch (opcion) {
			case 1:
				//	objeto.metodo(in);
				empresa.annadirEmpleado();
				break;
			case 2:
				//objeto.metodo(in);
				empresa.subirSueldo();
				break;
			case 3:
				empresa.obrerosDeJefe();
				break;
			case 4:
				empresa.jefeDeUnObrero();
				break;
			case 5:
				empresa.listarTodo();
				break;
			case 6:
				empresa.borrarEmpleado();
				break;
				
			}
		} while (opcion != 7);
		
		in.close();
	}
	
}
